package in.ashok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashok.service.RepoService;

@Controller
public class ReportController {
   
	
	@Autowired
	private RepoService repoService;
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
}
