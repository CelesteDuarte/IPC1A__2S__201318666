    import java.util.Scanner;  
    public class Clase {  
       public static void main(String[] args) {  
            Scanner num=new Scanner(System.in);  
            System.out.println("Ingresa un numero ");  
            int num1 = num.nextInt();  
            if(num1%2==0){  
                 System.out.println(num1+" es par");  
            }else{  
                System.out.println(num1+" es impar");  
            }        
         }  
    }  

