//Inheritance: Creating new class from parent class and from where they derived they are called super class.

//  Single inheritance
// class Animal{
//     protected void eat(){ // proctected only allowed its child classes to access it 
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal{ // extends brings the access of Animal class for Dog class 
//     void bark(){
//         System.out.println("I can bark");
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Dog d1 = new Dog();
//         d1.eat();
//         d1.bark();
//     }
// }


// ------------------------------------------------------------
// Multilevel Inheritance
// Parent cant access their child but child has access to parent's.
// class Animal{
//     protected void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal{ 
//     void bark(){
//         System.out.println("I can bark");
//     }
// }

// class babyDog extends Dog{
//     void weep(){
//         System.out.println("I can weep");
//     } 
// }


// class LPU{
//     public static void main(String args[]){

//         babyDog b1 = new babyDog();
//         b1.bark();

//     }
// }

//---------------------------------------------------------------

// Hierarchial Inheritance
// class Animal{
//     protected void eat(){
//         System.out.println("I can eat");
//     }
// }

// class Dog extends Animal{ 
//     void bark(){
//         System.out.println("I can bark");
//     }
// }

// class Tiger extends Animal{
//     void roar(){
//         System.out.println("I can roar");
//     }
// }

// //Animal is not having the access to bark or roar but Dog and Tiger have access to Animal so it means Parent cant access their child but child has access to parent's.

// class LPU{
//     public static void main(String args[]){

//         Dog d1 =  new Dog();
//         d1.eat();

//         Tiger t1 = new Tiger();
//         t1.eat();


//     }
// }

//------------------------------------------------------------

// Multiple Inheritance
// class A{
//     void test(){
//         System.out.println("Hello");
//     }
// }

// class B{
//     void test(){
//         System.out.println("Hey");
//     }
// }

// class C extends A{

// }

// // Not supported by JAVA

// class LPU{
//     public static void main(String args[]){

//     }
// }


// There is only one class being inherited from parent class then it is called the single inheritance
// If one class is being inherited from one class which is also being inherited from another class then it is called Multi level inheritance
//For a single parent there are multiple childs , this kind of inheritance is called hierarichal inheritance
// A common being inherited from more than one parent . This is  and this is known as multiple . This is not permitable in JAVA.
