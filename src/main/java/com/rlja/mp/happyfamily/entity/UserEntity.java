package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @program: happyfamily
 * @description: UserEntity
 * @author: Vaskka
 * @create: 2019/5/6 10:43 AM
 **/
@Document(collection = "user")
@AllArgsConstructor
@ToString
public class UserEntity extends BaseEntity {

    /**
     * openid
     */
    @Id
    private String openid;

    /**
     * 注册时间
     */
    private Timestamp createTime;

    /**
     * 生日
     */
    private Date birth;

}
