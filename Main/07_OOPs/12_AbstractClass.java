abstract class Car{
    abstract void acceleration();


    void playMusic(){ // Concrete Methods

    }
}

class Ford extends Car{
    void acceleration(){
        System.out.println("Speeding Up");
    }
}


class LPU{
    public static void main(String args[]){
        Car obj = new Ford();
        obj.acceleration();
        obj.playMusic();
    }
}

// Abstract methods can only be defined in Abstract classes only
// Once the class is extended 
// We can not create objects of abstract classes

