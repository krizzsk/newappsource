package p309x4;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.p014os.LocaleList;

/* renamed from: x4.a */
public final class C7155a extends Paint {
    public C7155a() {
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public C7155a(int i) {
        super(i);
    }

    public C7155a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C7155a(PorterDuff.Mode mode, int i) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
