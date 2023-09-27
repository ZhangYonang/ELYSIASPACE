package com.elysia.model.backgroundmodel;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "管理员")
@TableName("admin")
public class admin {

    @ApiModelProperty(value = "管理员id")
    @TableField("id")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "真实姓名")
    @TableField("turename")
    private String turename;

    @ApiModelProperty(value = "电话号码")
    @TableField("tel")
    private String tel;

    @ApiModelProperty(value = "邮箱地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "头像图片")
    @TableField("head_img")
    private byte[] headImg;
}