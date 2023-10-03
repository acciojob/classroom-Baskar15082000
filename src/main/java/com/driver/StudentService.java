package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void addstudentbybody(Student obj,String name){
        studentRepository.addstudentbybody(obj,name);
    }
    public void addteacherbybody(Teacher obj,String name){
        studentRepository.addteacherbybody(obj, name);
    }
    public void addstudend_teacher_pair(String s_name,String t_name){
        studentRepository.addstu_tea_pair(s_name,t_name);
    }
    public Student getstudent(String name){
        return studentRepository.getstudent(name);
    }
    public Teacher getteacher(String name){
        return studentRepository.getteacher(name);
    }
    public List<String> getallstudentbyteacher(String name){

        return studentRepository.getallstudentbyteacher(name);
    }
    public List<String> getallstudent(){
        return studentRepository.getallstudent();
    }
    public void deleteteacher(String name){
       studentRepository.deleteteacher(name);

    }
    public void deleteall(){
        studentRepository.deleteall();
    }

}
