package com.smar.assetview;

import com.smar.assetview.controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AssetviewApplication extends SpringBootServletInitializer {
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookController.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AssetviewApplication.class, args);
	}
}
