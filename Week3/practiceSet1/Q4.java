class Class1{
    int var1;
    int var2;

    // one way of doing it
    public Class1(int varDifferent) {
        var1 = varDifferent;
    }
    // another way of doing using this keyword
    public Class1(int var1,int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    public int getvar1() {
        return var1;
    }

    public int getvar2() {
        return var2;
    }
}
class Class2 extends Class1{
    int var3;
    // yaha pe error aayega kyu ki ye by default uske
    // parent class ke default constructor ko call karega jo ki hai hi nahi
    // isliye super keyword use karegee
    public Class2(int var3){
        super(var3);
        this.var3 = var3;
    }

    public int getvar3() {
        return var3;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Class1 Class1 = new Class1(12,23);
        System.out.println("Pahile variable ki value: "
                +Class1.getvar1()+"\nDusre variable ki value: "
                + Class1.getvar2());
        Class2 dc = new Class2(34);
        System.out.println("Teesre variable ki value: "+dc.getvar3());
    }
}
