package com.rlja.mp.happyfamily.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @program: happyfamily
 * @description: HelloEntity
 * @author: Vaskka
 * @create: 2019/4/29 10:00 AM
 **/
@Document(collection = "hello")
@AllArgsConstructor
@Data
@ToString
public class HelloEntity {

    @Id
    private String id;

    private String name;


}
