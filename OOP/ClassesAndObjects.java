package OOP;

class ClassesAndObject{
    public static void main(String args[]){

        Pen pen1 = new Pen();
        pen1.write();

    }
}

// Creating a class
class Pen{

    //Creating attring of Pen Class.
    String type;
    String color;

    //Creating a method means objects behaviour.
        public void write(){
                System.out.println("Writing the pen!");
        }
    }

