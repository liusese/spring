package chn.liu.htax.util;

public class StaticBlock {
	public String clientTest;
	public String clientConfirm;

	{
		this.clientTest = "12";
		this.clientConfirm = "34";
		System.out.println("constructor block");
	}

	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		StaticBlock sbk = new StaticBlock();
		System.out.println(sbk.clientTest);
		System.out.println(sbk.clientConfirm);
		StaticBlock sbk2 = new StaticBlock();
		System.out.println(sbk2.clientTest);
		System.out.println(sbk2.clientConfirm);
	}
}
