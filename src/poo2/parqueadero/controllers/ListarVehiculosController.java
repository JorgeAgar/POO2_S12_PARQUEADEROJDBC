/**
 * Sample Skeleton for 'ListarVehiculosView.fxml' Controller Class
 */

 package poo2.parqueadero.controllers;

 import java.net.URL;
 import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
 import javafx.scene.control.Label;
 import javafx.scene.control.ListView;
import poo2.parqueadero.model.ParqueaderoFachada;
import poo2.parqueadero.model.dao.CarroDTO;
 
 public class ListarVehiculosController {
 
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="lblTotalCarros"
     private Label lblTotalCarros; // Value injected by FXMLLoader
 
     @FXML // fx:id="lblTotalMotos"
     private Label lblTotalMotos; // Value injected by FXMLLoader
 
     @FXML // fx:id="lblTotalVehiculos"
     private Label lblTotalVehiculos; // Value injected by FXMLLoader
 
     @FXML // fx:id="lstCarros"
     private ListView<CarroDTO> lstCarros; // Value injected by FXMLLoader
 
     @FXML // fx:id="lstMotos"
     private ListView<?> lstMotos; // Value injected by FXMLLoader
     
     private ObservableList<CarroDTO> carros = FXCollections.observableArrayList();
     
     private ParqueaderoFachada fachada;
     
     private void actualizarMontoCarros() {
    	 lblTotalCarros.setText("$" + fachada.getMontoCarros());
     }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert lblTotalCarros != null : "fx:id=\"lblTotalCarros\" was not injected: check your FXML file 'ListarVehiculosView.fxml'.";
         assert lblTotalMotos != null : "fx:id=\"lblTotalMotos\" was not injected: check your FXML file 'ListarVehiculosView.fxml'.";
         assert lblTotalVehiculos != null : "fx:id=\"lblTotalVehiculos\" was not injected: check your FXML file 'ListarVehiculosView.fxml'.";
         assert lstCarros != null : "fx:id=\"lstCarros\" was not injected: check your FXML file 'ListarVehiculosView.fxml'.";
         assert lstMotos != null : "fx:id=\"lstMotos\" was not injected: check your FXML file 'ListarVehiculosView.fxml'.";
 
         fachada = ParqueaderoFachada.getInstance();
         initListCarros();
         carros.setAll(fachada.listarHistoricoCarros());
         actualizarMontoCarros();
     }
     
     private void initListCarros() {
     	lstCarros.setItems(carros);
     }
 
 }
 