package chn.liu.htax.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目实体类(Mybatis、JDBC)")
public class Project {
	@ApiModelProperty(value = "项目ID", required = true)
	public String id;
	@ApiModelProperty(value = "项目", required = true)
	public String name;
	@ApiModelProperty(value = "客户", required = true)
	public String client;
	@ApiModelProperty(value = "主机厂", required = true)
	public String mainFactory;
	@ApiModelProperty(value = "产品型号", required = true)
	public String fan;
	@ApiModelProperty(value = "负责人", required = true)
	public String pic;
	@ApiModelProperty(value = "设计者", required = true)
	public String designer;
	@ApiModelProperty(value = "开始时间", required = true)
	public String createTime;
	@ApiModelProperty(value = "数量", required = true)
	public Integer count;
	@ApiModelProperty(value = "重要度", required = true)
	public Integer importance;
	@ApiModelProperty(value = "开发类别", required = true)
	public Integer type;
	@ApiModelProperty(value = "状态", required = true)
	public Integer status;
	@ApiModelProperty(value = "阶段", required = true)
	public Integer progress;
	@ApiModelProperty(value = "背景", required = true)
	public String background;
	@ApiModelProperty(value = "难点", required = true)
	public String nodus;
	@ApiModelProperty(value = "要求交付时间", required = true)
	public String planDelivery;
	@ApiModelProperty(value = "实际交付时间", required = true)
	public String actualDelivery;
	@ApiModelProperty(value = "备注", required = true)
	public String notes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getMainFactory() {
		return mainFactory;
	}

	public void setMainFactory(String mainFactory) {
		this.mainFactory = mainFactory;
	}

	public String getFan() {
		return fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getImportance() {
		return importance;
	}

	public void setImportance(Integer importance) {
		this.importance = importance;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getNodus() {
		return nodus;
	}

	public void setNodus(String nodus) {
		this.nodus = nodus;
	}

	public String getPlanDelivery() {
		return planDelivery;
	}

	public void setPlanDelivery(String planDelivery) {
		this.planDelivery = planDelivery;
	}

	public String getActualDelivery() {
		return actualDelivery;
	}

	public void setActualDelivery(String actualDelivery) {
		this.actualDelivery = actualDelivery;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
