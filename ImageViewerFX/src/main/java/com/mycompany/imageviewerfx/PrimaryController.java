package com.mycompany.imageviewerfx;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PrimaryController {
    @FXML
    private Button openPicture;
    @FXML
    private ImageView imageView;
    @FXML
    private TextField textField;
    
    @FXML
    private void initialize(){
        openPicture.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                open(event);
            }
        });
    }
    
    @FXML
    private void open(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image File");
        
        //zobrazení dialogu pro výběr souboru
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        
        if (selectedFile != null){
            //Načtení obrázku z vybraného souboru
            Image image = new Image(selectedFile.toURI().toString());
            String path = selectedFile.getAbsolutePath();
            //Zobrazení obrázku
            imageView.setImage(image);
            textField.setText(path);
        }
    }
}
