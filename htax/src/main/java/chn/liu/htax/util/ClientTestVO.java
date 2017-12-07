package chn.liu.htax.util;

public class ClientTestVO {
	public String clientTest;
	public String clientConfirm;

	{
		this.clientTest = "12";
		this.clientConfirm = "34";
	}

	public ClientTestVO() {}
	
	public static void main(String[] args) {
		ClientTestVO ct = new ClientTestVO();
		System.out.println(ct.getClientTest());
		System.out.println(ct.getClientConfirm());
	}

	public String getClientTest() {
		return clientTest;
	}

	public void setClientTest(String clientTest) {
		this.clientTest = clientTest;
	}

	public String getClientConfirm() {
		return clientConfirm;
	}

	public void setClientConfirm(String clientConfirm) {
		this.clientConfirm = clientConfirm;
	}

}
