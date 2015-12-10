package myproject.demo.test;

import myproject.demo.util.SerializeUtil;

public class testGem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gem<String, Integer, String> gem = new Gem<String, Integer, String>();
		gem.setT("t");
		byte[] serial = SerializeUtil.serialize(gem);
		gem = (Gem<String, Integer, String>) SerializeUtil.unserialize(serial);
		System.out.println(gem.getT());
	}

}
