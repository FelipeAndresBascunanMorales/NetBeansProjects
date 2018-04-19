/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 17259444-1
 */


public class Sueldo {
   
private int base;
private int pagoExtra = 0;
private int horas = 0;
private int horasExtra = 0;
private int total;


//CONSTRUCTOR
public Sueldo(int horas, int valor){

    calculoBase(horas, valor); 
    
    if (horas>44){
        calculoHoraExtra(horas);
        calculoPagoExtra(valor);
    }
    this.horas = horas;
    calculoTotal(base, pagoExtra);
        
}
    
    //CALCULO DEL SUELDO HASTA 44 HORAS
private void calculoBase(int horas, int valor){
    
    if (horas>44){
        base = 44 * valor;
    }
    else{ 
        base = horas*valor;
    }
}

    //CANTIDAD DE HORAS EXTRA
private int calculoHoraExtra(int horas){
    if (horas>44){
        horasExtra = horas-44;
    }
    return horasExtra;
}

    //CALCULO DEL PAGO EXTRA
private void calculoPagoExtra(int valor){
    pagoExtra = (int) (horasExtra*(valor*1.5));
}

    //SUELDO FINAL
private void calculoTotal(int base, int extra){
    total = base+extra;
}

    //METODOS DE RETORNO DE VALORES OBTENIDOS
public int getBase(){
    return base;
}
public int getPagoExtra(){
    return pagoExtra;
}
public int getTotal(){
    return total;
}
public int getHorasExtra(){
    return horasExtra;
}
public int getHoras(){
    return horas;
}

}
