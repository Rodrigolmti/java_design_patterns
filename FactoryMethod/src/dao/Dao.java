package dao;

public interface Dao<E> {
	
	public void updateLog(String action);

	public void insert(E entidade);
	
	public void deleteById(Long id);
	
	public int entityCount();
	
	public E findById(Long id);
}
