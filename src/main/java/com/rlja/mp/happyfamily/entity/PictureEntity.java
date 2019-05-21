package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @program: happyfamily
 * @description: PictureEntity
 * @author: Vaskka
 * @create: 2019/5/6 10:51 AM
 **/
@Document(collection = "picture")
@AllArgsConstructor
@ToString
public class PictureEntity extends BaseEntity {

    /**
     * 照片id
     */
    @Id
    private String PictureId;

    /**
     * 拟采用云开发的对象存储，此处存储的是云开发的图片id，后期如果换云运营商在改成对应的id或url
     */
    private String objectPointer;
}
