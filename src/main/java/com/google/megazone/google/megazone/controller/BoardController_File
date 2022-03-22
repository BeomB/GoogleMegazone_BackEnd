package com.google.megazone.google.megazone.controller;

import com.google.megazone.google.megazone.Entity.Brand;
import com.google.megazone.google.megazone.Repoistory.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BrandController {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @PostMapping("/post")
    public Brand PostBrand(Brand brand){
    return brandRepository.save(brand);
    }

    @PutMapping("/Put")
    public Brand PutBrand(Brand brand){
        return brandRepository.save(brand);
    }

    @DeleteMapping("/delete")
    public void DeleteBrand(Long id)
    {
        brandRepository.deleteById(id);
    }

    @GetMapping("/get")
    public Brand GetBrandID(Long id)
    {
        return brandRepository.findById(id).orElse(null);
    }

//    @GetMapping("/get/member")
//    public List<Brand> GetBrandMember(Long id, String name, Long count)
//    {
//        return brandRepository.findByIdAndNameAndCount(id, name, count);
//    }

    @GetMapping("/get/sql")
    public List<Brand> GetBrandSQL(String name)
    {
        return brandRepository.findBySQL("이범기");
    }



    @GetMapping("/get/name")
    public List<Brand> GetBrandName(String name)
    {
        return brandRepository.findByName(name);
    }

    @GetMapping("/get/name/like")
    public List<Brand> GetBrandNameLike(String name)
    {
        return brandRepository.findByNameLike("%"+name+"%");
    }




    @GetMapping("/get/list")
    public List<Brand> getBrandList()
    {
    return (List<Brand>) brandRepository.findAll();
    }



}
