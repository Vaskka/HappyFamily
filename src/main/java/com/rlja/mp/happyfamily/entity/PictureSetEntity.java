package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import java.util.List;

/**
 * @program: happyfamily
 * @description: PictureSetEntity
 * @author: Vaskka
 * @create: 2019/5/6 10:48 AM
 **/
@Document(collection = "pictureSet")
@AllArgsConstructor
@ToString
public class PictureSetEntity extends BaseEntity {

    @Id
    private String pictureSetId;

    /**
     * 照片集名字
     */
    private String name;

    /**
     * 照片列表
     */
    private List<PictureEntity> pictures;
}
