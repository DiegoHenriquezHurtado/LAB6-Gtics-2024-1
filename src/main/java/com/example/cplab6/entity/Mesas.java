package com.example.cplab6.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "mesas")
public class Mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmesas",nullable = false)
    private Integer idMesas;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "f_inicio_reserva")
    private Date fechaInicialReserva;

    @Column(name = "f_final_reserva")
    private Date fechaFinalReserva;

    @Column(name = "ubicacion",nullable = false)
    private String ubicacion;

    @Column(name = "capacidad",nullable = false)
    private Integer capacidad;

    @ManyToOne
    @JoinColumn(name = "usuarios_idusuarios")
    private Usuarios usuarios;

    @Column(name = "disponibles")
    private Integer disponibles;
}
