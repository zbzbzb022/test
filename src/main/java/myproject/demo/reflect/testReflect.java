package myproject.demo.reflect;

public class testReflect {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("myproject.demo.reflect.Excel");
			try {
				OfficeAbel oa=(OfficeAbel)clazz.newInstance();
				oa.start();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
