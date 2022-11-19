package Patterns;

public class Tinsel extends TreeDecorate{
    public Tinsel(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    public String decorateWithTinsel() {
        return " with tinsel";
    }
    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }
}
