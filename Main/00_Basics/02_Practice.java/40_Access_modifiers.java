class Empl{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}

class LPU{
    public static void main(String args[]){
        Empl fg = new Empl();
        fg.setId(23);
        fg.setName("hagf");

        System.out.println(fg.getId());
        System.out.println(fg.getName());
    }
}