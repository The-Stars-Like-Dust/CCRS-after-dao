package top.theStarsLikeDust.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName alarm
 */
@TableName(value ="alarm")
public class Alarm implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String incomingCalls;

    /**
     * 
     */
    private Date incomingCallTime;

    /**
     * 
     */
    private Integer typeOfOffenseId;

    /**
     * 
     */
    private String place;

    /**
     * 
     */
    private String synopsis;

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
    public String getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * 
     */
    public void setIncomingCalls(String incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    /**
     * 
     */
    public Date getIncomingCallTime() {
        return incomingCallTime;
    }

    /**
     * 
     */
    public void setIncomingCallTime(Date incomingCallTime) {
        this.incomingCallTime = incomingCallTime;
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
    public String getPlace() {
        return place;
    }

    /**
     * 
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * 
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * 
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
        Alarm other = (Alarm) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIncomingCalls() == null ? other.getIncomingCalls() == null : this.getIncomingCalls().equals(other.getIncomingCalls()))
            && (this.getIncomingCallTime() == null ? other.getIncomingCallTime() == null : this.getIncomingCallTime().equals(other.getIncomingCallTime()))
            && (this.getTypeOfOffenseId() == null ? other.getTypeOfOffenseId() == null : this.getTypeOfOffenseId().equals(other.getTypeOfOffenseId()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getSynopsis() == null ? other.getSynopsis() == null : this.getSynopsis().equals(other.getSynopsis()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIncomingCalls() == null) ? 0 : getIncomingCalls().hashCode());
        result = prime * result + ((getIncomingCallTime() == null) ? 0 : getIncomingCallTime().hashCode());
        result = prime * result + ((getTypeOfOffenseId() == null) ? 0 : getTypeOfOffenseId().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getSynopsis() == null) ? 0 : getSynopsis().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", incomingCalls=").append(incomingCalls);
        sb.append(", incomingCallTime=").append(incomingCallTime);
        sb.append(", typeOfOffenseId=").append(typeOfOffenseId);
        sb.append(", place=").append(place);
        sb.append(", synopsis=").append(synopsis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}