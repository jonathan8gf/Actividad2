package calculadora;

/**
*
* @author Jonathan Gonzalez Fraga
* @version 1.0
* 
*/
public class Calculadora {
   
   //Creacion de atributos de la clase Calculadora
   private float num1;
   private float num2;
   private float res;
   
   //Constructores; Vacio && Completo parametrizado
   //Vacio
   public Calculadora(){
       
   }
   //Completo parametrizado
   public Calculadora(float paramNum1, float paramNum2, float paramRes){
       
       this.num1 = paramNum1;
       this.num2 = paramNum2;
       this.res = paramRes;
       
   }
   
   //Getters && Setters
   //getNum1
   public float getNum1() {
       return this.num1;
   }
   //setNum1
   public void setNum1(float paramNum1) {
       this.num1 = paramNum1;
   }
   //getNum2
   public float getNum2() {
       return this.num2;
   }
   //setNum2
   public void setNum2(float paramNum2) {
       this.num2 = paramNum2;
   }
   //getRes
   public float getRes() {
       return this.res;
   }
   //getRes
   public void setRes(float paramRes) {
       this.res = paramRes;
   }
   
   //METODOS DE FUNCIONALIDAD
   //Metodo SUMA
   /**
    * Este metodo sirve para sumar dos digitos.
    * @param paramNum1 es el digito numero1 del metodo suma
    * @param paramNum2 es el digito numero2 del metodo suma
 * @return 
    * @throws java.lang.Exception Se lanzara la excepcion cuando el valor maximo disponible de java se haya sobrepasado
    */ 
   public float Suma(float paramNum1, float paramNum2) throws Exception{
       
	   //Creacion de variable resultado
	   float paramRes = 0;
	   
       //Creacion de try-catch
       try{
           
           System.out.println("SUMA");
           paramRes = paramNum1 + paramNum2;
           System.out.println("El resultado es: "+paramRes);
       
       }catch(Exception e){
                throw new Exception("Error ");
       }finally {
           
            System.out.println("Operación finalizada");
        }    
       
       return paramRes;
   }
   
   
   
   //Metodo RESTA
   /**
    * Este metodo sirve para desempeñar la operacion de resta de dos numeros
    * @param paramNum1 es el digito numero uno del metodo resta
    * @param paramNum2 es el digito numero dos del metodo resta
    * @throws java.lang.Exception Se lanzara la excepcion cuando el valor maximo disponible de java se haya sobrepasado
    */
   public float Resta(float paramNum1, float paramNum2) throws Exception{
       
	   //Creacion de variable resultado
	   float paramRes = 0;
	   
       //Creacion de try-catch
        try{
           System.out.println("RESTA");
           paramRes = paramNum1 - paramNum2;
           System.out.println("El resultado es: "+paramRes);
       
       }catch(Exception e){
           throw new Exception("Error ");
           
           }finally {
            System.out.println("Operación finalizada");
        }    
        
        return paramRes;
   }
   
   //Metodo MULTIPLICAION
   /**
    * Este metodo sirve para realizar la multiplicacion de dos digitos
    * @param paramNum1 contendra un valor numerico (num1)
    * @param paramNum2 contendra un valor numerico (num2)
    * @throws Exception Se lanzara la excepcion cuando el valor maximo disponible de java se haya sobrepasado
    */
   public float Multiplicacion(float paramNum1, float paramNum2) throws Exception{
       
	   //Creacion de variable resultado
	   float paramRes = 0;
	   
       //Creacion de try-catch
       try{
           System.out.println("MULTIPLICACIÓN");
           paramRes = paramNum1 * paramNum2;
           System.out.println("El resultado es: "+paramRes);
       
       }catch(Exception e){
           throw new Exception("Error ");
           
           }finally {
            System.out.println("Operación finalizada");
        }
       
       return paramRes;
       
   }
   
   //Metodo DIVISION
   /**
    *  Este metodo sirva para realizar la division de dos digitos
    * @param paramNum1 contendra un valor numerico (num1)
    * @param paramNum2 contendra un valor numerico (num1)
    * @throws Exception Se lazara la excepcion cuando se incmupla algunos de los rasgos tecnicos de java
    */
   public float Division(float paramNum1, float paramNum2) throws Exception {
       
	   //Creacion de variable resultado
	   float paramRes = 0;
	   
       //Creacion de try-cacth
      try{
           System.out.println("DIVISIÓN");
           paramRes = paramNum2 / paramNum1;
           System.out.println("El resultado es: "+paramRes);
       
       }catch(Exception e){
           throw new Exception("Error " +e);
           
           }finally {
            System.out.println("Operación finalizada");
        }
      return paramRes;
   }
   
   //Metodo RESTO
   /**
    * Este metodo sirve para realizar el resto de una division de dos digitos
    * @param paramNum1 contendra un valor numerico (num1)
    * @param paramNum2 contendra un valor numerico (num2)
    * @throws Exception Se lanzara la excepcion cuando se infriga alguna regla tecnica o logica de java
    */
   public float Resto(float paramNum1, float paramNum2) throws Exception {
       
	   //Creacion de variable resultado
	   float paramRes = 0;
	   
       //Creacion de try-cacth
      try{
           System.out.println("RESTO");
           paramRes = paramNum2 % paramNum1;
           System.out.println("El resultado es: "+paramRes);
       
       }catch(Exception e){
           throw new Exception("Error " +e);
           
           }finally {
            System.out.println("Operación finalizada");
        }
      
      return paramRes;
   }
   
   //Metodo Potencia
   /**
    * Este metodo sirve para realizar la potencia de dos digitos
    * @param paramNum1 contendra un valor numerico (num1)
    * @param paramNum2 contendra un valor numerico (num2)
    * @throws Exception Se lanzara la excepcion cuando no se cumplan las reglas tecnicas o logicas de java
    */
   
   public int Potencia(float paramNum1, float paramNum2) throws Exception
   {
	   //Creacion de variable resultado
	   int paramRes = 0;
	   
       //Variable auxiliar
       int resultado = 0;
       
       //Cracion Try-catch
       try{
           
           System.out.println("POTENCIA");
           resultado = (int) Math.pow(paramNum1, paramNum2);
           System.out.println("El resultado es: " +resultado);
           
       }catch(Exception e){
           throw new Exception("Error " +e);
           
       }finally{   
           System.out.println("Operación finalizada");
       } 
       
       return paramRes;
   }
   
   //Metodo Limpiar Resultado
   /*
    * Metodo que seriviara para limpar el valor de resultado,
    * para elllo le denominaremos a 0
    */
   public void Limiar() {
	   res = 0;
   }
   
}