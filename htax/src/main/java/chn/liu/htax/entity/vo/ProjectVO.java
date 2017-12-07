package chn.liu.htax.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目")
public class ProjectVO {
	@ApiModelProperty(value = "项目ID", required = true)
	public String id;
	@ApiModelProperty(value = "项目", required = true)
	public String name;
	@ApiModelProperty(value = "客户", required = true)
	public String client;
	@ApiModelProperty(value = "主机厂", required = true)
	public String mainFactory;
	@ApiModelProperty(value = "数量", required = true)
	public String count;
	@ApiModelProperty(value = "背景", required = true)
	public String background;
	@ApiModelProperty(value = "技术难点", required = true)
	public String nodus;
	@ApiModelProperty(value = "开发类别", required = true)
	public String devType;
	@ApiModelProperty(value = "风机", required = true)
	public String fan;
	@ApiModelProperty(value = "重要度", required = true)
	public Integer importance;
	@ApiModelProperty(value = "状态", required = true)
	public String status;
	@ApiModelProperty(value = "开始时间", required = true)
	public String createTime;
	@ApiModelProperty(value = "阶段", required = true)
	public String progress;
	@ApiModelProperty(value = "要求交付时间", required = true)
	public String planDelivery;
	@ApiModelProperty(value = "实际交付时间", required = true)
	public String actualDelivery;
	@ApiModelProperty(value = "sss", required = true)
	public String notes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
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

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getFan() {
		return fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
	}

	public Integer getImportance() {
		return importance;
	}

	public void setImportance(Integer importance) {
		this.importance = importance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
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

}
