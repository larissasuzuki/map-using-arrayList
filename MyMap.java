package dataStructures;

import java.util.ArrayList;

public class MyMap {
	public ArrayList<Comparable> key;
	public ArrayList<Integer> value;
	
	public MyMap(){
		key = new ArrayList<Comparable>();
		value = new ArrayList<Integer>();
	}
	
	public void push(Comparable myKey){
		for(char ch:myKey.toString().toCharArray()){
			int index = getIndexOfKey(ch);
			if(index > -1){
				updateIndex(ch, index);
			}
			else{
				key.add(ch);
				value.add(1);
			}
		}
	} 
	
	public void updateIndex(Comparable myKey, int index){
		key.set(index, myKey);
		value.set(index, value.get(index) + 1);
	} 
	
	public int getIndexOfKey(Comparable myKey){
		for(int i=0;i<key.size();i++){
			if(key.get(i).equals(myKey))
				return i;
		}
		return -1;
	}
	
	public Comparable getFirstNonRepeated(){
		int minValue = value.get(0);
		int index = 0;
		for(int i=1; i<value.size();i++){
			if(value.get(i) < minValue){
				minValue = value.get(i);
				index = i;
			}	
		}
		return key.get(index);
	}	

}
