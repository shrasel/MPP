package lab6.prob2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Main extends Application {

	private TextField jtInput;
	private TextField jtOutput;
	private GridPane grid;
	private GridPane gridleft;
	private GridPane gridright;

	private Button btnCountLetters;
	private Button btnReverseLetters;
	private Button btnRemoveDuplicates;
	private Scene scene;

	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 275;

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			primaryStage.setTitle("Form");

			this.grid = gridSetUp(10, 20, 20);

			this.gridleft = gridSetUp(10, 20, 20);

			this.btnCountLetters = new Button("Count Letters");
			this.btnCountLetters.setPrefSize(150, 20);
			this.btnReverseLetters = new Button("Reverse Letters");
			this.btnReverseLetters.setPrefSize(150, 20);
			this.btnRemoveDuplicates = new Button("Remove Duplicates");
			this.btnRemoveDuplicates.setPrefSize(150, 20);

			VBox leftColumn = new VBox(10);
			leftColumn.setAlignment(Pos.CENTER);

			gridleft.add(btnCountLetters, 0, 0);
			gridleft.add(btnReverseLetters, 0, 1);
			gridleft.add(btnRemoveDuplicates, 0, 2);

			btnCountLetters.setOnAction((event) -> {
				String value = jtInput.getText();
				jtOutput.setText(String.valueOf(Util.countLetters(value)));
			});

			btnReverseLetters.setOnAction((event) -> {
				String value = jtInput.getText();
				jtOutput.setText(String.valueOf(Util.reverseLetters(value)));
			});

			btnRemoveDuplicates.setOnAction((event) -> {
				String value = jtInput.getText();
				jtOutput.setText(String.valueOf(Util.removeDuplicates(value)));
			});

			leftColumn.getChildren().add(gridleft);
			grid.add(leftColumn, 0, 0);

			this.gridright = gridSetUp(0, 0, 0);

			this.jtInput = new TextField();
			this.jtInput.setPromptText("Input");

			this.jtOutput = new TextField();
			this.jtOutput.setPromptText("Output:");
			this.jtOutput.setEditable(false);

			gridright.add(new Label("Input:"), 0, 0);
			gridright.add(jtInput, 0, 1);
			gridright.add(new Label("Output:"), 0, 3);
			gridright.add(jtOutput, 0, 4);

			VBox rightColumn = new VBox(10);
			rightColumn.setAlignment(Pos.CENTER);
			rightColumn.getChildren().add(gridright);
			grid.add(rightColumn, 1, 0);

			scene = new Scene(grid, DEFAULT_WIDTH, DEFAULT_HEIGHT);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private GridPane gridSetUp(int Hgap, int Bgap, int padding) {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(Hgap);
		grid.setVgap(Bgap);
		grid.setPadding(new Insets(padding, padding, padding, padding));
		return grid;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
