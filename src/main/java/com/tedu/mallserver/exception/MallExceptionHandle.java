package com.tedu.mallserver.exception;

import com.tedu.mallserver.pojo.ServerResult;
import org.apache.catalina.Server;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//调controller时自动调用方法
public class MallExceptionHandle {
    @ExceptionHandler
    public ServerResult exceptionHandle(Throwable e){
        //保存到数据库，显示异常
        //返回错误信息给前端
        String message = e.getMessage();
        e.printStackTrace();//打到控制台
        ServerResult serverResult = new ServerResult(500, "fuck wrong", message);
        return serverResult;

    }
}
