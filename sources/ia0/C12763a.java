package ia0;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ia0.a */
public final class C12763a<T> implements C12769g {

    /* renamed from: a */
    public LinkedList f31532a;

    /* renamed from: b */
    public LayoutInflater f31533b;

    /* renamed from: c */
    public List<T> f31534c;

    public C12763a(Context context, ArrayList arrayList) {
        this.f31533b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f31534c = arrayList;
    }

    /* renamed from: a */
    public final int mo39614a() {
        return this.f31534c.size();
    }
}
