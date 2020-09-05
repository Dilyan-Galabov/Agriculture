package gtech.agriculturerent.service.impl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gtech.agriculturerent.service.api.dto.LandLordProperty;
import gtech.agriculturerent.service.api.filter.LandLordPropertyFilter;
import gtech.agriculturerent.service.api.service.LandLordPropertyService;
import gtech.agriculturerent.service.impl.jpa.LandLordPropertyRepository;
import gtech.agriculturerent.service.impl.jpa.LandLordPropertyRepositoryImpl;
import gtech.agriculturerent.service.impl.model.LandLordPropertyEntity;

@Service
public class LandLordPropertyServiceImpl implements LandLordPropertyService {

    @Autowired
    private LandLordPropertyRepository landLordPropertyRepository;

    @Override
    public List<LandLordProperty> findAll() {
        List<LandLordProperty> landLordProperties = new ArrayList<>();
        landLordPropertyRepository.findAll().forEach(landLordPropertyEntity -> {
            landLordProperties.add(LandLordPropertyEntity.convertToDto(landLordPropertyEntity));
        });

        return landLordProperties;
    }

    @Override
    public List<LandLordProperty> findAll(LandLordPropertyFilter landLordPropertyFilter) {
        return landLordPropertyRepository.findAll(landLordPropertyFilter)
                .stream()
                .map(LandLordPropertyEntity::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public LandLordProperty findById(Long id) {
        final Optional<LandLordPropertyEntity> landLordPropertyEntity = landLordPropertyRepository.findById(id);
        return landLordPropertyEntity.map(LandLordPropertyEntity::convertToDto)
                .orElse(null);
    }

    @Override
    public Long create(LandLordProperty landLordProperty) {
        final LandLordPropertyEntity landLordEntity = landLordPropertyRepository.save(LandLordPropertyEntity.convertToEntity(landLordProperty));
        return landLordEntity.getId();
    }

    @Override
    public void update(Long id, LandLordProperty landLordProperty) {
        final LandLordProperty landLordPropertyById = findById(id);
        if(landLordPropertyById != null){
            landLordPropertyRepository.save(LandLordPropertyEntity.convertToEntity(landLordProperty));
        }
    }

    @Override
    public void deleteById(Long id) {
        landLordPropertyRepository.deleteById(id);
    }
}
