package gtech.agriculturerent.service.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import gtech.agriculturerent.service.api.filter.LandLordPropertyFilter;
import gtech.agriculturerent.service.impl.model.LandLordPropertyEntity;
import gtech.agriculturerent.service.impl.model.QLandLordPropertyEntity;


public class LandLordPropertyRepositoryImpl extends  BasicQueryDslRepositoryCustom<LandLordPropertyEntity, LandLordPropertyFilter>
        implements LandLordPropertyRepositoryCustom {

    @Autowired
    private EntityManager entityManagerLandLordProperty;

    @Override
    protected JPAQuery<LandLordPropertyEntity> createQuery(LandLordPropertyFilter filter) {

        JPAQueryFactory query = new JPAQueryFactory(entityManagerLandLordProperty);
        QLandLordPropertyEntity landLordProperty = QLandLordPropertyEntity.landLordPropertyEntity;
        JPAQuery<LandLordPropertyEntity> from = query.selectFrom(landLordProperty);

        List<BooleanExpression> predicates = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(filter.getIds())) {
            predicates.add(landLordProperty.id.in(filter.getIds()));
        }
        if (CollectionUtils.isNotEmpty(filter.getLands())) {
            predicates.add(landLordProperty.land.in(filter.getLands()));
        }
        if (CollectionUtils.isNotEmpty(filter.getLocalities())) {
            predicates.add(landLordProperty.locality.in(filter.getLocalities()));
        }
        if (CollectionUtils.isNotEmpty(filter.getEkattes())) {
            predicates.add(landLordProperty.ekatte.in(filter.getEkattes()));
        }
        if (CollectionUtils.isNotEmpty(filter.getCadastreNumbers())) {
            predicates.add(landLordProperty.cadastreNumber.in(filter.getCadastreNumbers()));
        }
        if (CollectionUtils.isNotEmpty(filter.getPropertyNumbers())) {
            predicates.add(landLordProperty.propertyNumber.in(filter.getPropertyNumbers()));
        }

        if (CollectionUtils.isNotEmpty(filter.getAreas())) {
            predicates.add(landLordProperty.area.in(filter.getAreas()));
        }

        return predicates.isEmpty() ? from : from.where(predicates.toArray(new Predicate[]{}));

    }

}
