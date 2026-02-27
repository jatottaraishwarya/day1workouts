interface  Student{
    void display();
}
class Section implements Student{
    public void display(){
        System.out.println("hello all");
    }
}
class ForInterface{
    public static void main(String[] args){
        Section sc = new Section();
        sc.display();

    }
}