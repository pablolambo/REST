package com.example.demoRESTweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestTest {
    private List<Student> listOfStudents = new ArrayList<Student>();

    @GetMapping("getStudents")
    public List<Student> getData(){
        return listOfStudents;
    }

    @PostMapping("addStudent")
    public void addStudent(@RequestBody Student student){
        listOfStudents.add(student);
    }

    @DeleteMapping("deleteStudent")
    public void deleteStudents(){
        listOfStudents.clear();
    }
}
