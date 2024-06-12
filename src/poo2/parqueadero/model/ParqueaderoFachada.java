package poo2.parqueadero.model;

import java.util.ArrayList;

import poo2.parqueadero.model.dao.CarroDAO;
import poo2.parqueadero.model.dao.VehiculoDTO;

public class ParqueaderoFachada {
    private static ParqueaderoFachada instance;

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
    
    public void retirarCarro(String placa) {
    	if(placa.isBlank())
    		throw new RuntimeException("Placa inválida");
    	
    	CarroDAO dao = new CarroDAO();
    	try {
    		dao.retirarCarro(placa);
    	} catch(Exception e) {
    		throw new RuntimeException(e.getMessage());
    	}
    }
    
    public ArrayList<VehiculoDTO> listar(){
    	CarroDAO dao = new CarroDAO();
    	return dao.listar();
    }
}
