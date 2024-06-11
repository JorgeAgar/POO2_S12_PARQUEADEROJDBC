/**
 * Sample Skeleton for 'IngresarCarroView.fxml' Controller Class
 */

package poo2.parqueadero.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import poo2.parqueadero.model.ParqueaderoFachada;
 
public class IngresarCarroController {
 
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
 
    @FXML // fx:id="cboCilindraje"
    private ComboBox<Integer> cboCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="cboPuertas"
    private ComboBox<Integer> cboPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRegistrarCarro"
    private Button cmdRegistrarCarro; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRetirarCarro"
    private Button cmdRetirarCarro; // Value injected by FXMLLoader

    @FXML // fx:id="lstVehiculos"
    private ListView<?> lstVehiculos; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="txtMinutos"
    private TextField txtMinutos; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlaca"
    private TextField txtPlaca; // Value injected by FXMLLoader

    private ObservableList<Integer> puertas = FXCollections.observableArrayList();
    private ObservableList<Integer> cilindraje = FXCollections.observableArrayList();

    private ParqueaderoFachada fachada;
 
    @FXML
    void registrarCarro(ActionEvent event) {
        
    }

    @FXML
    void retirarCarro(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cboCilindraje != null : "fx:id=\"cboCilindraje\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert cboPuertas != null : "fx:id=\"cboPuertas\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert cmdRegistrarCarro != null : "fx:id=\"cmdRegistrarCarro\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert cmdRetirarCarro != null : "fx:id=\"cmdRetirarCarro\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert lstVehiculos != null : "fx:id=\"lstVehiculos\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'IngresarCarroView.fxml'.";

        initCilindraje();
        initPuertas();
        fachada = ParqueaderoFachada.getInstance();

    }

    private void initPuertas(){
        puertas.add(2);
        puertas.add(3);
        puertas.add(4);
        puertas.add(5);
        cboPuertas.setItems(puertas);
    }

    private void initCilindraje(){
        cilindraje.add(1000);
        cilindraje.add(1200);
        cilindraje.add(1500);
        cilindraje.add(2000);
        cboCilindraje.setItems(cilindraje);
    }

}
 