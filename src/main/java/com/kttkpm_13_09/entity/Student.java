package com.kttkpm_13_09.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String fName;
    private  String lName;
    private String email;
}

