package model.baojia;


import java.io.Serializable;
import java.util.Objects;

public class CarInfo implements Serializable {
    private Integer id;

    private String cin;

    private Short sortId;

    private Integer modelId;

    private String name;

    private Integer deposit;

    private Float displacement;

    private String fullName;

    private String aliasName;

    private String pictureUrl;

    private Short yearStyle;

    private String fromUrl;

    private String fromUrlMd5;

    private Integer listOrder;

    private Byte status;

    private Integer boxp2Ready;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin == null ? null : cin.trim();
    }

    public Short getSortId() {
        return sortId;
    }

    public void setSortId(Short sortId) {
        this.sortId = sortId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Short getYearStyle() {
        return yearStyle;
    }

    public void setYearStyle(Short yearStyle) {
        this.yearStyle = yearStyle;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl == null ? null : fromUrl.trim();
    }

    public String getFromUrlMd5() {
        return fromUrlMd5;
    }

    public void setFromUrlMd5(String fromUrlMd5) {
        this.fromUrlMd5 = fromUrlMd5 == null ? null : fromUrlMd5.trim();
    }

    public Integer getListOrder() {
        return listOrder;
    }

    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getBoxp2Ready() {

        return boxp2Ready;
    }

    public void setBoxp2Ready(Integer boxp2Ready) {
        this.boxp2Ready = boxp2Ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Objects.equals(id, carInfo.id) &&
                Objects.equals(cin, carInfo.cin) &&
                Objects.equals(sortId, carInfo.sortId) &&
                Objects.equals(modelId, carInfo.modelId) &&
                Objects.equals(name, carInfo.name) &&
                Objects.equals(deposit, carInfo.deposit) &&
                Objects.equals(displacement, carInfo.displacement) &&
                Objects.equals(fullName, carInfo.fullName) &&
                Objects.equals(aliasName, carInfo.aliasName) &&
                Objects.equals(pictureUrl, carInfo.pictureUrl) &&
                Objects.equals(yearStyle, carInfo.yearStyle) &&
                Objects.equals(fromUrl, carInfo.fromUrl) &&
                Objects.equals(fromUrlMd5, carInfo.fromUrlMd5) &&
                Objects.equals(listOrder, carInfo.listOrder) &&
                Objects.equals(boxp2Ready, carInfo.boxp2Ready) &&
                Objects.equals(status, carInfo.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, cin, sortId, modelId, name, deposit, displacement, fullName, aliasName, pictureUrl, yearStyle, fromUrl, fromUrlMd5, listOrder, status, boxp2Ready);
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", cin='" + cin + '\'' +
                ", sortId=" + sortId +
                ", modelId=" + modelId +
                ", name='" + name + '\'' +
                ", deposit=" + deposit +
                ", displacement=" + displacement +
                ", fullName='" + fullName + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", yearStyle=" + yearStyle +
                ", fromUrl='" + fromUrl + '\'' +
                ", fromUrlMd5='" + fromUrlMd5 + '\'' +
                ", boxp2Ready='" + boxp2Ready + '\'' +
                ", listOrder=" + listOrder +
                ", status=" + status +
                '}';
    }
}