package poo2.parqueadero.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CarroDAO {
	
	private Connection conn;
	
	public CarroDAO() {
		try {
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (SQLException e) {
			System.err.println("La conexión no se pudo establecer. "+e.getMessage());
		}
	}
	
	public CarroDAO(Connection conn) {
		this.conn = conn;
	}
	
	public boolean registrarCarro(String placa, String marca, String modelo, int cilindraje, int noPuertas) {
		boolean exito = false;
		
		try {
			Statement statementOb = conn.createStatement();
			
			String sqlString = "INSERT INTO VEHICULOS_PARQUEADOS (PLACA, MARCA, MODELO, CILINDRAJE, NUM_PUERTAS) VALUES "
					+ "('"+placa+"', '"+marca+"', '"+modelo+"', "+cilindraje+", "+noPuertas+")";
			
			statementOb.executeUpdate(sqlString);
			
			exito = true;
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return exito;
	}
	
	public boolean retirarCarro(String placa) {
		boolean exito = false;
		
		try {
			Statement statementOb = conn.createStatement();
			String sqlString = "DELETE FROM VEHICULOS_PARQUEADOS WHERE PLACA=" + placa;			
			statementOb.executeUpdate(sqlString);
			exito = true;
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return exito;
	}
	
	public ArrayList<CarroDTO> listarHistoricoCarros(){
		ArrayList<CarroDTO> carros = new ArrayList<CarroDTO>();
		Statement statementOb = null;
		
		try {
			statementOb = conn.createStatement();
	        ResultSet rs = statementOb.executeQuery("SELECT * FROM CARROS_HISTORICO");
	        
	        while (rs.next()) {
	        	CarroDTO dto = new CarroDTO();
	        	dto.setPlaca(rs.getString("PLACA"));
	        	dto.setMarca(rs.getString("MARCA"));
	        	dto.setModelo(rs.getString("MODELO"));
	        	dto.setCilindraje(rs.getInt("CILINDRAJE"));
	        	dto.setNoPuertas(rs.getInt("NUM_PUERTAS"));
	        	
	        	carros.add(dto);
	        	
	        }
        
		}catch(Exception e) {
			System.err.println("Se presentó un error ejecutando la consulta. "+e.getMessage());
		}finally {
			// Close the connection            
            try {
            	statementOb.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
            
		}
		
		return carros;
	}
	
	public ArrayList<VehiculoDTO> listar(){
		ArrayList<VehiculoDTO> vehiculos = new ArrayList<VehiculoDTO>();
		Statement statementOb = null;
		
		try {
			statementOb = conn.createStatement();
	        ResultSet rs = statementOb.executeQuery("SELECT * FROM VEHICULOS_PARQUEADOS");
	        
	        while (rs.next()) {
	        	VehiculoDTO dto = new VehiculoDTO();
	        	dto.setPlaca(rs.getString("PLACA"));
	        	dto.setMarca(rs.getString("MARCA"));
	        	dto.setModelo(rs.getString("MODELO"));
	        	dto.setCilindraje(rs.getInt("CILINDRAJE"));
	        	
	        	vehiculos.add(dto);
	        	
	        }
        
		}catch(Exception e) {
			System.err.println("Se presentó un error ejecutando la consulta. "+e.getMessage());
		}finally {
			// Close the connection            
            try {
            	statementOb.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
            
		}
		
		return vehiculos;
	}
	
}
