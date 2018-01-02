package decorator;

public class redShapeDecorator extends shapeDecorator {
    @Override
    public void draw() {
        System.out.printf("using red : ");
        decoratedShape.draw();
    }
    public redShapeDecorator(shape decoratedShape){
        super(decoratedShape);
    }
}
