
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de las Guías del CCV
 * @author rincostante
 */
@XmlRootElement
public class Guia implements Serializable{
    
    private Long id;
    
    /**
     * Código de la Guía
     */    
    private String codigo;
    
    /**
     * Paramétrica que indica el estado en el que se encuentra la Guía, podrán ser:
     * Vigente,
     * Cerrada,
     * Anulada,
     * Intervenida,
     * Suspendida
     */
    private Parametrica estado;
    
    /**
     * Número del Instrumento fuente de productos (Autorización y Guía)
     */    
    private String tipo;
    
    /**
     * Tipo de instrumento que ofició como fuente de los productos
     */
    private String tipoFuente;
    
    /**
     * Número del instrumento fuente de los productos
     */
    private String numFuente;  
    
    /**
     * Listado de los Items que componen la Guía
     */
    private List<Item> items;  
    
    /**
     * Componente local desde el cual se emitió la Guía
     * Si corresponde
     */
    private ComponenteLocal compLocal;
    
    /**
     * Nombre completo de la Entidad remitente de la Guía
     */
    private String nombreOrigen;
    
    /**
     * Cuit de la Entidad remitente de la Guía
     */
    private Long cuitOrigen;
    
    /**
     * Ubicación del orígen de la Guía.
     * Ej: Villa Candela - Jujuy
     */
    private String locOrigen;
    
    /**
     * Nombre completo de la Entidad destinataria de la Guía
     */
    private String nombreDestino;
    
    /**
     * Cuit de la Entidad destinataria de la Guía
     */
    private Long cuitDestino;
    
    /**
     * Ubicación del destino de la Guía.
     * Ej: Los cardos - Salta
     */
    private String locDestino; 
    
    /**
     * Matrícula del Vehículo de transporte de los Productos
     */
    private String matVehiculo;  
    
    /**
     * Matrícula del Acoplado del Vehículo de transporte
     * Si corresponde
     */
    private String matAcoplado; 
    
    /**
     * Nombre completo del Conductor del Vehículo de transporte
     */
    private String nombreConductor;   
    
    /**
     * Dni del Conductor del Vehículo de tansporte
     */
    private Long dniConductor;   
    
    /**
     * Fecha de emisión de la Guía
     */
    private Date fechaEmision;   
    
    /**
     * Fecha de vencimiento de la Guía
     */
    private Date fechaVencimiento; 
    
    /**
     * Fecha de cierre de la Guía.
     */ 
    private Date fechaCierre;     
    
    /**
     * Nombre de la Provincia que emitió la Guía, en caso de ser local
     */
    private String provincia;
    
    /******************
     * Constructores **
     ******************/
    public Guia(){
        this.id = Long.valueOf(0);
        this.codigo = "default";
        this.estado = new Parametrica();
        this.tipo = "default";
        this.tipoFuente = "default";
        this.numFuente = "default";
        this.items = new ArrayList<>();
        this.compLocal = new ComponenteLocal();
        this.nombreOrigen = "default";
        this.cuitOrigen = Long.valueOf(0);
        this.locOrigen = "default";
        this.nombreDestino = "default";
        this.cuitDestino = Long.valueOf(0);
        this.locDestino = "default";
        this.matVehiculo = "default";
        this.matAcoplado = "default";
        this.nombreConductor = "default";
        this.dniConductor = Long.valueOf(0);
        this.fechaEmision = new Date();
        this.fechaVencimiento = new Date();
        this.fechaCierre = new Date();
        this.provincia = "default";
    }

    public Guia(Long id, String codigo, Parametrica estado, String tipo, String tipoFuente, String numFuente, List<Item> lstItems, ComponenteLocal compLocal, String nombreOrigen,
            Long cuitOrigen, String locOrigen, String nombreDestino, Long cuitDestino, String locDestino, String matVehiculo, String matAcoplado, String nombreConductor, Long dniConductor,
            Date fechaEmision, Date fechaVencimiento, Date fechaCierre, String provincia){
        this.id = id;
        this.codigo = codigo;
        this.estado = estado;
        this.tipo = tipo;
        this.tipoFuente = tipoFuente;
        this.numFuente = numFuente;
        this.items = lstItems;
        this.compLocal = compLocal;
        this.nombreOrigen = nombreOrigen;
        this.cuitOrigen = cuitOrigen;
        this.locOrigen = locOrigen;
        this.nombreDestino = nombreDestino;
        this.cuitDestino = cuitDestino;
        this.locDestino = locDestino;
        this.matVehiculo = matVehiculo;
        this.matAcoplado = matAcoplado;
        this.nombreConductor = nombreConductor;
        this.dniConductor = dniConductor;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCierre = fechaCierre;
        this.provincia = provincia;
    }    
     
    /**********************
     * Métodos de acceso **
     **********************/     
    public String getLocOrigen() {
        return locOrigen;
    }

    public void setLocOrigen(String locOrigen) {
        this.locOrigen = locOrigen;
    }

    public String getLocDestino() {
        return locDestino;
    }

    public void setLocDestino(String locDestino) {
        this.locDestino = locDestino;
    }

    public Parametrica getEstado() {
        return estado;
    }

    public void setEstado(Parametrica estado) {
        this.estado = estado;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }
  
    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getProvincia() {
        return provincia;
    }
  
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public void setTipoFuente(String tipoFuente) {
        this.tipoFuente = tipoFuente;
    }

    public String getNumFuente() {
        return numFuente;
    }

    public void setNumFuente(String numFuente) {
        this.numFuente = numFuente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ComponenteLocal getCompLocal() {
        return compLocal;
    }

    public void setCompLocal(ComponenteLocal compLocal) {
        this.compLocal = compLocal;
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public void setNombreOrigen(String nombreOrigen) {
        this.nombreOrigen = nombreOrigen;
    }

    public Long getCuitOrigen() {
        return cuitOrigen;
    }

    public void setCuitOrigen(Long cuitOrigen) {
        this.cuitOrigen = cuitOrigen;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public Long getCuitDestino() {
        return cuitDestino;
    }

    public void setCuitDestino(Long cuitDestino) {
        this.cuitDestino = cuitDestino;
    }

    public String getMatVehiculo() {
        return matVehiculo;
    }

    public void setMatVehiculo(String matVehiculo) {
        this.matVehiculo = matVehiculo;
    }

    public String getMatAcoplado() {
        return matAcoplado;
    }

    public void setMatAcoplado(String matAcoplado) {
        this.matAcoplado = matAcoplado;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public Long getDniConductor() {
        return dniConductor;
    }

    public void setDniConductor(Long dniConductor) {
        this.dniConductor = dniConductor;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }     
}
