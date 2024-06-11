/**
* Sample Skeleton for 'IngresarMotoView.fxml' Controller Class
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
 
public class IngresarMotoController {
 
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
 
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cboCilindraje"
    private ComboBox<Integer> cboCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="cboTipo"
    private ComboBox<String> cboTipo; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRegistrarMoto"
    private Button cmdRegistrarMoto; // Value injected by FXMLLoader

     @FXML // fx:id="cmdRetirarMoto"
    private Button cmdRetirarMoto; // Value injected by FXMLLoader

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

    private ObservableList<Integer> cilindraje = FXCollections.observableArrayList();
    private ObservableList<String> tipo = FXCollections.observableArrayList();

    @FXML
    void registrarMoto(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cboCilindraje != null : "fx:id=\"cboCilindraje\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert cboTipo != null : "fx:id=\"cboTipo\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert cmdRegistrarMoto != null : "fx:id=\"cmdRegistrarMoto\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert cmdRetirarMoto != null : "fx:id=\"cmdRetirarMoto\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert lstVehiculos != null : "fx:id=\"lstVehiculos\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'IngresarMotoView.fxml'.";

        initCilindraje();
        initTipo();
    }

    private void initTipo(){
        tipo.add("Urbana");
        tipo.add("Carretera");
        tipo.add("Callejera");
        cboTipo.setItems(tipo);
    }

    private void initCilindraje(){
        cilindraje.add(200);
        cilindraje.add(300);
        cilindraje.add(400);
        cboCilindraje.setItems(cilindraje);
    }
 
}
 