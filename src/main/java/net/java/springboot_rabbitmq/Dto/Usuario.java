package net.java.springboot_rabbitmq.Dto;

import lombok.Data;

@Data
public class Usuario {
    private int id;
    private String correo;  // Dirección de correo electrónico
    private String subject; // Asunto del correo
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
