package com.imagerequest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/images")
public class getProduct {	

	private Boolean executando = true;
	int cont = 0;
	
	@RequestMapping(method = RequestMethod.GET, path = "/{image}")
	public ResponseEntity<?> findImage(@PathVariable("image") String image) {
		
		if(executando == true) {
			if(cont == 5) {
				executando = false;
			}
			cont += 1;
			return new ResponseEntity<>(HttpStatus.OK);
			
		}else {
			executando = true;
			cont = 0;
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
				
	}	
}
