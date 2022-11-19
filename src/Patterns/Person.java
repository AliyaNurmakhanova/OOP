package Patterns;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    Working working;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void display();

    public void executeWork() {
        working.work();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return firstName + ' ' +  lastName;
    }
}

//    Person programmer = new Programmer("Alice", "Ackermann");
//        System.out.println(programmer);
//                programmer.display();
//                programmer.executeWork();
//                System.out.println();
//
//                Person student = new Student("Markus", "Miller");
//                System.out.println(student);
//                student.display();
//                student.executeWork();
//                System.out.println();
//
//                Person actor = new Actor("Felix", "Mallard");
//                System.out.println(actor);
//                actor.display();
//                actor.setWorking(new Working() {
//@Override
//public void work() {
//        System.out.println("I'm a movie star, I work as an actor.");
//        }
//        });
//        actor.executeWork();