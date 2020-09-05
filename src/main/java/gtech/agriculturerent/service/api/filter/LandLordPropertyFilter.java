package gtech.agriculturerent.service.api.filter;

import java.util.List;

public class LandLordPropertyFilter {

    private List<Long> ids;
    private List<String> lands;
    private List<String> localities;
    private List<Long> ekattes;
    private List<String> cadastreNumbers;
    private List<Long> propertyNumbers;
    private List<Float> areas;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<String> getLands() {
        return lands;
    }

    public void setLands(List<String> lands) {
        this.lands = lands;
    }

    public List<String> getLocalities() {
        return localities;
    }

    public void setLocalities(List<String> localities) {
        this.localities = localities;
    }

    public List<Long> getEkattes() {
        return ekattes;
    }

    public void setEkattes(List<Long> ekattes) {
        this.ekattes = ekattes;
    }

    public List<String> getCadastreNumbers() {
        return cadastreNumbers;
    }

    public void setCadastreNumbers(List<String> cadastreNumbers) {
        this.cadastreNumbers = cadastreNumbers;
    }

    public List<Long> getPropertyNumbers() {
        return propertyNumbers;
    }

    public void setPropertyNumbers(List<Long> propertyNumbers) {
        this.propertyNumbers = propertyNumbers;
    }

    public List<Float> getAreas() {
        return areas;
    }

    public void setAreas(List<Float> areas) {
        this.areas = areas;
    }
}
