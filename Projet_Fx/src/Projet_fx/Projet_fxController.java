package Projet_fx;

//import java.awt.Image;
//import java.awt.Label;
//import java.awt.TextField;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
// Java.sql.Timestamp
import javafx.scene.DepthTest;

public class Projet_fxController implements Initializable {
    projet_fx fxconnect = new projet_fx();
    Connection con = fxconnect.con;
    PreparedStatement pst;
    ResultSet rs;
    
    @FXML
    private javafx.scene.control.Label message;
//    private String pathname;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockimageview;
    @FXML
    private Button SubmiTButton;
    private Button cancelButton;
    @FXML
    private Button CancelButtonView;
    @FXML
    private RadioButton txtradio;
    @FXML
    private TextField txtregion;
    @FXML
    private TextField txtplacebirth;
    @FXML
    private TextField txtdivision;
    @FXML
    private TextField txtstatus;
//    @FXML
//    private DatePicker txtdate;
    @FXML
    private TextField txtname;
    @FXML
    private PasswordField txtpassword;
    @FXML
    private TextField txtusername;

    @FXML
    public void SubmitButtonOnAction(ActionEvent event) throws SQLException {
//        message.setText("You try to register");
        try{
            String surname = txtusername.getText();
        String name = txtname.getText();
        String password = txtpassword.getText();
        String radio = txtradio.getText();
//        SimpleDateFormat date_format = new SimpleDateFormat("YYYY-MM-dd");
        
//        String date = date_format.format(txtdate.getDepthTest());
        String placebirth = txtplacebirth.getText();
        String region = txtregion.getText();
        String division = txtdivision.getText();
        String status = txtstatus.getText();
        
        try{
        pst =(PreparedStatement) con.prepareStatement("Insert into student(surname,name,password,sex,datebirth,placebirth,region,division,status)values(?,?,?,?,?,?,?,?,?)");

        }
        catch(SQLException ex){
        }
        
        pst.setString(1, surname);
        pst.setString(2, name);
        pst.setString(3, password);
        pst.setString(4, radio);
        pst.setString(5, "default");
        pst.setString(6, placebirth);
        pst.setString(7, region);
        pst.setString(8, division);
        pst.setString(9, status);
        
        pst.executeUpdate();
        
//        JOptionPane.showMessageDialog(this,"Student Registration");
        
        txtusername.setText("");
        txtname.setText("");
        txtpassword.setText("");
        txtradio.setText("");
//        txtdate.setDepthTest(DepthTest.DISABLE);
        txtplacebirth.setText("");
        txtregion.setText("");
        txtdivision.setText("");
        txtstatus.setText("");
        }
        catch(SQLException ex){
        }
        
    }

    @FXML
    public void CancelButtonOnAction(ActionEvent event) {
//        Stage stage = (Stage) cancelButton.getScene().getWindow();
//        stage.close();
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.YES_NO_OPTION== JOptionPane.showConfirmDialog(frame, "Comfirm if you want exit",
                "Student Registration",JOptionPane.YES_NO_OPTION)){
            System.exit(0);
            
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("@../../../testfx/src/testfx/registration.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("@../../../testfx/src/testfx/securite.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockimageview.setImage(lockImage);
    }
     

}