/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptosavanzados.tareano4.utilitarios;

import java.util.LinkedList;

/**
 *
 * @author Kevin Ray Marzola Otero
 */
public class CalcularRangosDeTamano 
{
    private double VS;
    private double S;
    private double M;
    private double L;
    private double VL;
    private LinkedList<Double> listadoDeValores;
    private double O2;
    private double O;
    private double AVG;

    /*
    * GETTERS
    */
    public double getVS() 
    {
        return VS;
    }

    public double getS() 
    {
        return S;
    }

    public double getM() 
    {
        return M;
    }

    public double getL() 
    {
        return L;
    }

    public double getVL() 
    {
        return VL;
    }

    public double getO() 
    {
        return O;
    }

    public double getAVG() 
    {
        return AVG;
    }
    
    public double getO2() 
    {
        return O2;
    }
    

    public LinkedList<Double> getListadoDeValores() 
    {
        return listadoDeValores;
    }
    /*
    * SETTERS
    */
  
    public void setVS(double VS) 
    {
        this.VS = VS;
    }

    public void setS(double S) 
    {
        this.S = S;
    }

    public void setM(double M) 
    {
        this.M = M;
    }

    public void setL(double L) 
    {
        this.L = L;
    }

    public void setVL(double VL) 
    {
        this.VL = VL;
    }
    
    public void setO2(double O2) 
    {
        this.O2 = O2;
    }

    public void setO(double O) 
    {
        this.O = O;
    }

    public void setAVG(double AVG) 
    {
        this.AVG = AVG;
    }
    
    /**
     * Setter para el la lista enlazada con los valores X
     * @param listadoDeValores Objetito de Tipo LinkedList double 
     */
    public void setListadoDeValores(LinkedList<Double> listadoDeValores) 
    {
        this.listadoDeValores = listadoDeValores;
    }
    
    /**
     * Metodo Coordina el calculo de todos lo coeficientes
     * @param listadoDeValores Mapa con el listado de datos X y Y 
     * @return String con el calculo de todos los coeficientes
     */
    public String Calcular(LinkedList<Double> listadoDeValores)
    {        
        setListadoDeValores(listadoDeValores);
        calcularAVG();
        calcularOs();
        calcularCoeficientes();
        return toString();
    }

     /*
      *Metodo que calcula los coeficiientes
      */
    private void calcularCoeficientes() 
    {
        VS = Math.exp(AVG - 2*O);
        S = Math.exp(AVG - O);
        M = Math.exp(AVG);
        L = Math.exp(AVG + O);
        VL = Math.exp(AVG + 2*O);
    }

    /*
    * Metodo que calcula la varianza y la desviación estandar
    */
    private void calcularOs() 
    {
        O2 = OperacionesNumericas.calcularLnAVG(listadoDeValores,AVG)/(listadoDeValores.size()-1);
        O = Math.sqrt(O2);
    }

    /*
    * Metodo que calcula AVG
    */
    private void calcularAVG() 
    {
        AVG = OperacionesNumericas.calcularLn(listadoDeValores)/listadoDeValores.size();	
    }

    @Override
    public String toString() 
    {
        return "VS: " + VS + " - S: " + S + " - M: " + M + " - L: " + L + " - VL: " + VL;    	
    };
    
}
