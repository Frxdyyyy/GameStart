package com.GameStart.GameStart.Model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "venta")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Venta {
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Intefer id;

    @Column(nullable=true)
    private String precio_total;

    @Column(nullable=true)
    private String cantidad_ventas_juego;


}
