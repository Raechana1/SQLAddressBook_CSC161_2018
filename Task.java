/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc5;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author rahon
 */
public class Task {
    private final IntegerProperty ID = new SimpleIntegerProperty();
    private final StringProperty LastName = new SimpleStringProperty();
    private final StringProperty FirstName = new SimpleStringProperty();
    private final StringProperty mi = new SimpleStringProperty();
    private final StringProperty Address = new SimpleStringProperty();
    private final StringProperty City = new SimpleStringProperty();
    private final StringProperty State = new SimpleStringProperty();
    private final StringProperty phone = new SimpleStringProperty();
    
    public Task() {
    }
    
    public Task(Integer id, String lastName, String firstName, String mi, String address, String city,
            String state, String Phone) {
        this.ID.set(id);
        this.LastName.set(lastName);
        this.FirstName.set(firstName);
        this.mi.set(mi);
        this.Address.set(address);
        this.City.set(city);
        this.State.set(state);
        this.phone.set(Phone);
    }

    public IntegerProperty getID() {
        return ID;
    }
    public void setID(Integer ID){
        this.ID.set(ID);
    }

    public StringProperty getLastName() {
        return LastName;
    }
    public void setLastName(String lastname){
        this.LastName.set(lastname);
    }

    public StringProperty getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstname){
        this.FirstName.set(firstname);
    }

    public StringProperty getMi() {
        return mi;
    }
    public void setMi(String mi){
        this.mi.set(mi);
    }

    public StringProperty getAddress() {
        return Address;
    }
    public void setAddress(String address){
        this.Address.set(address);
    }

    public StringProperty getCity() {
        return City;
    }
    public void setCity(String City){
        this.City.set(City);
    }

    public StringProperty getState() {
        return State;
    }
    public void setState(String state){
        this.State.set(state);
    }

    public StringProperty getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone.set(phone);
    }
    
    
}
