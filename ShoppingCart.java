import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JList;


public class ShoppingCart extends JFrame {
	
	private JButton AddItem;
	private JButton RemoveItem;
	private JButton ViewItem;
	private int NumberOfitems;
	private String[] Items;
	private int TotalCost;
	private JLabel item1;
	
	
	public ShoppingCart(){
	super("BuySmart Shopping Cart");
	
	getContentPane().setLayout(new FlowLayout());
	
	setLayout(new FlowLayout());
	
	item1 = new JLabel(" Enjoy your Shopping experience !!!");
	
	item1.setToolTipText("FAST CHEAP HIGH QUALITY PHONES!");
	
	add(item1);
	
	
	ArrayList<String> items = new ArrayList<String>();
	String[] phones= {"Samsung","LG","Nokie","Apple"};
	
	for(int i=0; i<4 ; i++){
		items.add(phones[i]);
	}
	final JList<String>list = new JList(items.toArray());
	getContentPane().add(list);
	
	//setLayout(new FlowLayout());
	
	AddItem = new JButton(" Add Item");
	getContentPane().add(AddItem);
	
	RemoveItem = new JButton("Remove Item");
	getContentPane().add(RemoveItem);
	
	ViewItem = new JButton(" View Item");
	getContentPane().add(ViewItem);
	
AddItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			System.out.println("Added Items");
			int[] index=list.getSelectedIndices();
			
			for(int i=0; i<index.length;i++){
				System.out.println("Phone "+ (index[i]+1)+" "+ phones[i]);
			}
		}
	});
RemoveItem.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ae){
			System.out.println("Removed Items");
			int[] index=list.getSelectedIndices();
			
			for(int i=0; i<index.length;i++){
				System.out.println("Phone "+ (index[i]+1)+" "+ phones[i]);
			}
		}
	});

ViewItem.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ae){
			System.out.println("Viewed Item");
			int[] index=list.getSelectedIndices();
			
			for(int i=0; i<index.length;i++){
				System.out.println("Phone "+ (index[i]+1)+" "+ phones[i]);
			}
		}
	});}	
public String[] getItems(){
	return Items;	
}
public void setNString(String[] item){
	Items=item;
}
public int getNumberOFitems(){
	return NumberOfitems;
}
public void setNumberOfitems(int num){
	NumberOfitems=num;
}
public int getTotalCost(){
	return TotalCost;
}
public void setTotalCost(int cost){
	TotalCost=cost*NumberOfitems;
}
}
