package Patterns;

public class TreeTopper extends TreeDecorate{
    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorateWithTreeTopper() {
        return " with tree topper";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }
}
