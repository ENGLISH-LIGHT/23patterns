package decorator;

public class greenShapeDecorator extends shapeDecorator {
    public greenShapeDecorator(shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.printf("Using green : ");
        decoratedShape.draw();
    }
}
