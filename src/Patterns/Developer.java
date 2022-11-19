package Patterns;

public class Developer {
    private String name;
    private Role role;

    public Developer(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void promote(Role newRole) {
        role = newRole;
    }

    public void grade() {
        System.out.println(name + " is a " + role.desc());
    }

    public void doJob() {
        System.out.println(name + " will " + role.responsibilities());
    }

    @Override
    public String toString() {
        return name;
    }
}

//    Developer developer = new Developer("Bruno", new JuniorDeveloper());
//        developer.grade();
//                developer.doJob();
//                developer.promote(new MiddleDeveloper());
//                System.out.println("Bruno's been promoted! Now...");
//                developer.grade();
//                developer.doJob();
//                System.out.println();
//
//                Developer developer1 = new Developer("Emma", new SeniorDeveloper());
//                developer1.grade();
//                developer1.doJob();