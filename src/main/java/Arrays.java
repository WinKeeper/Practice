import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        String[][] arr2d = new String[3][3];
        arr2d[0][0] = "Omg";
        arr2d[0][1] = "Omg";
        arr2d[0][2] = "Omg";
        arr2d[1][0] = "Omg";
        arr2d[1][1] = "Omg";
        arr2d[1][2] = "Omg";

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println("");
        }

        String[][] arr2d2 = {
                {"a", "b" ,"c"},
                {"d", "f", "j"},
                {"g", "h", "r"}
        };

        for (int i = 0; i < arr2d2.length; i++) {
            for (int j = 0; j < arr2d2[i].length; j++) {
                System.out.print(arr2d2[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
