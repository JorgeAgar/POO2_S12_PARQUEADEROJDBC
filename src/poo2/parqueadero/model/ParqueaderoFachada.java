package poo2.parqueadero.model;

import java.util.ArrayList;

import poo2.parqueadero.model.dao.CarroDAO;
import poo2.parqueadero.model.dao.CarroDTO;
import poo2.parqueadero.model.dao.VehiculoDTO;

public class ParqueaderoFachada {
    private static ParqueaderoFachada instance;
    
    public static int TARIFA_CARROS = 10; //costo x minuto de parquear un carro

    private ParqueaderoFachada(){}

    public static ParqueaderoFachada getInstance(){
        if(instance == null)
            instance = new ParqueaderoFachada();
        return instance;
    }
    
    public void registrarCarro(String placa, String marca, String modelo, int cilindraje, int noPuertas) {
    	if(placa.isBlank() || marca.isBlank() || modelo.isBlank())
    		throw new RuntimeException("Los campos deben estar llenos");
    	
    	CarroDAO dao = new CarroDAO();
    	try {
    		dao.registrarCarro(placa, marca, modelo, cilindraje, noPuertas);
    	} catch(Exception e) {
    		throw new RuntimeException(e.getMessage());
    	}
    	
    }
    
    public void retirarCarro(String placa, int minutos) {
    	if(placa.isBlank())
    		throw new RuntimeException("Placa inválida");
    	
    	CarroDAO dao = new CarroDAO();
    	try {
    		dao.retirarCarro(placa, minutos);
    	} catch(Exception e) {
    		throw new RuntimeException(e.getMessage());
    	}
    }
    
    public int getMontoCarros() {
    	CarroDAO dao = new CarroDAO();
    	return dao.getMinutosCarros() * TARIFA_CARROS;
    }
    
    public ArrayList<VehiculoDTO> listar(){
    	CarroDAO dao = new CarroDAO();
    	return dao.listarCarros();
    }
    
    public ArrayList<CarroDTO> listarHistoricoCarros(){
    	CarroDAO dao = new CarroDAO();
    	return dao.listarHistoricoCarros();
    }
}
