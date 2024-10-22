/*
Each object has a predefined equals() method that is used for semantical equality testing.
But, to make it work for our classes, we need to override it and check the conditions 
we need.
There is a simple and fast way of generating the equals() method, other than writing 
it manually.
Just right click in your class, go to Source->Generate hashCode() and equals()... 
 */
class Animal {
    String name;
    Animal(String n) {
      name = n;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Animal other = (Animal) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }
  }
class demo{
    public static void main(String args[]){
    Animal a1 = new Animal("Kane");
    Animal a2 = new Animal("Kane");
    System.out.println(a1.equals(a2));
    }
}