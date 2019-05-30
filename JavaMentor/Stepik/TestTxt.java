package JavaMentor.Stepik;

public class TestTxt {
    public static void main(String[] args) {
//        System.out.println("I\nam\na\nboy");
//        System.out.println("I am a boy".replaceAll("\\s+","\n"));
//        System.out.println("I am a boy".replaceAll("\\s+",System.getProperty("line.separator"))); // portable way
        String x = "Hello," + System.lineSeparator() + "there";
        String b = "Hello," + "\n" + "there";
        System.out.println(x);
        System.out.println(b);


    }
}
