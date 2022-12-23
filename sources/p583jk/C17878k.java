package p583jk;

import com.masabi.justride.sdk.exception.helpers.LuhnAlgorithmException;

/* renamed from: jk.k */
public final class C17878k {
    /* renamed from: a */
    public static boolean m44326a(String str) throws LuhnAlgorithmException {
        int i = 0;
        boolean z = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            int numericValue = Character.getNumericValue(str.charAt(length));
            if (numericValue < 0 || numericValue > 9) {
                throw new LuhnAlgorithmException(C16759e.m42349e("Encountered unexpected digit: ", numericValue));
            }
            if (z && (numericValue = numericValue * 2) > 9) {
                numericValue = (numericValue % 10) + 1;
            }
            i += numericValue;
            z = !z;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }
}
