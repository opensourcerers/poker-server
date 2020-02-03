/**
 * 
 */
package tbg.iti.poker.services;

import java.util.List;

import javax.transaction.Transactional;

import tbg.iti.poker.daos.DAO;
import tbg.iti.poker.models.Model;

/**
 * @author dossj
 *
 */
public abstract class ServiceImpl<E extends Model, K> implements Service<E, K> {
	private DAO<E, K> dao;
	
	public ServiceImpl(DAO<E, K> dao) {
		this.dao = dao;
	}
	
	@Override
	public List<E> listAll() {
		return this.dao.findAll();
	}

	@Override
	public E getOne(K id) {
		return this.dao.find(id);
	}

	@Override
	@Transactional
	public void create(E entity) {
		this.dao.save(entity);
	}

	@Override
	@Transactional
	public void update(K id, E entity) {
		E old = this.dao.find(id);
		old.update(entity);
		this.dao.save(old);
	}

	@Override
	@Transactional
	public void delete(K id) {
		E entity = this.dao.find(id);
		this.dao.delete(entity);
	}
}
