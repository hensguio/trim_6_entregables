package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alergias")
public class Alergias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAlergias;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "tratamiento", nullable = false, length = 45)
    private String tratamiento;




    @OneToMany(mappedBy = "alergias")
    private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdAlergias() {
        return idAlergias;
    }

    public void setIdAlergias(long idAlergias) {
        this.idAlergias = idAlergias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public List<MaestroEmpleado> getMaestroEmpleadoList() {
        return maestroEmpleadoList;
    }

    public void setMaestroEmpleadoList(List<MaestroEmpleado> maestroEmpleadoList) {
        this.maestroEmpleadoList = maestroEmpleadoList;
    }
}
