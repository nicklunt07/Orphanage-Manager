import java.util.*;

import javafx.scene.control.Button;
public class Employee extends Person implements Taskable {
    
    private Skillable skill;
    private String position;
    private static long employeeID = 300001;
    private long id;

    public Employee(String name, int age, String gender, String position,Orphanage orphanage, Skillable skill) {
        super(name,age,gender);
        this.id = employeeID++;
        this.position = position;
        this.skill = skill;
        orphanage.addPerson(this);
    }

    /**
     * @author Sushanth Ambati
     * @return position
     */
    protected String getPosition(){
        return this.position;
    }

    protected long getID(){
        
        return id;
    }

    

    @Override
    public String toString() {
        return super.toString() + "\tID: " + getID() + "\tPosition: " + getPosition();
    }

    public void assignTask(Skillable skill) {
       this.skill = skill;
    }

    public Skillable getSkill() {
        return skill;
    }
    public Button performTask() {
        return skill.skill();
     }


   
}
