
public class Customer {

private String Username;
private String Name;
private String Email;
private String password;
private int Number;

	public Customer(String name, int number){
		Name=name;
		Number = number;
	}
	
	public void setName(String name){
		Name=name;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getEmail(){
		return Email;
	}
	
	public void setEmail(String email){
		this.Email = email;
	}
	
	public String getPassward(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getUsername(){
		return Username;
	}
	
	public void setUsername(String Userid){
		this.Username=Userid;
	}
	
	public int getNumber(){
		return Number;
	}
	
	public void setNumber(int number){
		this.Number=number;
	}
	public String toString(){
		return "Username = " + Username + ", Name= "+Name + ", Email" + Email +
				", Password=" + password + ", Phone number=" + Number;
	}
	
}
