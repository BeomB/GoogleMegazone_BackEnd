package com.google.megazone.google.megazone.Repoistory;

import com.google.megazone.google.megazone.Entity.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends CrudRepository<Brand,Long > {


    List<Brand> findByName(String name);
    List<Brand> findByCount(Long count);
    List<Brand> findByNameLike(String name);
    List<Brand> findByIdOrNameOrCount(Long id, String name, Long count);


    @Query(value = "select * from whatbrand where name =?1 ",nativeQuery = true) // 쿼리문으로 그 즉시 만들기  //native query = "실제 있는 SQL 문 사용하기"
    List<Brand> findBySQL(String value1);


}
