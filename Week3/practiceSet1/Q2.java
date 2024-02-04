class Animal{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal makes sound !");
    }
}
class Dog extends Animal{
    public void barks(){
        System.out.println(getName()+" barks !");
    }
}


public class Q2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Tibetian Mastif");
        d.setAge(4);
        d.makeSound();
        d.barks();
        System.out.println(d.getName()+" age : "+d.getAge());
    }
}
