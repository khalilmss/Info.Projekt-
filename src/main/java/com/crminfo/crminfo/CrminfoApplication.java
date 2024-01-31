package com.crminfo.crminfo;

import com.crminfo.crminfo.entity.Kunden;
import com.crminfo.crminfo.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrminfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrminfoApplication.class, args);
	}


}
