/**
 * 
 */
package tbg.iti.poker.daos;

import java.util.List;

import tbg.iti.poker.models.Model;

/**
 * @author dossj
 *
 */
public interface DAO<E extends Model, K> {
	List<E> findAll();
	E find(K id);
	void save(E entity);
	void delete(E entity);
}
