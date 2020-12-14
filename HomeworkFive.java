package ru.geekbrains.java.javaone.homework;

public class HomeworkFive {
    private static final int ARRAY_SIZE = 100;
    private static final int HALF_ARRAY_SIZE = ARRAY_SIZE / 2;


    public static void main(String[] args) {
        HomeworkFive result = new HomeworkFive();
        result.runThread();
        result.runBothThreads();
        System.out.println();
    }

    public float[] calc(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return array;
    }

    public void runThread() {
        float[] array = new float[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;
        }
            long a = System.currentTimeMillis();
            calc(array);
            System.out.println("One thread is completed for: " + (System.currentTimeMillis() - a));

        }


    public void runBothThreads() {
        float[] array = new float[ARRAY_SIZE];
        final float[] array1 = new float[HALF_ARRAY_SIZE];
        final float[] array2 = new float[HALF_ARRAY_SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, array1, 0, HALF_ARRAY_SIZE);
        System.arraycopy(array, HALF_ARRAY_SIZE, array2, 0, HALF_ARRAY_SIZE);

        new Thread() {
            public void run() {
                float[] b = calc(array1);
                System.arraycopy(b, 0, array1, 0, array1.length);
            }
        }
        .start();

        new Thread() {
            public void run() {
                float[] c = calc(array2);
                System.arraycopy(c, 0, array2, 0, array2.length);
            }
        }.start();

        System.arraycopy(array1, 0, array, 0, HALF_ARRAY_SIZE);
        System.arraycopy(array2, 0, array, HALF_ARRAY_SIZE, HALF_ARRAY_SIZE);
        System.out.println("Both threads are completed for: " + (System.currentTimeMillis() - a));
    }
}
