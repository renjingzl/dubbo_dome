package com.baojia.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.consumer.controller.OperationLogController;
import model.baojia.CarInfo;
import model.contract.ContractBilling;
import model.oms.OMSOperationLog;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import service.*;

import java.util.HashMap;
import java.util.Map;

@Component
public class BusinessService {
    private Logger logger = Logger.getLogger(OperationLogController.class);

    @Reference(version = "1.0.0")
    private HelloService helloService;
    @Reference(version = "1.0.0")
    private OMSOperationLogService omsOperationLogService;
    @Reference(version = "1.0.0")
    private CarInfoService carInfoService;
    @Reference(version = "1.0.0")
    private ContractBillingService contractBillingService;
    @Reference(version = "1.0.0")
    private RedisService redisService;


    public String hello() {

        return helloService.hello();
    }

    public OMSOperationLog getById(Integer id) {
        redisService.put("test","myKey1","value1");
        return omsOperationLogService.getById(id);
    }


    public Object test(Integer logId, Integer cbId, CarInfo carInfo) {

        Map<String, Object> res = new HashMap<>();

        OMSOperationLog operationLog = omsOperationLogService.getById(logId);
        ContractBilling contractBilling = contractBillingService.selectByPrimaryKey(cbId);

//        carInfo.setDeposit(0);
//        carInfo.setBoxp2Ready(0);
//        carInfoService.insert(carInfo);
        res.put("operationLog",operationLog);
        res.put("contractBilling",contractBilling);

        return res;
    }
}
