package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C1894a;
import java.util.ArrayList;
import java.util.List;
import p037c5.C1781b;
import p037c5.C1782c;
import p037c5.C1783d;
import p037c5.C1785f;
import p059d5.C4370b;
import p321y4.C7314b;
import p321y4.C7320h;

/* renamed from: com.airbnb.lottie.model.content.a */
public final class C1893a implements C4370b {

    /* renamed from: a */
    public final String f6572a;

    /* renamed from: b */
    public final GradientType f6573b;

    /* renamed from: c */
    public final C1782c f6574c;

    /* renamed from: d */
    public final C1783d f6575d;

    /* renamed from: e */
    public final C1785f f6576e;

    /* renamed from: f */
    public final C1785f f6577f;

    /* renamed from: g */
    public final C1781b f6578g;

    /* renamed from: h */
    public final ShapeStroke.LineCapType f6579h;

    /* renamed from: i */
    public final ShapeStroke.LineJoinType f6580i;

    /* renamed from: j */
    public final float f6581j;

    /* renamed from: k */
    public final List<C1781b> f6582k;

    /* renamed from: l */
    public final C1781b f6583l;

    /* renamed from: m */
    public final boolean f6584m;

    public C1893a(String str, GradientType gradientType, C1782c cVar, C1783d dVar, C1785f fVar, C1785f fVar2, C1781b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, ArrayList arrayList, C1781b bVar2, boolean z) {
        this.f6572a = str;
        this.f6573b = gradientType;
        this.f6574c = cVar;
        this.f6575d = dVar;
        this.f6576e = fVar;
        this.f6577f = fVar2;
        this.f6578g = bVar;
        this.f6579h = lineCapType;
        this.f6580i = lineJoinType;
        this.f6581j = f;
        this.f6582k = arrayList;
        this.f6583l = bVar2;
        this.f6584m = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7320h(lVar, aVar, this);
    }
}
