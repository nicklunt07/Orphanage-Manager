public class Employee extends Person implements Skillable {
    
    public Employee(String name, int age, String gender) {
        super(name,age,gender);
        addPerson(this);
    }

   public void skill() {

   }
}
