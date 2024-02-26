import java.io.IOException;

public class Student extends Preson {
private     String className;
public Student(){
    super();

}
    public Student(String name,Integer age ,Long phone ,String className){
        super(name,age,phone);
        this.className=className;


}

public void grade(int mark){
    System.out.println("grade is: "+((mark>=50)?"Pass":"fail"));

}
    public void grade(double mark){
        System.out.println("grade is: "+((mark>=50)?"Pass":"fail"));

    }
@Override
public  void display(){
  super.display();
    System.out.println("className is :"+ this.className );

}

}
