package com.Projeto.crud.resources;

import com.Projeto.crud.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public User findAll(){
        User u = new User(1L, "Felipe", "felipegmail.com", "91912345678", "1234");
        return ResponseEntity.ok().body(u).getBody();
    }

}
