package com.nutiteq.components;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.Arrays;
import mf0.C24361g;
import na0.C12929g;
import na0.C12930h;
import p358af.C13437d;

public class Envelope implements Serializable {

    /* renamed from: b */
    public static final C7977a f24173b = new C7977a();

    /* renamed from: c */
    public static final C7977a f24174c = new C7977a();
    private static final long serialVersionUID = 208676400732923880L;
    private final C12930h[] convexHull;
    public final double maxX;
    public final double maxY;
    public final double minX;
    public final double minY;

    /* renamed from: com.nutiteq.components.Envelope$a */
    public static class C7977a extends ThreadLocal<C12930h[]> {
        public final Object initialValue() {
            return new C12930h[]{new C12930h(0.0d, 0.0d), new C12930h(0.0d, 0.0d), new C12930h(0.0d, 0.0d), new C12930h(0.0d, 0.0d)};
        }
    }

    public Envelope(Envelope envelope) {
        this.minX = envelope.minX;
        this.minY = envelope.minY;
        this.maxX = envelope.maxX;
        this.maxY = envelope.maxY;
        this.convexHull = envelope.convexHull;
    }

    /* renamed from: a */
    public final boolean mo24912a(Envelope envelope) {
        float f;
        C12930h[] hVarArr;
        int i;
        boolean z;
        Envelope envelope2 = this;
        Envelope envelope3 = envelope;
        if (envelope2.minX > envelope3.minX || envelope2.minY > envelope3.minY || envelope2.maxX < envelope3.maxX || envelope2.maxY < envelope3.maxY) {
            return false;
        }
        if (envelope2.convexHull == null) {
            return true;
        }
        C12930h[] b = envelope3.mo24913b((C12930h[]) f24173b.get());
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            C12930h hVar = b[i2];
            C12930h[] hVarArr2 = envelope2.convexHull;
            double d = hVar.f32028a;
            double d2 = hVar.f32029b;
            if (C24361g.m61155Y(hVarArr2)) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= hVarArr2.length) {
                    hVarArr = b;
                    i = i2;
                    z = true;
                    break;
                }
                C12930h hVar2 = hVarArr2[i3];
                i3++;
                C12930h hVar3 = hVarArr2[i3 % hVarArr2.length];
                i = i2;
                double d3 = hVar3.f32028a;
                C12930h[] hVarArr3 = hVarArr2;
                double d4 = hVar2.f32028a;
                hVarArr = b;
                double d5 = hVar2.f32029b;
                if (((double) f) * (((d2 - d5) * (d3 - d4)) - ((d - d4) * (hVar3.f32029b - d5))) > 0.0d) {
                    z = false;
                    break;
                }
                i2 = i;
                hVarArr2 = hVarArr3;
                b = hVarArr;
            }
            if (!z) {
                return false;
            }
            i2 = i + 1;
            envelope2 = this;
            b = hVarArr;
        }
        return true;
    }

    /* renamed from: b */
    public final C12930h[] mo24913b(C12930h[] hVarArr) {
        C12930h[] hVarArr2 = this.convexHull;
        if (hVarArr2 != null) {
            return hVarArr2;
        }
        C12930h hVar = hVarArr[0];
        double d = this.minX;
        double d2 = this.minY;
        hVar.f32028a = d;
        hVar.f32029b = d2;
        C12930h hVar2 = hVarArr[1];
        double d3 = this.maxY;
        hVar2.f32028a = d;
        hVar2.f32029b = d3;
        C12930h hVar3 = hVarArr[2];
        double d4 = this.maxX;
        hVar3.f32028a = d4;
        hVar3.f32029b = d3;
        C12930h hVar4 = hVarArr[3];
        hVar4.f32028a = d4;
        hVar4.f32029b = d2;
        return hVarArr;
    }

    /* renamed from: c */
    public final boolean mo24914c(Envelope envelope) {
        if (envelope.maxX >= this.minX && envelope.minX <= this.maxX && envelope.maxY >= this.minY && envelope.minY <= this.maxY) {
            if (this.convexHull == null && envelope.convexHull == null) {
                return true;
            }
            C12930h[] b = mo24913b((C12930h[]) f24173b.get());
            C12930h[] b2 = envelope.mo24913b((C12930h[]) f24174c.get());
            if (!C24361g.m61180p0(b, b2) || !C24361g.m61180p0(b2, b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Envelope envelope = (Envelope) obj;
        if (this.minX != envelope.minX || this.minY != envelope.minY || this.maxX != envelope.maxX || this.maxY != envelope.maxY) {
            return false;
        }
        if (this.convexHull == null && envelope.convexHull == null) {
            return true;
        }
        return Arrays.equals(mo24913b((C12930h[]) f24173b.get()), envelope.mo24913b((C12930h[]) f24174c.get()));
    }

    public final String toString() {
        String str;
        C12930h[] hVarArr = this.convexHull;
        if (hVarArr == null) {
            StringBuilder k = C13555b.m33972k("Envelope [minX=");
            k.append(this.minX);
            k.append(", minY=");
            k.append(this.minY);
            k.append(", maxX=");
            k.append(this.maxX);
            k.append(", maxY=");
            k.append(this.maxY);
            k.append("]");
            return k.toString();
        }
        String str2 = "";
        for (C12930h hVar : hVarArr) {
            StringBuilder k2 = C13555b.m33972k(str2);
            if (str2.length() == 0) {
                str = "";
            } else {
                str = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
            }
            k2.append(str);
            k2.append(hVar);
            str2 = k2.toString();
        }
        return C13437d.m33706k("Envelope [", str2, "]");
    }

    public Envelope(C12929g gVar) {
        this.minX = gVar.f32024a;
        this.minY = gVar.f32025b;
        this.maxX = gVar.f32026c;
        this.maxY = gVar.f32027d;
        this.convexHull = null;
    }

    public Envelope(double d, double d2) {
        this.minX = d;
        this.minY = d2;
        this.maxX = d;
        this.maxY = d2;
        this.convexHull = null;
    }

    public Envelope(double d, double d2, double d3, double d4) {
        this.minX = d;
        this.maxX = d2;
        this.minY = d3;
        this.maxY = d4;
        this.convexHull = null;
    }

    public Envelope(MapPos[] mapPosArr) {
        this.convexHull = new C12930h[mapPosArr.length];
        for (int i = 0; i < mapPosArr.length; i++) {
            this.convexHull[i] = new C12930h(mapPosArr[i]);
        }
        double d = -1.7976931348623157E308d;
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        double d4 = -1.7976931348623157E308d;
        for (C12930h hVar : this.convexHull) {
            d2 = Math.min(d2, hVar.f32028a);
            d = Math.max(d, hVar.f32028a);
            d3 = Math.min(d3, hVar.f32029b);
            d4 = Math.max(d4, hVar.f32029b);
        }
        this.minX = d2;
        this.maxX = d;
        this.minY = d3;
        this.maxY = d4;
    }
}
