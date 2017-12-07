package chn.liu.htax.entity.vo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目详情")
public class ProjectDetailVO {
	@ApiModelProperty(value = "项目ID", required = true)
	public String id;
	@ApiModelProperty(value = "项目", required = true)
	public String name;
	@ApiModelProperty(value = "客户", required = true)
	public ClientVO client;
	@ApiModelProperty(value = "负责人", required = true)
	public UserVO pic;
	@ApiModelProperty(value = "设计者", required = true)
	public UserVO designer;
	@ApiModelProperty(value = "风机", required = true)
	public FanVO fan;
	@ApiModelProperty(value = "项目方案", required = true)
	public List<List<ProjectSchemeVO>> scheme;

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

	public ClientVO getClient() {
		return client;
	}

	public void setClient(ClientVO client) {
		this.client = client;
	}

	public UserVO getPic() {
		return pic;
	}

	public void setPic(UserVO pic) {
		this.pic = pic;
	}

	public UserVO getDesigner() {
		return designer;
	}

	public void setDesigner(UserVO designer) {
		this.designer = designer;
	}

	public FanVO getFan() {
		return fan;
	}

	public void setFan(FanVO fan) {
		this.fan = fan;
	}

	public List<List<ProjectSchemeVO>> getScheme() {
		return scheme;
	}

	public void setScheme(List<List<ProjectSchemeVO>> scheme) {
		this.scheme = scheme;
	}

}
