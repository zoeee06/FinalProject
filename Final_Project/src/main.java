
public class main {
	public static void main(String[] args) {
//		Class c = Class.readFile("data.bin");
//		if(c==null) {
//			c=new Class();
//		}
		
		Class c = new Class();
		mainGUI mainWindow = new mainGUI(c);
		mainWindow.show();
		
//		c.save("data.bin");
		
		
	}
}
