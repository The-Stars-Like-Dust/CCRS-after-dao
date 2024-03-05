package top.theStarsLikeDust.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName suspected_vehicle
 */
@TableName(value ="suspected_vehicle")
public class SuspectedVehicle implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer vehicleId;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String reason;

    /**
     * 
     */
    private Integer type;

    /**
     * 
     */
    private Integer waringRecordId;

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
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * 
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 
     */
    public String getReason() {
        return reason;
    }

    /**
     * 
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     */
    public Integer getWaringRecordId() {
        return waringRecordId;
    }

    /**
     * 
     */
    public void setWaringRecordId(Integer waringRecordId) {
        this.waringRecordId = waringRecordId;
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
        SuspectedVehicle other = (SuspectedVehicle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getWaringRecordId() == null ? other.getWaringRecordId() == null : this.getWaringRecordId().equals(other.getWaringRecordId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getWaringRecordId() == null) ? 0 : getWaringRecordId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vehicleId=").append(vehicleId);
        sb.append(", date=").append(date);
        sb.append(", reason=").append(reason);
        sb.append(", type=").append(type);
        sb.append(", waringRecordId=").append(waringRecordId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}