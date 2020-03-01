package com.blueocean.ShoppingCart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Office;
import com.blueocean.ShoppingCart.repository.OfficeRepository;

@Service
public class OfficeServiceImpln implements OfficeService{

	@Autowired
	private OfficeRepository officerepo;
	

	@Override
	public List<Office> getOffices() {
		return officerepo.findAll();
	}

	@Override
	@Cacheable(value="office", key ="#officeCode")
	public Office getOffice(String officeCode) {

		return officerepo.findById(officeCode).orElse(null);
	}

	@Override
	public Office createOffice(Office office) throws Exception {
		Office officeobj;
		try
		{
			officeobj = officerepo.findById(office.getOfficeCode()).orElse(null);
		if(officeobj !=null) {
			throw new Exception("office is already exists");
		}
		return officerepo.save(office);
		}
		catch(Exception ex)
		{
			throw new Exception("office is already exists");
		}	
	}

	@Override
	@CachePut(value = "office", key = "#officecode")
	public Office updateoffice(String officecode, Office office) {
		Office officeobj = officerepo.findById(officecode).orElse(null);

		Office officenewobj;
		if( officeobj !=null)
		{
			officenewobj = officerepo.save(office);
			return officenewobj;
		}
		else
		{
			return null;
		}	
	}

	@Override
	//@CacheEvict(value="office" , key = "#officecode")
	@CacheEvict(value="office", allEntries = true)
	public Boolean deleteoffice(String officecode) {
		// TODO Auto-generated method stub
		Office officeobj = officerepo.findById(officecode).orElse(null);
		if(officeobj !=null) 
		{
			officerepo.delete(officeobj);
			return true;
		}
		return false;
	}
	

}
