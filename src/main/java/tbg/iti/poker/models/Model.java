/**
 * 
 */
package tbg.iti.poker.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dossj
 *
 */
public abstract class Model {
	public void update(Model that) {
		if (that.getClass().getName() == this.getClass().getName()) {
			// Then we can make a reasonable assumption that the method signatures are the same.

			for (Method method : this.getClass().getDeclaredMethods()) {
				String methodName = method.getName();
				if (methodName.startsWith("set")) {
					try {
						Method getter    = that.getClass().getDeclaredMethod("get"+methodName.substring(3));
						Object thisValue = getter.invoke(this);
						Object thatValue = getter.invoke(that);
						
						if (thisValue != thatValue) {
							method.invoke(this, thatValue);
						}
					} catch (NoSuchMethodException | SecurityException e) {
						// This is from pulling a getter that may not exist or I might not have access to. This is okay.
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// This is from invoking methods on myself or from the foreign object poorly.
						e.printStackTrace();
					}
				}
			}
		}
	}
}
