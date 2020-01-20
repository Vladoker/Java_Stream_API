/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfinal;

import java.util.Calendar;

/**
 *
 * @author Vladik_tm
 */
public class Auto {
    
    private String manufacturer;
    private String model;
    private Integer year;
    private Double motorCapacity;
    private Type type;
    
   public Auto(String manufacturer,String model, int year, double motorCapacity, Type type) {
       this.manufacturer = manufacturer;
       this.model = model;
       this.year = year;
       this.motorCapacity = motorCapacity;
       this.type = type;
   }
   
   public String getName() {
       return this.manufacturer;
   }
    public String getModel() {
       return this.model;
   }
    public Double getMotor() {
        return this.motorCapacity;
    }
    public Integer getYear() {
       return this.year;    
   }
   public Type getType () {
       return this.type;
   }
   
   @Override
   public String toString(){
       return (manufacturer + " || " + model) + " || " + motorCapacity.toString() + " || " + year.toString() +
            " || " + type.toString();
   }
   
   
   
    
}
