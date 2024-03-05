package top.theStarsLikeDust.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName illegal_record
 */
@TableName(value ="illegal_record")
public class IllegalRecord implements Serializable {
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
    private String behavior;

    /**
     * 
     */
    private Date timeofcrime;

    /**
     * 
     */
    private String placeofcrime;

    /**
     * 
     */
    private String description;

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
    public String getBehavior() {
        return behavior;
    }

    /**
     * 
     */
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * 
     */
    public Date getTimeofcrime() {
        return timeofcrime;
    }

    /**
     * 
     */
    public void setTimeofcrime(Date timeofcrime) {
        this.timeofcrime = timeofcrime;
    }

    /**
     * 
     */
    public String getPlaceofcrime() {
        return placeofcrime;
    }

    /**
     * 
     */
    public void setPlaceofcrime(String placeofcrime) {
        this.placeofcrime = placeofcrime;
    }

    /**
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    public void setDescription(String description) {
        this.description = description;
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
        IllegalRecord other = (IllegalRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeOfOffenseId() == null ? other.getTypeOfOffenseId() == null : this.getTypeOfOffenseId().equals(other.getTypeOfOffenseId()))
            && (this.getBehavior() == null ? other.getBehavior() == null : this.getBehavior().equals(other.getBehavior()))
            && (this.getTimeofcrime() == null ? other.getTimeofcrime() == null : this.getTimeofcrime().equals(other.getTimeofcrime()))
            && (this.getPlaceofcrime() == null ? other.getPlaceofcrime() == null : this.getPlaceofcrime().equals(other.getPlaceofcrime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPersonnelId() == null ? other.getPersonnelId() == null : this.getPersonnelId().equals(other.getPersonnelId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeOfOffenseId() == null) ? 0 : getTypeOfOffenseId().hashCode());
        result = prime * result + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        result = prime * result + ((getTimeofcrime() == null) ? 0 : getTimeofcrime().hashCode());
        result = prime * result + ((getPlaceofcrime() == null) ? 0 : getPlaceofcrime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
        sb.append(", typeOfOffenseId=").append(typeOfOffenseId);
        sb.append(", behavior=").append(behavior);
        sb.append(", timeofcrime=").append(timeofcrime);
        sb.append(", placeofcrime=").append(placeofcrime);
        sb.append(", description=").append(description);
        sb.append(", personnelId=").append(personnelId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}