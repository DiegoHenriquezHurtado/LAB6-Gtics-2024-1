package com.example.cplab6.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios",nullable = false)
    private Integer idUsuarios;

    @Column(name = "rol",nullable = false)
    private String rol;

    @Column(name = "correo",nullable = false)
    private String correo;

    @Column(name = "password",nullable = false)
    private String password;
}
