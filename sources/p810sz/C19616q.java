package p810sz;

import android.util.SparseArray;
import com.appboy.support.ValidationUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: sz.q */
public abstract class C19616q {
    /* renamed from: a */
    public abstract OutputStream mo51933a();

    /* renamed from: b */
    public void mo51934b(boolean z) throws IOException {
        mo51935c(z ? 1 : 0);
    }

    /* renamed from: c */
    public abstract void mo51935c(int i) throws IOException;

    /* renamed from: d */
    public void mo51950d(int i, byte[] bArr) throws IOException {
        if (bArr == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(i);
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            mo51935c(bArr[i3]);
        }
    }

    /* renamed from: e */
    public void mo51951e(byte[] bArr) throws IOException {
        mo51950d(bArr != null ? bArr.length : -1, bArr);
    }

    /* renamed from: f */
    public void mo51936f(char c) throws IOException {
        mo51941r(c);
    }

    /* renamed from: g */
    public final <T> void mo51964g(Collection<? extends T> collection, C19600l<T> lVar) throws IOException {
        if (collection == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(collection.size());
        for (Object q : collection) {
            mo51967q(q, lVar);
        }
    }

    /* renamed from: h */
    public final <T> void mo51965h(Collection<? extends T> collection, C19600l<T> lVar) throws IOException {
        if (collection == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(collection.size());
        for (Object write : collection) {
            lVar.write(write, this);
        }
    }

    /* renamed from: i */
    public abstract void mo51937i(double d) throws IOException;

    /* renamed from: j */
    public abstract void mo51938j(float f) throws IOException;

    /* renamed from: k */
    public void mo51952k(float[] fArr) throws IOException {
        if (fArr == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(fArr.length);
        for (float j : fArr) {
            mo51938j(j);
        }
    }

    /* renamed from: l */
    public abstract void mo51939l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo51940m(long j) throws IOException;

    /* renamed from: n */
    public void mo51953n(long[] jArr) throws IOException {
        if (jArr == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(jArr.length);
        for (long m : jArr) {
            mo51940m(m);
        }
    }

    /* renamed from: o */
    public final <K, V> void mo51966o(Map<? extends K, ? extends V> map, C19600l<K> lVar, C19600l<V> lVar2) throws IOException {
        if (map == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(map.size());
        for (Map.Entry next : map.entrySet()) {
            mo51967q(next.getKey(), lVar);
            mo51967q(next.getValue(), lVar2);
        }
    }

    /* renamed from: p */
    public void mo51954p(String str) throws IOException {
        mo51955t(str);
    }

    /* renamed from: q */
    public final <T> void mo51967q(T t, C19600l<T> lVar) throws IOException {
        if (t == null) {
            mo51934b(false);
            return;
        }
        mo51934b(true);
        lVar.write(t, this);
    }

    /* renamed from: r */
    public void mo51941r(int i) throws IOException {
        mo51935c((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        mo51935c(i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: s */
    public final <T> void mo51968s(SparseArray<? extends T> sparseArray, C19600l<T> lVar) throws IOException {
        if (sparseArray == null) {
            mo51939l(-1);
            return;
        }
        int size = sparseArray.size();
        mo51939l(size);
        for (int i = 0; i < size; i++) {
            mo51939l(sparseArray.keyAt(i));
            mo51967q(sparseArray.valueAt(i), lVar);
        }
    }

    /* renamed from: t */
    public void mo51955t(String str) throws IOException {
        if (str == null) {
            mo51939l(-1);
            return;
        }
        int length = str.length();
        mo51939l(length);
        for (int i = 0; i < length; i++) {
            mo51936f(str.charAt(i));
        }
    }

    /* renamed from: u */
    public void mo51956u(String[] strArr) throws IOException {
        if (strArr == null) {
            mo51939l(-1);
            return;
        }
        mo51939l(strArr.length);
        for (String t : strArr) {
            mo51955t(t);
        }
    }
}
