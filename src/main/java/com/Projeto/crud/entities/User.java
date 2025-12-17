package com.Projeto.crud.entities;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String passaword;

}
