package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1781b;
import p037c5.C1792m;
import p059d5.C4370b;
import p321y4.C7314b;
import p321y4.C7326m;

public final class PolystarShape implements C4370b {

    /* renamed from: a */
    public final String f6545a;

    /* renamed from: b */
    public final Type f6546b;

    /* renamed from: c */
    public final C1781b f6547c;

    /* renamed from: d */
    public final C1792m<PointF, PointF> f6548d;

    /* renamed from: e */
    public final C1781b f6549e;

    /* renamed from: f */
    public final C1781b f6550f;

    /* renamed from: g */
    public final C1781b f6551g;

    /* renamed from: h */
    public final C1781b f6552h;

    /* renamed from: i */
    public final C1781b f6553i;

    /* renamed from: j */
    public final boolean f6554j;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, C1781b bVar, C1792m<PointF, PointF> mVar, C1781b bVar2, C1781b bVar3, C1781b bVar4, C1781b bVar5, C1781b bVar6, boolean z) {
        this.f6545a = str;
        this.f6546b = type;
        this.f6547c = bVar;
        this.f6548d = mVar;
        this.f6549e = bVar2;
        this.f6550f = bVar3;
        this.f6551g = bVar4;
        this.f6552h = bVar5;
        this.f6553i = bVar6;
        this.f6554j = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7326m(lVar, aVar, this);
    }
}
