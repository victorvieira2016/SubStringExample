//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String letters = "fadfasdfasdgkasdnkqnjtnqewjngmxifdngnrjwnj";

        System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("Substring from index 3 up to, but not including 6 is \"%s\"%n", letters.substring(3,6));
    }
}