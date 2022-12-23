package j00;

import android.util.Property;
import android.widget.TextView;

/* renamed from: j00.j */
public final class C17703j extends Property<TextView, Integer> {

    /* renamed from: a */
    public final String f45448a;

    public C17703j(String str) {
        super(Integer.class, "textSubstring");
        this.f45448a = str;
    }

    public final Object get(Object obj) {
        int i;
        CharSequence text = ((TextView) obj).getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public final void set(Object obj, Object obj2) {
        ((TextView) obj).setText(this.f45448a.subSequence(0, Math.min(((Integer) obj2).intValue(), this.f45448a.length())));
    }
}
