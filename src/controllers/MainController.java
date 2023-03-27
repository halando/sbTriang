package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.MainModel;

public class MainController {
    @FXML
    TextField basefield;
    @FXML
    TextField heightfield;
    @FXML
    TextField areafield;
    
    MainModel mainModel;

    public MainController() {
        this.mainModel = new MainModel();
    }

    @FXML 
    protected void onclickCalcButton(ActionEvent e) {
       this.startCalculation();
    }   
    private void startCalculation(){
        String baseStr =this.basefield.getText();
        String heightStr = this.heightfield.getText();
        double base = Double.parseDouble(baseStr);
        double height= Double.parseDouble(heightStr);
        Double area = this.mainModel.calcTriangleArea(base, height);
       this.areafield.setText(area.toString());

    }

}
