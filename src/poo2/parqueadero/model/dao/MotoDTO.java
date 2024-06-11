package poo2.parqueadero.model.dao;

public class MotoDTO extends VehiculoDTO{
    private String tipo;

    public MotoDTO(){}

    public MotoDTO(String placa, String marca, String modelo, int cilindraje, String tipo) {
        super(placa, marca, modelo, cilindraje);
        this.tipo = tipo;
    }

    public MotoDTO(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo, cilindraje);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
