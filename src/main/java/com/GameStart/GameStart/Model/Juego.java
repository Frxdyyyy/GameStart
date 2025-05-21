package com.GameStart.GameStart.Controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity

public class Juego {
    @Id
    @GenerationValue(strategy = GnerationType.IDENTITY)
    private Intefer id;

    @Column(nullable=true)
    private String nombre_juego;

    @Column(nullable=true)
    private String genero_juego;

    @Column(nullable=true)
    private String stock_juego;

    @Column(nullable=true)
    private String precio_juego;

    @ManyToOne 
    private Venta venta;
    
}
