package Controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controlador implements Initializable{
	 @FXML
	    private Button btnagregar;
	 @FXML
	    private Button btnlimpiar;
	 @FXML
	    private Button btncomprobante;
	 @FXML
	    private TextField tfnserie;
	 @FXML
	    private TextField tfcantidad;
	 @FXML
	    private TextField tfpeso;
	 @FXML
	    private TextField tftrans;
	 @FXML
	    private TextField tfcliente;
	 @FXML
	    private TextField tfobs;
	 @FXML
	    private DatePicker tffecha;
	public void initialize(URL url, ResourceBundle rb) {
	}

	@FXML
	private void agregarregistro(ActionEvent event) {
		
		if(tfnserie.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de NUMERO DE SERIE esta vacio");
			a.show();}
		else if(tfcantidad.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de CANTIDAD está vacío");
			a.show();}
		else if(tfpeso.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de PESO está vacío");
			a.show();}
		else if(tffecha.getValue()==null){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de FECHA está vacío");
			a.show();}
		else if(tftrans.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de TRANSPORTISTA está vacío");
			a.show();}
		else if(tfcliente.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de CLIENTE está vacío");
			a.show();}
		else if(tfobs.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de OBSERVACIONES está vacío");
			a.show();}
		else {
		String nserie =this.tfnserie.getText();
		String cantidad =this.tfcantidad.getText();
		String pesototal =this.tfpeso.getText();
		String fecha = this.tffecha.getValue().toString();
		String transportista =this.tftrans.getText();
		String cliente =this.tfcliente.getText();
		String observaciones =this.tfobs.getText();
		System.out.println("Se ha guardado la información de forma correcta");
		System.out.println("Los datos que ha introducido son: \n1. Numero de serie: "+ nserie + "\n2. Cantidad: " +cantidad+
				"\n3. Peso: " +pesototal+ "\n4. Fecha: "+ fecha + "\n5. Transportista: " + transportista+
				        		"\n 6. Cliente: "+cliente+"\n 7. Observaciones: "+observaciones+"\n Para guardar la informacion pulse la tecla guardar.");
		
		}
}
	
	@FXML
	private void limpiarceldas(ActionEvent event) {
		tfnserie.clear();
		tfcantidad.clear();
		tfpeso.clear();
		tffecha.setValue(null);
		tftrans.clear();
		tfcliente.clear();
		tfobs.clear();}
	@FXML
	private void recibicomprobante(ActionEvent event) {
		if(tfnserie.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de NUMERO DE SERIE esta vacio");
			a.show();}
		else if(tfcantidad.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de CANTIDAD está vacío");
			a.show();}
		else if(tfpeso.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de PESO está vacío");
			a.show();}
		else if(tffecha.getValue()==null){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de FECHA está vacío");
			a.show();}
		else if(tftrans.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de TRANSPORTISTA está vacío");
			a.show();}
		else if(tfcliente.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de CLIENTE está vacío");
			a.show();}
		else if(tfobs.getText()==""){
			Alert a = new Alert(Alert.AlertType.ERROR);
			a.setContentText("Ha ocurrido un error. El campo de OBSERVACIONES está vacío");
			a.show();}
		else {
			String nserie =this.tfnserie.getText();
			String cantidad =this.tfcantidad.getText();
			String pesototal =this.tfpeso.getText();
			String fecha = this.tffecha.getValue().toString();
			String transportista =this.tftrans.getText();
			String cliente =this.tfcliente.getText();
			String observaciones =this.tfobs.getText();
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Información de registro");
        alert.setContentText("Los datos que ha introducido son: \n1. Numero de serie: "+ nserie + "\n2. Cantidad: " +cantidad+
        		"\n3. Peso: " +pesototal+ "\n4. Fecha: "+ fecha + "\n5. Transportista: " + transportista+
        		"\n 6. Cliente: "+cliente+"\n 7. Observaciones: "+observaciones+"\n Para guardar la informacion pulse la tecla guardar.");
        alert.showAndWait();}
		}

	}