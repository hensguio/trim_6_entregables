package co.com.masconsulta.Payroll.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="maestroempleado")


public class MaestroEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaestroEmpleado;

    @Column(name="fechaingreso",nullable = false)
    private LocalDateTime fechaIngreso;

    @Column(name="numeroidentificacion",nullable = false)
    private long numeroIdentificacion;

    @Column(name="primerapellido",nullable = false,length = 50)
    private String primerapellido;

    @Column(name="segundoapellido",nullable = false,length = 50)
    private String segundoapellido;

    @Column(name="primernombre",nullable = false,length = 50)
    private String primerNombre;

    @Column(name="segundonombre",nullable = false,length = 50)
    private String segundoNombre;

    @Column(name="otronombre",nullable = false,length = 50)
    private String otroNombre;

    @Column(name="direccion",nullable = false,length = 40)
    private String direccion;

    @Column(name="numerocelular",nullable = false,length = 20)
    private String numeroCelular;




    @ManyToOne
    @JoinColumn(name = "id_maestro_afp",nullable = false,referencedColumnName = "idMaestroAFP")
    private MaestroPension maestroPension;


    @ManyToOne
    @JoinColumn(name = "id_maestro_parafiscales",nullable = false,referencedColumnName = "idmaestroparafiscales")
    private MaestroParafiscales maestroParafiscales;


    @ManyToOne
    @JoinColumn(name = "id_Arl",nullable = false,referencedColumnName = "idarl")
    private MaestroARL maestroARL;


   @ManyToOne
   @JoinColumn(name = "id_salud",nullable = false,referencedColumnName = "idsalud")
   private MasterSalud masterSalud;



    @ManyToOne
    @JoinColumn(name = "id_periodicidad_nomina",nullable = false,referencedColumnName = "idperiodicidadnomina")
    private PeriodicidadLiquidacion periodicidadLiquidacion;


    @ManyToOne
    @JoinColumn(name = "id_Tipo_Contrato",nullable = false,referencedColumnName = "idTipoContrato")
    private TipoContrato tipoContrato;

    @ManyToOne
    @JoinColumn(name = "id_Alergias",nullable = false,referencedColumnName = "idAlergias")
    private Alergias alergias;

    @ManyToOne
    @JoinColumn(name = "id_tarifa",nullable = false,referencedColumnName = "idtarifa")
    private TarifaARL tarifaARL;

    @ManyToOne
    @JoinColumn(name = "id_Estado_Empleado",nullable = false,referencedColumnName = "idEstadoEmpleado")
    private EstadoEmpleado estadoEmpleado;

    @ManyToOne
    @JoinColumn(name = "id_Tipo_Documento",nullable = false,referencedColumnName = "idTipoDocumento")
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "id_Municipio",nullable = false,referencedColumnName = "idMunicipio")
    private Municipio municipio;

    @ManyToOne
    @JoinColumn(name = "id_proyecto",nullable = false,referencedColumnName = "idproyecto")
    private MaestroProyecto maestroProyecto;

    @ManyToOne
    @JoinColumn(name = "id_maestro_centro_costo",nullable = false,referencedColumnName = "idmaestrocentrocosto")
    private MaestroCentroCosto maestroCentroCosto;


    public long getIdMaestroEmpleado() {
        return idMaestroEmpleado;
    }

    public void setIdMaestroEmpleado(long idMaestroEmpleado) {
        this.idMaestroEmpleado = idMaestroEmpleado;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getOtroNombre() {
        return otroNombre;
    }

    public void setOtroNombre(String otroNombre) {
        this.otroNombre = otroNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public MaestroPension getMaestroPension() {
        return maestroPension;
    }

    public void setMaestroPension(MaestroPension maestroPension) {
        this.maestroPension = maestroPension;
    }

    public MaestroParafiscales getMaestroParafiscales() {
        return maestroParafiscales;
    }

    public void setMaestroParafiscales(MaestroParafiscales maestroParafiscales) {
        this.maestroParafiscales = maestroParafiscales;
    }

    public MaestroARL getMaestroARL() {
        return maestroARL;
    }

    public void setMaestroARL(MaestroARL maestroARL) {
        this.maestroARL = maestroARL;
    }

    public MasterSalud getMasterSalud() {
        return masterSalud;
    }

    public void setMasterSalud(MasterSalud masterSalud) {
        this.masterSalud = masterSalud;
    }

    public PeriodicidadLiquidacion getPeriodicidadLiquidacion() {
        return periodicidadLiquidacion;
    }

    public void setPeriodicidadLiquidacion(PeriodicidadLiquidacion periodicidadLiquidacion) {
        this.periodicidadLiquidacion = periodicidadLiquidacion;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Alergias getAlergias() {
        return alergias;
    }

    public void setAlergias(Alergias alergias) {
        this.alergias = alergias;
    }

    public TarifaARL getTarifaARL() {
        return tarifaARL;
    }

    public void setTarifaARL(TarifaARL tarifaARL) {
        this.tarifaARL = tarifaARL;
    }

    public EstadoEmpleado getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(EstadoEmpleado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public MaestroProyecto getMaestroProyecto() {
        return maestroProyecto;
    }

    public void setMaestroProyecto(MaestroProyecto maestroProyecto) {
        this.maestroProyecto = maestroProyecto;
    }

    public MaestroCentroCosto getMaestroCentroCosto() {
        return maestroCentroCosto;
    }

    public void setMaestroCentroCosto(MaestroCentroCosto maestroCentroCosto) {
        this.maestroCentroCosto = maestroCentroCosto;
    }
}
