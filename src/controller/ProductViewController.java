package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.bo.ProductBo;
import model.entity.Product;
import util.AlertBuilder;

import java.io.IOException;
import java.util.List;

public class ProductViewController {
    Product product = new Product();
    ProductBo productBo = new ProductBo();
    HomeController homeController = new HomeController();

    @FXML
    Pane pane;

    @FXML
    TextField txtfield_name;

    @FXML
    TextField txtfield_price;

    @FXML
    Button create_product;

    @FXML
    private void initialize() {
        System.out.println("View ProductView iniciada");
        loadInfo();
    }

    private void loadInfo(){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ProductView.fxml.fxml"));
            Pane productView = loader.load();
            LoginController controller = loader.getController();
//            controller.setHomeController(this);
            List<Node> children = pane.getChildren();
            children.clear();
            children.add(productView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @FXML
//    private void handleInsert(){
//        String name = txtfield_name.getText();
//        Double price = Double.valueOf(txtfield_price.getText());
//
//        if(name.isBlank() || name.isEmpty()){
//            AlertBuilder.build("error", "Nome em branco", null, "Por favor, preencha um nome.").showAndWait();
//            return;
//        }
//
//        product.setName(name);
//        product.setPrice(price);
//        productBo.createProduct(product);
//    }

}
