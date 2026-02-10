//objeto Vehiculo
public class Vehiculo {
    //atributos a usar y pasar
    private final String placa;
    private String marca;
    private String modelo;

    //defino mi objeto
        public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca =marca;
        this.modelo = modelo;

        }


//getters
public String getPlaca() {
            return placa;

}
public String getMarca() {

            return marca;
}

public String getModelo() {
            return modelo;

}

//setters modificar cambiar
    public void setMarca(String Nuevamarca) {

            this.marca = Nuevamarca;


    }

    public void setModelo(String NuevoModelo)
        {
            this.modelo = NuevoModelo;
        }



//metodos que modifican cosas


   //@Override al usar objetos e imprimir
    public String toString() {
        return "Vehiculo" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'';
    }
}
