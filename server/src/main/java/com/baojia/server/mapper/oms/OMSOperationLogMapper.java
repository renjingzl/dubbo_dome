package com.baojia.server.mapper.oms;

import model.oms.OMSOperationLog;

public interface OMSOperationLogMapper {

//    @Select("select * from oms_operation_log where id = #{id} ")
    public OMSOperationLog getById(Integer id);
}
