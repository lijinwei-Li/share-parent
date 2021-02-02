package com.binary.app.controller;

import com.alibaba.fastjson.JSON;
import com.binary.app.entity.TestEntityReq;
import com.binary.app.service.TestService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.spring.web.json.Json;

import java.util.List;
import java.util.Map;

@Api("测试的控制类")
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/testWary")
    @ResponseBody
    @ApiOperation("查询book表")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value ="学生姓名",required=false,paramType="path",dataType="String"),
            @ApiImplicitParam(name="age",value = "学生年龄",required=false,paramType="path",dataType="int")
        })
    public Object testWary(){
        List<Map<String,Object>> list = testService.query();
        return list;
    }

    @PostMapping("/testStudent")
    @ResponseBody
    @ApiOperation("查询学生信息")
    public Object testStudent(TestEntityReq req){
        List<Map<String,Object>> list = testService.query();
        System.out.println(JSON.toJSONString(req));
        return list;
    }
}
