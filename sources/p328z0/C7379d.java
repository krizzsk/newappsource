package p328z0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import p317y0.C7253d;

/* renamed from: z0.d */
public abstract class C7379d {

    /* renamed from: a */
    public int f22607a = -1;

    /* renamed from: b */
    public int f22608b = -1;

    /* renamed from: c */
    public String f22609c = null;

    /* renamed from: d */
    public HashMap<String, ConstraintAttribute> f22610d;

    /* renamed from: g */
    public static float m16992g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    /* renamed from: a */
    public abstract void mo23600a(HashMap<String, C7253d> hashMap);

    /* renamed from: b */
    public abstract C7379d clone();

    /* renamed from: c */
    public C7379d mo23602c(C7379d dVar) {
        this.f22607a = dVar.f22607a;
        this.f22608b = dVar.f22608b;
        this.f22609c = dVar.f22609c;
        this.f22610d = dVar.f22610d;
        return this;
    }

    /* renamed from: d */
    public abstract void mo23604d(HashSet<String> hashSet);

    /* renamed from: e */
    public abstract void mo23605e(Context context, AttributeSet attributeSet);

    /* renamed from: f */
    public void mo23606f(HashMap<String, Integer> hashMap) {
    }
}
