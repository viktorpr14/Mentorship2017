package spring.mvc.manager;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.manager.model.User;

@Controller
public class UserController {
	private static List<User> users = new LinkedList<>();
	@RequestMapping(method=RequestMethod.GET, value="/users/add")
	public ModelAndView addUserForm() {
		return new ModelAndView("add-user", "user", new User());
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users/")
	public String addUser(@ModelAttribute("user") User user,
			ModelMap model) {
		users.add(user);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("id", user.getId());
		return "user-created";
	}
	@RequestMapping(method=RequestMethod.GET, value="/users/")
	public String findAllUsers(ModelMap model) {
		model.addAttribute("users", users);
		return "users-table";
	}
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public String searchUserById(@RequestParam String id, ModelMap model) {
		User foundUser = users.stream().filter(u->u.getId().equals(id)).findFirst().get();
		model.addAttribute("user", foundUser);
		return "user-profile";
	}
}
