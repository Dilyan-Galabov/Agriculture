package gtech.agriculturerent.service.impl.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import gtech.agriculturerent.service.api.dto.LandLord;

@Entity
@Table(name = "AR_LANDLORD")
public class LandLordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PIN")
    private Long PIN;

    @Column(name = "SETTLEMENT")
    private String settlement;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS_NUMBER")
    private Long addressNumber;

    @OneToMany(fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "landLordEntity",
            cascade = CascadeType.ALL)
    private List<LandLordPropertyEntity> landLordProperties;

    public LandLordEntity(){}

    public LandLordEntity(Long id){
        this.id = id;
    }

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

    public List<LandLordPropertyEntity> getLandLordProperties() {
        return landLordProperties;
    }

    public void setLandLordProperties(List<LandLordPropertyEntity> landLordProperties) {
        this.landLordProperties = landLordProperties;
    }


    public static LandLord convertToDto(LandLordEntity entity) {
        LandLord dto = new LandLord();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setSurname(entity.getSurname());
        dto.setLastName(entity.getLastName());
        dto.setPIN(entity.getPIN());
        dto.setAddress(entity.getAddress());
        dto.setAddressNumber(entity.getAddressNumber());
        dto.setSettlement(entity.getSettlement());

        return dto;
    }

    public static LandLordEntity convertToEntity(LandLord dto) {

        LandLordEntity entity = new LandLordEntity();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setSurname(dto.getSurname());
        entity.setLastName(dto.getLastName());
        entity.setPIN(dto.getPIN());
        entity.setAddress(dto.getAddress());
        entity.setAddressNumber(dto.getAddressNumber());
        entity.setSettlement(dto.getSettlement());

        return entity;
    }

}
