package com.baojia.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.server.mapper.contract.ContractBillingMapper;
import model.contract.ContractBilling;
import org.springframework.beans.factory.annotation.Autowired;
import service.ContractBillingService;

@Service(version = "1.0.0")
public class ContractBillingServiceImpl implements ContractBillingService {

    @Autowired
    private ContractBillingMapper contractBillingMapper;


    @Override
    public ContractBilling selectByPrimaryKey(Integer id) {
        return contractBillingMapper.selectByPrimaryKey(id);
    }
}
