import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JList;

import javax.swing.JFrame;

public class SelectItem extends JFrame {
	
	public SelectItem(){super("Select Item");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		getContentPane().setLayout(new FlowLayout());
		
		ArrayList<String> items = new ArrayList<String>();
		
		String[] phones = { "Samsung", "LG", "Nokie",
			    "Apple" };	
		
		for(int i=0; i<4 ; i++){
			items.add("Phone "+(i+1) +" "+ phones[i]);
		}
		final JList<String> list=new JList(items.toArray());
		getContentPane().add(list);
		
		JButton button= new JButton("select phone");
		getContentPane().add(button);
	
	
	button.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ae){
			System.out.println("Selected Phone");
			int[] index=list.getSelectedIndices();
			
			for(int i=0; i<index.length;i++){
				System.out.println("Phone "+ (index[i]+1)+" "+ phones[i]);
			}
		}
	});
	
	setSize(400,400);
	}

}