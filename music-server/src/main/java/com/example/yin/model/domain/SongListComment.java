package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@TableName(value = "songlist_comment")
@Data
public class SongListComment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer songListId;

    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Byte type;

    private Integer up;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
