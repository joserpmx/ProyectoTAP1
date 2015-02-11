/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ericka y Jose
 */
public class Calculadora {
    public float resultado;
    public void suma(float numero){
       resultado += numero;
    }
    public void resta(float numero){
       resultado -= numero;
    }
    public void multiplica(float numero){
       resultado *= numero;
    }
    public void divide(float numero){
       resultado /= numero;
    }
    public void raiz(float numero){
        resultado= (float) Math.sqrt(numero);
    }
    public String  oprimenumero(String cadena, String Tecla, int BotonOperador)
     {
        if ("0".equals(cadena)) //si la cadena esta en cero, es la primera tecla que se oprime, el texto es igual a la tecla oprimida
          {
              cadena=Tecla;
          }
       else
          {
              if (BotonOperador==0) // si ya hay algo en la cadena pero no se ha oprimido un operador, se agrega la tecla oprimida a la cadena en pantalla
                {
                    cadena=cadena + Tecla;
                }              
              else  // si se oprimio un operador y luego una tecla la cadena nueva es igual a la tecla oprimida
                {
                    cadena=Tecla;
                }  
          }
       return(cadena);
    }
    
    public String OprimeOperador (char operadorAnt, float numero)
    {
        switch (operadorAnt)
         {   
            case ' ': resultado=numero; //cuando es el primer operador que se teclea
                      break;     
            case '+': suma(numero);
                      break;
            case '-': resta(numero);
                      break;
            case '*': multiplica(numero);
                      break;
            case '/': divide(numero);
                      break;
            case '=': resultado=numero;
                      break;
            case '$': raiz(numero);
                      break;
         }       
        return(String.valueOf(resultado));    
    }            
}
