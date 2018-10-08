package repository;
import dao.Dao;

public abstract class BaseRepository<E> {

	public abstract Dao<E> getDao();
}
