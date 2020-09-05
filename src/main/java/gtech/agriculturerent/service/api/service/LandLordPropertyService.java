package gtech.agriculturerent.service.api.service;

import java.util.List;

import gtech.agriculturerent.service.api.dto.LandLordProperty;
import gtech.agriculturerent.service.api.filter.LandLordPropertyFilter;

public interface LandLordPropertyService {


    List<LandLordProperty> findAll();

    List<LandLordProperty> findAll(LandLordPropertyFilter landLordPropertyFilter);

    LandLordProperty findById(Long id);

    Long create(LandLordProperty landLordProperty);

    void update(Long id, LandLordProperty landLordProperty);

    void deleteById(Long id);



}
