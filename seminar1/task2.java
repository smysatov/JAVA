package seminar1;

public class task2 {
    /**
     * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа,
     * равные заданному, нужно перенести эти элементы в конец массива. Таким
     * образом, первые несколько (или все) элементов массива должны быть отличны
     * от заданного, а остальные - равны ему.
     */
    public static void main(String[] args) {
        int[] array = { 3, 2, 2, 3, 1, 5, 5, 3, 3 };
        int val = 2;
        for (int x : array) {
            System.out.print(x);}
        System.out.println();
        swap(array, val);
        for (int x : array) {
            System.out.print(x);
        }
    }

    static void swap(int[] array, int val) {
        int size = array.length;
        int shift = 1;
        for (int i = 0; i < size - shift; i++) {
            while (array[size-shift] == val){
                shift++;
            }
            if (array[i] == val) {
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }

        }
    }

}
