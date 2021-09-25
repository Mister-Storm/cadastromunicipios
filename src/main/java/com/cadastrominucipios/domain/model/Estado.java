package com.cadastrominucipios.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long codigoIBGE;
    private String sigla;
    private String nomeDoEstado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Long codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeDoEstado() {
        return nomeDoEstado;
    }

    public void setNomeDoEstado(String nomeDoEstado) {
        this.nomeDoEstado = nomeDoEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return Objects.equals(getId(), estado.getId()) &&
                Objects.equals(getCodigoIBGE(), estado.getCodigoIBGE()) &&
                Objects.equals(getSigla(), estado.getSigla()) &&
                Objects.equals(getNomeDoEstado(), estado.getNomeDoEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCodigoIBGE(), getSigla(), getNomeDoEstado());
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", codigoIBGE=" + codigoIBGE +
                ", sigla='" + sigla + '\'' +
                ", nomeDoEstado='" + nomeDoEstado + '\'' +
                '}';
    }
}
