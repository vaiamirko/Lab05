
	package it.polito.tdp.anagrammi.controller;

	import java.net.URL;
	import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Anagramma;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class AnagrammiController {
		private Anagramma anagramma=new Anagramma();

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtParola;

	    @FXML
	    private Button btnCercaAnagrammi;

	    @FXML
	    private TextArea txtAnagrammiCorretti;

	    @FXML
	    private TextArea txtAnagrammiErrati;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void doReset(ActionEvent event) {
	    	txtParola.clear();
	    	txtAnagrammiCorretti.clear();
	    	txtAnagrammiErrati.clear();

	    }

	    @FXML
	    void handleCalcolaAnagrammi(ActionEvent event) {
	    	

	    }

	    @FXML
	    void initialize() {
	        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnCercaAnagrammi != null : "fx:id=\"btnCercaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

	    }
	    public void setAnagramma(Anagramma anagramma) {
	    	this.anagramma=anagramma;
	    }
	}


	


