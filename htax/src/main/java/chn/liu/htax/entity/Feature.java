package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "样机特性实体类(Mybatis、JDBC)")
public class Feature {
	@ApiModelProperty(value = "特性ID", required = true)
	public Integer id;
	@ApiModelProperty(value = "特性", required = true)
	public String name;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

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

}
