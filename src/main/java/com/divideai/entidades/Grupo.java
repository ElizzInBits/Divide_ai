package com.divideai.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grupo {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime dataCriacao;
    private List<Usuario> membros;
    private List<Despesa> despesas;
    
    public Grupo() {
        this.membros = new ArrayList<>();
        this.despesas = new ArrayList<>();
        this.dataCriacao = LocalDateTime.now();
    }
    
    public Grupo(Long id, String nome, String descricao) {
        this();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public List<Usuario> getMembros() {
        return membros;
    }
    
    public void setMembros(List<Usuario> membros) {
        this.membros = membros;
    }
    
    public List<Despesa> getDespesas() {
        return despesas;
    }
    
    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(id, grupo.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", membros=" + membros.size() +
                ", despesas=" + despesas.size() +
                '}';
    }
}