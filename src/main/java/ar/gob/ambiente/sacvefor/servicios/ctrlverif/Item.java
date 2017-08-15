
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de los Items componentes del detalle de las Guías
 * @author rincostante
 */
@XmlRootElement
public class Item implements Serializable{
    
    private Long id;
    
    /**
     * El código origen encapsula los atributos del Producto de origen separados por '|' en este orden
     * nombreCientifico: nombre científico de la Especie constituido por 'Género/Especie'
     * nombreVulgar: nombre vulgar de la Especie definido de manera local
     * clase: clase en la que se comercializa el Producto definido de manera local
     * unidad: unidad de medida en la que se comercializa el Producto/Clase definido de manera local
     * resolución: numero de la resolución (campo numero de la entidad Autorización)
     * provincia: nombre de la Provincia dentro de la cual se extraerá el Producto
     * EJ.:"1|Prosopis caldenia|Caldén|Rollo|Unidad|123-DGB-2017|Santiago del Estero"
     * Estos valores serán tomados del Item productivo acreditado que de origen a los nuevos productos
     */
    private String codigoOrigen;
    
    /**
     * Nombre científico de la Especie del producto
     */
    private String nombreCientifico;
    
    /**
     * Nombre vulgar del Producto
     * Podrá no coincidir con el que se utilizó en el código de orígen
     */
    private String nombreVulgar;
    
    /**
     * Clase en la que se comercializa el producto
     */
    private String clase;
    
    /**
     * Unidad de medida en la que se comercializa el producto
     */
    private String unidad;
    
    /**
     * Total del producto que se incluye en el item, en la unidad de medida en el que se comercializa
     */
    private float total;
    
    /**
     * Equivalente en Kg del total del producto que se incluye en el item
     */
    private float totalKg;
    
    /*****************
     * Contructores **
     *****************/
    
    public Item(){
        this.id = Long.valueOf(0);
        this.codigoOrigen = "default";
        this.nombreCientifico = "default";
        this.nombreVulgar = "default";
        this.clase = "default";
        this.unidad = "default";
        this.total = 0;
        this.totalKg = 0;
    }
    
    public Item(Long id, String codigoOrigen, String nombreCientifico, String nombreVulgar, String clase, String unidad, float total, float totalKg){
        this.id = Long.valueOf(0);
        this.codigoOrigen = "default";
        this.nombreCientifico = "default";
        this.nombreVulgar = "default";
        this.clase = "default";
        this.unidad = "default";
        this.total = 0;
        this.totalKg = 0;
    }    

    /**********************
     * Métodos de acceso **
     **********************/      
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    public void setCodigoOrigen(String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(float totalKg) {
        this.totalKg = totalKg;
    }
    
    
}
