package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado_empleado")


public class EstadoEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstadoEmpleado;

    @Column(name = "descripcion", nullable = false, length = 40)
    private String descripcion;


    @OneToMany(mappedBy = "estadoEmpleado")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdEstadoEmpleado() {
        return idEstadoEmpleado;
    }

    public void setIdEstadoEmpleado(long idEstadoEmpleado) {
        this.idEstadoEmpleado = idEstadoEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
