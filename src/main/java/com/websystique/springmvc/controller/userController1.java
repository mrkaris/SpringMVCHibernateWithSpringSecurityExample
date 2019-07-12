/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.controller;

import com.websystique.springmvc.model.Brand;
import com.websystique.springmvc.service.BrandService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author George
 */
@Controller
@RequestMapping("/brands")
public class userController1 {
    
    @Autowired
    BrandService service;

//    //==================================GET ALL - GET BY ID================================
//    @RequestMapping(value = {"/getInstruments"}, method = RequestMethod.GET)
//    public String getInstruments(ModelMap model) {
//        List<Instrument> instruments = service.findAllInstruments();
//        model.addAttribute("instrumentsList", instruments);
//
//        return "userInstruments";
//    }
//
//    @RequestMapping(value = {"/getInstrument/{id}"}, method = RequestMethod.GET)
//    public String getInstrument(ModelMap model, @PathVariable Integer id) {
//        Instrument instrument = service.findById(id);
//        model.addAttribute("instrument", instrument);
//
//        return "userInstruments";
//    }
//    
//    //======================== GET INSTRUMENT BY TYPE ==========================
//    
//    @RequestMapping(value = {"/getInstrumentType/{type}"}, method = RequestMethod.GET)
//    public String findByType(ModelMap model, @PathVariable String type) {
//        List<Instrument> instruments = service.findByType(type);
//        model.addAttribute("instrument", instruments);
//
//        return "userInstruments";
//    }
//    
    //======================== GET INSTRUMENT BY BRAND ==========================
    
//    @RequestMapping(value = {"/getInstrumentBrand/{id}"}, method = RequestMethod.GET)
//    public String findByBrandId(ModelMap model, @PathVariable  Integer id) {
//       Instrunment  instrument = service.findById(id);
//        model.addAttribute("instrument", instrument);
//
//        return "userInstruments";
//    }
    
    
    
    @RequestMapping(value = {"/getBrands"},method = RequestMethod.GET)
    public String findAllBrands(ModelMap model) {
        List<Brand> brands = service.findAllBrands();
        model.addAttribute("brands", brands);
        return "brandsUsr";
    }
    
    @RequestMapping(value = "/getBrand/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Brand b = service.findById(id);
        model.addAttribute("brand", b);
        return "brandview";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(ModelMap model) {
        return "index2";
    }
    
    
}
