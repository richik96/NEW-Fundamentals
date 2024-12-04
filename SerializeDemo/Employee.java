package SerializeDemo;

import java.io.Serializable;

public class Employee implements Serializable{

    //private and final fields are not serialized
    //transient fields are not serialized
    //static fields are not serialized
    //serialVersionUID is used to ensure that the same class (that was used to serialize) is used to deserialize
    //If the serialVersionUID is not provided, the JVM will generate it based on the class definition
    //If the serialVersionUID is provided, the JVM will use it to compare with the serialized class
    //If the serialVersionUID is not provided and the class definition is changed, the JVM will not be able to deserialize the object
    //If the serialVersionUID is provided and the class definition is changed, the JVM will be able to deserialize the object
    private int id;
    private String name;
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
