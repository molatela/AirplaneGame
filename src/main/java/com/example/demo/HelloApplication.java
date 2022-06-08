package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

    public class HelloApplication extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            Scene scene = new Scene(root, 800, 600);

            ImageView airPlaneImage= createAirPlaneModel();
            ImageView firstCloud=createFirstCloud();
            ImageView secondCloud= createSecondCloud();
            ImageView thirdCloud= createThirdCloud();
            ImageView fourthCloud= createFourthCloud();
            ImageView fifthCloud= createFifthCloud();
            ImageView sixthCloud= createSixthCloud();
            ImageView seventhCloud= createSeventhCloud();
            ImageView eighthCloud= createEighthCloud();
            ImageView ninthCloud= createNinthCloud();
            ImageView tenthCloud= createTenthCloud();

            root.getChildren().addAll(airPlaneImage,firstCloud,secondCloud,thirdCloud,fourthCloud,fifthCloud,sixthCloud,seventhCloud,eighthCloud,ninthCloud,tenthCloud);

            scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {

                double vertical = airPlaneImage.getY();
                airPlaneImage.setX(100);

                switch (event.getCode()){

                    case UP -> airPlaneImage.setY(vertical- 10 );
                    case DOWN -> airPlaneImage.setY(vertical + 10 );
                }


            });

            stage.setTitle("AirPlane Game");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }

        private ImageView createAirPlaneModel() {

            ImageView image = new ImageView(new Image("planeee.png"));
            image.setFitWidth(110);
            image.setFitHeight(90);
            image.setY(50);
            image.setX(50);



            return image;
        }

        private ImageView createFirstCloud() {
            ImageView image1 = new ImageView(new Image("cloud2.jpg"));
            image1.setFitWidth(200);
            image1.setFitHeight(150);
            image1.setY(120);
            image1.setX(800);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(8000), image1);
            translateTransition.setByX(-1500f);
            translateTransition.setCycleCount(8000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return image1;
        }

        private ImageView createSecondCloud() {
            ImageView image2 = new ImageView(new Image("cloud2.jpg"));
            image2.setFitWidth(200);
            image2.setFitHeight(150);
            image2.setY(320);
            image2.setX(900);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(8000), image2);
            translateTransition.setByX(-1900f);
            translateTransition.setCycleCount(7000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();
            return image2;
        }



        private ImageView createThirdCloud() {
            ImageView image3 = new ImageView(new Image("cloud.png"));
            image3.setFitWidth(200);
            image3.setFitHeight(150);
            image3.setY(200);
            image3.setX(1000);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(5000), image3);
            translateTransition.setByX(-1200f);
            translateTransition.setCycleCount(6000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();
            return image3;
        }

        private ImageView createFourthCloud() {
            ImageView clout4 = new ImageView(new Image("cloud.png"));
            clout4.setFitWidth(150);
            clout4.setFitHeight(100);
            clout4.setY(20);
            clout4.setX(1090);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), clout4);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return clout4;
        }

        private ImageView createFifthCloud() {
            ImageView cloud5 = new ImageView(new Image("cloud.png"));
            cloud5.setFitWidth(200);
            cloud5.setFitHeight(150);
            cloud5.setY(500);
            cloud5.setX(1100);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud5);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud5;
        }

        private ImageView createSixthCloud() {
            ImageView cloud6 = new ImageView(new Image("cloud.png"));
            cloud6.setFitWidth(255);
            cloud6.setFitHeight(155);
            cloud6.setY(480);
            cloud6.setX(1109);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud6);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud6;
        }

        private ImageView createSeventhCloud() {
            ImageView cloud7 = new ImageView(new Image("cloud.png"));
            cloud7.setFitWidth(200);
            cloud7.setFitHeight(150);
            cloud7.setY(370);
            cloud7.setX(1400);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud7);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud7;
        }

        private ImageView createEighthCloud() {
            ImageView cloud8 = new ImageView(new Image("cloud.png"));
            cloud8.setFitWidth(90);
            cloud8.setFitHeight(50);
            cloud8.setY(600);
            cloud8.setX(1900);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud8);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud8;
        }

        private ImageView createNinthCloud() {
            ImageView cloud9 = new ImageView(new Image("cloud1.png"));
            cloud9.setFitWidth(207);
            cloud9.setFitHeight(157);
            cloud9.setY(387);
            cloud9.setX(1110);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud9);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud9;
        }

        private ImageView createTenthCloud() {
            ImageView cloud10 = new ImageView(new Image("cloud.png"));
            cloud10.setFitWidth(20);
            cloud10.setFitHeight(10);
            cloud10.setY(486);
            cloud10.setX(1106);

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(9000), cloud10);
            translateTransition.setByX(-2200f);
            translateTransition.setCycleCount(5000);
            translateTransition.setAutoReverse(false);

            translateTransition.play();

            return cloud10;
        }








    public static void main(String[] args) {
        launch();
    }
}