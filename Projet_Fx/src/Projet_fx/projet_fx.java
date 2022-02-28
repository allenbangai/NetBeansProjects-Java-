package Projet_fx;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Button;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.stage.Stage;

public class projet_fx extends Application{
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("projet_fx.fxml"));
        Scene scene=new Scene(root);
        stage.setTitle("Student Registration");
        stage.setScene(scene);
        stage.show();
    }
    
    public projet_fx(){
//        initComponents();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                 con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/registration_student","root","");
            } catch (SQLException ex) {
                Logger.getLogger(projet_fx.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(projet_fx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    private void initComponents() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
