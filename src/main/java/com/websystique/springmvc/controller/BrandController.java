package com.websystique.springmvc.controller;

import com.websystique.springmvc.model.Brand;
import com.websystique.springmvc.service.BrandService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/brands")
public class BrandController {

    @Autowired
    BrandService service;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllBrands(ModelMap model) {
        List<Brand> brands = service.findAllBrands();
        model.addAttribute("brands", brands);
        return "brandsAdm";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Brand b = service.findById(id);
        model.addAttribute("brand", b);
        return "brandview";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
      
        Brand brand = new Brand();
        
        model.addAttribute("brand", brand);
        
        return "addBrand";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveBrand(@Valid Brand brand, BindingResult result, ModelMap model) {
        service.saveBrand(brand);
        if (result.hasErrors()) {
            return "insert";
        }
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBrandById(ModelMap model, @PathVariable("id") int id) {
        service.deleteBrandById(id);

        return "success";
    }
    

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("brand", service.findById(id));
        return "update";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateBrand(@Valid Brand brand, BindingResult result, ModelMap model) {
        service.updateBrand(brand);
        if(result.hasErrors()) {
            int id = brand.getBrandId();
            return "update/{" + id + "}";
        }
        return "success";
    }

}
