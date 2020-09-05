package gtech.agriculturerent.service.impl.jpa;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gtech.agriculturerent.service.impl.model.LandLordPropertyEntity;

@Repository
@Transactional
public interface LandLordPropertyRepository extends CrudRepository<LandLordPropertyEntity, Long>, LandLordPropertyRepositoryCustom  {


}
