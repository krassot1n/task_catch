
public class Main {
    public static void main(String[] args) {

        try{
            int[] task = new int[2];
            task[0] = 0;
            task[1] = 2;
            task[2] = 3;
            System.out.println(task);
        }
        catch (NullPointerException | IndexOutOfBoundsException exception)
        {
            System.out.println("Словили одно из исключений");
        }

    }
}