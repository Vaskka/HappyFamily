package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @program: happyfamily
 * @description: MemberEntity 家庭成员实体
 * @author: Vaskka
 * @create: 2019/5/6 10:32 AM
 **/

@Document(collection = "member")
@AllArgsConstructor
@ToString
public class MemberEntity extends BaseEntity {

    @Id
    private String memberId;

    /**
     * 成员关联的用户
     */
    private UserEntity innerUser;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 成员角色（爸爸，妈妈，儿子，女儿等）
     */
    private String type;

    /**
     * 成员标签
     */
    private List<String> tags;

    /**
     * 亲情值
     */
    private int relationGrade;


}
