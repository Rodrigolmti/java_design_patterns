package repository;
import dao.Dao;
import dao.UserDao;
import model.User;

public class UserRepository extends BaseRepository<User> {

	private Dao<User> userDao;
	
	@Override
	public Dao<User> getDao() {
		if (userDao == null) {
			userDao = new UserDao(); 
		}
		userDao.updateLog("GetDao property called!");
		return userDao;
	}
	
	public void insertUser(User user) {
		getDao().updateLog(user.toString());
		getDao().insert(user);
	}
	
	public void deleteUserById(Long id) {
		getDao().updateLog("User deleted by id: " + id);
		getDao().deleteById(id);
	}
	
	public User getUserById(Long id) {
		getDao().updateLog("Get user by id: " + id);
		return getDao().findById(id);
	}
	
	public int userCount() {
		final int userCount = getDao().entityCount();
		getDao().updateLog("User count: " + userCount);
		return userCount;
	}
}
