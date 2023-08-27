package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")

public class Controller {

    @Autowired
    private Myrepository studentRepository;

@Autowired
private CustomGateway customGateway;
    @PostMapping ("/customer")
    public String addStudent(@RequestBody Banking person){
//        CustomGateway.print(student);
        customGateway.print(person);
        System.out.println(person.getId());
        return "data entered";
    }
@GetMapping("/get")
    public void getstudent(){
        customGateway.getStudents();
}



}


