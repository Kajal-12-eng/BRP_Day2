public class MethodError {
        public static void main(String[] args) {
            ProduceError p1 = new ProduceError();
            p1.add(10, 12);

        }
    }
    class ProduceError {
        int z=0;
        public void add(int x, int y) {
            z = x+y;
            show(z);
        }
        public void show(int z) {
            System.out.println("Output::"+z);
        }
}
