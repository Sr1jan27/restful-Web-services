package com.srijan.rest.webservices.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Jim", LocalDate.now().minusYears(20)));
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

}
