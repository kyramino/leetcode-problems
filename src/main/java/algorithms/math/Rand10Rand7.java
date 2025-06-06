package algorithms.math;

interface SolBase {
    int rand7();
}

/**
 * 470. Implement Rand10() Using Rand7()
 */
public class Rand10Rand7 implements SolBase {

    public int rand10() {
        int row, col, idx;
        do {
            row = rand7();
            col = rand7();
            idx = col + (row - 1) * 7;
        } while (idx > 40);
        return 1 + (idx - 1) % 10;
    }

    @Override
    public int rand7() {
        return 0;
    }
}
