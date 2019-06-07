package JavaMentor.Stepik.ComplexNumber;

import java.util.Objects;

public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

    @Override
    public int hashCode() {
            final double prime = 31;
            double result = 1;
            result = prime * result + re;
            result = prime * result + im;

        return (int) result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        if (re != other.re)
            return false;
        if (im != other.im)
            return false;
        return true;
    }
}

