package com.cadastrominucipios.domain.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeMunicipio;
    private Long codigoIBGE;
    @ManyToOne
    private Estado estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Long getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Long codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Municipio)) return false;
        Municipio municipio = (Municipio) o;
        return Objects.equals(getId(), municipio.getId()) &&
                Objects.equals(getNomeMunicipio(), municipio.getNomeMunicipio()) &&
                Objects.equals(getCodigoIBGE(), municipio.getCodigoIBGE()) &&
                Objects.equals(getEstado(), municipio.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomeMunicipio(), getCodigoIBGE(), getEstado());
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "id=" + id +
                ", nomeMunicipio='" + nomeMunicipio + '\'' +
                ", codigoIBGE=" + codigoIBGE +
                ", estado=" + estado +
                '}';
    }
}
