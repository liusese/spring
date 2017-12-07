package chn.liu.htax.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目方案")
public class ProjectSchemeVO {
	@ApiModelProperty(value = "方案ID", required = true)
	public String id;
	@ApiModelProperty(value = "是否为当前方案", required = true)
	public Integer active;
	@ApiModelProperty(value = "方案预算", required = true)
	public String budget;
	@ApiModelProperty(value = "实际支出", required = true)
	public String actualFee;
	@ApiModelProperty(value = "节点", required = true)
	public String name;
	@ApiModelProperty(value = "计划", required = true)
	public String plan;
	@ApiModelProperty(value = "实际", required = true)
	public String actual;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
