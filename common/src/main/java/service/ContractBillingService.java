package service;


import model.contract.ContractBilling;

public interface ContractBillingService {

    ContractBilling selectByPrimaryKey(Integer id);
}
