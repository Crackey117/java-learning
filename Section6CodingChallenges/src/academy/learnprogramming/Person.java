package academy.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int age){
        if (age > 100 || age < 0) {
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if(this.age >= 20 || this.age <= 12){
            return false;
        }else {
            return true;
        }
    }

    public String getFullName() {
        if(this.firstName.isEmpty()  && this.lastName.isEmpty()){
            return "";
        }else if (this.firstName.isEmpty()){
            return this.lastName;
        }else if (this.lastName.isEmpty()) {
            return this.firstName;
        }else {
            return (this.firstName + " " + this.lastName);
        }
    }
}
