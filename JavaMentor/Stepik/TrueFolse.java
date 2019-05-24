//2.1 Примитивные типы
//7 из 15 шагов пройдено

package JavaMentor.Stepik;

public class TrueFolse {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, false, false));

    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        return (a ^ b) && (c ^ d) || (a ^ d) && (b ^ c);
    }
}


//    ^ true только когда есть 1 true

//    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
//        if ((a & b & !c & !d) ^ (a & !b & c & !d) ^ (a & !b & !c & d) ^ (!a & b & c & !d) ^ (!a & b & !c & d) ^ (!a & !b & c & d)) {
//            return true;
//        }
//        return false;
//    }