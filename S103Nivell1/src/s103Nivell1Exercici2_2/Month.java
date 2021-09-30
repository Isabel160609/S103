package s103Nivell1Exercici2_2;

public class Month {

	private String name;
	
	public Month (String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean iguals(Month mes) {
		boolean iguals=false;
		
		if (name.equalsIgnoreCase(mes.name)) {
			iguals=true;
		}
				
		return iguals;
	}
}
