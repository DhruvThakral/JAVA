class Eaam {
    int id;
    String name;
    public Eaam(){
        id = 45;
        name = "jhiugr";
    }
    public Eaam(int d , String n){
        id = d;
        name = n;
    }
    public Eaam(int d ){
        id = d;
       
    }
}

class LPU{
    public static void main(String args[]){
        Eaam gh = new Eaam(56,"jhgeu");
        System.out.println(gh.id);
        System.out.println(gh.name);
    }
}