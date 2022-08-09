/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Moto extends Vehiculo_Terrestre{
    
    private String pedal_de_cambios, manubrio, manija_de_aceleracion, cadena;

    public Moto(){
        
    }
    public Moto(String pedal_de_cambios, String manubrio, String manija_de_aceleracion, String cadena, String gasolina, String color, String model, String marca, String ruedas) {
        super(gasolina, color, model, marca, ruedas);
        this.pedal_de_cambios = pedal_de_cambios;
        this.manubrio = manubrio;
        this.manija_de_aceleracion = manija_de_aceleracion;
        this.cadena = cadena;
    }

    public String getPedal_de_cambios() {
        return pedal_de_cambios;
    }

    public void setPedal_de_cambios(String pedal_de_cambios) {
        this.pedal_de_cambios = pedal_de_cambios;
    }

    public String getManubrio() {
        return manubrio;
    }

    public void setManubrio(String manubrio) {
        this.manubrio = manubrio;
    }

    public String getManija_de_aceleracion() {
        return manija_de_aceleracion;
    }

    public void setManija_de_aceleracion(String manija_de_aceleracion) {
        this.manija_de_aceleracion = manija_de_aceleracion;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    @Override
    public void derrapar(){
        
    }
    
    @Override
    public void arrancar(){
        
    }
    
    @Override
    public void acelerar(){
        
    }
    
    @Override
    public void detenerse(){
        
    }
    
    @Override
    public void frenar(){
        
    }
    
}
