package dataStructures;

import java.util.Hashtable;

public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hashTable = new Hashtable<>(10); 
		
		hashTable.put("100", "Roger");
		hashTable.put("111", "Waynard");
		hashTable.put("333", "Hathway");
		hashTable.put("635", "Ambrose");
		hashTable.put("555", "Devon");
		hashTable.put("777", "Schrute");
		
		for(String key: hashTable.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashTable.get(key));
		}
	}

}
