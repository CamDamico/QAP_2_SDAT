package com.keyin.passengers;

import com.keyin.aircraft.Aircraft;
import com.keyin.city.City;
import jakarta.persistence.*;

import java.util.List;

//(id, firstName, lastName, phoneNumber
@Entity
public class Passenger {

    @Id
    @SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "passenger_sequence")
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    @OneToOne
    private City currentlyLiving;

    @OneToMany
    private List<Aircraft> listOfFlownAircraft;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public City getCurrentlyLiving() {
        return currentlyLiving;
    }

    public void setCurrentlyLiving(City currentlyLiving) {
        this.currentlyLiving = currentlyLiving;
    }

    public List<Aircraft> getListOfFlownAircraft() {
        return listOfFlownAircraft;
    }

    public void setListOfFlownAircraft(List<Aircraft> listOfFlownAircraft) {
        this.listOfFlownAircraft = listOfFlownAircraft;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
