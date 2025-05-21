package com.GameStart.GameStart.Controller;

import java.util.List;

@RestController
@RequestMapping("api/v1/ventas")

public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Venta>> listar() {
        List<Venta> ventas = ventaService.findAll();
        if(ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }

    @PostMapping
    public ResponseEntity<Venta> guardar(@RequestBody Venta venta) {
        Venta nuevaVenta = ventaService.save(venta);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaVenta);
    }


}
