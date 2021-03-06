package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	
	@Autowired
	private UserRepository repo;
	
	//mapping index page
	@GetMapping("")
	public String viewHomePage() {	
		return "index";
	}
 
	//mapping register page
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user",new User());
		return "signup_form";
	}
	
	//mapping registering process
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		repo.save(user);
		
		return "register_success";
	}
	
	//mapping city navigator page
	@GetMapping("/city_navigator")
	public String viewUser() {
		return "navi";
	}
		
	//Andhra Pradesh
	@GetMapping("/andhra")
	public String pAndhra() {
		return "andhra";
	}
	
	//Delhi-NCR
	/*places*/
	@GetMapping("/placesDelhi")
	public String pDelhi() {
		return "placesDelhi";
	}
	@GetMapping("/otherDelhi")
	public String oDelhi() {
		return "otherDelhi";
	}
	/*restaurants*/
	@GetMapping("/restuarantsDelhi")
	public String resDelhi() {
		return "restuarantsDelhi";
	}
	@GetMapping("/otherRestaurantsDelhi")
	public String resDelhi1() {
		return "otherRestaurantsDelhi";
	}
	
	//Punjab
	/*places*/
	@GetMapping("/placesPb")
	public String pPb() {
		return "placesPb";
	}
	@GetMapping("/other")
	public String oPb() {
		return "other";
	}
	/*restaurants*/
	@GetMapping("/restuarantsPb")
	public String resPb() {
		return "restuarantsPb";
	}
	@GetMapping("/otherRestaurants")
	public String resPb1() {
		return "otherRestaurants";
	}
	
	//Tamil Nadu
	@GetMapping("/tamil")
	public String pTamil() {
		return "tamil";
	}
	
	//Back to customer profile
	@GetMapping("/navi")
	public String Back() {
		return "navi";
	}
}