import java.util.Arrays;

public class Average
{
    public static void main(String[] args)
    { // Average the numbers on StdIn.
//        double sum = 0.0;
//        int cnt = 0;
//        while (cnt < 10 )
//        { // Read a number and cumulate the sum.
//            sum += StdIn.readDouble();
//            cnt++;
//        }
//        double avg = sum / cnt;
//        StdOut.printf("Average is %.5f\n", avg);
        plot();
    }

    private static void plot(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.random();
        Arrays.sort(a);
        for (int i = 0; i < N; i++)
        {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}