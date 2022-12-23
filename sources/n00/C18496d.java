package n00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: n00.d */
public class C18496d extends C18491a<View> {

    /* renamed from: b */
    public final LayoutInflater f47102b;

    /* renamed from: c */
    public final int[] f47103c;

    public C18496d(Context context, int... iArr) {
        this.f47102b = LayoutInflater.from(context);
        this.f47103c = iArr;
    }

    /* renamed from: b */
    public final View mo45295b(ViewGroup viewGroup, int i) {
        return this.f47102b.inflate(this.f47103c[i], viewGroup, false);
    }

    public int getCount() {
        return this.f47103c.length;
    }
}
