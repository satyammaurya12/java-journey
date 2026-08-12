class Student{
    private int age ;
    public void setage( int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setage(18);
        System.out.println(s.getage());

    }
}