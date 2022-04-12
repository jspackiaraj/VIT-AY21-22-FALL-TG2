public class Joinery {
    double width, height;
    String joineryType, joineryMaterial;
    // PUTTER METHOD (Constructors)
    public Joinery(double newWidth, double newHeight, String newJoineryType, String newJoineryMaterial) {
        width = newWidth;
        height = newHeight;
        joineryType = newJoineryType;
        joineryMaterial = newJoineryMaterial;
    }
    public Joinery() {
            width = 0;
            height = 0;
            joineryType = "DOOR";
            joineryMaterial = "PROCESSED WOOD";
    }
    // GETTER METHOD (Observer Methods)

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getJoineryMaterial() {
        return joineryMaterial;
    }

    public String getJoineryType() {
        return joineryType;
    }

    public double joineryArea() {
        return width * height;
    }
}
