package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@RestController
public class MainController {

	// @CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("findAllUser")
	public List<User> findAllUser() {
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			User user = new User();
			list.add(user);
			user.id = i;
			user.name = "name_" + i;
			user.age = 20 + i;
		}
		return list;
	}

}
