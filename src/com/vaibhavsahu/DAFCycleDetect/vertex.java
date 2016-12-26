package com.vaibhavsahu.DAFCycleDetect;

import java.util.ArrayList;

/**
 * Created by vaibhavsahu on 12/25/16.
 */
public class vertex {
    private String data;
    private boolean visited;
    private boolean beingVisited;
    private vertex predecessor;
    private ArrayList<vertex> neighborList;


    public vertex(String x){
        this.data = x;
        this.neighborList = new ArrayList<>();
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public void addNeighbor(vertex v){
        this.neighborList.add(v);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<vertex> getNeighborList() {
        return neighborList;
    }

//    public void setNeighborList(ArrayList<vertex> neighborList) {
//        this.neighborList = neighborList;
//    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(vertex predecessor) {
        this.predecessor = predecessor;
    }
}
