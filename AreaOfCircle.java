public class AreaOfCircle {
    void area(int r,float p){
        float a=p*r*r;
        System.out.println("Area of circle is :"+a);
    }
    public static  void main (String[]args){
        AreaOfCircle obj1=new AreaOfCircle();
        obj1.area(10,3.14f);


    }

}
