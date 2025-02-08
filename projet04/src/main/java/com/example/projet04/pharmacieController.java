package com.example.projet04;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class pharmacieController implements Initializable {
    @FXML
    Label msg;
@FXML
 TextField reftf,lib;
@FXML
 RadioButton lm1,lm2,lm3;
@FXML
 public void enregistrer(){
    //recupere lib et ref
    String ref=reftf.getText();
    String l=lib.getText();
    String c =" ";
    if (lm1.isSelected())
        c="bebe";
    else if (lm2.isSelected())
        c="enfant";
    else
        c="adulte";
    msg.setText("med :"+l+"reference"+ref+"pour "+c+"est enregistrer");

}
public void annuler(){
    lib.setText("");
    reftf.setText("");
    lm1.setSelected(false);
    lm2.setSelected(false);
    lm3.setSelected(false);
    msg.setText(" ");
}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
