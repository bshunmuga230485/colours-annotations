package com.learnsb.coloursannotations;

import com.learnsb.coloursannotations.services.ColourPrinter;
import com.learnsb.coloursannotations.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursAnnotationsApplication implements CommandLineRunner {

	public ColourPrinter colourPrinter;

	public ColoursAnnotationsApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColoursAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}
