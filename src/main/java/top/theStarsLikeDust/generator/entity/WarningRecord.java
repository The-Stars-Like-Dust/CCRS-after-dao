package top.theStarsLikeDust.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName warning_record
 */
@TableName(value ="warning_record")
public class WarningRecord implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer typeOfOffenseId;

    /**
     * 
     */
    private Integer unitId;

    /**
     * 
     */
    private Integer policeunitId;

    /**
     * 
     */
    private Date warningTime;

    /**
     * 
     */
    private Integer riskGrade;

    /**
     * 
     */
    private Integer status;

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
    public Integer getTypeOfOffenseId() {
        return typeOfOffenseId;
    }

    /**
     * 
     */
    public void setTypeOfOffenseId(Integer typeOfOffenseId) {
        this.typeOfOffenseId = typeOfOffenseId;
    }

    /**
     * 
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * 
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * 
     */
    public Integer getPoliceunitId() {
        return policeunitId;
    }

    /**
     * 
     */
    public void setPoliceunitId(Integer policeunitId) {
        this.policeunitId = policeunitId;
    }

    /**
     * 
     */
    public Date getWarningTime() {
        return warningTime;
    }

    /**
     * 
     */
    public void setWarningTime(Date warningTime) {
        this.warningTime = warningTime;
    }

    /**
     * 
     */
    public Integer getRiskGrade() {
        return riskGrade;
    }

    /**
     * 
     */
    public void setRiskGrade(Integer riskGrade) {
        this.riskGrade = riskGrade;
    }

    /**
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        WarningRecord other = (WarningRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeOfOffenseId() == null ? other.getTypeOfOffenseId() == null : this.getTypeOfOffenseId().equals(other.getTypeOfOffenseId()))
            && (this.getUnitId() == null ? other.getUnitId() == null : this.getUnitId().equals(other.getUnitId()))
            && (this.getPoliceunitId() == null ? other.getPoliceunitId() == null : this.getPoliceunitId().equals(other.getPoliceunitId()))
            && (this.getWarningTime() == null ? other.getWarningTime() == null : this.getWarningTime().equals(other.getWarningTime()))
            && (this.getRiskGrade() == null ? other.getRiskGrade() == null : this.getRiskGrade().equals(other.getRiskGrade()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeOfOffenseId() == null) ? 0 : getTypeOfOffenseId().hashCode());
        result = prime * result + ((getUnitId() == null) ? 0 : getUnitId().hashCode());
        result = prime * result + ((getPoliceunitId() == null) ? 0 : getPoliceunitId().hashCode());
        result = prime * result + ((getWarningTime() == null) ? 0 : getWarningTime().hashCode());
        result = prime * result + ((getRiskGrade() == null) ? 0 : getRiskGrade().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeOfOffenseId=").append(typeOfOffenseId);
        sb.append(", unitId=").append(unitId);
        sb.append(", policeunitId=").append(policeunitId);
        sb.append(", warningTime=").append(warningTime);
        sb.append(", riskGrade=").append(riskGrade);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}