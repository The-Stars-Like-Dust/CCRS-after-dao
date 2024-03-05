package top.theStarsLikeDust.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 
 * @TableName vehicle
 */
@TableName(value ="vehicle")
public class Vehicle implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String vehicleNumber;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String carModel;

    /**
     * 
     */
    private String power;

    /**
     * 
     */
    private Integer seat;

    /**
     * 
     */
    private String insurance;

    /**
     * 
     */
    private String img;

    /**
     * 
     */
    private String color;

    /**
     * 
     */
    private Integer personnelId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * 
     */
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /**
     * 
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 
     */
    public String getPower() {
        return power;
    }

    /**
     * 
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * 
     */
    public Integer getSeat() {
        return seat;
    }

    /**
     * 
     */
    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    /**
     * 
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * 
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * 
     */
    public String getImg() {
        return img;
    }

    /**
     * 
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     */
    public Integer getPersonnelId() {
        return personnelId;
    }

    /**
     * 
     */
    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
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
        Vehicle other = (Vehicle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVehicleNumber() == null ? other.getVehicleNumber() == null : this.getVehicleNumber().equals(other.getVehicleNumber()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getCarModel() == null ? other.getCarModel() == null : this.getCarModel().equals(other.getCarModel()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getSeat() == null ? other.getSeat() == null : this.getSeat().equals(other.getSeat()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getPersonnelId() == null ? other.getPersonnelId() == null : this.getPersonnelId().equals(other.getPersonnelId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehicleNumber() == null) ? 0 : getVehicleNumber().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getCarModel() == null) ? 0 : getCarModel().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getSeat() == null) ? 0 : getSeat().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getPersonnelId() == null) ? 0 : getPersonnelId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vehicleNumber=").append(vehicleNumber);
        sb.append(", brand=").append(brand);
        sb.append(", carModel=").append(carModel);
        sb.append(", power=").append(power);
        sb.append(", seat=").append(seat);
        sb.append(", insurance=").append(insurance);
        sb.append(", img=").append(img);
        sb.append(", color=").append(color);
        sb.append(", personnelId=").append(personnelId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}