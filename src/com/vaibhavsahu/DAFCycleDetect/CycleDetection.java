package com.vaibhavsahu.DAFCycleDetect;

import java.util.List;
import java.util.Stack;

/**
 * Created by vaibhavsahu on 12/26/16.
 */
public class CycleDetection {

    Stack<vertex> stack;

    public CycleDetection(){
        this.stack = new Stack<>();
    }

    public void doCycleDetection(List<vertex> vertices){
        for (vertex v : vertices){
            if(!v.isVisited()){
                doDFS(v);
            }
        }

    }


    public void doDFS(vertex vertex){
        vertex.setVisited(false);
        vertex.setBeingVisited(true);

        for (vertex v: vertex.getNeighborList()){
            if(!v.isVisited()){
                v.setVisited(true);

            }
        }
    }
}
