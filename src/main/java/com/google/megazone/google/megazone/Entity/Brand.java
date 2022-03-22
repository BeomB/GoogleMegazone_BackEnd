package com.google.megazone.google.megazone.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Data                       //Brand라는 member변수에 해당하는 getter setter가 자동으로 생성된다.
@Table(name="whatbrand")
public class Brand {


    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Long count;

    public Brand()
    {

    }


    public Brand(Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

}
