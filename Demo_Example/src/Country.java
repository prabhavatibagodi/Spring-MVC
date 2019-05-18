
public class Country {
private String name;
private int states;
public Country() 
{
System.out.println(this.getClass().getSimpleName());
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStates() {
	return states;
}
public void setStates(int states) {
	this.states = states;
}
}
