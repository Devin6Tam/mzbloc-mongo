package com.mzbloc.mongo.api;

import com.mzbloc.mongo.entity.MgClientEntity;

import java.util.List;

/**
 * Created by tanxw on 2018/12/12.
 */
public interface MgClienteService {

    void saveCliente(MgClientEntity mgClientEntity);

    MgClientEntity findOne(String id);

    List<MgClientEntity> withQueryFindByFisrtName(String firstName);
}
