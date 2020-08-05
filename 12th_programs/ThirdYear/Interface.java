package ThirdYear;


interface Book{
    public String title();
    public String author();
}

class Author1 implements Book{
    public String title(){
        return("Percy Jackson");
    }
    public String author(){
        return("Adnan");
    }
    public void show(){
        System.out.println("in show");
    }
}

class Author2 implements Book{
    public String title(){
        return("Don Quixote");
    }
    public String author(){
        return("Zaid");
    }
    public void show(){
        System.out.println("in show");
    }
}

public class Interface
{
    public static void main(String args[])
    {
        Book obj = new Author2();
        System.out.println(obj.title());
        System.out.println(obj.author());
    }

}