package core;

import model.User;
import repository.UserRepository;

public class Main {

	private static final UserRepository userRepository = new UserRepository();
	
	public static void main(String[] args) {
		
		final User rodrigo = new User("Rodrigo", 1L);
		userRepository.insertUser(rodrigo);
		
		final User joao = new User("Joao", 2L);
		userRepository.insertUser(joao);
		
		userRepository.userCount();
			
		userRepository.getUserById(1L);
	
		userRepository.deleteUserById(1L);
		
		userRepository.userCount();
	}
}
