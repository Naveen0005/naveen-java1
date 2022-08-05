package com.abstracte.demo;

public class test{

	public static void main(String[] args) {
		Shape s1 =new Circle (5.5,"RED",false); //upcast circle to shape
		
        System.out.println(s1); // circle [radius=5.5]
        System.out.println(s1.getPerimeter());  //34.55751
        System.out.println(s1.getArea());  //95.033317777109
        System.out.println(s1.getColour()); //RED
        System.out.println(s1.isFilled());  //false
        /*System.out.println(s1.getradius()); //the method getradius() is undefined*/
	
	    
	  
       Circle c1=(Circle)s1;   //downcast back to circle
       System.out.println(c1.getArea());  //95.0331777109
       System.out.println(c1.getPerimeter()); //34.55751
       System.out.println(c1.getColour()); //RED
       System.out.println(c1.isFilled());  //false
       System.out.println(c1.getRadius());// 5.5
       
       
       
       /*Shape s2 = new Shape(); // cannot instantiate shape*/
       
       Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   
       System.out.println(s3); //Rectangle [Width=1.0,Length=2.0]
       System.out.println(s3.getArea()); //0.0
       System.out.println(s3.getPerimeter()); //0.0
       System.out.println(s3.getColour()); //RED
       /*System.out.println(s3.getLength()); //the method getlength() is undefined*/
          

       Rectangle r1 = (Rectangle)s3;   // downcast
       System.out.println(r1); // Rectangle[Width=1.0,Length=2.0
       System.out.println(r1.getArea()); //0.0
       System.out.println(r1.getColour()); //RED
       System.out.println(r1.getLength()); //2.0
       
       
       Shape s4 = new Square(6.6);     // Upcast
       System.out.println(s4);  // square [side=6.6]
       System.out.println(s4.getArea()); //43.559999999999
       System.out.println(s4.getColour()); //NULL
       /*System.out.println(s4.getSide()); //the method getside() is undefined*/
       
       Rectangle r2 = (Rectangle)s4;
       System.out.println(r2); //sqaure [side=6.6] 
       System.out.println(r2.getArea()); // 43.55999999999
       System.out.println(r2.getColour()); //NULL
       /*System.out.println(r2.getSide()); // the method getside() is undefined*/
       System.out.println(r2.getLength()); //0.0
       
       
       Square sq1 = (Square)r2;
       System.out.println(sq1);//square[side=6.6]
       System.out.println(sq1.getArea());//43.55999
       System.out.println(sq1.getColour());
       System.out.println(sq1.getSide());
       System.out.println(sq1.getLength());


       
       
       
          

       
       
       
         

          

      
	}}
	
       
	      

