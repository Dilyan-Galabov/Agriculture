package gtech.agriculturerent.service.api.filter;

import java.util.List;

import gtech.agriculturerent.service.api.dto.LandLordProperty;

public class LandLordFilter {

    private List<Long> ids;
    private List<String> firstNames;
    private List<String> surnames;
    private List<String> lastNames;
    private List<Long> PINs;
    private List<String> settlements;
    private List<String> addresses;
    private List<Long> addressNumbers;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<String> getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(List<String> firstNames) {
        this.firstNames = firstNames;
    }

    public List<String> getSurnames() {
        return surnames;
    }

    public void setSurnames(List<String> surnames) {
        this.surnames = surnames;
    }

    public List<String> getLastNames() {
        return lastNames;
    }

    public void setLastNames(List<String> lastNames) {
        this.lastNames = lastNames;
    }

    public List<Long> getPINs() {
        return PINs;
    }

    public void setPINs(List<Long> PINs) {
        this.PINs = PINs;
    }

    public List<String> getSettlements() {
        return settlements;
    }

    public void setSettlements(List<String> settlements) {
        this.settlements = settlements;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public List<Long> getAddressNumbers() {
        return addressNumbers;
    }

    public void setAddressNumbers(List<Long> addressNumbers) {
        this.addressNumbers = addressNumbers;
    }
}
