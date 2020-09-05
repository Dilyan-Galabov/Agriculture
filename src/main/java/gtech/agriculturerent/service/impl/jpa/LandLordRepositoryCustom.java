package gtech.agriculturerent.service.impl.jpa;

import java.util.List;

import gtech.agriculturerent.service.api.filter.LandLordFilter;
import gtech.agriculturerent.service.impl.model.LandLordEntity;


public interface LandLordRepositoryCustom {

    List<LandLordEntity> findAll(LandLordFilter filter);

}
