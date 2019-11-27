
package model.entity;

import java.awt.Image;
import java.util.Date;

public class Customer extends Person{
    private Image document;

    public Customer(Image document, String name, String email, Date birthDate, String cpf, String landLine, String mobile, String address, String city, String stateProvince) {
        super(name, email, birthDate, cpf, landLine, mobile, address, city, stateProvince);
        this.document = document;
    }

    public Image getDocument() {
        return document;
    }

    public void setDocument(Image document) {
        this.document = document;
    }

   
    
}
