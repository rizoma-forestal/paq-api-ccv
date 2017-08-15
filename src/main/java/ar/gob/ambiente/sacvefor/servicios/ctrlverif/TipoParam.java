
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Tipos de Paramétricas provenientes del CCV
 * @author rincostante
 */
@XmlRootElement
public class TipoParam implements Serializable{
    
    private Long id;
    private String nombre; 

    /******************
     * Constructores **
     ******************/
    public TipoParam(){
        this.id = Long.valueOf(0);
        this.nombre = "dafault";
    }
    
    public TipoParam(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
