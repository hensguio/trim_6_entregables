package co.com.masconsulta.Payroll.domain;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pais")

public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpais;

    @Column(name="codigopais", nullable = false, length = 10)
    private String codigopais;

    @Column(name="nombrepais",nullable = false, length = 100)
    private String nombrepais;

    @OneToMany(mappedBy = "pais")
     private List<Departamento> departamentoList;


    public long getIdpais() {
        return idpais;
    }

    public void setIdpais(long idpais) {
        this.idpais = idpais;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }
}
