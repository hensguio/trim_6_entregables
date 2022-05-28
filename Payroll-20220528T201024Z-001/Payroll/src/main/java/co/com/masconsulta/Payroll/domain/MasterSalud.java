package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="maestrosalud")

public class MasterSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSalud;

    @Column(name="nit", nullable = false)
    private long nit;

    @Column(name="dv", nullable = false)
    private int dv;

    @Column(name="codigoeps",nullable = false, length = 10)
    private String codigoEps;

    @Column(name="nombreeps",nullable = false,length = 255)
    private String nombreEps;

    @OneToMany(mappedBy = "masterSalud")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdSalud() {
        return idSalud;
    }

    public void setIdSalud(long idSalud) {
        this.idSalud = idSalud;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getCodigoEps() {
        return codigoEps;
    }

    public void setCodigoEps(String codigoEps) {
        this.codigoEps = codigoEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
