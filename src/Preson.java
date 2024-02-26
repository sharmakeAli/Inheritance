
public class Preson {
    private String name;
    private Integer age;
    private Long phone;

    public Integer getAge() {
        return age;
    }

    public Long getPhone() {
        return phone;
    }


    public String getName() {
        return name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Preson(){

    }
    public Preson(String name,Integer age, Long phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
}
