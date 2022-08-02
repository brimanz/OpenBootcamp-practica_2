public class MyClass {
    public static void main(String args[]) {
     //usando el if comprobando si un numero es positivo o negativo
     int nuemroIf = 3;

     if(nuemroIf >= 1){
          System.out.println("El numero es positivo");
     }if(nuemroIf < 0){
          System.out.println("El numero es negativo");
     }if(nuemroIf == 0){
          System.out.println("El numero es cero");
     }


     //incrementando numero usando while
     int numeroWhile = 0;

     while(numeroWhile < 3){
          System.out.println(numeroWhile);
          numeroWhile++;
     }


     // ejecutando una unica vez incrementador numero usando doWhile
     int numeroDoWhile = 4;

     do{
          numeroDoWhile = numeroDoWhile + 1;
          System.out.println(numeroDoWhile);
     }while(numeroDoWhile <= 4);


     //usando el bucle for para incrementar numero
     int numeroFor = 0;

     for(; numeroFor <= 3; numeroFor++){
          System.out.println(numeroFor);
     }


     //usando bucle switch para mostrar estaciones del año
       String estacion = "Invierno";
       
       switch(estacion){
           case "Invierno":
                System.out.println("La estacion actual es: " + estacion);
           break;
           case "Primavera":
                System.out.println("La estacion actual es: " + estacion);
           break;
           case "Otoño":
                System.out.println("La estacion actual es: " + estacion);
           break;
           default:
                System.out.println("La estacion actual es: " + estacion);
           break;
       }
    }
}