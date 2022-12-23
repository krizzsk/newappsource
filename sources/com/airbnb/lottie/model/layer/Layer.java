package com.airbnb.lottie.model.layer;

import androidx.appcompat.app.C0262r;
import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import p037c5.C1781b;
import p037c5.C1789j;
import p037c5.C1790k;
import p037c5.C1791l;
import p059d5.C4370b;
import p094g5.C4811j;
import p120i5.C5280a;

public final class Layer {

    /* renamed from: a */
    public final List<C4370b> f6585a;

    /* renamed from: b */
    public final C1867f f6586b;

    /* renamed from: c */
    public final String f6587c;

    /* renamed from: d */
    public final long f6588d;

    /* renamed from: e */
    public final LayerType f6589e;

    /* renamed from: f */
    public final long f6590f;

    /* renamed from: g */
    public final String f6591g;

    /* renamed from: h */
    public final List<Mask> f6592h;

    /* renamed from: i */
    public final C1791l f6593i;

    /* renamed from: j */
    public final int f6594j;

    /* renamed from: k */
    public final int f6595k;

    /* renamed from: l */
    public final int f6596l;

    /* renamed from: m */
    public final float f6597m;

    /* renamed from: n */
    public final float f6598n;

    /* renamed from: o */
    public final int f6599o;

    /* renamed from: p */
    public final int f6600p;

    /* renamed from: q */
    public final C1789j f6601q;

    /* renamed from: r */
    public final C1790k f6602r;

    /* renamed from: s */
    public final C1781b f6603s;

    /* renamed from: t */
    public final List<C5280a<Float>> f6604t;

    /* renamed from: u */
    public final MatteType f6605u;

    /* renamed from: v */
    public final boolean f6606v;

    /* renamed from: w */
    public final C0262r f6607w;

    /* renamed from: x */
    public final C4811j f6608x;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<C4370b> list, C1867f fVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C1791l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C1789j jVar, C1790k kVar, List<C5280a<Float>> list3, MatteType matteType, C1781b bVar, boolean z, C0262r rVar, C4811j jVar2) {
        this.f6585a = list;
        this.f6586b = fVar;
        this.f6587c = str;
        this.f6588d = j;
        this.f6589e = layerType;
        this.f6590f = j2;
        this.f6591g = str2;
        this.f6592h = list2;
        this.f6593i = lVar;
        this.f6594j = i;
        this.f6595k = i2;
        this.f6596l = i3;
        this.f6597m = f;
        this.f6598n = f2;
        this.f6599o = i4;
        this.f6600p = i5;
        this.f6601q = jVar;
        this.f6602r = kVar;
        this.f6604t = list3;
        this.f6605u = matteType;
        this.f6603s = bVar;
        this.f6606v = z;
        this.f6607w = rVar;
        this.f6608x = jVar2;
    }

    /* renamed from: a */
    public final String mo6801a(String str) {
        StringBuilder k = C13555b.m33972k(str);
        k.append(this.f6587c);
        k.append("\n");
        C1867f fVar = this.f6586b;
        Layer layer = (Layer) fVar.f6456h.mo22329i(this.f6590f, (Long) null);
        if (layer != null) {
            k.append("\t\tParents: ");
            k.append(layer.f6587c);
            C1867f fVar2 = this.f6586b;
            Layer layer2 = (Layer) fVar2.f6456h.mo22329i(layer.f6590f, (Long) null);
            while (layer2 != null) {
                k.append("->");
                k.append(layer2.f6587c);
                C1867f fVar3 = this.f6586b;
                layer2 = (Layer) fVar3.f6456h.mo22329i(layer2.f6590f, (Long) null);
            }
            k.append(str);
            k.append("\n");
        }
        if (!this.f6592h.isEmpty()) {
            k.append(str);
            k.append("\tMasks: ");
            k.append(this.f6592h.size());
            k.append("\n");
        }
        if (!(this.f6594j == 0 || this.f6595k == 0)) {
            k.append(str);
            k.append("\tBackground: ");
            k.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f6594j), Integer.valueOf(this.f6595k), Integer.valueOf(this.f6596l)}));
        }
        if (!this.f6585a.isEmpty()) {
            k.append(str);
            k.append("\tShapes:\n");
            for (C4370b next : this.f6585a) {
                k.append(str);
                k.append("\t\t");
                k.append(next);
                k.append("\n");
            }
        }
        return k.toString();
    }

    public final String toString() {
        return mo6801a("");
    }
}
