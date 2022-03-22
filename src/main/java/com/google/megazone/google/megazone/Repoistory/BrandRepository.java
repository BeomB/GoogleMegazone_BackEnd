package com.google.megazone.google.megazone.Repoistory;

import com.google.megazone.google.megazone.Entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand,Long > {

}
