// abstract class Car{

//     Car(){
//         System.out.println("Constructor of Car");
//     }

//     abstract void acceleration();

//     void playMusic(){ //concrete methods

//     }
// }

// class Ford extends Car{
//     void acceleration(){
//         System.out.println("Ford is Speeding up ");
//     }
// }

// class Tata extends Car{
//     void acceleration(){
//         System.out.println("Tata is Speeding up ");
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Car obj = new Ford(); //upcasting
//         obj.acceleration();
//         obj.playMusic();

//         Car objTata = new Tata();
//         objTata.acceleration();
//     }
// }



// -> Absttraction is a process of hiding the implementation detail and showing only functionality to the user.
 
// -> Abstract class must be declared with an abstract keyword
// -> It can have abstract and non-abstract(concrete) methods.
// -> It cannot be instantiated.
// -> If a subclass is extended from abstract class, it must define the abstract methods of the parent class
// -> abstract modifier is not applicable for variables.
// -> abstract method cannot be private
// -> abstract method cannot be static
// Abstract methods can only be defined in Abstract classes only
// Once the class is extended 
// We can not create objects of abstract classes


// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
// abstract class Animal {
//     abstract void eat();
//     abstract void sleep();
// }

// class Lion extends Animal {
//     void eat() {
//         System.out.println("Lion eats");
//     }
//     void sleep() {
//         System.out.println("Lion sleeps");
//     }
// }

// class Tiger extends Animal {
//     void eat() {
//         System.out.println("Tiger eats");
//     }
//     void sleep() {
//         System.out.println("Tiger sleeps");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("Deer eats");
//     }
//      void sleep() {
//         System.out.println("Deer sleeps");
//     }
// }

// class LPU {
//     public static void main(String[] args) {
//         Lion l = new Lion();
//         l.eat();
//         l.sleep();

//         Tiger t = new Tiger();
//         t.eat();
//         t.sleep();

//         Deer d = new Deer();
//         d.eat();
//         d.sleep();
//     }
// }


abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void draw() {
        System.out.println("Drawing Circle");        
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }
    void draw() {
        System.out.println("Drawing Square");
    }
    double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    void draw() {
        System.out.println("Drawing Triangle");   
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class LPU {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(5);
        Triangle triangle = new Triangle(1, 2);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
