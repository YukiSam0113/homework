package homework_8;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<String, Book>();
		books.put("1", new Book("1", "老人与海", 36, "人民出版社"));
		books.put("2", new Book("2", "活着", 45, "人民出版社"));
		books.put("4", new Book("4", "海底两万里", 30, "人民出版社"));
		books.put("3", new Book("3", "红楼梦", 89, "人民出版社"));
		Iterator iter = books.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(((Book) entry.getValue()).toString());
		}
	}
}
