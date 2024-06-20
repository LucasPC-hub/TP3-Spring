package com.infnet.tp3spring.services;

import com.infnet.tp3spring.entities.MaterialDidatico;
import com.infnet.tp3spring.repos.MaterialDidaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MaterialDidaticoService {

    @Autowired
    private MaterialDidaticoRepository materialDidaticoRepository;

    // Operação de criação (Create)
    public MaterialDidatico criarMaterial(MaterialDidatico materialDidatico) {
        return materialDidaticoRepository.save(materialDidatico);
    }

    // Operação de leitura de todos os materiais (Read All)
    public List<MaterialDidatico> listarMateriais() {
        return materialDidaticoRepository.findAll();
    }

    // Operação de leitura de material por ID (Read by ID)
    public Optional<MaterialDidatico> buscarMaterialPorId(String id) {
        return materialDidaticoRepository.findById(id);
    }

    // Operação de atualização (Update)
    public MaterialDidatico atualizarMaterial(String id, MaterialDidatico materialDidatico) {
        if (materialDidaticoRepository.existsById(id)) {
            materialDidatico.setId(id); // Garante que o ID seja mantido
            return materialDidaticoRepository.save(materialDidatico);
        }
        return null; // Ou lançar exceção se preferir
    }

    // Operação de remoção (Delete)
    public void deletarMaterial(String id) {
        materialDidaticoRepository.deleteById(id);
    }
}
