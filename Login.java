import javafx.application.Application;

import javafx.stage.Stage;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;



public class Login extends Application {



    @Override

    public void start(Stage primaryStage) {



        String usr, pass;



        TextInputDialog textInputDialog = new TextInputDialog("");



        textInputDialog.setTitle("Authentication");



        textInputDialog.setContentText("Enter your username ");

        Optional<String> result = textInputDialog.showAndWait();

        String usrinput = result.get();





        textInputDialog.setContentText("Enter your password ");

        Optional<String> result2 = textInputDialog.showAndWait();

        String passinput = result2.get();





        if (usrinput.equals("tsegab") && (passinput.equals("1234"))) {

            System.out.print("Welcome TSEGAB");

        } else {

            System.out.print("Wrong password or username,please try again");



        }





    }

    public static void main(String [] args) {

        launch(args);





    }

}
