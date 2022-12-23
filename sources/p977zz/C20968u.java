package p977zz;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* renamed from: zz.u */
public final class C20968u implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = null;
        if (i2 - i != 1) {
            int i5 = 0;
            while (i < i2) {
                if (!Character.isDigit(charSequence.charAt(i))) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                    int i6 = i - i5;
                    spannableStringBuilder.delete(i6, i6 + 1);
                    i5++;
                }
                i++;
            }
            return spannableStringBuilder;
        } else if (!Character.isDigit(charSequence.charAt(i))) {
            return "";
        } else {
            return null;
        }
    }
}
