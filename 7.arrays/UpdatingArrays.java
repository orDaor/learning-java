import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        //define array that can contains 3 predefined values
        String[] menu = {"Espresso", "Iced Coffe", "Macchiato"};
        System.out.println(Arrays.toString(menu));

        //update 3rd element
        menu[2] = "Turkish";
        System.out.println(Arrays.toString(menu));

        //define a new array the CAN contain 5 values
        //NOTE: elements are initialized with null values
        String[] newMenu = new String[5];
        System.out.println(Arrays.toString(newMenu));

        //copy elements of the first array into the new one
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }   
        System.out.println(Arrays.toString(newMenu));

        //update last 2 new menu values
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
    }
}
