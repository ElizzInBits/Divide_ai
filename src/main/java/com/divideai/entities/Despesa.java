package com.divideai.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Despesa {
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDateTime dataGasto;
    private Usuario pagador;
    private Grupo grupo;
    private List<Usuario> participantes;
    private TipoDivisao tipoDivisao;
    
    public Despesa() {
        this.participantes = new ArrayList<>();
        this.dataGasto = LocalDateTime.now();
        this.tipoDivisao = TipoDivisao.IGUAL;
    }
    
    public Despesa(Long id, String descricao, BigDecimal valor, Usuario pagador, Grupo grupo) {
        this();
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.pagador = pagador;
        this.grupo = grupo;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public LocalDateTime getDataGasto() {
        return dataGasto;
    }
    
    public void setDataGasto(LocalDateTime dataGasto) {
        this.dataGasto = dataGasto;
    }
    
    public Usuario getPagador() {
        return pagador;
    }
    
    public void setPagador(Usuario pagador) {
        this.pagador = pagador;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public List<Usuario> getParticipantes() {
        return participantes;
    }
    
    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }
    
    public TipoDivisao getTipoDivisao() {
        return tipoDivisao;
    }
    
    public void setTipoDivisao(TipoDivisao tipoDivisao) {
        this.tipoDivisao = tipoDivisao;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return Objects.equals(id, despesa.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Despesa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", dataGasto=" + dataGasto +
                ", pagador=" + pagador.getNome() +
                ", grupo=" + grupo.getNome() +
                ", participantes=" + participantes.size() +
                ", tipoDivisao=" + tipoDivisao +
                '}';
    }
}