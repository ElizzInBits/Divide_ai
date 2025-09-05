package com.divideai.entidades;

import java.math.BigDecimal;
import java.util.Objects;

public class Saldo {
    private Long id;
    private Usuario usuario;
    private Grupo grupo;
    private BigDecimal totalPago;
    private BigDecimal totalDevido;
    private BigDecimal saldoFinal;
    
    public Saldo() {
        this.totalPago = BigDecimal.ZERO;
        this.totalDevido = BigDecimal.ZERO;
        this.saldoFinal = BigDecimal.ZERO;
    }
    
    public Saldo(Long id, Usuario usuario, Grupo grupo) {
        this();
        this.id = id;
        this.usuario = usuario;
        this.grupo = grupo;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public BigDecimal getTotalPago() {
        return totalPago;
    }
    
    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }
    
    public BigDecimal getTotalDevido() {
        return totalDevido;
    }
    
    public void setTotalDevido(BigDecimal totalDevido) {
        this.totalDevido = totalDevido;
    }
    
    public BigDecimal getSaldoFinal() {
        return saldoFinal;
    }
    
    public void setSaldoFinal(BigDecimal saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
    
    public void calcularSaldo() {
        this.saldoFinal = this.totalPago.subtract(this.totalDevido);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saldo saldo = (Saldo) o;
        return Objects.equals(id, saldo.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Saldo{" +
                "id=" + id +
                ", usuario=" + usuario.getNome() +
                ", grupo=" + grupo.getNome() +
                ", totalPago=" + totalPago +
                ", totalDevido=" + totalDevido +
                ", saldoFinal=" + saldoFinal +
                '}';
    }
}