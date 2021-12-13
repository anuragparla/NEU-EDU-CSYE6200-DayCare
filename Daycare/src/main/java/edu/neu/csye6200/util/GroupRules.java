/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.util;

/**
 *
 * @author varun
 */
public class GroupRules {
    public static boolean validate(int ageLower, int ageHigher, int groupSize){
        
       if (ageLower> 5 && ageHigher<=12){
           if (groupSize>=4){
               return false;
           }
       }
           else if(ageLower> 12 && ageHigher<=24){
               if(groupSize>=5){
                   return false;
               }
           }
           
           else if(ageLower> 24 && ageHigher<=35){
              
               if(groupSize>=6){
                 
                   return false;
               }
           }
           else if(ageLower> 36 && ageHigher<=47){
               if(groupSize>=8){
                   return false;
               }
           }
           else if(ageLower> 48 && ageHigher<=59){
               if(groupSize>=12){
                   return false;
               }
           }
           else if(ageLower>= 60 ){
               if(groupSize>=15){
                   return false;
               }
           }
      
       return true;
    }
}
