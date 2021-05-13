
enum COLOR{
    RED, BLUE, ORANGE;
}
public class Driver {


    public String printColor(){
        PrintService printService = new PrintService();
        return printService.print(COLOR.RED);
    }
    public static void main(String[] args) {

    }
}
