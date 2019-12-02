package controller;

import javafx.fxml.FXML;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.bo.EmployeeBo;
import model.entity.Employee;
import util.AlertBuilder;

public class LoginController {

    HomeController homeController;
    EmployeeBo employeeBo = new EmployeeBo();

    @FXML
    TextField txtfield_login;

    @FXML
    PasswordField passfield_password;

    public void handleLogin(){

        String login = txtfield_login.getText();
        String password = passfield_password.getText();

        if(login.isBlank() || login.isEmpty()){
            AlertBuilder.build("error", "Erro", "Login é obrigatório.", "Por favor, preencha um login.").showAndWait();
            return;
        }

        if(password.isBlank() || password.isEmpty()){
            AlertBuilder.build("error", "Erro", "Senha é obrigatório.", "Por favor, preencha uma senha.").showAndWait();
            return;
        }

        Employee loginEmployee = employeeBo.login(login, password);
        if(loginEmployee != null){
            System.out.println("Logado com o " + loginEmployee.getName());
            homeController.loadContent();
            return;
        }

        passfield_password.setText("");
        AlertBuilder.build("error", "Erro", "Login e/ou senha incorretos.", "Confirme os valores digitados e tente novamente.").showAndWait();

    }

    public void setHomeController(HomeController homeController) {
        this.homeController = homeController;
    }

    @FXML
    private void initialize() {
        System.out.println("View Login iniciada");
    }

}
