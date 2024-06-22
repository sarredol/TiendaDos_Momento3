package model;

public class Costumer {

    private int idCostumer;
    private String costumerName;
    private String lastName;
    private String phone;
    private String mail;
    private String passw;
    private String type;

    public Costumer(){

    }

    public Costumer(int idCostumer, String costumerName, String lastName, String phone, String mail, String passw, String type) {
        this.idCostumer = idCostumer;
        this.costumerName = costumerName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
        this.passw = passw;
        this.type = type;
    }

    public int getIdCostumer() {
        return idCostumer;
    }

    public void setIdCostumer(int idCostumer) {
        this.idCostumer = idCostumer;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
