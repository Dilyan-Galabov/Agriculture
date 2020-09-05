package gtech.agriculturerent.service.impl.jpa;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.querydsl.jpa.impl.JPAQuery;


public abstract class BasicQueryDslRepositoryCustom<ENTITY, FILTER>{


    public List<ENTITY> findAll(final FILTER filter) {
        return createQuery(filter).fetch();
    }


    public ENTITY findOne(final FILTER filter) {
        final ENTITY entity = createQuery(filter).fetchFirst();
        if (entity == null) {
          throw new EntityNotFoundException();
        }
        return entity;
    }

    protected abstract JPAQuery<ENTITY> createQuery(final FILTER filter);
}