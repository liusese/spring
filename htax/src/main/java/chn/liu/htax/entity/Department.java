package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "部门实体类(Mybatis、JDBC)")
public class Department {
	@ApiModelProperty(value = "部门ID", required = true)
	public Integer id;
	@ApiModelProperty(value = "部门", required = true)
	public String name;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;
	@ApiModelProperty(value = "上级部门", required = true)
	public Integer parrentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getParrentId() {
		return parrentId;
	}

	public void setParrentId(Integer parrentId) {
		this.parrentId = parrentId;
	}

}
