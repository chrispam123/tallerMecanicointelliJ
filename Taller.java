import java.util.ArrayList; //inicializamos el arraylist para guardar datos
public class Taller {


    private ArrayList<Vehiculo> inventario; //definimos declaramos el arrylist modelo vacio

    //constructor
    public Taller() {

        this.inventario = new ArrayList<>(); //dejamos espacio en memoria

    }
    //metodo agregar vehiculo
    public boolean agregarVehiculo(String placa, String marca, String modelo ) {

        Vehiculo coche = new Vehiculo(placa, marca, modelo);
        inventario.add(coche);
        return true;
    }
    //metodo mostrar vehiculo
    public void mostrarVehiculo() {
        for (Vehiculo coche : inventario) {
            System.out.println(coche);
        }
    }











}