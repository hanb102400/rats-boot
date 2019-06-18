package com.rats.service.impl;


import javax.annotation.Resource;

import com.rats.framework.common.base.BaseServiceImpl;
import com.rats.framework.common.base.Mapper;
import com.rats.framework.common.persistence.Example;
import com.rats.framework.common.persistence.GeneratedExample;
import org.springframework.stereotype.Service;

import com.rats.entity.Depart;
import com.rats.mapper.DepartMapper;
import com.rats.service.DepartService;

/**
 * Copyright (C) 2013 rats
 * <p>
 * DepartServiceImpl
 * Description:
 *
 * @author : Lu generator
 * @version : v1.0
 * @since :
 */
@Service(value = "departService")
public class DepartServiceImpl extends BaseServiceImpl<Depart, Integer> implements DepartService {

    @Resource
    private DepartMapper departMapper;

    @Override
    public Mapper<Depart, Integer> getMapper() {
        return departMapper;
    }

    public GeneratedExample buildExample(Depart condition) {
        Example<Depart> example = new Example<>();
        WeekendCriteria<Depart> criteria = example.createCriteria();
        if (condition.getId() != null) {
            criteria.andEqualTo(Depart::getId, condition.getId());
        }
        if (condition.getParentId() != null) {
            criteria.andEqualTo(Depart::getParentId, condition.getParentId());
        }
        if (condition.getParentIds() != null) {
            criteria.andEqualTo(Depart::getParentIds, condition.getParentIds());
        }
        if (condition.getName() != null) {
            criteria.andEqualTo(Depart::getName, condition.getName());
        }
        if (condition.getSort() != null) {
            criteria.andEqualTo(Depart::getSort, condition.getSort());
        }
        if (condition.getDepartType() != null) {
            criteria.andEqualTo(Depart::getDepartType, condition.getDepartType());
        }
        if (condition.getGrade() != null) {
            criteria.andEqualTo(Depart::getGrade, condition.getGrade());
        }
        if (condition.getAddress() != null) {
            criteria.andEqualTo(Depart::getAddress, condition.getAddress());
        }
        if (condition.getMaster() != null) {
            criteria.andEqualTo(Depart::getMaster, condition.getMaster());
        }
        if (condition.getMobile() != null) {
            criteria.andEqualTo(Depart::getMobile, condition.getMobile());
        }
        if (condition.getEmail() != null) {
            criteria.andEqualTo(Depart::getEmail, condition.getEmail());
        }
        if (condition.getCreator() != null) {
            criteria.andEqualTo(Depart::getCreator, condition.getCreator());
        }
        if (condition.getCreateDate() != null) {
            criteria.andEqualTo(Depart::getCreateDate, condition.getCreateDate());
        }
        if (condition.getUpdater() != null) {
            criteria.andEqualTo(Depart::getUpdater, condition.getUpdater());
        }
        if (condition.getUpdateDate() != null) {
            criteria.andEqualTo(Depart::getUpdateDate, condition.getUpdateDate());
        }
        if (condition.getRemark() != null) {
            criteria.andEqualTo(Depart::getRemark, condition.getRemark());
        }
        if (condition.getEnable() != null) {
            criteria.andEqualTo(Depart::getEnable, condition.getEnable());
        }
        if (condition.getState() != null) {
            criteria.andEqualTo(Depart::getState, condition.getState());
        }
        return example;
    }
}



