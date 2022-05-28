package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="maestrocentrocosto")


public class MaestroCentroCosto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmaestrocentrocosto;

    @Column(name="codigocentrocosto", nullable = false,length = 10)
    private String codigocentrocosto;

    @Column(name="nombrecentrodecosto",nullable = false, length = 255)
    private String nombrecentordecosto;


    @OneToMany(mappedBy = "maestroCentroCosto")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdmaestrocentrocosto() {
        return idmaestrocentrocosto;
    }

    public void setIdmaestrocentrocosto(long idmaestrocentrocosto) {
        this.idmaestrocentrocosto = idmaestrocentrocosto;
    }

    public String getCodigocentrocosto() {
        return codigocentrocosto;
    }

    public void setCodigocentrocosto(String codigocentrocosto) {
        this.codigocentrocosto = codigocentrocosto;
    }

    public String getNombrecentordecosto() {
        return nombrecentordecosto;
    }

    public void setNombrecentordecosto(String nombrecentordecosto) {
        this.nombrecentordecosto = nombrecentordecosto;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}


