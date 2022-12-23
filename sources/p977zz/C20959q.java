package p977zz;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* renamed from: zz.q */
public final class C20959q implements InputFilter {

    /* renamed from: b */
    public static final Pattern f52707b = Pattern.compile("\\d+(\\.(\\d{0,2}))?");

    /* renamed from: a */
    public final StringBuilder f52708a = new StringBuilder();

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        this.f52708a.setLength(0);
        if (spanned != null) {
            this.f52708a.append(spanned);
        }
        if (charSequence != null) {
            this.f52708a.replace(i3, i4, charSequence.toString());
        }
        if (f52707b.matcher(this.f52708a).matches()) {
            return null;
        }
        return "";
    }
}
