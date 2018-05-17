package com.baojia.server.mapper.contract;


import model.contract.ContractBilling;
import org.apache.ibatis.annotations.*;


public interface ContractBillingMapper {
    @Delete({
            "delete from contract_billing",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into contract_billing (contract_id, party_id, ",
            "receivable, received, ",
            "payable, paid, refundable, ",
            "refunded, status, ",
            "create_time, upate_time, ",
            "remark)",
            "values (#{contractId,jdbcType=INTEGER}, #{partyId,jdbcType=INTEGER}, ",
            "#{receivable,jdbcType=DOUBLE}, #{received,jdbcType=DOUBLE}, ",
            "#{payable,jdbcType=DOUBLE}, #{paid,jdbcType=DOUBLE}, #{refundable,jdbcType=DOUBLE}, ",
            "#{refunded,jdbcType=DOUBLE}, #{status,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=DATE}, #{upateTime,jdbcType=DATE}, ",
            "#{remark,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(ContractBilling record);

    int insertSelective(ContractBilling record);

    @Select({
            "select",
            "id, contract_id, party_id, receivable, received, payable, paid, refundable, ",
            "refunded, status, create_time, upate_time, remark",
            "from contract_billing",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ContractBilling selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContractBilling record);

    @Update({
            "update contract_billing",
            "set contract_id = #{contractId,jdbcType=INTEGER},",
            "party_id = #{partyId,jdbcType=INTEGER},",
            "receivable = #{receivable,jdbcType=DOUBLE},",
            "received = #{received,jdbcType=DOUBLE},",
            "payable = #{payable,jdbcType=DOUBLE},",
            "paid = #{paid,jdbcType=DOUBLE},",
            "refundable = #{refundable,jdbcType=DOUBLE},",
            "refunded = #{refunded,jdbcType=DOUBLE},",
            "status = #{status,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=DATE},",
            "upate_time = #{upateTime,jdbcType=DATE},",
            "remark = #{remark,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ContractBilling record);
}