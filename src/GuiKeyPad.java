
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;

import java.awt.event.*;


public class GuiKeyPad extends Panel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str="";
	private JButton[] buttons;
	private static final String[] names=
		{"1","2","3","4","5","6","7","8","9","0","Delete","Enter"};
	private GridLayout gridLayout;
	
	public GuiKeyPad()
	{
		gridLayout=new GridLayout(4,3,5,5);
		buttons=new JButton[12];
		for(int count=0;count<12;count++)
		{
			buttons[count]=new JButton(names[count]);
			add(buttons[count]);
		}
		setLayout(gridLayout);
		
		for (int i=0; i < 9; i ++){
			int j=i;
	        buttons[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	                getKeyPadInput(j);
	                System.out.println(str);
	            }
	        });
		}
		
		buttons[10].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	deleteKeyPressed();
	        	System.out.println(str);
	        }
	    });
		
		buttons[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	enterKeyPressed();
            	System.out.println(str);
            }
        });
	}
	

	private String getKeyPadInput(int digit){
		str+=names[digit];
		System.out.println(str);
		return str;
	}
	
	private String deleteKeyPressed(){
		str=str.substring(0,str.length()-1);
		System.out.println(str);
		return str;
	}
	
	private String enterKeyPressed(){
		System.out.println(str);
		return str;
	}
	
	public String getString(){
		return str;
	}
	
	
	// return an integer value entered by user
	public int intoInt(String str)
	{
		if(str!="")
			return Integer.parseInt(str) ;// we assume that user enters an integer
		else
			return 0;
	} // end method getInput
}
