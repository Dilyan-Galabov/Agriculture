package gtech.agriculturerent.service.impl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import gtech.agriculturerent.service.api.dto.LandLord;
import gtech.agriculturerent.service.api.dto.LandLordProperty;

@Entity
@Table(name = "AR_LANDLORD_PROPERTY")
public class LandLordPropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LAND")
    private String land;
    @Column(name = "LOCALITY")
    private String locality;
    @Column(name = "EKATTE")
    private Long ekatte;
    @Column(name = "CADASTRE_NUMBER")
    private String cadastreNumber;
    @Column(name = "PROPERTY_NUMBER")
    private Long propertyNumber;
    @Column(name = "AREA")
    private Float area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AR_LANDLORD_ID")
    private LandLordEntity landLordEntity;

    public LandLordPropertyEntity(){}

    public LandLordPropertyEntity(Long id){
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Long getEkatte() {
        return ekatte;
    }

    public void setEkatte(Long ekatte) {
        this.ekatte = ekatte;
    }

    public String getCadastreNumber() {
        return cadastreNumber;
    }

    public void setCadastreNumber(String cadastreNumber) {
        this.cadastreNumber = cadastreNumber;
    }

    public Long getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(Long propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public LandLordEntity getLandLordEntity() {
        return landLordEntity;
    }

    public void setLandLordEntity(LandLordEntity landLordEntity) {
        this.landLordEntity = landLordEntity;
    }


    public static LandLordProperty convertToDto(LandLordPropertyEntity entity) {
        LandLordProperty dto = new LandLordProperty();
        dto.setId(entity.getId());
        dto.setLand(entity.getLand());
        dto.setLocality(entity.getLocality());
        dto.setEkatte(entity.getEkatte());
        dto.setCadastreNumber(entity.getCadastreNumber());
        dto.setPropertyNumber(entity.getPropertyNumber());
        dto.setArea(entity.getArea());
        dto.setLandLordId(entity.getLandLordEntity() != null ? entity.getLandLordEntity().getId() : null);

        return dto;
    }

    public static LandLordPropertyEntity convertToEntity(LandLordProperty dto) {

        LandLordPropertyEntity entity = new LandLordPropertyEntity();

        entity.setId(dto.getId());
        entity.setLand(dto.getLand());
        entity.setLocality(dto.getLocality());
        entity.setEkatte(dto.getEkatte());
        entity.setCadastreNumber(dto.getCadastreNumber());
        entity.setPropertyNumber(dto.getPropertyNumber());
        entity.setArea(dto.getArea());
        entity.setLandLordEntity(new LandLordEntity(dto.getId()));

        return entity;
    }


}
