package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
        Graph theGraph = new Graph(10);
        // 0 A
        // 1 B
        // 2 C
        // 3 D
        // 4 E
        // 5 F
        // 6 G
        // 7 H
        // 8 I
        // 9 J

        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(0, 4); // AE
        theGraph.addEdge(0, 5); // AF
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 8); // CI
        theGraph.addEdge(2, 9); // CJ
        theGraph.addEdge(2, 6); // CG
        theGraph.addEdge(3, 2); // DC
        theGraph.addEdge(4, 3); // ED
        theGraph.addEdge(5, 7); // FH
        theGraph.addEdge(5, 6); // FG
        theGraph.addEdge(5, 2); // FC

        BreadthFirstPaths bfp = new BreadthFirstPaths(theGraph, 0);
        System.out.println(bfp.hasPathTo(3));
        System.out.println(bfp.pathTo(3));
    }
}
