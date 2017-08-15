
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de las Parametricas del CCV
 * @author rincostante
 */
@XmlRootElement
public class Parametrica implements Serializable{
    
    private Long id;
    
    /**
     * Tipo de Paramétrica
     */
    private TipoParam tipo;
    
    /**
     * Nombre identificatorio
     */
    private String nombre;
    
    /******************
     * Constructores **
     ******************/
    public Parametrica(){
        this.id = Long.valueOf(0);
        this.nombre = "dafault";
        this.tipo = new TipoParam();
    }
     
    public Parametrica(Long id, String nombre, TipoParam tipo){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
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

    public TipoParam getTipo() {
        return tipo;
    }

    public void setTipo(TipoParam tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
