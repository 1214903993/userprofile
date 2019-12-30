package com.wyh.userprofile.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "stu")
public class Student {
    @Id
    private String sid;
//    @Column(name = "sname")
//    @Column(name = "sname")
    private String sname;
    private Integer age;
    private String gender;
}
