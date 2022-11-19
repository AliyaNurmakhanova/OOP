package Patterns;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(),
                "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(),
                "Christmas tree with Garland with Garland with Bubble Lights");
    }

    private static void assertEquals(String decorate, String christmas_tree_with_garland) {
    }
}
