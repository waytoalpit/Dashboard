package org.gradle;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Home")
public class DashboardController {
	
	private Logger log = Logger.getLogger("DashboardController");
	private final DashboardService dashboardService;

	
	@Autowired
	public DashboardController(DashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcomeMethod() {

		log.info("welcomeMethod() is executed!");
		ModelAndView model = new ModelAndView();
		
		model.addObject("title", dashboardService.getTitle());
		model.addObject("msg", dashboardService.getDesc());
		
		model.setViewName("Home");

		return model;
	}

}