package es.upm.miw.persistence.jpa.entities.library;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

    private String email;

    private int phone;

    public Contact() {
        //Empty for framework
    }

    public Contact(String email, int phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
