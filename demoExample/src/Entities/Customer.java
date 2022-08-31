package Entities;

import Abstract.*;
import Concrete.*;


import java.time.LocalDate;

public class Customer implements Entity {
    public int id;
    public String nationalityId;
    public String firstName;
    public String lastName;
    public int birthDay;

    public Customer(int id,String nationalityId,String firstName,String lastName,int birthDay) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getNationalityId(){
        return nationalityId;
    }
    public void setNationalityId(){
        this.nationalityId = nationalityId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public int getBirthDay(){
        return birthDay;
    }
    public void setBirthDay(){
        this.birthDay = birthDay;
    }


}
