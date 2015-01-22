package lv.aaa.tree;

import java.util.ArrayList;

public class Node {

    private String data;
    private ArrayList<Node> children;

    public Node(String data) {
        this.data = data;
        children = new ArrayList<Node>();
    }

    public String getData() {
        return data;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void addChild(Node identifier) {
        children.add(identifier);
    }
}
