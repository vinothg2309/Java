package org.example.structuralDesignPattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class DrawingAdapter {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public List<Shape> getShapes(){
        return shapes;
    }

    public void drawShape(){
        if(shapes.isEmpty()){
            System.out.println("No Shape to draw");
        }else{
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resizeShape(){
        if(shapes.isEmpty()){
            System.out.println("No Shape to resize");
        }else{
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}
