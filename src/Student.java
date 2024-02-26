public class Student extends Preson {
private     String className;
public Student(){

}
    public Student(String name,Integer age ,Long phone ,String className){
        super(name,age,phone);
        this.className=className;


}
public  void display(){
    System.out.println("name is :"+ this.getName() );
    System.out.println("age is :"+ this.getAge() );
    System.out.println("phone is :"+ this.getPhone() );
    System.out.println("className is :"+ this.className );

}

}
