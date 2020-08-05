package ThirdYear;

abstract class Book{
    public String title(){
        String title = "Mystery at Camp Lake";
        return (title);
    }

    public abstract String author();
}

class Author1 extends Book{
    public String author(){
        return("Adnan");
    }
    public void show(){
        System.out.println("in show");
    }
}

class Author2 extends Book{
    public String author(){
        return("Zaid");
    }
    public void show(){
        System.out.println("in show");
    }
}

public class AbstractClass
{
    public static void main(String args[])
    {
        Book obj = new Author2();
        System.out.println(obj.author());
    }

}
