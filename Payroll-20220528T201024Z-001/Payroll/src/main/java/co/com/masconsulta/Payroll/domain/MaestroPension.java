package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="maestropension")


public class MaestroPension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaestroAFP;

    @Column(name="codigoafp",nullable = false,length = 10)
    private String codigoafp;

    @Column(name="NITafp",nullable = false)
    private long NITafp;

    @Column(name="DV",nullable = false)
    private long DV;

    @Column(name="nombreafp",nullable = false,length = 255)
    private String nombreafp;

    @OneToMany(mappedBy = "maestroPension")
    private List<MaestroEmpleado>maestroEmpleadoList;

    public long getIdMaestroAFP() {
        return idMaestroAFP;
    }

    public void setIdMaestroAFP(long idMaestroAFP) {
        this.idMaestroAFP = idMaestroAFP;
    }

    public String getCodigoafp() {
        return codigoafp;
    }

    public void setCodigoafp(String codigoafp) {
        this.codigoafp = codigoafp;
    }

    public long getNITafp() {
        return NITafp;
    }

    public void setNITafp(long NITafp) {
        this.NITafp = NITafp;
    }

    public long getDV() {
        return DV;
    }

    public void setDV(long DV) {
        this.DV = DV;
    }

    public String getNombreafp() {
        return nombreafp;
    }

    public void setNombreafp(String nombreafp) {
        this.nombreafp = nombreafp;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
