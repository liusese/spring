package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户类型实体类(Mybatis、JDBC)")
public class UserType {
	@ApiModelProperty(value = "用户类型ID", required = true)
	public Integer utId;
	@ApiModelProperty(value = "用户类型", required = true)
	public String utName;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

	public Integer getUtId() {
		return utId;
	}

	public void setUtId(Integer utId) {
		this.utId = utId;
	}

	public String getUtName() {
		return utName;
	}

	public void setUtName(String utName) {
		this.utName = utName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
