package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tarifaarl")

public class TarifaARL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idtarifa;

    @Column(name="codigo", nullable = false)
    private int códigoCIUO;

    @Column(name="claseriesgo",nullable = false)
    private int claseriesgo;

    @Column(name="descripcionoficio",nullable = false, length = 255)
    private String descripcionoficio;

    @Column(name="tarifaarl",nullable = false)
    private double tarifaarl;

    @OneToMany(mappedBy = "tarifaARL")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(long idtarifa) {
        this.idtarifa = idtarifa;
    }

    public int getCódigoCIUO() {
        return códigoCIUO;
    }

    public void setCódigoCIUO(int códigoCIUO) {
        this.códigoCIUO = códigoCIUO;
    }

    public int getClaseriesgo() {
        return claseriesgo;
    }

    public void setClaseriesgo(int claseriesgo) {
        this.claseriesgo = claseriesgo;
    }

    public String getDescripcionoficio() {
        return descripcionoficio;
    }

    public void setDescripcionoficio(String descripcionoficio) {
        this.descripcionoficio = descripcionoficio;
    }

    public double getTarifaarl() {
        return tarifaarl;
    }

    public void setTarifaarl(double tarifaarl) {
        this.tarifaarl = tarifaarl;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
