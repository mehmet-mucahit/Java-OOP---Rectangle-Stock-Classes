

public class Rectangle{
    
    double width  ;
    double height  ;
    
    
    public Rectangle (){}
    
     public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    
    
    public double getArea(){
    return width*height;
    }
    public double getPerimeter(){
    return 2 * (height + width);
    }

}