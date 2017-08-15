
package ar.gob.ambiente.sacvefor.servicios.ctrlverif;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de los Controles realizados mediante el CCV
 * @author rincostante
 */
@XmlRootElement
public class Control implements Serializable{
    
    private Long id;
    
    /**
     * Guía que se controló
     */
    private Guia guia;
    
    /**
     * Fecha y hora en la que se realizó el control
     */
    private Date fechaHora;
    
    /**
     * Resultado del control realizado
     */
    private Parametrica resultado;
    
    /**
     * Observaciones surgidas del control
     */
    private String obs;
    
    /**
     * Ruta o camino en la cual se encuentra el Puesto desde le que se realizó el control
     */
    private String ruta;
    
    /**
     * Altura de la ruta o camino donde se encuentra el Puesto desde le que se realizó el control
     */
    private String altura;
    
    /*****************
     * Contructores **
     *****************/
    
    public Control(){
        this.id = Long.valueOf(0);
        this.guia = new Guia();
        this.fechaHora = new Date();
        this.resultado = new Parametrica();
        this.obs = "default";
        this.ruta = "default";
        this.altura = "default";
    }
    
    public Control(Long id, Guia guia, Date fechaHora, Parametrica resultado, String obs, String ruta, String altura){
        this.id = id;
        this.guia = guia;
        this.fechaHora = fechaHora;
        this.resultado = resultado;
        this.obs = obs;
        this.ruta = ruta;
        this.altura = altura;
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

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Parametrica getResultado() {
        return resultado;
    }

    public void setResultado(Parametrica resultado) {
        this.resultado = resultado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
}
