package com.infnet.tp3spring.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom-metrics")
public class CustomMetricsEndpoint {

    @ReadOperation
    public Map<String, Object> customMetrics() {
        Map<String, Object> metrics = new HashMap<>();
        // Exemplo de métrica customizada
        metrics.put("totalAlunos", 100); // Suponha que você tenha 100 alunos cadastrados
        metrics.put("totalCursos", 50); // Suponha que você tenha 50 cursos cadastrados
        return metrics;
    }

    @ReadOperation
    public Object customMetric(@Selector String metricName) {
        // Implementação para retornar métricas específicas se necessário
        // Exemplo: /actuator/custom-metrics/totalAlunos
        Map<String, Object> metrics = customMetrics();
        return metrics.get(metricName);
    }
}
