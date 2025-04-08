public abstract class ShapeAsClass {

    protected int width;
    protected int length;

    public void setWidth(int width){
        if(width>0) this.width= width;
    }

    public void setLength(int length){
        if(length>0) this.length= length;
    }
    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getArea(){
        return length*width;
    }
    @Override
    public abstract ShapeAsClass clone();
}
