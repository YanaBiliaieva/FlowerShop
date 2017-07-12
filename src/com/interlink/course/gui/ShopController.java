package com.interlink.course.gui;/**
 * Created by Яна on 03.07.2017.
 */

import com.interlink.course.Bouquet;
import com.interlink.course.natural.Color;
import com.interlink.course.artificial.Artificial;
import com.interlink.course.artificial.ArtificialMaterial;
import com.interlink.course.natural.Camomile;
import com.interlink.course.natural.Rose;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;




public class ShopController extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @FXML
    private Button createBouquetButton;
    @FXML
    private Label totalBouquetPriceLabel;
    @FXML
    private Label numberOfNaturalFlowersLabel;
    @FXML
    private Label numberOfArtificialFlowersLabel;
    @FXML
    private Label numberOfCamomilesLabel;
    @FXML
    private Label numberOfRosesFlowersLabel;
    @FXML
    private Label numberOfMetalFlowersLabel;
    @FXML
    private Label numberOfPaperFlowersLabel;
    @FXML
    private Label numberOfGlassFlowersLabel;
    @FXML
    private Label numberOfMulticolorFlowersLabel;
    @FXML
    private Label numberOfRedFlowersLabel;
    @FXML
    private Label numberOfYellowFlowersLabel;
    @FXML
    private Label numberOfWhiteFlowersLabel;

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("/com/interlink/course/gui/shop.fxml"));
            Scene shopScene=new Scene(root);
            primaryStage.setScene(shopScene);
            primaryStage.setTitle("Welcome to Flower Shop");
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void createBouquet(ActionEvent event){
        Bouquet bouquet=new Bouquet();
        for (int i=0; i<20; i++){
            int	 k=(int) (Math.random()*3);
            switch (k){
                case 1:  bouquet.add(new Artificial());
                break;
                case 2: bouquet.add(new Camomile());
                break;
                case 3: bouquet.add(new Rose());
                break;
                default: bouquet.add(new Rose());
            }
        }
        Double price=bouquet.getBouquetPrice();
        totalBouquetPriceLabel.setText(price.toString());
        int a=0;
        int c=0;
        int r=0;
        int metal=0;
        int paper=0;
        int glass=0;
        int multicolor=0;
        int red=0;
        int white=0;
        int yellow=0;
        for (int i=0; i<20; i++){
            if(bouquet.get(i) instanceof Artificial){
                a++;
                if(((Artificial) bouquet.get(i)).getMaterial()== ArtificialMaterial.GLASS){
                    glass++;
                }else if(((Artificial) bouquet.get(i)).getMaterial()== ArtificialMaterial.PAPER){
                    paper++;
                }else if(((Artificial) bouquet.get(i)).getMaterial()== ArtificialMaterial.METAL){
                    metal++;
                }

            }else if(bouquet.get(i) instanceof Camomile){
                c++;

            }else if (bouquet.get(i) instanceof Rose){
                r++;
                if(((Rose) bouquet.get(i)).getColor()== Color.MULTICOLOR){
                    multicolor++;
                }else if(((Rose) bouquet.get(i)).getColor()== Color.RED){
                    red++;
                }else if(((Rose) bouquet.get(i)).getColor()== Color.WHITE){
                    white++;
                }else if(((Rose) bouquet.get(i)).getColor()== Color.YELLOW){
                    yellow++;
                }
            }

        }
        numberOfNaturalFlowersLabel.setText(String.valueOf(c+r));
        numberOfArtificialFlowersLabel.setText(String.valueOf(a));
        numberOfCamomilesLabel.setText(String.valueOf(c));
        numberOfRosesFlowersLabel.setText(String.valueOf(r));
        numberOfMetalFlowersLabel.setText(String.valueOf(metal));
        numberOfPaperFlowersLabel.setText(String.valueOf(paper));
        numberOfGlassFlowersLabel.setText(String.valueOf(glass));
        numberOfMulticolorFlowersLabel.setText(String.valueOf(multicolor));
        numberOfRedFlowersLabel.setText(String.valueOf(red));
        numberOfWhiteFlowersLabel.setText(String.valueOf(white));
        numberOfYellowFlowersLabel.setText(String.valueOf(yellow));
    }
}
