package Patterns;

public class TreeDecorate implements ChristmasTree{
    private ChristmasTree christmasTree;

    public TreeDecorate(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
