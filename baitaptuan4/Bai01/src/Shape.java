abstract public class Shape {
    protected int x, y;
    public Shape(int _toadox, int _toadoy){
        x = _toadox;
        y = _toadoy;
    }

    public abstract void draw();
    public abstract void erase();

    public void moveTo(int newX, int newY){
        erase();
        x = newX;
        y = newY;
        draw();
    }
}
