package homework_8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {

			 Set<Cats> cats = new TreeSet<Cats>();
			
			 Cats tomcat=new Cats();
	         tomcat.setName("Tom");
	         tomcat.setAge(2);

	         Cats jackcat=new Cats();
	         jackcat.setName("Jack");
	         jackcat.setAge(3);

	         Cats johncat=new Cats();
	         johncat.setName("John");
	         johncat.setAge(4);

			 cats.add(tomcat);
			 cats.add(tomcat);
			 cats.add(jackcat);
			 cats.add(johncat);
			

		    Iterator<Cats> it = cats.iterator();
		    while(it.hasNext()) {
		    Cats cat = (Cats)it.next();
		    System.out.println(cat.getName());
		  }
	}


}
