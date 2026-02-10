import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Taller taller = new Taller();
       Scanner leer = new Scanner(System.in);
       int opcion=0;
       //el bucle while  cpn 5 salgo del bucle
       while(opcion!=5){
        try {
            System.out.println("\n Sistema de Taller");
            System.out.println("1- Agregar Vehiculo");
            System.out.println("2- Mostrar Vehiculos");
            System.out.println("5- Salir");
            System.out.println("Elija la opcion: ");
            opcion = leer.nextInt(); //aqui pedimos el numero y asignamos a opcion
            leer.nextLine();//limpiamos el Enter que queda en el teclado
            //usaremos un Switch
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la placa: ");
                    String placa = leer.nextLine();//pedimo la placa
                    System.out.println("Ingrese la marca: ");
                    String marca = leer.nextLine();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = leer.nextLine();
                    //llamamos al metodo agregar
                    taller.agregarVehiculo(placa, marca, modelo);
                    System.out.println("Vehiculos guardados con exito!");
                    break;

                case 2:
                    taller.mostrarVehiculo();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("opcion no valida");


            }
        }catch(Exception e){

            System.out.println("Por favor ingrese solo número.....");
            leer.nextLine();
            opcion=0;
        }

       }


       //mostrar
       taller.mostrarVehiculo();




     }


}