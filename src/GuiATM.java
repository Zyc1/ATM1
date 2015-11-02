
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class GuiATM extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GuiATM(){
		ATM theATM=new ATM(this);
		theATM.run();
		GuiKeyPad keypad = new GuiKeyPad();
        add(keypad,BorderLayout.WEST);
        
        GuiScreen screen = new GuiScreen();
        add(new JScrollPane(screen),BorderLayout.NORTH);
        
      //创建面板p1往其中添加提示取钱的面板p11和提示存钱的面板p12
        JPanel p1=new JPanel(new GridLayout(2,1,0,15));
		p1.setBackground(new Color(240,255,255));
		JPanel p11=new JPanel(new GridLayout(2,1,0,0));
		p11.setBorder(new LineBorder(new Color(240,255,255),5));
		JTextField f10 = new JTextField("Please take cash here           ");
		f10.setEditable(false);
		p11.add(f10);
		JTextField f1 = new JTextField();
		f1.setEditable(false);
		f1.setBorder(BorderFactory.createLoweredBevelBorder());
		f1.setBackground(new Color(240,255,255));
		p11.add(f1);
		
		JPanel p12=new JPanel(new GridLayout(2,1,0,0));
		p12.setBorder(new LineBorder(new Color(240,255,255),5));
		JTextField f20 = new JTextField("Please insert deposit here");
		f20.setEditable(false);
		p12.add(f20);
		JTextField f2= new JTextField();
		f2.setEditable(false);
		f2.setBorder(BorderFactory.createLoweredBevelBorder());
		f2.setBackground(new Color(240,255,255));
	    p12.add(f2);
	    p1.add(p11);
		p1.add(p12);
		
		add(p1,BorderLayout.EAST);
        
        //BorderLayout.setMinimumSize(new Dimension(650,200));
	}
}
