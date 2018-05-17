package model.contract;


import java.io.Serializable;
import java.util.Date;

public class ContractBilling implements Serializable {
    private Integer id;

    private Integer contractId;

    private Integer partyId;

    private Double receivable;

    private Double received;

    private Double payable;

    private Double paid;

    private Double refundable;

    private Double refunded;

    private String status;

    private Date createTime;

    private Date upateTime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Double getReceivable() {
        return receivable;
    }

    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    public Double getReceived() {
        return received;
    }

    public void setReceived(Double received) {
        this.received = received;
    }

    public Double getPayable() {
        return payable;
    }

    public void setPayable(Double payable) {
        this.payable = payable;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getRefundable() {
        return refundable;
    }

    public void setRefundable(Double refundable) {
        this.refundable = refundable;
    }

    public Double getRefunded() {
        return refunded;
    }

    public void setRefunded(Double refunded) {
        this.refunded = refunded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ContractBilling other = (ContractBilling) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
            && (this.getPartyId() == null ? other.getPartyId() == null : this.getPartyId().equals(other.getPartyId()))
            && (this.getReceivable() == null ? other.getReceivable() == null : this.getReceivable().equals(other.getReceivable()))
            && (this.getReceived() == null ? other.getReceived() == null : this.getReceived().equals(other.getReceived()))
            && (this.getPayable() == null ? other.getPayable() == null : this.getPayable().equals(other.getPayable()))
            && (this.getPaid() == null ? other.getPaid() == null : this.getPaid().equals(other.getPaid()))
            && (this.getRefundable() == null ? other.getRefundable() == null : this.getRefundable().equals(other.getRefundable()))
            && (this.getRefunded() == null ? other.getRefunded() == null : this.getRefunded().equals(other.getRefunded()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpateTime() == null ? other.getUpateTime() == null : this.getUpateTime().equals(other.getUpateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getPartyId() == null) ? 0 : getPartyId().hashCode());
        result = prime * result + ((getReceivable() == null) ? 0 : getReceivable().hashCode());
        result = prime * result + ((getReceived() == null) ? 0 : getReceived().hashCode());
        result = prime * result + ((getPayable() == null) ? 0 : getPayable().hashCode());
        result = prime * result + ((getPaid() == null) ? 0 : getPaid().hashCode());
        result = prime * result + ((getRefundable() == null) ? 0 : getRefundable().hashCode());
        result = prime * result + ((getRefunded() == null) ? 0 : getRefunded().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpateTime() == null) ? 0 : getUpateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contractId=").append(contractId);
        sb.append(", partyId=").append(partyId);
        sb.append(", receivable=").append(receivable);
        sb.append(", received=").append(received);
        sb.append(", payable=").append(payable);
        sb.append(", paid=").append(paid);
        sb.append(", refundable=").append(refundable);
        sb.append(", refunded=").append(refunded);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", upateTime=").append(upateTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}