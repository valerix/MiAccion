import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import static javax.swing.Action.*;

public class ToolBarDemo extends Ventana implements MouseListener{

	private MyAction miaccion;
	private JToolBar toolBar;
	private JButton btnMiAccion;
	private JPopupMenu popup;
	
	
	public ToolBarDemo(){
		toolBar=new JToolBar();
		this.getContentPane().add(toolBar,BorderLayout.NORTH);
		miaccion=new MyAction("Opcion 1");
		miaccion.putValue(LARGE_ICON_KEY, new ImageIcon("img/toolBarIcon.jpg"));
		miaccion.putValue(SHORT_DESCRIPTION, "Mi boton");
		btnMiAccion=new JButton(miaccion);
		btnMiAccion.setHideActionText(true);
		btnMiAccion.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(2,5,5,2), BorderFactory.createRaisedBevelBorder()));
		toolBar.add(btnMiAccion);
		
		popup=new JPopupMenu("General");
		popup.add(new JMenuItem("Hola"));
		popup.add(new JMenuItem("adios"));
		this.addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==e.BUTTON3){
			popup.show(this, e.getX(), e.getY());
		}
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
