package ClassCircle;

public class Cylinder extends Circle {
    private double height = 25;
    public  Cylinder(){

    }
    public Cylinder(double height){
     this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumn(){
         return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cynlinder[" + super.toString()+ ", volume = " +getVolumn() + "]";
    }
}
