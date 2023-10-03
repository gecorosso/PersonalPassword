package it.personal.psw.PswController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonalController {
	
	@ResponseBody
	@GetMapping("/myTest")
	public String testPersonal() {
		return "Test Avvenuto correttamente";
	}	
	
	
	@GetMapping("/loginPage")
	public String pagLogin(ModelMap mm) {
		mm.addAttribute("title","Pagina Di Login");
		return "loginPage";
	}
	
	@GetMapping("/underPage")
	public String underCostruction(ModelMap model) {
		return "under";
	}
	
	@PostMapping("/gestionePage")
	public String personalPassPage(@RequestParam("username") String user, @RequestParam("password") String pass,ModelMap model) {
		
		model.addAttribute("title","Gestione Password Personal Pass");
		model.addAttribute("user",user);
		model.addAttribute("pass",pass);
		
		return "gestionePsw";
	}
	
	
	
}
