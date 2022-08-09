/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
public class Automovil extends Vehiculo_Terrestre{
    
    private String descapotable, chasis, palanca_de_cambios, pedales;
    
    public Automovil(){
        
    }
    
    public Automovil(String descapotable, String chasis, String palanca_de_cambios, String pedales, String gasolina, String color, String model, String marca, String ruedas) {
        super(gasolina, color, model, marca, ruedas);
        this.descapotable = descapotable;
        this.chasis = chasis;
        this.palanca_de_cambios = palanca_de_cambios;
        this.pedales = pedales;
    }

    public String getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(String descapotable) {
        this.descapotable = descapotable;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getPalanca_de_cambios() {
        return palanca_de_cambios;
    }

    public void setPalanca_de_cambios(String palanca_de_cambios) {
        this.palanca_de_cambios = palanca_de_cambios;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
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
