package algorithms.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 166. Fraction to Recurring Decimal
 */
public class FractionToRecurringDecimal {

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder res = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) res.append("-");
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        long q = n / d;
        long r = n % d;
        res.append(q);
        if (r == 0) return res.toString();
        else {
            res.append(".");
            Map<Long, Integer> map = new HashMap<>();
            while (r != 0) {
                if (map.containsKey(r)) {
                    int len = map.get(r);
                    res.insert(len, "(");
                    res.append(")");
                    break;
                } else {
                    map.put(r, res.length());
                    r = r * 10;
                    q = r / d;
                    r = r % d;
                    res.append(q);
                }
            }
        }

        return res.toString();
    }
}
