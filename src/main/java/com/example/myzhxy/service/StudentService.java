package com.example.myzhxy.service;

import com.example.myzhxy.pojo.LoginForm;
import com.example.myzhxy.pojo.Student;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


public interface StudentService extends IService<Student> {


    Student login(LoginForm loginForm);


    Student getStudentById(Long userId);

    IPage<Student> getStudentByOpr(Page<Student> pageParam, Student student);
}
