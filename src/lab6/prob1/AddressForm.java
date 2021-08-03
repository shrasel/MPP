package lab6.prob1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class AddressForm extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			primaryStage.setTitle("Address Form");
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(20);

			Label lName = new Label("Name");
			TextField tName = new TextField("John Doe");
			VBox bName = new VBox();
			bName.setSpacing(-2);
			bName.getChildren().addAll(lName, tName);

			Label lStreet = new Label("Street Address");
			TextField tStreet = new TextField("1000 N 4th St");
			VBox bStreet = new VBox();
			bStreet.setSpacing(-2);
			bStreet.getChildren().addAll(lStreet, tStreet);

			Label lCity = new Label("City");
			TextField tCity = new TextField("FairFied");
			VBox bCity = new VBox();
			bCity.setSpacing(-2);
			bCity.getChildren().addAll(lCity, tCity);

			FlowPane flowPane = new FlowPane();
			flowPane.setHgap(15);
			flowPane.setAlignment(Pos.CENTER);
			flowPane.getChildren().addAll(bName, bStreet, bCity);
			grid.add(flowPane, 0, 0, 30, 1);

			Label lState = new Label("State");
			TextField tState = new TextField("Iowa");
			VBox bState = new VBox();
			bState.setSpacing(-2);
			bState.getChildren().addAll(lState, tState);

			Label lZip = new Label("Zip");
			TextField tZip = new TextField("52557");
			VBox bZip = new VBox();
			bZip.setSpacing(-2);
			bZip.getChildren().addAll(lZip, tZip);

			FlowPane flowPane1 = new FlowPane();
			flowPane1.setHgap(15);
			flowPane1.setAlignment(Pos.CENTER);
			flowPane1.getChildren().addAll(bState, bZip);
			grid.add(flowPane1, 0, 1, 30, 1);

			VBox vbox3 = new VBox();
			Button submit = new Button("Submit");
			vbox3.getChildren().add(submit);
			submit.setOnAction((event) -> {
				System.out.println(tName.getText());
				System.out.println(tStreet.getText());
				System.out.println(tCity.getText() + ", " + tState.getText() + " " + tZip.getText());
			});

			FlowPane flowPane2 = new FlowPane();
			flowPane2.setAlignment(Pos.CENTER);
			flowPane2.getChildren().add(vbox3);
			grid.add(flowPane2, 0, 2, 30, 1);

			Scene scene = new Scene(grid, 700, 250);
			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
