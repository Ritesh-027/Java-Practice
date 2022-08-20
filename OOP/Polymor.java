package OOP;

// Method overloading Practice - > [Known as Static Method]


public class Polymor {
    //Entry point of the java programs compiler will start to execute from here everytime.
    public static void main(String[] args){
    // Creating a objext for methodOver class.
    MethodOver disc = new MethodOver();
    disc.say(1);
    disc.say(1,2);
    disc.say(1,2,3);
    disc.say("Shefali Saying");
    disc.say("Ritesh listen to ","Shefali");
    disc.say("Shefali","To","Ritesh");
    disc.say('R');

    }
}

// Polymorphism - Method overloading. [Static - Compile time]
// Codintion - Below for satisfying the polymorphism. 
// More than 2 same method in same class with different arguments then we can say this is a methos overloading.


// Creating a class
class MethodOver{
    
//Function - Method -1
void say(int a){
    System.out.println("Hi Ritesh, you used to like shefali right!");
}
void say(int b,int c){
    System.out.println("Ritesh, Yes, how you know this? infact still i'm in love with her but she wants to keep me as friend !");
}
void say(int d,int e,int f){
    System.out.println("Shefali, Yes Exactly!");
}
void say(String s){
    System.out.println("Shefali, Although, I used to like the ritesh but he is very late to proposed me! and I have to focus on my carrier!");
}
void say(String r,String s){
    System.out.println("Ritesh, yes right, but I don't want to anything from you right now, I m ready to waiting for you lifetime!");
}
void say(String Shepu,String say,String ritesh){
    System.out.println("Shefali, Then no issue we are just friends for now, Once I get what I want in my life,we'll married!");
}
void say(char r){
    System.out.println("Ritesh, God, Thanks a lot!");
    }   
}
