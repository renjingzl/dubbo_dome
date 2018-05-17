package com.baojia.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.server.mapper.oms.OMSOperationLogMapper;
import model.oms.OMSOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import service.OMSOperationLogService;

@Service(version = "1.0.0")
public class OMSOperationLogServiceImpl implements OMSOperationLogService {

    @Autowired
    private OMSOperationLogMapper oMSOperationLogMapper;

    @Override
    public OMSOperationLog getById(Integer id) {
        return oMSOperationLogMapper.getById(id);
    }
}
