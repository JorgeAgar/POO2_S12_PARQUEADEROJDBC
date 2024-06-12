package poo2.parqueadero.model.dao;

public class VehiculoDTO {
    private String placa;
    private String marca;
    private String modelo;
    private int cilindraje;

    public VehiculoDTO(){}

    public VehiculoDTO(String placa, String marca, String modelo, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

	@Override
	public String toString() {
		return marca + " " + modelo + " -> " + placa;
	}

    
}
