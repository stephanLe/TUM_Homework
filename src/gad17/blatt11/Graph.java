package gad17.blatt11;

import java.util.ArrayList;
import java.util.Collection;

public class Graph {
    public ArrayList<Node> nodes;

    public class Node {
        // TODO rename after Testing!
        public int index;
        public Collection<Node> connected;
    }

    public Graph() {
        // TODO
    }

    /**
     * Erstellt einen neuen Knoten, und gibt den Index dieses Knotens zurück.
     * Der erste erstellte Knoten sollte Index 0 haben.
     * Knoten, die direkt nacheinander erstellt werden, sollten aufsteigende Indices haben.
     */
    public Integer addNode() {
        // TODO
        throw new RuntimeException("Not yet implemented.");
    }

    /**
     * Liefert den Knoten zum angegebenen Index zurück
     */
    public Node getNode(Integer id) {
        // TODO
        throw new RuntimeException("Not yet implemented.");
    }

    /**
     * Fügt zwischen den beiden angegebenen Knoten eine (ungerichtete) Kante hinzu.
     */
    public void addEdge(Node a, Node b) {
        // TODO
        throw new RuntimeException("Not yet implemented.");
    }
}
