class Oshwal
{
    String name;
    int age;

    void display(String name){
        System.out.println("Student name is: " +name);
}
}
class yeargroup5 extends Oshwal
{
void show(int age){
    System.out.println("Student age is: "+age);
}
}
class program{
    public static void main(String[] args) {
        yeargroup5 i=new yeargroup5();
        i.show(10);
        i.display("Pradyun");
    }
}