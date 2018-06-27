package main.java.com.myyong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@Value("${welcome.message:test}")
	private String message="Hello World";
	
	@RequestMapping(value="/12345")
	public String welcome(ModelMap model) {
		model.put("rows", 100);
		model.put("message", this.message);
		return "welcome";
		
	}
	
	@RequestMapping(value="/hi")
	public String Hello(ModelMap model, String age) {
		model.put("name", "SS");
		model.put("age", age);
		return "Hello";
	}
}
