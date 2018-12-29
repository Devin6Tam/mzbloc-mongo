package com.mzbloc.mongo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mzbloc.mongo.api.MgClienteService;
import com.mzbloc.mongo.dao.MgClienteRepository;
import com.mzbloc.mongo.entity.MgClientEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tanxw on 2018/12/12.
 */
@Service(interfaceClass = MgClienteService.class)
public class MgClienteServiceImpl implements MgClienteService {

    @Autowired
    private MgClienteRepository mgClienteRepository;


    public void saveCliente(MgClientEntity mgClientEntity){
        mgClienteRepository.save(mgClientEntity);
    }


    public MgClientEntity findOne(String id){
        return mgClienteRepository.findOne(id);
    }

    public List<MgClientEntity> withQueryFindByFisrtName(String firstName){
        return mgClienteRepository.withQueryFindByFisrtName(firstName);
    }
}
