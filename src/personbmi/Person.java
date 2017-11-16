
package personbmi;

public class Person {
    String name;
    int age;
    double ht;
    double wt;
    double bmi;
    
    public Person(){
        System.out.println("New Class is created");
    }
    public Person(String provideAname){
        System.out.println("New Class is created with a name");
        name=provideAname;
    }

   }
    public void calculateBmi(){
        bmi =wt/(ht*ht);
    }
}
