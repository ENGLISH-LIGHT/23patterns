package decorator;

public abstract class shapeDecorator implements shape {
    protected shape decoratedShape = null;
    public shapeDecorator(shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
