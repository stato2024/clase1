package model;

public class TestClass {

    private int id;
    private String name;

    public TestClass (int id,String name){
        this.id = id;
        this.name = name;
    }

    public  TestClass(){

    }

    public TestClass(String Name){
        this.name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
