//Example of MultiLevel Inheritance :Child Class of BClassInherit or sub class
public class CClassInherit extends BClassInherit{
    void ClassC(){
        System.out.println("C class method");
    }
    public static void main(String[] args){
        CClassInherit objC = new CClassInherit();
        objC.ClassA();
        objC.ClassB();
        objC.ClassC();
    }
}
