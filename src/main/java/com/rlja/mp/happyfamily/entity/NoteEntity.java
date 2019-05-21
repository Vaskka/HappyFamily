package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @program: happyfamily
 * @description: NoteEntity
 * @author: Vaskka
 * @create: 2019/5/20 11:38 AM
 **/
@Document(collection = "note")
@AllArgsConstructor
@ToString
public class NoteEntity extends BaseEntity {

    @Id
    private String noteId;

    /**
     * 创建者
     */
    private MemberEntity memberCreator;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 是否完成
     */
    private Boolean done;

    /**
     * 进行活动的日期
     */
    private Date activityDate;

    /**
     * 提醒内容
     */
    private String content;

    /**
     * tag
     */
    private List<String> tags;
}

