class MOverLoading{
    public static void main(String[] args){
        //Object created.
        Poly see = new Poly();
        see.show("Shefali");
    }
}

// Note - > Object is parent class of all the classes.

class Poly{
    //Checikng methods.
    void show(){
        System.out.println("Hi, Shefali is there!");
    }
    void show(Object a){
        System.out.println("Hi, Ritesh is there!");
    }
}