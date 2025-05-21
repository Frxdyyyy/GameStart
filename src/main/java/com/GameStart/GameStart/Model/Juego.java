package com.GameStart.GameStart.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "juego")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private String nombre_juego;

    @Column(nullable = true)
    private String genero_juego;

    @Column(nullable = true)
    private String stock_juego;

    @Column(nullable = true)
    private String precio_juego;

    @ManyToOne
    private Venta venta;
}