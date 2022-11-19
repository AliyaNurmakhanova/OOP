package Patterns;

public class Garland extends TreeDecorate{
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorateWithGarland() {
        return " with garland";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }
}
