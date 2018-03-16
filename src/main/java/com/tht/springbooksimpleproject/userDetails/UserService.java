package com.tht.springbooksimpleproject.userDetails;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = new ArrayList<User>(
			Arrays.asList(new User(1, "Geetika", "geetika123@climate.com", 1234567898, "US", "06/19/1986"),
					new User(2, "Abc", "abc12664@climate.com", 1234557898, "US", "06/11/1986")));

	private final static Set<String> locales = new HashSet<>(Arrays.asList("US", "BR", "CA"));
	
	private final static String COMPANY_DOMAIN = "@climate.com";
	
	private static Pattern dateFrmtPtrn = 
			Pattern.compile("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)");
     

	public List<User> getUserDetails() {

		return users;
	}

	public User getUser(int id) {

		return (User) users.stream().filter(u -> u.getId() == id).findFirst().get();
	}

	public void addUser(User user) {

		users.add(user);
	}

	public boolean validateUser(User user) {
		System.out.println(user);
		return locales.contains(user.getLoc()) 
				&& user.getEmail().endsWith(COMPANY_DOMAIN) 
				&& dateFrmtPtrn.matcher(user.getDob()).matches();
	}

}
