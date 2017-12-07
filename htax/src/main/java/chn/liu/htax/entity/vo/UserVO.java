package chn.liu.htax.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户实体类")
public class UserVO {
	@ApiModelProperty(value = "用户ID", required = true)
	public String id;
	@ApiModelProperty(value = "用户姓名", required = true)
	public String name;
	@ApiModelProperty(value = "用户账号", required = true)
	public String account;
	@ApiModelProperty(value = "用户年龄", required = true)
	public Integer age;
	@ApiModelProperty(value = "用户电话", required = true)
	public String tel;
	@ApiModelProperty(value = "用户手机", required = true)
	public String phone;
	@ApiModelProperty(value = "用户邮箱", required = true)
	public String email;
	@ApiModelProperty(value = "用户地址", required = true)
	public String address;
	@ApiModelProperty(value = "用户所属部门", required = true)
	public String dep;
	@ApiModelProperty(value = "用户职位", required = true)
	public String post;
	@ApiModelProperty(value = "用户类型", required = true)
	public String type;
	@ApiModelProperty(value = "用户头像")
	private String img;
	@ApiModelProperty(value = "用户个性签名", required = true)
	private String signature;

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}
