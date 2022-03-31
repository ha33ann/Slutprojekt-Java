package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FileReaderController {

	@RequestMapping(
			value = "/showCsvFile",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public void showCsvFile(HttpServletResponse response) throws IOException {
		var csvFile = new ClassPathResource("sample.csv");
		
		response.setContentType(MediaType.TEXT_PLAIN_VALUE);
		StreamUtils.copy(csvFile.getInputStream(), response.getOutputStream());
	}
	

	@RequestMapping(
			value = "/showCsvFile", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String showCsvFile() throws IOException {
		FileReaderBean reader = new FileReaderBean();
		reader.readFile("sample.csv");
		String text = reader.ShowJson();
		
		return text;
	}
	
	
}