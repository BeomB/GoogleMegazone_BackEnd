package com.google.megazone.google.megazone.Repoistory;

import com.google.megazone.google.megazone.Entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {         ///CRUD Repository 인터페이스 활용, <?,?> => Entity이름 Entity PK 값

    Brand findByName(String name);         ///CRUD 인터페이스에서 알아서 찾아준다.



}
