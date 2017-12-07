package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "方案节点实体类(Mybatis、JDBC)")
public class SchemeNode {
	@ApiModelProperty(value = "节点ID", required = true)
	public Integer id;
	@ApiModelProperty(value = "方案ID", required = true)
	public String psId;
	@ApiModelProperty(value = "节点", required = true)
	public String name;
	@ApiModelProperty(value = "计划", required = true)
	public String plan;
	@ApiModelProperty(value = "实际", required = true)
	public String actual;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
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
