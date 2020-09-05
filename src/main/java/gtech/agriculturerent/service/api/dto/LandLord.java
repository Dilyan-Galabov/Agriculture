package gtech.agriculturerent.service.api.dto;

import java.util.List;
import java.util.Objects;

public class LandLord {

    private Long id;
    private String firstName;
    private String surname;
    private String lastName;
    private Long PIN;
    private String settlement;
    private String address;
    private Long addressNumber;
    private List<LandLordProperty> landLordProperties;


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPIN() {
        return PIN;
    }

    public void setPIN(Long PIN) {
        this.PIN = PIN;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Long addressNumber) {
        this.addressNumber = addressNumber;
    }

    public List<LandLordProperty> getLandLordProperties() {
        return landLordProperties;
    }

    public void setLandLordProperties(List<LandLordProperty> landLordProperties) {
        this.landLordProperties = landLordProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LandLord)) return false;
        LandLord landLord = (LandLord) o;
        return getId().equals(landLord.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
