package com.infnet.tp3spring.controllers;

import com.infnet.tp3spring.entities.MaterialDidatico;
import com.infnet.tp3spring.services.MaterialDidaticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materiais")
public class MaterialDidaticoController {

    @Autowired
    private MaterialDidaticoService materialDidaticoService;

    @PostMapping
    public MaterialDidatico criarMaterial(@RequestBody MaterialDidatico materialDidatico) {
        return materialDidaticoService.criarMaterial(materialDidatico);
    }

    @GetMapping
    public List<MaterialDidatico> listarMateriais() {
        return materialDidaticoService.listarMateriais();
    }

    @GetMapping("/{id}")
    public Optional<MaterialDidatico> buscarMaterialPorId(@PathVariable String id) {
        return materialDidaticoService.buscarMaterialPorId(id);
    }

    @PutMapping("/{id}")
    public MaterialDidatico atualizarMaterial(@PathVariable String id, @RequestBody MaterialDidatico materialDidatico) {
        return materialDidaticoService.atualizarMaterial(id, materialDidatico);
    }

    @DeleteMapping("/{id}")
    public void deletarMaterial(@PathVariable String id) {
        materialDidaticoService.deletarMaterial(id);
    }
}
