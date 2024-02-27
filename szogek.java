import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class szogek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy szöget!");
        int szog = scanner.nextInt();

        
        if (szog < 0) {
            szog += 360; 
        }

        switch (szog) {
            case 0:
                System.out.println("Null szög.");
                break;
            case 90:
                System.out.println("Derékszög.");
                break;
            case 180:
                System.out.println("Egyenes szög.");
                break;
            case 360:
                System.out.println("Teljes szög.");
                break;
                default:
                szog = szog % 360;
                if (szog < 90 && szog > 0) {
                    System.out.println("Hegyes szög.");
                } else if (szog < 180 && szog > 90) {
                    System.out.println("Tompa szög.");
                } else if (szog < 360 && szog > 180) {
                    System.out.println("Homorú szög.");
                } else {
                    System.out.println("Teljes szög.");
                }
                break;
            }
            
        }
}
