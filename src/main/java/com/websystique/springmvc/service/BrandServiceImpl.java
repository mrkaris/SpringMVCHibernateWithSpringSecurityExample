/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.service;

import com.websystique.springmvc.dao.BrandDao;
import com.websystique.springmvc.model.Brand;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kat26
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao dao;

    @Override
    public Brand findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveBrand(Brand brand) {
        dao.saveBrand(brand);
    }

    @Override
    public void updateBrand(Brand brand) {
        Brand entity = dao.findById(brand.getBrandId());
        if (entity != null) {
            entity.setName(brand.getName());
            entity.setInfo(brand.getInfo());
        }
        
    }

    @Override
    public void deleteBrandById(int id) {
        dao.deleteBrandById(id);
    }

    @Override
    public List<Brand> findAllBrands() {
        return dao.findAllBrands();
    }


}
