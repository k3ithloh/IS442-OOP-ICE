public class WebColor {
    int red;
    int green;
    int blue;

    public WebColor(int red, int green, int blue) {
        if (!isValidColorValue(red) || !isValidColorValue(green) || !isValidColorValue(blue)) {
            throw new IllegalArgumentException("invalid int value");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public WebColor(String hexString) {
        if (hexString == null || hexString.length() != 7 || hexString.charAt(0) != '#') {
            throw new IllegalArgumentException("invalid hexstring");
        }

        String colorString = hexString.substring(1).toUpperCase();

        String validChars = "0123456789ABCDEF";
        for (int i = 0; i < colorString.length(); i++) {
            if (!validChars.contains(String.valueOf(colorString.charAt(i)))) {
                throw new IllegalArgumentException("invalid hexstring");
            }
        }

        this.red = Integer.parseInt(hexString.substring(1, 3), 16);
        this.green = Integer.parseInt(hexString.substring(3, 5), 16);
        this.blue = Integer.parseInt(hexString.substring(5, 7), 16);
    }

    private boolean isValidColorValue(int value) {
        return value >= 0 && value <= 255;
    }

    public WebColor add(WebColor another) {
        int newRed = (this.red * another.red) / 255;
        int newGreen = (this.green * another.green) / 255;
        int newBlue = (this.blue * another.blue) / 255;

        WebColor newWebColor = new WebColor(newRed, newGreen, newBlue);

        return newWebColor;
    }

    public String toHexString() {
        return "#" + toPaddedHex(red) + toPaddedHex(green) + toPaddedHex(blue);

    }

    private String toPaddedHex(int value) {
        String hex = Integer.toHexString(value);
        if (hex.length() < 2) {
            hex = "0" + hex;
        }
        return hex.toUpperCase();
    }

    @Override
    public String toString() {
        return red + ":" + green + ":" + blue;
    }
}
