package myproject.demo.test;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Class<?> clazzB=Bpp.class;
        try {
			Class<?> clazzC=Class.forName("myproject.demo.test.Cpp");
			try {
				Cpp cpp=(Cpp)clazzC.newInstance();
				cpp.print();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
        try {
			Bpp bpp=(Bpp)clazzB.newInstance();
			bpp.print();
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
    }
   
}
class Bpp{
	public void print(){
		System.out.println("test B reflect!");
	}
}
class Cpp{
	public void print(){
		System.out.println("test C reflect!");
	}
}
