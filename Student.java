package Models ;
public class Student {
    // öğrencinin bilgileri tanımlandı
    String name ;
    String surname ;
    int age  ;
    // const ve getter- setter lar oluşturuldu .
    public Student(String name , String surname , int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
