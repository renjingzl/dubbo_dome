package com.baojia.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.server.mapper.baojia.CarInfoMapper;
import model.baojia.CarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import service.CarInfoService;

@Service(version = "1.0.0")
public class CarInfoServiceImpl implements CarInfoService {

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Override
    public int insert(CarInfo record) {

        return carInfoMapper.insert(record);
    }
}
