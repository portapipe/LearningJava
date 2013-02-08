import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class helloworldswt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Ciao Brutti Rincoglioniti!");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
