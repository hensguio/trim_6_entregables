package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="maestroparafiscales")


public class MaestroParafiscales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmaestroparafiscales;

    @Column(name="codigoparafiscales", nullable = false,length = 10)
    private String codigoparafiscales;

    @Column(name="NIT",nullable = false)
    private long NIT;

    @Column(name="DV", nullable = false)
    private int dv;

    @Column(name="Nombreempresa",nullable = false,length = 255)
    private String nombreempresa;


    @OneToMany(mappedBy = "maestroParafiscales")
        private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdmaestroparafiscales() {
        return idmaestroparafiscales;
    }

    public void setIdmaestroparafiscales(long idmaestroparafiscales) {
        this.idmaestroparafiscales = idmaestroparafiscales;
    }

    public String getCodigoparafiscales() {
        return codigoparafiscales;
    }

    public void setCodigoparafiscales(String codigoparafiscales) {
        this.codigoparafiscales = codigoparafiscales;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
