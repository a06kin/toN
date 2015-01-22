package lv.aaa;

import lv.aaa.tree.Node;
import lv.aaa.tree.Tree;

import java.util.ArrayList;

public class Main {

    static ArrayList<Node> marked = new ArrayList<Node>();
    static int maxLimbSize = 0;
    static int limbSize = 0;

    public static void main(String[] args) {
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
