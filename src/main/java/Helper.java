public class Helper {

    private static Helper helperClass;

    private Helper() {
    }


    public static void setUpDriver() {
        if (helperClass==null) {
            helperClass = new Helper();
        }
    }

    public static void tearDown() {
        helperClass = null;
    }

}
