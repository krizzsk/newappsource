package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1781b;
import p059d5.C4370b;
import p321y4.C7314b;
import p321y4.C7332r;

public final class ShapeTrimPath implements C4370b {

    /* renamed from: a */
    public final Type f6567a;

    /* renamed from: b */
    public final C1781b f6568b;

    /* renamed from: c */
    public final C1781b f6569c;

    /* renamed from: d */
    public final C1781b f6570d;

    /* renamed from: e */
    public final boolean f6571e;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown trim path type ", i));
        }
    }

    public ShapeTrimPath(String str, Type type, C1781b bVar, C1781b bVar2, C1781b bVar3, boolean z) {
        this.f6567a = type;
        this.f6568b = bVar;
        this.f6569c = bVar2;
        this.f6570d = bVar3;
        this.f6571e = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7332r(aVar, this);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Trim Path: {start: ");
        k.append(this.f6568b);
        k.append(", end: ");
        k.append(this.f6569c);
        k.append(", offset: ");
        k.append(this.f6570d);
        k.append("}");
        return k.toString();
    }
}
