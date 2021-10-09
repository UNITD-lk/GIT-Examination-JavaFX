/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) UnitD-lk. All rights reserved.
 *  *  Licensed under the SriLanka License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 10/9/2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        URL resource = this.getClass().getResource("view/CustomerForm.fxml");

        Parent load = FXMLLoader.load(resource);

        Scene scene = new Scene(load);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
