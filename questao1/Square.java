package marcelle;
public class Square extends Rectangle{
    
    protected double side;
    
    public Square(){
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    
    @Override
    public void setLength(double side){
        this.length = side;
    }
    
}
