package model;

public class Employee {

    private int idEmployee;
    private String employeeName;
    private String lastName;
    private String phone;
    private String mail;
    private String passw;
    private String position;

    public Employee(){

    }

    public Employee(int idEmployee, String employeeName, String lastName, String phone, String mail, String passw, String position) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
        this.passw = passw;
        this.position = position;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
