package p293w1;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: w1.c */
public abstract class C6968c extends C6963a {

    /* renamed from: i */
    public int f21729i;

    /* renamed from: j */
    public int f21730j;

    /* renamed from: k */
    public LayoutInflater f21731k;

    @Deprecated
    public C6968c(Context context, int i) {
        super(context);
        this.f21730j = i;
        this.f21729i = i;
        this.f21731k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
