package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @program: happyfamily
 * @description: MemoryDateEntity
 * @author: Vaskka
 * @create: 2019/5/6 11:07 AM
 **/
@Document(collection = "memoryDate")
@AllArgsConstructor
@ToString
public class MemoryDateEntity extends BaseEntity {
    @Id
    private String memoryDateId;

    /**
     * 纪念日日期
     */
    private String date;

    /**
     * 纪念日名称
     */
    private String name;


}
