/**
 * 
 */
package tbg.iti.poker.services;

import java.util.List;

import tbg.iti.poker.models.Model;

/**
 * @author dossj
 *
 */
public interface Service<E extends Model, K> {
	public List<E> listAll();
	public E getOne(K id);
	public void create(E entity);
	public void update(K id, E entity);
	public void delete(K id);
}
