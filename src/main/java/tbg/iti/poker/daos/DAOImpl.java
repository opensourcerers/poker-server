/**
 * 
 */
package tbg.iti.poker.daos;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import tbg.iti.poker.models.Model;

/**
 * @author dossj
 *
 */
@SuppressWarnings("rawtypes")
public abstract class DAOImpl<E extends Model, K> implements DAO<E, K> {
	@PersistenceContext
	protected EntityManager entityManager;
	protected Class         entityClass;
	
	public DAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[0];
	}

	/* (non-Javadoc)
	 * @see iea.storage.database.dao.DAO#findAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		CriteriaBuilder   cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<E>  cq = cb.createQuery(this.entityClass);
		Root<E>         root = cq.from(this.entityClass);
		CriteriaQuery<E> all = cq.select(root);
		TypedQuery<E>   allQ = this.entityManager.createQuery(all);
		List<E>      results = allQ.getResultList(); 
		
		return results;
	}

	/* (non-Javadoc)
	 * @see iea.storage.database.dao.DAO#find(K)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public E find(K id) {
		return (E) this.entityManager.find(this.entityClass, id);
	}

	/* (non-Javadoc)
	 * @see iea.storage.database.dao.DAO#save(E)
	 */
	@Override
	public void save(E entity) {
		this.entityManager.persist(entity);
	}

	/* (non-Javadoc)
	 * @see iea.storage.database.dao.DAO#delete(E)
	 */
	@Override
	public void delete(E entity) {
		this.entityManager.remove(entity);
	}
}
