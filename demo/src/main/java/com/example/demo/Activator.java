package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
    public class Activator{
        @Autowired
        private Myrepository db;
        @ServiceActivator(inputChannel = "echoChannel")
        public void print(Banking person)
        {
             db.save(person);

        }
        @ServiceActivator(inputChannel= "getchannel")

        public ResponseEntity<?> getStudents() {
            System.out.println(db.findAll());
            return ResponseEntity.ok(db.findAll());
        }
        }
