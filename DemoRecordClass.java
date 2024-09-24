
// class A {

//     private final int id;
//     private final String name;
//     public A(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "A [id=" + id + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         A other = (A) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
    
// }

//use case - DataLoader class - to carry data to server to client
record A(int id, String name) {} //implicitly takes 2 parameter. this is a canonical constructor
//Record class is a special type of class introduced in Java 14
//It is a final class and cannot be extended

//Record class is used to create a simple data container class
public class DemoRecordClass {

    public static void main(String[] args) {
        
        A a1 = new A(23, "Richik");
        A a2 = new A(43, "Richik");

        System.out.println(a1.equals(a2));

        System.out.println(a2);
    }
}