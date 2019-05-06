package com.rlja.mp.happyfamily.entity;

import com.rlja.mp.happyfamily.entity.base.BaseEntity;

import java.sql.Timestamp;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @program: happyfamily
 * @description: GroupEntity
 * @author: Vaskka
 * @create: 2019/5/6 10:38 AM
 **/

@Document(collection = "group")
@AllArgsConstructor
@ToString
public class GroupEntity extends BaseEntity {

    @Id
    private String groupId;

    /**
     * 亲情组名字
     */
    private String name;

    /**
     * 成员
     */
    private List<MemberEntity> members;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 家庭组相册集列表（创建每个组需要初始化默认相册集用来存储全家福）
     */
    private List<PictureSetEntity> pictureSets;


    /**
     * 纪念日列表（创建每个组需要初始化生日在这个list中）
     */
    private List<MemoryDateEntity> memoryDates;

    /**
     * 家庭日志
     */
    private List<JournalEntity> journals;
    
}
