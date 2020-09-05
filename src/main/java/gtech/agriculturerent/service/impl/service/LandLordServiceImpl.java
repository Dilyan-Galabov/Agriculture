package gtech.agriculturerent.service.impl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gtech.agriculturerent.service.api.dto.LandLord;
import gtech.agriculturerent.service.api.dto.LandLordProperty;
import gtech.agriculturerent.service.api.filter.LandLordFilter;
import gtech.agriculturerent.service.api.service.LandLordService;
import gtech.agriculturerent.service.impl.jpa.LandLordRepository;
import gtech.agriculturerent.service.impl.model.LandLordEntity;
import gtech.agriculturerent.service.impl.model.LandLordPropertyEntity;

@Service
public class LandLordServiceImpl implements LandLordService {

    @Autowired
    private LandLordRepository landLordRepository;

    @Override
    public List<LandLord> findAll() {
        List<LandLord> landLordProperties = new ArrayList<>();
        landLordRepository.findAll().forEach(landLordEntity -> {
            landLordProperties.add(LandLordEntity.convertToDto(landLordEntity));
        });

        return landLordProperties;
    }

    @Override
    public List<LandLord> findAll(LandLordFilter landLordFilter) {
        return landLordRepository.findAll(landLordFilter)
                .stream()
                .map(LandLordEntity::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public LandLord findById(Long id) {
        final Optional<LandLordEntity> landLordEntity = landLordRepository.findById(id);
        return landLordEntity.map(LandLordEntity::convertToDto)
                .orElse(null);
    }

    @Override
    public Long create(LandLord landLord) {
        final LandLordEntity landLordEntity = landLordRepository.save(LandLordEntity.convertToEntity(landLord));
        return landLordEntity.getId();
    }

    @Override
    public void update(Long id,LandLord landLord) {
        final LandLord landLordById = findById(id);
        if(landLordById != null){
            landLordRepository.save(LandLordEntity.convertToEntity(landLord));
        }
    }

    @Override
    public void deleteById(Long id) {
        landLordRepository.deleteById(id);
    }

    @Override
    public List<LandLordProperty> findLandLordPropertiesByLandLordId(Long id) {
        final LandLord landLordById = findById(id);
        List<LandLordProperty> landLordProperties = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(landLordProperties)){
            landLordProperties.addAll(landLordById.getLandLordProperties());
        }
        return  landLordProperties;

    }
}
