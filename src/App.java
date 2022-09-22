public class App {
    public static void main(String[] args) {
        int n_iters = Integer.parseInt(args[0]);
        long tInit = System.currentTimeMillis();
        int c = 0;

        for (int i = 0; i < n_iters; ++i) {
            for (int j = 0; j < n_iters; ++j) {
                for (int k = 0; k < n_iters; ++k) {
                    if (i * i + j * j == k * k) {
                        ++c;
                    }
                }
            }
        }
        System.out.println(c);
        System.out.println((System.currentTimeMillis() - tInit) / 1000.0);
    }
}