package Patterns;

public class BubbleLights extends TreeDecorate{
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    public String decorateWithBubbleLights() {
        return " with bubble lights";
    }
    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
}
