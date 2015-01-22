package lv.aaa.tree;

import java.util.HashMap;

public class Tree {

    private HashMap<String, Node> nodes = new HashMap<String, Node>();

    public Tree() {
    }

    public HashMap<String, Node> getNodes() {
        return nodes;
    }

    public Node addNode(String data, String parent) {
        Node node = new Node(data);
        nodes.put(data, node);
        if(parent != null) {
            nodes.get(parent).addChild(node);
        }

        return node;
    }
}