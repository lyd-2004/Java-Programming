package test8;
public class Student {
    private String name;
    public Student(String name) {
        this.name=name;
    }
    public Student() {
        this("Irfan");
    }
    public void setName(String name) {
    }
    public String getName() {
        return this.name;
    }
}
