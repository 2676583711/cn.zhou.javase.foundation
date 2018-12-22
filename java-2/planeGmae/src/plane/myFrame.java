package plane;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class myFrame extends JFrame{

	
	public void launchFrame() {
		setTitle("PlaneGame");
        setSize(Constant.WINDOW_WIDTH,Constant.WINDOW_HEIGHT);
		setLocation(Constant.WINDOW_X,Constant.WINDOW_Y);
		
	       new paintThread().start();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
	
	 class paintThread extends Thread {
		public void run() {
			while(true) {
				repaint();
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static void main(String []args) {
		myFrame mf=new myFrame();
		mf.launchFrame();
	}
}
