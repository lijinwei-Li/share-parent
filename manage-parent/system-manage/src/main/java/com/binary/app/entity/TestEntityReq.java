package com.binary.app.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Lijw
 */
@Data
@ApiModel(value="学生对象",description="学生信息的实体类")
public class TestEntityReq {
    @ApiModelProperty(value="姓名",name="name",example="黎锦威")
    private String name;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("学校")
    private String school;

}
