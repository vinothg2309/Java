package org.example.structuralDesignPattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        DrawingAdapter adapter = new DrawingAdapter();
        adapter.addShape(rectangle);
        adapter.addShape(circle);

        adapter.drawShape();
        adapter.resizeShape();

    }
}
