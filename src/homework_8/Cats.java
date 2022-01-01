package homework_8;

public class Cats implements Comparable<Object>{
    private String name;
    private int age;
    
	public Cats(){
	}
	
	public Cats(String name,int age)	{
		  this.name=name;
		  this.age=age;
	}

    public String getName(){
	     return name;
    }

    public void setName(String name){
	      this.name=name;
    }

    public int getAge(){
	      return age;
    }

    public void setAge(int age){
	      this.age=age;
    }

    public int compareTo(Object o) {
      if (!(o instanceof Cat))
        throw new RuntimeException("Cat");
      Cats p = (Cats) o;
      if (this.age > p.age)
        return 1;
      if (this.age == p.age){
        return this.name.compareTo(p.name);
      }
      return -1;
    }
}
