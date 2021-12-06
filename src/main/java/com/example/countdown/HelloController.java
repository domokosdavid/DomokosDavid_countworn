package com.example.countdown;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.Period;

public class HelloController {
    @FXML
    private Button buttonIndit;
    @FXML
    private Label labelKiir;
    @FXML
    private DatePicker datumBevitel;

    public void inditas(ActionEvent actionEvent) {
        LocalDate mai = LocalDate.now();
        LocalDate megadott = datumBevitel.getValue();
        Period kulonbseg = mai.until(megadott);
        labelKiir.setText(kulonbseg.getYears() + " év " + kulonbseg.getMonths() + " hónap " + kulonbseg.getDays() + " nap ");
    }
}