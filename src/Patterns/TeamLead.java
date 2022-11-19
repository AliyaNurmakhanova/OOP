package Patterns;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(IDeveloper developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return " Send week report.";
    }

    @Override
    public String doJob() {
        return super.doJob() + sendWeekReport();
    }
}
