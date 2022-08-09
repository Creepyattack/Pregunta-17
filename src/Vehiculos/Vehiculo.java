/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author ppbet
 */
abstract class Vehiculo {
    
    private String color, model, marca, ruedas;
    
    public Vehiculo(){
    
       }

    public Vehiculo(String color, String model, String marca, String ruedas) {
        this.color = color;
        this.model = model;
        this.marca = marca;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    
    public void arrancar(){
        
    }
    
    public void acelerar(){
        
    }
    
    public void detenerse(){
        
    }
    
    public void frenar(){
        
    }
    
}
