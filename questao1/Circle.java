package marcelle;

public class Circle extends Shape{
    
    protected double radius;
    
    public Circle(){
    }
    
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    
}
