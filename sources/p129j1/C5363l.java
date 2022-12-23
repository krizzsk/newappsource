package p129j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import p116i1.C5240d;
import p190o1.C5920m;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j1.l */
public class C5363l {

    /* renamed from: j1.l$a */
    public interface C5364a<T> {
        /* renamed from: a */
        boolean mo21144a(T t);

        /* renamed from: b */
        int mo21145b(T t);
    }

    public C5363l() {
        new ConcurrentHashMap();
    }

    /* renamed from: e */
    public static <T> T m13459e(T[] tArr, int i, C5364a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.mo21145b(t2) - i2) * 2;
            if (aVar.mo21144a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo21135a(Context context, C5240d.C5243c cVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo21136b(Context context, C5920m[] mVarArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo21142c(Context context, InputStream inputStream) {
        File d = C5365m.m13470d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!C5365m.m13469c(d, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo21137d(Context context, Resources resources, int i, String str, int i2) {
        File d = C5365m.m13470d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!C5365m.m13468b(d, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* renamed from: f */
    public C5920m mo21143f(int i, C5920m[] mVarArr) {
        return (C5920m) m13459e(mVarArr, i, new C5362k());
    }
}
