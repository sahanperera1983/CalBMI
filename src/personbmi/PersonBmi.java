
package personbmi;

public class PersonBmi {

    public static void main(String[] args) {
        Person p1=new Person("Sahan");
        
      
        p1.age=34;
        p1.ht=1.7;
        p1.wt=64;
        p1.calculateBmi();
        System.out.println(p1.name + " BMI = "+ p1.bmi);
        
        Person p2=new Person();
        p2.name="Perera";
        p2.ht=1.5;
        p2.wt=60;
        p2.calculateBmi();
        System.out.println(p2.name + " BMI = " + p2.bmi);
        
    }
    
}
