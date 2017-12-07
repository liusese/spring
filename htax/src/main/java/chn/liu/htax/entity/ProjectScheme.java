package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目方案实体类(Mybatis、JDBC)")
public class ProjectScheme {
	@ApiModelProperty(value = "方案ID", required = true)
	public String id;
	@ApiModelProperty(value = "项目ID", required = true)
	public String pId;
	@ApiModelProperty(value = "方案预算", required = true)
	public String budget;
	@ApiModelProperty(value = "实际支出", required = true)
	public String actualFee;
	@ApiModelProperty(value = "是否为当前方案", required = true)
	public Integer active;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getActualFee() {
		return actualFee;
	}

	public void setActualFee(String actualFee) {
		this.actualFee = actualFee;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
