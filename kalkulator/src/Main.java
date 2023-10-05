import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {


      double a, b;
      String operacja;

      a = nastepnaLiczba("podaj pierwszą liczbę"); // pierwsza liczba 🥴
      b = nastepnaLiczba("podaj drugą liczbę"); // druga liczba 🤯🤯🤯

      operacja = nastepnyZnak("podaj operacje ( + - * / ^ p )","+-*/^p");

      if(operacja.equals("/")){
         while (b==0) {
            System.out.println("nie dziel przez 0!!!!!!!!");
            b = nastepnaLiczba("podaj drugą liczbę");
         }
      }


      switch (operacja){
         case "+":
            operacja(a,b,dodaj(a,b),"+");
            break;
         case "-":
            operacja(a,b,odejmi(a,b),"-");
            break;
         case "*":
            operacja(a,b,pomnoz(a,b),"*");
            break;
         case "/":
            operacja(a,b,dziel(a,b),"/");
            break;
         case "^":
            operacja(a,b,potegoj(a,b),"^");
            break;
         case "p":
            operacja(b,a,pierwiastek(a,b),"√");
            break;
         default:
      }
/*
      switch (operacja){
         case "+":
            operacja(a,b,a+b,"+");
            break;
         case "-":
            operacja(a,b,a-b,"-");
            break;
         case "*":
            operacja(a,b,a*b,"*");
            break;
         case "/":
            operacja(a,b,a/b,"/");
            break;
         case "^":
            operacja(a,b,Math.pow(a,b),"^");
            break;
         case "p":
            operacja(b,a,Math.pow(a,1/b),"√");
            break;
         default:
      }*/
   }

   public static void operacja(double a,double b,double wynik, String znak){
      System.out.println(a+" "+znak+" "+b+" = "+wynik);
   }
   public static double dodaj(double a, double b){
      return  a + b;
   }
   public static double odejmi(double a, double b){
      return  a -b;
   }
   public static double pomnoz(double a, double b){
      return  a *b;
   }
   public static double dziel(double a, double b){
      return  a /b;
   }
   public static double potegoj(double a, double b){
      return  Math.pow(a,b);
   }
   public static double pierwiastek(double a, double b){
      return  Math.pow(a,1/b);
   }
   public static double nastepnaLiczba(String text){
      System.out.println(text);
      Scanner essa = new Scanner(System.in);
      while(essa.hasNext()){
         if(essa.hasNextDouble()) break;
         System.out.println("podaj liczbę!!!");
         essa.next();
      }
      return essa.nextDouble();
   }
   public static String nastepnyZnak(String text,String znaki){
      System.out.println(text);
      Scanner essa = new Scanner(System.in);
      String znak= " ";
      while(essa.hasNext() ){
         String bbb = essa.next();
         znak = String.valueOf(bbb.charAt(0));
         if(znaki.contains(znak)){
            break;
         }
         System.out.println(text);
      }
      return znak;
   }


}