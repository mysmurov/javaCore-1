package JavaMentor.Stepik.Task_531_3;

public class AsciiCharSequence_532 {

    public static void main(String[] args) {

    }

    public class AsciiCharSequence implements CharSequence {
        private byte[] mass;

        public AsciiCharSequence(byte[] mass) {
            this.mass = mass;
        }

        @Override
        public int length() {
            return mass.length;
        }

        @Override
        public char charAt(int index) {
            return (char) (mass[index] & 0xff);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            int length = end - start;
            byte[] byt = new byte[length];
            for (int i = 0, a = start; i < length; i++, a++) {
                byt[i] = mass[a];
            }
            return new AsciiCharSequence(byt);
        }

        @Override
        public String toString() {
            return new String(mass);
        }
    }

}
