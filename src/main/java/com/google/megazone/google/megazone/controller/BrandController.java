package com.google.megazone.google.megazone.controller;


import com.google.megazone.google.megazone.Entity.Brand;
import com.google.megazone.google.megazone.Repoistory.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BrandController {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @GetMapping("/database")
    public List<Brand> getBrand()
    {
        return (List<Brand>) brandRepository.findAll();
    }

//    @PutMapping("/Put")
//    public Brand PutBrand(Brand brand){
//        return brandRepository.save(brand);
//    }
//    let sql = 'UPDATE duo97 SET count=count+1 WHERE name=?';
    @PutMapping("/database/{name}")
    public Brand UpdateBrand(@PathVariable("name") String name)
    {
        Brand brand = brandRepository.findByName(name);
        brand.setCount(brand.getCount()+1);
        brandRepository.save(brand);
        return brand;
    }



}
