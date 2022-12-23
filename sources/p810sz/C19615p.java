package p810sz;

import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: sz.p */
public abstract class C19615p {
    /* renamed from: a */
    public abstract InputStream mo51918a();

    /* renamed from: b */
    public boolean mo51919b() throws IOException {
        return mo51920c() != 0;
    }

    /* renamed from: c */
    public abstract byte mo51920c() throws IOException;

    /* renamed from: d */
    public byte[] mo51944d() throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        byte[] bArr = new byte[l];
        for (int i = 0; i < l; i++) {
            bArr[i] = mo51920c();
        }
        return bArr;
    }

    /* renamed from: e */
    public char mo51921e() throws IOException {
        return (char) mo51926r();
    }

    /* renamed from: f */
    public final <T> ArrayList<T> mo51958f(C19589j<? extends T> jVar) throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(l);
        for (int i = 0; i < l; i++) {
            arrayList.add(mo51962q(jVar));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final <T> ArrayList<T> mo51959g(C19589j<? extends T> jVar) throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(l);
        for (int i = 0; i < l; i++) {
            arrayList.add(jVar.read(this));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final Collection mo51960h(C19577c cVar, HashSet hashSet) throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        for (int i = 0; i < l; i++) {
            cVar.getClass();
            hashSet.add(cVar.mo51916a(mo51926r()));
        }
        return hashSet;
    }

    /* renamed from: i */
    public abstract double mo51922i() throws IOException;

    /* renamed from: j */
    public abstract float mo51923j() throws IOException;

    /* renamed from: k */
    public float[] mo51945k() throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        float[] fArr = new float[l];
        for (int i = 0; i < l; i++) {
            fArr[i] = mo51923j();
        }
        return fArr;
    }

    /* renamed from: l */
    public abstract int mo51924l() throws IOException;

    /* renamed from: m */
    public abstract long mo51925m() throws IOException;

    /* renamed from: n */
    public long[] mo51946n() throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        long[] jArr = new long[l];
        for (int i = 0; i < l; i++) {
            jArr[i] = mo51925m();
        }
        return jArr;
    }

    /* renamed from: o */
    public final <K, V, M extends Map<? super K, ? super V>> M mo51961o(C19589j<K> jVar, C19589j<V> jVar2, M m) throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        for (int i = 0; i < l; i++) {
            m.put(mo51962q(jVar), mo51962q(jVar2));
        }
        return m;
    }

    /* renamed from: p */
    public String mo51947p() throws IOException {
        return mo51948t();
    }

    /* renamed from: q */
    public final <T> T mo51962q(C19589j<T> jVar) throws IOException {
        if (!mo51919b()) {
            return null;
        }
        return jVar.read(this);
    }

    /* renamed from: r */
    public short mo51926r() throws IOException {
        return (short) ((mo51920c() << 8) | (mo51920c() & 255));
    }

    /* renamed from: s */
    public final <T> SparseArray<T> mo51963s(C19589j<? extends T> jVar) throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(l);
        for (int i = 0; i < l; i++) {
            sparseArray.append(mo51924l(), mo51962q(jVar));
        }
        return sparseArray;
    }

    /* renamed from: t */
    public String mo51948t() throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        char[] cArr = new char[l];
        for (int i = 0; i < l; i++) {
            cArr[i] = mo51921e();
        }
        return new String(cArr);
    }

    /* renamed from: u */
    public String[] mo51949u() throws IOException {
        int l = mo51924l();
        if (l == -1) {
            return null;
        }
        String[] strArr = new String[l];
        for (int i = 0; i < l; i++) {
            strArr[i] = mo51948t();
        }
        return strArr;
    }
}
