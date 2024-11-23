package net.java.springboot_rabbitmq.Publisher;

import net.java.springboot_rabbitmq.Dto.Usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProductor {
    @Value("${rabbitmq.exchange.name}")
    private String exchange;
    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonProductor.class);

    private RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProductor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    public void enviarJsonMensaje(Usuario usuario)
    {
        LOGGER.info(String.format("Mensaje Json Enviado -> %s",usuario.toString()));
        rabbitTemplate.convertAndSend(exchange,routingJsonKey,usuario);
    }
}
