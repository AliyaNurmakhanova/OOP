package Patterns;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(IDeveloper developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }

    @Override
    public String doJob() {
        return super.doJob() + makeCodeReview();
    }
}
