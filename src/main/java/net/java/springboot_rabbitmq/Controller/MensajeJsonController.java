package net.java.springboot_rabbitmq.Controller;

import net.java.springboot_rabbitmq.Dto.Usuario;
import net.java.springboot_rabbitmq.Publisher.RabbitMQJsonProductor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MensajeJsonController {
    private RabbitMQJsonProductor jsonProductor;

    public MensajeJsonController(RabbitMQJsonProductor jsonProductor) {
        this.jsonProductor = jsonProductor;
    }
    @PostMapping("/publicar")
    public ResponseEntity<String> enviarJsonMensaje(@RequestBody Usuario usuario)
    {
    jsonProductor.enviarJsonMensaje(usuario);
    return ResponseEntity.ok("Mensaje Json enviado a RabbitMQ...");
    }
}
