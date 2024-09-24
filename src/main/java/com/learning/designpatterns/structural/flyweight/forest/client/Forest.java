package com.learning.designpatterns.structural.flyweight.forest.client;

import com.learning.designpatterns.structural.flyweight.forest.flyweight.Tree;
import com.learning.designpatterns.structural.flyweight.forest.flyweight.TreeType;
import com.learning.designpatterns.structural.flyweight.forest.flyweightfactory.TreeFactory;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
