package CollectionsTemplate;

import java.util.HashMap;

public class MyExampleHashMap {

    private void putGetMap(){
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Basil", "07.12.1987");		//	 put(K key, V value)  - добавляет элемент в карту;
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");

        System.out.println("The value for 'Basil' is " + myHashMap.get("Basil"));	// get(Object key) - ищет значение по его ключу;
    }
    private void otherOperationWithMap(){
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");

        System.out.println("The size of map is " + myHashMap.size());	//	size() -  возвращает размер карты (количество пар "ключ-значение").

        myHashMap.remove("Kate");	//	remove(Object key) - удаляет значение по его ключу;

        System.out.println("The size of map is " + myHashMap.size());		//	size() -  возвращает размер карты (количество пар "ключ-значение").

        System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil"));	//	containsKey(Object key) - спрашивает, есть ли в карте заданный ключ;
        System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));

        System.out.println("Do we have a value'12.10.1971'? " + myHashMap.containsValue("12.10.1971"));		//	containsValue(Object value) - спрашивает есть ли в карте заданное значение;
        System.out.println("Do we have a value 'lalala'? " + myHashMap.containsValue("lalala"));
    }
    public static void main(String[] args) {
        MyExampleHashMap myEx = new MyExampleHashMap();
        myEx.putGetMap();
        myEx.otherOperationWithMap();
    }
}

