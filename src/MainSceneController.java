

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.animation.SequentialTransition;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.beans.value.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class MainSceneController  {
  //  @FXML private Button mhc;
  @FXML private Button SVButton;
    @FXML 
    void SinhVienProcess(MouseEvent event) throws IOException {
      Parent dash = FXMLLoader.load(getClass().getResource("sinhvien.fxml"));
      Scene dashScene = new Scene(dash);
      Stage window = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
      window.setScene(dashScene);
      window.show();
    }
 
    

}