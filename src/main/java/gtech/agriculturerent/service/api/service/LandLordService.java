package gtech.agriculturerent.service.api.service;

import java.util.List;

import gtech.agriculturerent.service.api.dto.LandLord;
import gtech.agriculturerent.service.api.dto.LandLordProperty;
import gtech.agriculturerent.service.api.filter.LandLordFilter;

public interface LandLordService {

    List<LandLord> findAll();

    List<LandLord> findAll(LandLordFilter landLordFilter);

    LandLord findById(Long id);

    Long create(LandLord landLord);

    void update(Long id, LandLord landLord);

    void deleteById(Long id);

    List<LandLordProperty> findLandLordPropertiesByLandLordId(Long id);


}
