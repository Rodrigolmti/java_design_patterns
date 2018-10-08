package dao;
import java.util.ArrayList;
import java.util.List;

import core.AppLogger;
import model.User;
import model.UserNull;

public class UserDao implements Dao<User> {

	private final AppLogger logger = AppLogger.getInstance();
	private final List<User> users = new ArrayList<>();
	
	@Override
	public void insert(User entidade) {
		users.add(entidade);
	}

	@Override
	public void deleteById(Long id) {
		User forDeleted = null;
		for (User user : users) {
			if (user.getId().equals(id)) {
				forDeleted = user;
				break;
			}
		}
		if (forDeleted != null) {
			users.remove(forDeleted);
		}
	}

	@Override
	public User findById(Long id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return new UserNull();
	}

	@Override
	public void updateLog(String action) {
		logger.info(action);
	}

	@Override
	public int entityCount() {
		return users.size();
	}
}
