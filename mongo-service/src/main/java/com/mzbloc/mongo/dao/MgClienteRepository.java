package com.mzbloc.mongo.dao;

import com.mzbloc.mongo.entity.MgClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tanxw on 2018/12/12.
 */
@Repository
public interface MgClienteRepository extends MongoRepository<MgClientEntity,String> {

    @Query("{'firstname':?0}")
    List<MgClientEntity> withQueryFindByFisrtName(String firstName);
}
