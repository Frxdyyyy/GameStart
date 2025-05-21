package com.GameStart.GameStart.Controller;

import java.util.List;



@RestController
@RequestMapping("api/v1/juegos")
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    @GetMapping
    public ResponseEntity<List<Juego>> listar() {
        List<Juego> juegos = juegoService.findAll();
        if(juegos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return juegoService.getAllJuegos();
    }

    @PostMapping
    public ResponseEntity<Juego> guardar(@RequestBody Juego juego) {
        Juego nuevoJuego = juegoService.save(juego);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoJuego);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Juego> buscar(@PathVariable Integer id) {
        try{
            Juego juego = juegoService.findById(id);
            return ResponseEntity.ok(juego);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


     @PutMapping("/{id}")
    public ResponseEntity<Juego> actualizar(@PathVariable Long id, RequestBody Juego juego) {
        try {
            juego jue = juegoService.findById(id);
            jue.setId(id);
            jue.setRun(juego.getRun());
            jue.setNombre(juego.getNombre());   
            jue.setGenero(juego.getGenero());
            jue.setStock(juego.getStock());
            jue.setPrecio(juego.getPrecio());
            
            juegoService.save(jue);
            return ResponseEntity.ok(juego);
        }catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        try {
            juegoService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
