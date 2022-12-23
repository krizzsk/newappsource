package p217q2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p269u2.C6683d;
import p269u2.C6684e;

/* renamed from: q2.k */
public final class C6162k implements C6684e, C6683d {

    /* renamed from: j */
    public static final TreeMap<Integer, C6162k> f19535j = new TreeMap<>();

    /* renamed from: b */
    public volatile String f19536b;

    /* renamed from: c */
    public final long[] f19537c;

    /* renamed from: d */
    public final double[] f19538d;

    /* renamed from: e */
    public final String[] f19539e;

    /* renamed from: f */
    public final byte[][] f19540f;

    /* renamed from: g */
    public final int[] f19541g;

    /* renamed from: h */
    public final int f19542h;

    /* renamed from: i */
    public int f19543i;

    public C6162k(int i) {
        this.f19542h = i;
        int i2 = i + 1;
        this.f19541g = new int[i2];
        this.f19537c = new long[i2];
        this.f19538d = new double[i2];
        this.f19539e = new String[i2];
        this.f19540f = new byte[i2][];
    }

    /* renamed from: a */
    public static C6162k m14718a(int i, String str) {
        TreeMap<Integer, C6162k> treeMap = f19535j;
        synchronized (treeMap) {
            Map.Entry<Integer, C6162k> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C6162k value = ceilingEntry.getValue();
                value.f19536b = str;
                value.f19543i = i;
                return value;
            }
            C6162k kVar = new C6162k(i);
            kVar.f19536b = str;
            kVar.f19543i = i;
            return kVar;
        }
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.f19541g[i] = 5;
        this.f19540f[i] = bArr;
    }

    public final void bindDouble(int i, double d) {
        this.f19541g[i] = 3;
        this.f19538d[i] = d;
    }

    public final void bindLong(int i, long j) {
        this.f19541g[i] = 2;
        this.f19537c[i] = j;
    }

    public final void bindNull(int i) {
        this.f19541g[i] = 1;
    }

    public final void bindString(int i, String str) {
        this.f19541g[i] = 4;
        this.f19539e[i] = str;
    }

    /* renamed from: c */
    public final void mo22145c(C6683d dVar) {
        for (int i = 1; i <= this.f19543i; i++) {
            int i2 = this.f19541g[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f19537c[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f19538d[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f19539e[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f19540f[i]);
            }
        }
    }

    public final void close() {
    }

    /* renamed from: e */
    public final String mo22147e() {
        return this.f19536b;
    }

    public final void release() {
        TreeMap<Integer, C6162k> treeMap = f19535j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f19542h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
