package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="municipio")

public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMunicipio;

    @Column(name="codigomunicipio", nullable = false,length = 10)
    private String codigoMunicipio;

    @Column(name="nombreMunicipio",nullable = false,length = 100)
    private String nombreMunicipio;


    @OneToMany(mappedBy = "municipio")
    private List<MaestroEmpleado> maestroEmpleadoList;


     @ManyToOne
     @JoinColumn(name = "iddepartamento",nullable = false,referencedColumnName = "iddepartamento")
     private Departamento departamento;

    public long getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
