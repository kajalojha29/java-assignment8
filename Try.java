//Q1
//Polymorphism = Polymorphism is the ability of an object to take  on  many forms . In polymorphisam refers to the ability of a class to
 //provide different implimentation of a method , depending on the type of object that is passed to the method. in simple words a task that 
 //perform a single action i differet ways.
 //Polumorphism occur when there is inheritance . Inheritence is a powerful feature of java . Inheritence lets one class aquire the attributes
 //of another class.Polumorphism allow us to use these inherited properties to perform different task .
 //Types of polymorphisam:
 //1) = Method Overloading 
 //2)= Method overriding
 //Method Overloadin: It is the process that can create multiple method of the csame name in the same class and all the method work in a different ways.
 //Method overloading occur when there is more than one class of the same name .
 
 //Method Overriding: It is the process when tha subclass or a child class has the same method as declare in the parent class.
 
 //Program for Polumorphism	: 
 //class Shapes{
 //public void area(){
 //System.out.println(" the formula of area of");
 
 //}
 
 //}
 //class Triangle extends Shapes{
	// public void area(){
		// System.out.println("Triangle is 1/2*base*height");
	 //}
 //}
  //class Circle extends Shapes{
  //public void area(){
  //System.out.println("Circle is 3.14*radius*radius*");
  
//  }
  
  //}
  //class Main{
  //public static void main(String[] args){
  // Shapes myShape = new Shapes();
   //Shapes myTriangle = new Triangle();
   //Shapes myCircle = new Circle();
   //myShape.area();
   //myTriangle.area();
   //myShape.area();
   //myCircle.area();
  //}
  
  
  //}
  
  
//Q1 
//Encapsulation = Encapsulation is one of the key features of OOPS . Encapsulation refers to the building of field and method inside a single class.
              //  It prevent outer classes from accessing and changing fields and method of class . thos also help to achieve hiding. when we wand to 
               // hide some codes than we use encapsulation.

//class Area{
	
//	int length;
	//int breadth;
	 //Area( int length , int breadth){
		// this.length = length;
		 //this.breadth = breadth;
	 //}
	 //public void getArea(){
		// int area = length*breadth;
		 //System.out.println("Area : "+area);
		 
	 //}
//} 
//class Encap{
	//public static void main(String[] args){
		//Area rectangle = new Area(7,8);
		//rectangle.getArea();
	//}
	
	//}     
          
 //Q3
// Access Specifiers = In java there is four types of access specifiers 
    //these specifiers are public,protected,private , default . 
 //default specifiers have not any keyword associated with it .when class does not have any specifiers we assume it is having default 
 //specifiers.
 //public specifiers allow us to access only to access everything insidr or outside the class or package .
 //protected specifiers allow us to access only to subclass inheriting the class in which protected members are declare . 
 //private specifiers allows the least accessbility with the private data members to be access only within the class.
 
 //Define package = package is collection of similar type of  classes , interface and sub packages .
 //there are two types of package :
 //built in pacakge = eg swings, scanner .
 //user definid package = In which user buid the package according to their knowledge.

 
 //Define final keyword = final keyword means if we write final in front of any variable when we declare it then we can change the value of
// the variable thorough pout the class . It is a non acces modifier .  eg If we make the program of the security purpose then we will use final in front of the
//password so that nobody can accesss that   password , only the known person can access it.
 
 
//Q5
//class Try{
	//public static void main(String args[]){

//int n =5 ;
//for(int i = 1; i<=n ;i++){
	
	//for(int j = i  ; j<=n ; j++){
		//System.out.print(" ");
	//}
	//for(int j = 1 ; j<=i ; j++){
		//System.out.print("1");
	//}
	//System.out.println();
//}
	//}
//}

//Q4 
 //class Rectangle{
//	 public static void main (String args[]){
	//	 Static length ;
		// Static breadth;
		 //void area(){
			// area;
	 //}
 //}		  
		  