package lv.aaa;

import lv.aaa.tree.Node;
import lv.aaa.tree.Tree;

import java.util.ArrayList;

public class Main {

    static ArrayList<Node> marked = new ArrayList<Node>();
    static int maxLimbSize = 0;
    static int limbSize = 0;

    public static void main(String[] args) {
        treeHight();
    }

    public static void treeHight(){
	    Tree testTree = new Tree();
        testTree.addNode("top", null);
        testTree.addNode("second1", "top");
        testTree.addNode("th1", "second1");
        testTree.addNode("fo1", "th1");
        testTree.addNode("fi1", "fo1");
        testTree.addNode("second2", "top");
        testTree.addNode("th2", "second2");
        testTree.addNode("fo2", "th2");

        dfs(testTree, testTree.getNodes().get("top"));
        System.out.println("size = " + maxLimbSize);
    }

    public static void dfs(Tree tree, Node now){
        ++limbSize;
        if (limbSize > maxLimbSize){
            maxLimbSize = limbSize;
        }
        marked.add(now);

        for(Node tmp : now.getChildren()){
            if (!marked.contains(tmp)){
                dfs(tree, tmp);
            }
        }
        --limbSize;
    }
}
