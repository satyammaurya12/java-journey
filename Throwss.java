
class Throwss {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("you are not eligible to vote");
        } else {
            System.out.println("you are eligible for vote");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Exception : " +e.getMessage());
        }
    }
}
