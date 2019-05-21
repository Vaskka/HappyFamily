package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * @program: happyfamily
 * @description: JournalEntity
 * @author: Vaskka
 * @create: 2019/5/6 11:34 AM
 **/
@Document(collection = "journal")
@AllArgsConstructor
@ToString
public class JournalEntity extends BaseEntity {

    @Id
    private String journalId;

    /**
     * 创建的家庭成员
     */
    private MemberEntity memberCreator;

    /**
     * 日志内容（考虑前端富文本输入转html，渲染再利用html渲染插件）
     */
    private String content;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 创建时间
     */
    private Timestamp createTime;



}
