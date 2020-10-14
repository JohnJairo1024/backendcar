package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Mecanicos;
import net.javaguides.springboot.repository.MecanicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class MecanicoController {

    @Autowired
    private MecanicoRepository mecanicoRepository;


    @GetMapping("/mecanicos")
    public List<Mecanicos> getAllMecanicos() {
        return mecanicoRepository.findAll();
    }

    @PostMapping("/mecanico")
    public Mecanicos createMecanico(@RequestBody Mecanicos mecanicos) {
        return mecanicoRepository.save(mecanicos);
    }


    @GetMapping("/mecanico/{id}")
    public ResponseEntity<Mecanicos> getMecanicoById(@PathVariable Long id) {
        Mecanicos mecanicos = mecanicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mecanico no existe :" + id));
        return ResponseEntity.ok(mecanicos);
    }

    
    @PutMapping("/mecanico/{id}")
    public ResponseEntity<Mecanicos> updateMecanicos(@PathVariable Long id, @RequestBody Mecanicos mecanicos1) {
        Mecanicos mecanicos = mecanicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mecanicos...... :" + id));

        mecanicos.setDocumento(mecanicos1.getDocumento());
        mecanicos.setTipo_documento(mecanicos1.getTipo_documento());
        mecanicos.setPrimerNombre(mecanicos1.getPrimerNombre());
        mecanicos.setSegundoNombre(mecanicos1.getSegundoNombre());
        mecanicos.setPrimerApellido(mecanicos1.getPrimerApellido());
        mecanicos.setSegundoApellido(mecanicos1.getSegundoApellido());
        mecanicos.setCelular(mecanicos1.getCelular());
        mecanicos.setDireccion(mecanicos1.getDireccion());
        mecanicos.setEmail(mecanicos1.getEmail());
        mecanicos.setEstado(mecanicos1.getEstado());

        Mecanicos mecanicos2 = mecanicoRepository.save(mecanicos);
        return ResponseEntity.ok(mecanicos2);
    }

    @DeleteMapping("/mecanico/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteMecanico(@PathVariable Long id) {
        Mecanicos mecanicos = mecanicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("mecanicos ---- id :" + id));

        mecanicoRepository.delete(mecanicos);
        Map<String, Boolean> response = new HashMap<>();
        response.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
