package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @program: happyfamily
 * @description: ReplyEntity
 * @author: Vaskka
 * @create: 2019/5/6 11:27 AM
 **/
@Document(collection = "reply")
@AllArgsConstructor
@ToString
public class ReplyEntity extends BaseEntity {

    @Id
    private String replyId;

    /**
     * 恢复内容
     */
    private String content;

    /**
     * 创建者
     */
    private MemberEntity sender;

    /**
     * 接受者
     */
    private MemberEntity receiver;

    /**
     * 想要回复的reply实体id，如果回复的是Question实体（例如第一条回复），则此字段为固定字符串"FIRST"
     */
    private String wantToReplyId;
}

