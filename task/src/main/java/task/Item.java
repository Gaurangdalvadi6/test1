package task;

import java.util.Comparator;

public class Item {
	private int id;
	private String name;
	private String category;
	private int points;
	
	


	public Item(int id, String name, String category, int points) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.points = points;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getCategory() {
		return category;
	}


	public int getPoints() {
		return points;
	}

class PointsCompare implements Comparator<Item>{

	@Override
	public int compare(Item i1, Item i2) {
		// TODO Auto-generated method stub
		if (i1.getPoints() < i2.getPoints()) {
			return -1;
		} 
		if (i1.getPoints() > i2.getPoints()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
class NameCompare implements Comparator<Item>{

	@Override
	public int compare(Item i1, Item i2) {
		// TODO Auto-generated method stub
		return i1.getName().compareTo(i2.getName());
	}
	
}
	
}

	
	
}
