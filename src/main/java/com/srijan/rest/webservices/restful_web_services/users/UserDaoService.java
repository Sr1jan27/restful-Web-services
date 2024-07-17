package com.srijan.rest.webservices.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	public static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
//	public User findUserById(Integer id) {
//		User user = new User();
//		for(new User() fetchUser: users) {
//			if(fetUser.id== id) {
//				user = fetchUser;
//			}
//		}
//		return user;
//	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteUserById(User user) {
		users.remove(user);
	}

}
