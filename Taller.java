import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList; //inicializamos el arraylist para guardar datos
import java.util.Scanner;

public class Taller {


    private ArrayList<Vehiculo> inventario; //definimos declaramos el arrylist modelo vacio
    //definimos las rutas constanstes
    private static final String CARPETA = "data";
    private static final String ARCHIVO = "data/vehiculos.txt";
    //variables en mayúsculas por convención

    //constructor
    public Taller() {

        this.inventario = new ArrayList<>(); //dejamos espacio en memoria
        //llamamos a la preparación apenas se cree el taller al inciar Taller taller=new Taller();
        prepararArchivo();

    }
    //preparar carpetas y archivos es lo primero
    private void prepararArchivo(){
        try{
            //revisamos la carpeta
            File directorio = new File(CARPETA);
            if(!directorio.exists()){
                if(directorio.mkdir()){
                    System.out.println("Carpeta iniciado exitosamente");

                }
            }
            else {
                System.out.println("Ya existe un Carpeta data");
            }

            //revisamos el archivo
            File archivo = new File(ARCHIVO);
            if(!archivo.exists()){
                if(archivo.createNewFile()) {

                    System.out.println("Achivos de vehiculos creados");

                }


            }
            else {
                System.out.println("Ya existe un archivos vehiculos.txt");
            }

        }catch(Exception e){
            System.out.println("error al crear el archivo");
            
        }


    }







    //metodo agregar vehiculo este es el inventario
    public boolean agregarVehiculo(String placa, String marca, String modelo ) {

        Vehiculo coche = new Vehiculo(placa, marca, modelo);
        inventario.add(coche);
        escribirArchivo(coche);
        return true;
    }

    //NUEVO metodo escribir en archivo
    public void escribirArchivo(Vehiculo coche){

        //preparamos la línea de texto (Formato:Placa,Marca,Modelo);
        String linea=coche.getPlaca()+ ","+ coche.getMarca()+ ","+ coche.getModelo();
        try(FileWriter fw = new FileWriter(ARCHIVO,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.println(linea);// escribimos la linea y saltamos a la siguiente




        }catch(Exception e){
            System.out.println("error al escribir el archivo");
        }



    }

//metodo cargar datos

    private void cargarDatos(){

        //usamos try-with recursos para que el lector se cierre solo




    }




    //metodo mostrar vehiculo
    public void mostrarVehiculo() {
        for (Vehiculo coche : inventario) {
            System.out.println(coche);
        }
    }



}