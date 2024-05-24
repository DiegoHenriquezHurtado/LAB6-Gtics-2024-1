package com.example.cplab6.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios",nullable = false)
    private Integer idUsuarios;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "rol",nullable = false)
    private String rol;

    @Column(name = "correo",nullable = false)
    private String correo;

    @Column(name = "password",nullable = false)
    private String password;
}
