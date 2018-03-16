package com.tht.springbooksimpleproject.userDetails;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetails {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userDetails")
	public List<User> getUserDetails() {
		return userService.getUserDetails();
	}
	
	@RequestMapping("/userDetails/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/userDetails")
	/*public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}*/
	
	public ResponseEntity<?> createUser(@RequestBody User user) {
		if(userService.validateUser(user)==true) {
			userService.addUser(user);
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		else 
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
	}
	
}	