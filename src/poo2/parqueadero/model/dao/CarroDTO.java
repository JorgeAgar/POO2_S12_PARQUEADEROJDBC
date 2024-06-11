package poo2.parqueadero.model.dao;

public class CarroDTO extends VehiculoDTO{
    private int noPuertas;

    public CarroDTO(){}

    public CarroDTO(String placa, String marca, String modelo, int cilindraje, int noPuertas) {
        super(placa, marca, modelo, cilindraje);
        this.noPuertas = noPuertas;
    }

    public CarroDTO(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo, cilindraje);
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
   
}
