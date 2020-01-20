/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfinal;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Vladik_tm
 */
public class App {

    
    public static void main(String[] args) {
        List<Auto> list = new ArrayList<Auto>();
       Auto m1 = new Auto("BMW", "X5", 5, 2.8, Type.diesel);
       Auto m2 = new Auto("Honda", "z55", 12, 2.5, Type.diesel);
       Auto m3 = new Auto("Volkswagen", "yol32", 6, 3.0,Type.diesel);
       Auto m4 = new Auto("Ford", "PIX", 20, 3.2, Type.petrol);
       Auto m5 = new Auto("Hyundai", "Tycson", 10, 2.0, Type.petrol);
       
       list.add(m1);
       list.add(m2);
       list.add(m3);
       list.add(m4);
       list.add(m5);
       
       list.sort((a1, a2) -> {    
         return a1.getModel().compareTo(a2.getModel());
       });
       
       
       
       //Filter motor and year
       
       List<Auto> list2 = new ArrayList<Auto>();
       
        for (Auto auto : list) {
            if(auto.getMotor() > 1.5 && auto.getYear() > 10){
                list2.add(auto);
            }
        }
        
        //Type
        List<Auto> diesel = new ArrayList<Auto>();
        List<Auto> petrol = new ArrayList<Auto>();
        
          for (Auto auto : list) {
            if(auto.getType() == Type.diesel){
                diesel.add(auto);
            }
            else petrol.add(auto);
        }
          
          
         for (Auto auto : diesel) {
             System.out.println(auto.toString());
         }
         
         
         for (Auto auto : petrol) {
             System.out.println(auto.toString());
         }
         
         
         
                   
    }
    
}
