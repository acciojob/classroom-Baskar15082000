package com.driver;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRepository {
    HashMap<String,Student>student=new HashMap<>();
    HashMap<String,Teacher>teacher=new HashMap<>();
    HashMap<String,List<String>>student_teacher=new HashMap<>();
    public void addstudentbybody(Student obj,String name){
          student.put(name,obj);
    }
    public void addteacherbybody(Teacher obj,String name){
        teacher.put(name,obj);
    }
    public void addstu_tea_pair(String student_name,String teacher_name){
       if(student_teacher.containsKey(teacher_name)){
           List<String>list=student_teacher.get(teacher_name);
           list.add(student_name);
           student_teacher.put(teacher_name,list);
       }
       else{
           List<String >list=new ArrayList<>();
           list.add(student_name);
           student_teacher.put(teacher_name,list);
       }

    }
    public Student getstudent(String name){
        return student.get(name);
    }
    public Teacher getteacher(String name){
        return teacher.get(name);
    }
    public List<String> getallstudentbyteacher(String name){

        return student_teacher.get(name);
    }
    public List<String> getallstudent(){
        List<String> list=new ArrayList<>();
        for(Student obj:student.values()){
            list.add(obj.getName());
        }
        return list;
    }
    public void deleteteacher(String name){
        teacher.remove(name);
        student_teacher.remove(name);

    }
    public void deleteall(){
        student.clear();
        teacher.clear();
        student_teacher.clear();
    }


}
