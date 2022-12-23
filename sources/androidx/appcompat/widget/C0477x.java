package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.x */
public final class C0477x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextView f1654b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f1655c;

    /* renamed from: d */
    public final /* synthetic */ int f1656d;

    public C0477x(TextView textView, Typeface typeface, int i) {
        this.f1654b = textView;
        this.f1655c = typeface;
        this.f1656d = i;
    }

    public final void run() {
        this.f1654b.setTypeface(this.f1655c, this.f1656d);
    }
}
