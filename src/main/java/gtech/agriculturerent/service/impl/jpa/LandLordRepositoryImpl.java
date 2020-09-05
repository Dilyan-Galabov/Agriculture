package gtech.agriculturerent.service.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import gtech.agriculturerent.service.api.filter.LandLordFilter;
import gtech.agriculturerent.service.impl.model.LandLordEntity;
import gtech.agriculturerent.service.impl.model.QLandLordEntity;


public class LandLordRepositoryImpl extends  BasicQueryDslRepositoryCustom<LandLordEntity, LandLordFilter>
        implements LandLordRepositoryCustom {

    @Autowired
    private EntityManager entityManagerLandLord;

    @Override
    protected JPAQuery<LandLordEntity> createQuery(LandLordFilter filter) {

        JPAQueryFactory query = new JPAQueryFactory(entityManagerLandLord);
        QLandLordEntity landLord = QLandLordEntity.landLordEntity;
        JPAQuery<LandLordEntity> from = query.selectFrom(landLord);

        List<BooleanExpression> predicates = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(filter.getIds())) {
            predicates.add(landLord.id.in(filter.getIds()));
        }

        if (CollectionUtils.isNotEmpty(filter.getFirstNames())) {
            predicates.add(landLord.firstName.in(filter.getFirstNames()));
        }

        if (CollectionUtils.isNotEmpty(filter.getSurnames())) {
            predicates.add(landLord.surname.in(filter.getSurnames()));
        }
        if (CollectionUtils.isNotEmpty(filter.getLastNames())) {
            predicates.add(landLord.lastName.in(filter.getLastNames()));
        }
        if (CollectionUtils.isNotEmpty(filter.getPINs())) {
            predicates.add(landLord.PIN.in(filter.getPINs()));
        }

        if (CollectionUtils.isNotEmpty(filter.getAddresses())) {
            predicates.add(landLord.address.in(filter.getAddresses()));
        }

        if (CollectionUtils.isNotEmpty(filter.getAddressNumbers())) {
            predicates.add(landLord.addressNumber.in(filter.getAddressNumbers()));
        }

        if (CollectionUtils.isNotEmpty(filter.getSettlements())) {
            predicates.add(landLord.settlement.in(filter.getSettlements()));
        }

        return predicates.isEmpty() ? from : from.where(predicates.toArray(new Predicate[]{}));
    }


}
