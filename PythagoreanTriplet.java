import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet
       {
       private final int a;
       private final int b;
       private final int c;

      PythagoreanTriplet(  int a,int b,int c)
            {
                this.a=a;
                this.b=b;
                this.c=c;
            }
        public static PythagoreanTripletFinder makeTripletsList() {
        return new PythagoreanTripletFinder();
        }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
        }
        public static class PythagoreanTripletFinder
            {
        int N;
        public PythagoreanTripletFinder withFactorsLessThanOrEqualTo(int input) {
            N=input;
            return this;
        }
        public PythagoreanTripletFinder thatSumTo(int input) {
            return this;
        }
        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> Triplets = new
            ArrayList<PythagoreanTriplet>();
            for (int a = 1; a <= N/2; a++) {
                for (int b = a; b <= N/2; b++) {
                    int c = N - (a + b);
                    if (a * a + b * b == c * c ) {
                        if (a + b + c == N) {
                            PythagoreanTriplet pythagoreanTriplet = new
            PythagoreanTriplet(a, b, c);
                            Triplets.add(pythagoreanTriplet);
                        }
                    }
                }
            }
            return Triplets;
        }
    }
}
