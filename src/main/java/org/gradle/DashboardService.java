package org.gradle;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

	private Logger log = Logger.getLogger("DashboardService");
	
	public String getDesc() {

		log.info("getDesc() is executed!");
		String desc="Welcome to the Spectrum Sensing Dashboard";
		return desc;
	}

	public String getTitle() {

		log.info("getTitle() is executed!");
		String title="Dashboard";
		return title;
	}
}
