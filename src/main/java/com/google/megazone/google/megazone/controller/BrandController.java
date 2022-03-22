package com.google.megazone.google.megazone.controller;

import com.google.megazone.google.megazone.Entity.Brand;
import com.google.megazone.google.megazone.Repoistory.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BrandController {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @PostMapping("/post")
    public Brand putBrand(Brand brand){
    return brandRepository.save(brand);
    }

    @DeleteMapping("/delete")
    public void DeleteBrand(Long id)
    {
        brandRepository.deleteById(id);
    }



//    @GetMapping("getbrand/{id}")
//    public Optional<Brand> getBradId(@PathVariable("id") Long id)
//    {
//        return brandRepository.getClass();
//    }


//    @GetMapping("getbrand/{id}/{name}")
//    public Brand getbrandByIdName(@PathVariable("id") Long id, @PathVariable("name") String name)
//    {
//
//        Brand brand = new Brand();
//        brand.setId(id);
//        brand.setName(name);
//        return brand;
//
//    }



    @GetMapping("/getbrand2")
    public Iterable<Brand> GetBrand2()
    {
        return brandRepository.findAll();
    }

//    @GetMapping("getbrand2")
//    public Iterable<Brand> GetBrand2()
//    {
//        return
//    }



    @PutMapping("/getbrand/{data}")
    public String UpdateBrand(@RequestParam Long Id, @RequestParam String name, @RequestParam Long count )
    {


        return "Success";

    }




}
