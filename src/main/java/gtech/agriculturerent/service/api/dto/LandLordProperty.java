package gtech.agriculturerent.service.api.dto;

public class LandLordProperty {

    private Long id;
    private String land;
    private String locality;
    private Long ekatte;
    private String cadastreNumber;
    private Long propertyNumber;
    private Float area;
    private Long landLordId;

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

    public Long getLandLordId() {
        return landLordId;
    }

    public void setLandLordId(Long landLordId) {
        this.landLordId = landLordId;
    }
}
