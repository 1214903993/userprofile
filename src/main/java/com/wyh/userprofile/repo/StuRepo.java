package com.wyh.userprofile.repo;

import com.wyh.userprofile.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepo extends JpaRepository<Student,String> {

}
