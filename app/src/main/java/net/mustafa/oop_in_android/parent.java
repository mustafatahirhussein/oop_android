package net.mustafa.oop_in_android;

public class parent extends grand_parent {

    String name;
    String age;

    public parent(String age, String name) {
        super(age, name);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }
}
