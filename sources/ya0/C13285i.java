package ya0;

import com.nutiteq.components.Envelope;
import java.util.ArrayList;

/* renamed from: ya0.i */
public final class C13285i<T> {

    /* renamed from: a */
    public C13286a<T> f32964a = null;

    /* renamed from: b */
    public final double f32965b;

    /* renamed from: ya0.i$a */
    public static class C13286a<T> {

        /* renamed from: a */
        public final Envelope f32966a;

        /* renamed from: b */
        public ArrayList f32967b = new ArrayList();

        /* renamed from: c */
        public C13286a<T>[] f32968c = null;

        public C13286a(Envelope envelope) {
            this.f32966a = envelope;
        }
    }

    /* renamed from: ya0.i$b */
    public static class C13287b<T> {

        /* renamed from: a */
        public final Envelope f32969a;

        /* renamed from: b */
        public final T f32970b;

        public C13287b(Envelope envelope, T t) {
            this.f32969a = envelope;
            this.f32970b = t;
        }
    }

    public C13285i(double d) {
        this.f32965b = d;
    }

    /* renamed from: a */
    public static void m33418a(C13286a aVar, ArrayList arrayList) {
        if (aVar != null) {
            int i = 0;
            for (int i2 = 0; i2 < aVar.f32967b.size(); i2++) {
                arrayList.add(((C13287b) aVar.f32967b.get(i2)).f32970b);
            }
            if (aVar.f32968c != null) {
                while (true) {
                    C13286a<T>[] aVarArr = aVar.f32968c;
                    if (i < aVarArr.length) {
                        m33418a(aVarArr[i], arrayList);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static Envelope m33419b(Envelope envelope, int i) {
        double d = (envelope.minX + envelope.maxX) * 0.5d;
        double d2 = (envelope.minY + envelope.maxY) * 0.5d;
        if (i == 0) {
            return new Envelope(envelope.minX, d, envelope.minY, d2);
        }
        if (i == 1) {
            return new Envelope(d, envelope.maxX, envelope.minY, d2);
        } else if (i == 2) {
            return new Envelope(envelope.minX, d, d2, envelope.maxY);
        } else {
            if (i != 3) {
                return new Envelope(envelope);
            }
            return new Envelope(d, envelope.maxX, d2, envelope.maxY);
        }
    }

    /* renamed from: c */
    public static int m33420c(Envelope envelope, Envelope envelope2) {
        double d = (envelope.minX + envelope.maxX) * 0.5d;
        double d2 = (envelope.minY + envelope.maxY) * 0.5d;
        int i = 0;
        while (i < 4) {
            if ((i & 1) != 0) {
                if (envelope2.minX < d) {
                    continue;
                    i++;
                }
            } else if (envelope2.maxX > d) {
                continue;
                i++;
            }
            if ((i & 2) != 0) {
                if (envelope2.minY < d2) {
                    i++;
                }
            } else if (envelope2.maxY > d2) {
                i++;
            }
            return i;
        }
        return -1;
    }

    /* renamed from: e */
    public static C13286a m33421e(C13286a aVar, Envelope envelope, Object obj, int i) {
        int i2;
        if (!aVar.f32967b.isEmpty() || aVar.f32968c != null) {
            i2 = m33420c(aVar.f32966a, envelope);
        } else {
            i2 = -1;
        }
        if (i2 < 0 || i >= 32) {
            aVar.f32967b.add(new C13287b(envelope, obj));
            return aVar;
        }
        if (aVar.f32968c == null) {
            aVar.f32968c = new C13286a[4];
            int i3 = 0;
            while (i3 < aVar.f32967b.size()) {
                int c = m33420c(aVar.f32966a, ((C13287b) aVar.f32967b.get(i3)).f32969a);
                if (c < 0) {
                    i3++;
                } else {
                    C13286a<T>[] aVarArr = aVar.f32968c;
                    if (aVarArr[c] == null) {
                        aVarArr[c] = new C13286a<>(m33419b(aVar.f32966a, c));
                    }
                    aVar.f32968c[c].f32967b.add((C13287b) aVar.f32967b.remove(i3));
                }
            }
        }
        C13286a<T>[] aVarArr2 = aVar.f32968c;
        if (aVarArr2[i2] == null) {
            aVarArr2[i2] = new C13286a<>(m33419b(aVar.f32966a, i2));
        }
        return m33421e(aVar.f32968c[i2], envelope, obj, i + 1);
    }

    /* renamed from: g */
    public static void m33422g(C13286a aVar, Envelope envelope, ArrayList arrayList) {
        if (aVar != null && aVar.f32966a.mo24914c(envelope)) {
            int i = 0;
            for (int i2 = 0; i2 < aVar.f32967b.size(); i2++) {
                C13287b bVar = (C13287b) aVar.f32967b.get(i2);
                if (bVar.f32969a.mo24914c(envelope)) {
                    arrayList.add(bVar.f32970b);
                }
            }
            if (aVar.f32968c != null) {
                while (true) {
                    C13286a<T>[] aVarArr = aVar.f32968c;
                    if (i < aVarArr.length) {
                        m33422g(aVarArr[i], envelope, arrayList);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static C13286a m33423h(C13286a aVar, Envelope envelope, Object obj) {
        if (aVar == null) {
            return aVar;
        }
        if (envelope != null && !aVar.f32966a.mo24914c(envelope)) {
            return aVar;
        }
        for (int i = 0; i < aVar.f32967b.size(); i++) {
            if (((C13287b) aVar.f32967b.get(i)).f32970b == obj) {
                aVar.f32967b.remove(i);
            }
        }
        if (aVar.f32968c != null) {
            boolean z = true;
            int i2 = 0;
            while (true) {
                C13286a<T>[] aVarArr = aVar.f32968c;
                if (i2 >= aVarArr.length) {
                    break;
                }
                aVarArr[i2] = m33423h(aVarArr[i2], envelope, obj);
                if (aVar.f32968c[i2] != null) {
                    z = false;
                }
                i2++;
            }
            if (z) {
                aVar.f32968c = null;
            }
        }
        if (!aVar.f32967b.isEmpty() || aVar.f32968c != null) {
            return aVar;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo40151d(Envelope envelope, T t) {
        C13285i iVar;
        Envelope envelope2 = envelope;
        if (Double.isNaN(envelope2.minX) || Double.isNaN(envelope2.maxX) || Double.isNaN(envelope2.minY) || Double.isNaN(envelope2.maxY)) {
            return;
        }
        if (this.f32964a == null) {
            double d = envelope2.minX;
            double d2 = envelope2.maxX;
            double d3 = envelope2.minY;
            double d4 = envelope2.maxY;
            double d5 = d2 - d;
            double d6 = d4 - d3;
            double max = Math.max(this.f32965b, Math.max(d5, d6));
            double d7 = (max - d5) * 0.5d;
            double d8 = (max - d6) * 0.5d;
            iVar = this;
            iVar.f32964a = new C13286a<>(new Envelope(d - d7, d2 + d7, d3 - d8, d4 + d8));
        } else {
            iVar = this;
        }
        while (true) {
            Envelope envelope3 = envelope;
            int i = 0;
            if (!iVar.f32964a.f32966a.mo24912a(envelope3)) {
                Envelope envelope4 = iVar.f32964a.f32966a;
                double d9 = envelope4.minX;
                double d11 = envelope4.maxX;
                double d12 = envelope4.minY;
                double d13 = envelope4.maxY;
                if (d9 - envelope3.minX > envelope3.maxX - d11) {
                    i = 1;
                }
                if (d12 - envelope3.minY > envelope3.maxY - d13) {
                    i += 2;
                }
                if ((i & 1) != 0) {
                    d9 -= d11 - d9;
                } else {
                    d11 += d11 - d9;
                }
                double d14 = d9;
                double d15 = d11;
                if ((i & 2) != 0) {
                    d12 -= d13 - d12;
                } else {
                    d13 += d13 - d12;
                }
                C13286a<T> aVar = new C13286a<>(new Envelope(d14, d15, d12, d13));
                C13286a<T>[] aVarArr = new C13286a[4];
                aVar.f32968c = aVarArr;
                aVarArr[i] = iVar.f32964a;
                iVar.f32964a = aVar;
            } else {
                m33421e(iVar.f32964a, envelope3, t, 0);
                return;
            }
        }
    }

    /* renamed from: f */
    public final ArrayList mo40152f(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        m33422g(this.f32964a, envelope, arrayList);
        return arrayList;
    }
}
