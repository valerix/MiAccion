import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;


public class MyAction extends AbstractAction{

	
	public MyAction(String nombre){
		super(nombre);
	}
	
	public MyAction(String nombre, char caracter,int modificador){
		super(nombre);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(caracter,modificador));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
	}

}
