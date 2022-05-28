package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "periodicidadliquidacion")


public class PeriodicidadLiquidacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idperiodicidadnomina;

    @Column(name="descripción",nullable = false,length = 40)
    private String descripcion;


    @OneToMany(mappedBy = "periodicidadLiquidacion")
        private List<MaestroEmpleado> maestroEmpleadoList;

    public long getIdperiodicidadnomina() {
        return idperiodicidadnomina;
    }

    public void setIdperiodicidadnomina(long idperiodicidadnomina) {
        this.idperiodicidadnomina = idperiodicidadnomina;
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
