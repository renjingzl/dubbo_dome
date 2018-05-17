package com.baojia.consumer.controller;

import com.baojia.consumer.service.BusinessService;
import model.baojia.CarInfo;
import model.oms.OMSOperationLog;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OperationLogController {

    @Autowired
    private BusinessService businessService;

    private Logger logger = Logger.getLogger(OperationLogController.class);


    @GetMapping("/operationLog/{id}")
    @ApiOperation("根据id查访问日志")
//    @ApiImplicitParam(paramType="query", name = "id", value = "日志编号", required = true, dataType = "Integer")
    public OMSOperationLog getById(@PathVariable("id") Integer id) {

        return businessService.getById(id);
    }



    @GetMapping("/test/{logId}/{cbId}")
    @ApiOperation("测试3个数据源")
    @ResponseBody
    public Object test(@PathVariable("logId") Integer logId, @PathVariable("cbId") Integer cbId) {
        return businessService.test(logId, cbId, null);
    }
}
