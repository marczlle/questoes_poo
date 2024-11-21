package marcelle;

public class Rectangle extends Shape{
    
    protected double width;
    protected double length;
    
    public Rectangle(){
    }
    
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return width*length;
    }
    
    @Override
    public double getPerimeter(){
        return 2*length + 2*width;
    }
}

