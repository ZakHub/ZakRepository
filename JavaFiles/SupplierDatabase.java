
public class SupplierDatabase {
private String[] Suppliers = new String[20];
private int i=0;
private int sizeOfArr = 21;
private int targetItem;

public SupplierDatabase(){};

public void add(String S){
	
	if(i<Suppliers.length){
		
		Suppliers[i]= S;
		System.out.println("Supplier was added at index" + i);
		i++;
		
	}

}

public void remove(int X){
	this.targetItem=X;
	
	for(int j = targetItem ; j <sizeOfArr -1; j++){
		Suppliers[j] = Suppliers[j+1];
	}
	
	Suppliers[targetItem-1]=null;
	
	
}

public String[] getSuppliers(){
	return Suppliers;
}
}
