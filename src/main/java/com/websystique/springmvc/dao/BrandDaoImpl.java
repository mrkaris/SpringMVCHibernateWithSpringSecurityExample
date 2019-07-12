/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Brand;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dimitris
 */
@Repository("brandDao")
@Transactional
public class BrandDaoImpl extends AbstractDao<Integer, Brand> implements BrandDao {

    @SuppressWarnings("unchecked")
    public List<Brand> findAllBrands() {
       Criteria criteria = createEntityCriteria();
        return (List<Brand>) criteria.list();
    }

    @Override
    public Brand findById(int id) {
       return getByKey(id);
    }

    @Override
    public void saveBrand(Brand b) {
        persist(b);
    }

    @Override
    public void deleteBrandById(int id) {
       delete(findById(id));
    }

   

    
    
    
}
