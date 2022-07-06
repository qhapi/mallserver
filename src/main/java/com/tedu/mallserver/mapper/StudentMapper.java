package com.tedu.mallserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tedu.mallserver.pojo.StudentDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<StudentDAO> {
}
