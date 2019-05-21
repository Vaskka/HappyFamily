package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * @program: happyfamily
 * @description: QuestionEntity
 * @author: Vaskka
 * @create: 2019/5/6 11:19 AM
 **/
@Document(collection = "question")
@AllArgsConstructor
@ToString
public class QuestionEntity extends BaseEntity {
    @Id
    private String questionId;

    /**
     * 提问内容
     */
    private String content;

    /**
     * 创建者
     */
    private MemberEntity sender;

    /**
     * 被提问者
     */
    private MemberEntity receiver;

    /**
     * 回复
     */
    private List<ReplyEntity> replies;

}
