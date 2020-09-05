package gtech.agriculturerent.service.impl.jpa;

import java.util.List;

import gtech.agriculturerent.service.api.filter.LandLordPropertyFilter;
import gtech.agriculturerent.service.impl.model.LandLordPropertyEntity;

public interface LandLordPropertyRepositoryCustom {

    List<LandLordPropertyEntity> findAll(LandLordPropertyFilter filter);
}
