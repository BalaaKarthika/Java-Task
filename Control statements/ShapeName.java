public class ShapeName{
    public static void main(String[] args) {
        int shapeNumber = 3;
        String shapeName;
        switch (shapeNumber) {
            case 1:
                shapeName = "Circle";
                break;
            case 2:
                shapeName = "Square";
                break;
            case 3:
                shapeName = "Triangle";
                break;
            default:
                shapeName = "Unknown";
                break;
        }

        System.out.println("The shape with number " + shapeNumber + " is a " + shapeName + ".");
    }
}
