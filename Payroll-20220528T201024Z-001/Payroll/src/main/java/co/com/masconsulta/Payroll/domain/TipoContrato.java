package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity //conecta la database
@Table(name = "tipo_contrato")  //Como se quiere aparecer el nombre en la database.
public class TipoContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTipoContrato;

    @Column(name = "descripcion_tipo_contrato",nullable = false,length = 40)
    private String descripcionTipoContrato;


    @OneToMany(mappedBy = "tipoContrato")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(long idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public String getDescripcionTipoContrato() {
        return descripcionTipoContrato;
    }

    public void setDescripcionTipoContrato(String descripcionTipoContrato) {
        this.descripcionTipoContrato = descripcionTipoContrato;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
