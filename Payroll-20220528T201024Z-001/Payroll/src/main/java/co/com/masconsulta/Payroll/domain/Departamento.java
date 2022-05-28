package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departamento")


public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddepartamento;

    @Column(name="codigodepartamento",nullable = false,length = 10)
    private String codigodepartamento;

    @Column(name="nombredepartamento",nullable = false,length = 255)
    private String nombredepartamento;


    @ManyToOne
    @JoinColumn(name = "idpais",nullable = false,referencedColumnName = "idpais")
    private Pais pais;

    @OneToMany(mappedBy = "departamento")
    private List <Municipio> municipioList;

    public long getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(long iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getCodigodepartamento() {
        return codigodepartamento;
    }

    public void setCodigodepartamento(String codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Municipio> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<Municipio> municipioList) {
        this.municipioList = municipioList;
    }
}
