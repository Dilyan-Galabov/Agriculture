package gtech.agriculturerent.service.impl.jpa;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gtech.agriculturerent.service.impl.model.LandLordEntity;


@Repository
@Transactional
public interface LandLordRepository extends CrudRepository<LandLordEntity, Long>, LandLordRepositoryCustom {


}
