class productarray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int product = 1;
        int i=0;

        while(i<a.length) {
            product = product * a[i];
            i++;
        }

        System.out.println(product);
    }
}
