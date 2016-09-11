package dataStructures;

public class MyMapApp {
	public static void main(String args[]){
		MyMap map = new MyMap();
		
		map.push("lalissa");
		
		System.out.println(map.getFirstNonRepeated());
	}

}
