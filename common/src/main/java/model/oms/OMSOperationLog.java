package model.oms;


import java.io.Serializable;
import java.util.Date;

public class OMSOperationLog implements Serializable {

    private Integer id;

    private String url;

    private String ip;

    private Integer operatorId;

    private Date operatorTime;

    private String operatorCode;

    private String formString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    public String getFormString() {
        return formString;
    }

    public void setFormString(String formString) {
        this.formString = formString == null ? null : formString.trim();
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
        OMSOperationLog other = (OMSOperationLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getOperatorTime() == null ? other.getOperatorTime() == null : this.getOperatorTime().equals(other.getOperatorTime()))
            && (this.getOperatorCode() == null ? other.getOperatorCode() == null : this.getOperatorCode().equals(other.getOperatorCode()))
            && (this.getFormString() == null ? other.getFormString() == null : this.getFormString().equals(other.getFormString()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getOperatorTime() == null) ? 0 : getOperatorTime().hashCode());
        result = prime * result + ((getOperatorCode() == null) ? 0 : getOperatorCode().hashCode());
        result = prime * result + ((getFormString() == null) ? 0 : getFormString().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", ip=").append(ip);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operatorTime=").append(operatorTime);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", formString=").append(formString);
        sb.append("]");
        return sb.toString();
    }
}