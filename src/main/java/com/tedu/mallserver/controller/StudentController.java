package com.tedu.mallserver.controller;

import com.tedu.mallserver.pojo.ServerResult;
import com.tedu.mallserver.pojo.StudentDTO;
import com.tedu.mallserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/login")
    public ServerResult login(StudentDTO studentDTO){
        Integer id = studentService.login(studentDTO);
        if(id != -1)
            return new ServerResult(0,"login success",id);
        else
            return new ServerResult(-1,"login failed",-1);

    }
}
