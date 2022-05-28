package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_documento", uniqueConstraints = {
        @UniqueConstraint(name = "uk_sigla", columnNames = "sigla"),
        @UniqueConstraint(name = "uk_descripción", columnNames = "descripcion")
})

public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Para que sea autoincremental
    private long idTipoDocumento;

    @Column(name = "sigla",nullable = false,length = 5)
    private String sigla;

    @Column(name = "descripcion",nullable = false, length = 40)
    private String descripcion;


    @OneToMany(mappedBy = "tipoDocumento")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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
