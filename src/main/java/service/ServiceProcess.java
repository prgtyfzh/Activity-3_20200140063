/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.text.DecimalFormat;

/**
 *
 * @author Pragitya Faazha
 */
public class ServiceProcess {
     public float getidrtojpy(float jpy){
        
        float idr = (float) (jpy/123.63);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (idr);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
     
     public float getjpytoidr(float idr){
        
        float jpy = (float) (idr/0.0081);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (jpy);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
     
    public float getdollartoidr(float idr){
        
        float dollar = (float) (idr/0.000070);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (dollar);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
    
        public float getidrtodollar(float dollar){
        
        float idr = (float) (dollar/14301.65);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (idr);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
        
        public float getidrtokrw(float krw){
        
        float idr = (float) (krw/11.96);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (idr);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
                
        public float getkrwtoidr(float idr){
        
        float krw = (float) (idr/0.084);
        
        String pattern = "#0.00";
        DecimalFormat formatdesimal = new DecimalFormat (pattern);
        
        String a = formatdesimal.format (krw);
        
        double parsingnumber = Double.parseDouble(a);
        
        return (float) parsingnumber;
    }
}
