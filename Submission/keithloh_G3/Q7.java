public class Q7 {
    public static void main(String[] args) {

        String[] days = {
                "first", "second", "third", "fourth",
                "fifth", "sixth", "seventh", "eighth",
                "ninth", "tenth", "eleventh", "twelfth"
        };

        String day = days[0];
        switch (day) {
            case "first":
                System.out.println("On the first day of Christmas, my true love sent to me\n" +
                        "A partridge in a pear tree.");
            case "second":
                System.out.println("On the second day of Christmas, my true love sent to me\n" +
                        "" +
                        "Two turtle doves\n" +
                        "and a partridge in a pear tree.");
            case "third":
                System.out.println("On the third day of Christmas, my true love sent to me\n" +
                        "Three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "fourth":
                System.out.println("On the fourth day of Christmas, my true love sent to me\n"
                        + "Four calling birds, three French hens, two turtle doves\n"
                        + "And a partridge in a pear tree.");
            case "fifth":
                System.out.println("On the fifth day of Christmas, my true love sent to me\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "sixth":
                System.out.println("On the sixth day of Christmas, my true love gave to me\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "seventh":
                System.out.println("On the seventh day of Christmas, my true love gave to me\n" +
                        "Seven swans a-swimming, six geese a-laying,\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "eighth":
                System.out.println("On the eighth day of Christmas, my true love gave to me\n" +
                        "Eight maids a-milking, seven swans a-swimming, six geese a-laying,\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "ninth":
                System.out.println("On the ninth day of Christmas, my true love gave to me\n" +
                        "Nine ladies dancing, eight maids a-milking, seven swans a-swimming, six geese a-laying,\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "tenth":
                System.out.println("On the tenth day of Christmas, my true love gave to me\n" +
                        "Ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swi'mmi'ng, six geese a-laying,\n"
                        +
                        "Five golden rings.\n" +
                        "Fou'r calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            case "eleventh":
                System.out.println("On the eleventh day of Christmas, my true love gave to me\n" +
                        "Eleven pipers piping, ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swimming,\n"
                        + "Six geese a-laying,\n" +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves And a partridge in a pear tree.");
            case "twelfth":
                System.out.println("On the twelfth day of Christmas, my true love gave to me\n" +
                        "Twelve drummers drumming, eleven pipers piping, ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swimming, six geese a-laying,\n"
                        +
                        "Five golden rings.\n" +
                        "Four calling birds, three French hens, two turtle doves\n" +
                        "And a partridge in a pear tree.");
            default:
                break;
        }
    }
}
