package com.task.innterface;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Banker() {

			@Override
			public void depositeMoney() {

				System.out.println("deposit method");
			}
		};
		obj.depositeMoney();
		obj.passbookPrint();

	}

}
