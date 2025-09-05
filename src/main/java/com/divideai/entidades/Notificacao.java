package com.divideai.entidades;

import java.time.LocalDateTime;
import java.util.Objects;

public class Notificacao {
    private Long id;
    private String titulo;
    private String mensagem;
    private Usuario destinatario;
    private TipoNotificacao tipo;
    private LocalDateTime dataEnvio;
    private boolean lida;
    
    public Notificacao() {
        this.dataEnvio = LocalDateTime.now();
        this.lida = false;
    }
    
    public Notificacao(Long id, String titulo, String mensagem, Usuario destinatario, TipoNotificacao tipo) {
        this();
        this.id = id;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.tipo = tipo;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getMensagem() {
        return mensagem;
    }
    
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public Usuario getDestinatario() {
        return destinatario;
    }
    
    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
    
    public TipoNotificacao getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoNotificacao tipo) {
        this.tipo = tipo;
    }
    
    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }
    
    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    public boolean isLida() {
        return lida;
    }
    
    public void setLida(boolean lida) {
        this.lida = lida;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notificacao that = (Notificacao) o;
        return Objects.equals(id, that.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Notificacao{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", destinatario=" + destinatario.getNome() +
                ", tipo=" + tipo +
                ", dataEnvio=" + dataEnvio +
                ", lida=" + lida +
                '}';
    }
}