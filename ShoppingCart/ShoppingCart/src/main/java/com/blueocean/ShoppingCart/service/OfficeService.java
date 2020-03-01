package com.blueocean.ShoppingCart.service;

import java.util.List;
import com.blueocean.ShoppingCart.model.Office;

public interface OfficeService {

	List<Office> getOffices();
	
	Office getOffice(String officeCode);
	
	Office createOffice(Office office) throws Exception;
	
	Office updateoffice(String officecode, Office office);	
	
	Boolean deleteoffice(String officecode);
}
