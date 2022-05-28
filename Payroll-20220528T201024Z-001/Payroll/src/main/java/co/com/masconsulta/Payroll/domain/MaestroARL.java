package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="maestroARL")


public class MaestroARL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idarl;

    @Column(name="codigoARL",nullable = false,length = 10)
    private String codigoarl;

    @Column(name="NIT",nullable = false)
    private long nitarl;

    @Column(name="DV", nullable = false)
    private int DV;

    @Column(name="nombrearl",nullable = false, length = 255)
    private String nombrearl;

    @OneToMany(mappedBy = "maestroARL")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdarl() {
        return idarl;
    }

    public void setIdarl(long idarl) {
        this.idarl = idarl;
    }

    public String getCodigoarl() {
        return codigoarl;
    }

    public void setCodigoarl(String codigoarl) {
        this.codigoarl = codigoarl;
    }

    public long getNitarl() {
        return nitarl;
    }

    public void setNitarl(long nitarl) {
        this.nitarl = nitarl;
    }

    public int getDV() {
        return DV;
    }

    public void setDV(int DV) {
        this.DV = DV;
    }

    public String getNombrearl() {
        return nombrearl;
    }

    public void setNombrearl(String nombrearl) {
        this.nombrearl = nombrearl;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
