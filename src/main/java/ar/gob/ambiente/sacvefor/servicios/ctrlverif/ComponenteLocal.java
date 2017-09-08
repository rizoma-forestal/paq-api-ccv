
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de los Componentes locales del CCV
 * @author rincostante
 */
@XmlRootElement
public class ComponenteLocal implements Serializable{
    
    private Long id;
    
    /**
     * Pronvincia a la cual pertenece el Componente local
     */
    private String provincia;
    
    /**
     * Url de acceso a la API REST
     */
    private String url;
    
    /**
     * Correo electrónico responsable del Componente local en la provincia
     */
    private String correoElectronico;
    
    /**
     * Identificación de la Provincia en el SErvicio de Gestión territorial
     */
    private Long idProvGt;    
    
    /*****************
     * Contructores **
     *****************/
    
    public ComponenteLocal(){
        this.id = Long.valueOf(0);
        this.provincia = "dafault";
        this.url = "default";
        this.correoElectronico = "default";
        this.idProvGt = Long.valueOf(0);
    }
    
    public ComponenteLocal(Long id, String provincia, String url, String correoElectronico, Long idProvGt){
        this.id = id;
        this.provincia = provincia;
        this.url = url;
        this.correoElectronico = correoElectronico;
        this.idProvGt = idProvGt;
    }    
   
    /**********************
     * Métodos de acceso **
     **********************/   
    public Long getIdProvGt() {
        return idProvGt;
    }

    public void setIdProvGt(Long idProvGt) {
        this.idProvGt = idProvGt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}
