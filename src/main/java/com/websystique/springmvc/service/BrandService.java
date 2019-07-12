/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Brand;
import java.util.List;

/**
 *
 * @author kat26
 */
public interface BrandService {
    
        Brand findById(int id);
	
	void saveBrand(Brand brand);
	
	void updateBrand(Brand brand);
	
	void deleteBrandById(int id);

	List<Brand> findAllBrands(); 
	
	
    
}
