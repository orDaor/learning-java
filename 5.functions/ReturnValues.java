public class ReturnValues {
    public static void main(String[] args) {
        //rectangle area
        double area = calcRectangleArea(-3, 3.1);
        System.out.println("Area: " + area);

        //area explanation in the selected language
        String explanation = explainArea("Italian");
        System.out.println(explanation);
    }

    public static double calcRectangleArea(double base, double height) {
        //input validation
        if (base < 0 || height < 0) {
            System.out.println("Invalid dimensions!");

            //Terminate the runtime (terminate execution of the java application)
            System.exit(0);
        }

        //calc and return the area
        double area = base * height;
        return area;
    }

    public static String explainArea(String language) {
        String explanation = "";

        if (language.equals("English")) {
            explanation = "Area equals length * width";
        } else if (language.equals("French")) {
            explanation = "La surface est egale a la longueur * la largeur";
        } else if (language.equals("Spanish")) {
            explanation = "Area es igual a largo * ancho";
        } else {
            explanation = "Please slect a supported language";
        }

        return explanation;
    }

}