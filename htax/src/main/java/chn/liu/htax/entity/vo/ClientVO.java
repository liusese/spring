package chn.liu.htax.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "客户")
public class ClientVO {
	@ApiModelProperty(value = "姓名", required = true)
	public String name;
	@ApiModelProperty(value = "联系人", required = true)
	public String contact;
	@ApiModelProperty(value = "联系方式", required = true)
	public String phone;
	@ApiModelProperty(value = "联系邮箱", required = true)
	public String email;
	@ApiModelProperty(value = "联系电话", required = true)
	public String tel;
	@ApiModelProperty(value = "地址", required = true)
	public String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
