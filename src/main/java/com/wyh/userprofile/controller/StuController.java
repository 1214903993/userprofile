package com.wyh.userprofile.controller;

import com.wyh.userprofile.pojo.Student;
import com.wyh.userprofile.repo.StuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("student")
@ResponseBody
public class StuController {
    @Autowired
    private StuRepo stuRepo;

    @RequestMapping("findAllStu")
    public List<Student> findAllStu(){
        List<Student> list = stuRepo.findAll();
        return list;
    }

    /**
     * 根据sid找学生
     */
    @RequestMapping("findStuBySid")
    public Student findStuBySid(String sid){
        Optional<Student> stu = stuRepo.findById(sid);
        return stu.get();
    }

    /**
     *添加一个用户
     */
    @RequestMapping("saveStu/{sid}/{sname}/{age}/{gender}")
    public Student saveStu(@PathVariable String sid,@PathVariable String sname,@PathVariable Integer age,@PathVariable String gender){
        Student stu = new Student();
        stu.setSid(sid);
        stu.setSname(sname);
        stu.setAge(age);
        stu.setGender(gender);
        Student save = stuRepo.save(stu);
        return save;
    }
}
