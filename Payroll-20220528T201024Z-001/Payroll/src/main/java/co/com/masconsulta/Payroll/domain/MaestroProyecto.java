package co.com.masconsulta.Payroll.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="maestroproyecto")

public class MaestroProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproyecto;

    @Column(name="codigoproyecto", nullable = false, length = 10)
    private String codigoproyecto;

    @Column(name="Nombreproyecto",nullable = false,length = 255)
    private String nombreproyecto;

    @OneToMany(mappedBy = "maestroProyecto")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(long idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getCodigoproyecto() {
        return codigoproyecto;
    }

    public void setCodigoproyecto(String codigoproyecto) {
        this.codigoproyecto = codigoproyecto;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public void setNombreproyecto(String nombreproyecto) {
        this.nombreproyecto = nombreproyecto;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}


