package com.blueocean.ShoppingCart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blueocean.ShoppingCart.model.Office;
import com.blueocean.ShoppingCart.service.OfficeService;

@RestController
@RequestMapping("/api/v1")
public class OfficeController {

	@Autowired
	private OfficeService officeservice;
	
	@GetMapping("/office")
	ResponseEntity<?> getoffices()
	{
		try 
		{
			List<Office> offices = officeservice.getOffices();
			return new ResponseEntity<List<Office>>(offices,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("office/{officecode}")
	ResponseEntity<?> getEmployeesbyemployeenumber(@PathVariable(value = "officecode") String officecode) 
	{
		 Office office = officeservice.getOffice(officecode);
		    if (office == null) {
		        return ResponseEntity.notFound().build();
		    }
		    return ResponseEntity.ok().body(office);
	}
	 @PostMapping("/office")
	 ResponseEntity<?> createOffice(@Valid @RequestBody  Office office) {
		 try
			{
			 Office officeobj = officeservice.createOffice(office);
			 return new ResponseEntity<Office>(officeobj,HttpStatus.CREATED);
			}
			catch(Exception e)
			{
				return new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
			}
	}
	 
	 @PutMapping("/office/{officecode}")
		ResponseEntity<?> updateoffice(@PathVariable("officecode") String officecode, @RequestBody Office office)
		{		
		 Office officeobj = null;
			try {
				officeobj = officeservice.updateoffice(officecode, office);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return new ResponseEntity<String>("error office code is not found",HttpStatus.NOT_FOUND);
			}
			if(officeobj!=null)
			{
				return new ResponseEntity<Office>(officeobj,HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("office code is not found",HttpStatus.NOT_FOUND);
			}
		}
	 	@DeleteMapping("/office/{officecode}")
		ResponseEntity<?> deleteuser(@PathVariable("officecode") String officecode)
		{		
		 Boolean officeobj;
			try {
				officeobj = officeservice.deleteoffice(officecode);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return new ResponseEntity<String>("error office code is not found",HttpStatus.NOT_FOUND);
			}
			if(officeobj!=null)
			{
				return new ResponseEntity<String>("office code is deleted",HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("office code is not found",HttpStatus.NOT_FOUND);
			}
		}
}
