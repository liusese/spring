package chn.liu.htax.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "风机")
public class FanVO {
	@ApiModelProperty(value = "风机", required = true)
	public String name;
	@ApiModelProperty(value = "特性", required = true)
	public String feature;
	@ApiModelProperty(value = "风量", required = true)
	public String airVolume;
	@ApiModelProperty(value = "静压", required = true)
	public String staticPress;
	@ApiModelProperty(value = "噪声", required = true)
	public String noise;
	@ApiModelProperty(value = "功率", required = true)
	public String power;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getAirVolume() {
		return airVolume;
	}

	public void setAirVolume(String airVolume) {
		this.airVolume = airVolume;
	}

	public String getStaticPress() {
		return staticPress;
	}

	public void setStaticPress(String staticPress) {
		this.staticPress = staticPress;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
