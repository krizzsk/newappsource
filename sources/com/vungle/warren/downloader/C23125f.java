package com.vungle.warren.downloader;

/* renamed from: com.vungle.warren.downloader.f */
public final class C23125f implements Comparable {

    /* renamed from: b */
    public final Integer f58704b;

    /* renamed from: c */
    public final Integer f58705c;

    public C23125f(int i, int i2) {
        this.f58704b = Integer.valueOf(i);
        this.f58705c = Integer.valueOf(i2);
    }

    public final int compareTo(Object obj) {
        if (!(obj instanceof C23125f)) {
            return -1;
        }
        C23125f fVar = (C23125f) obj;
        int compareTo = this.f58704b.compareTo(fVar.f58704b);
        if (compareTo == 0) {
            return this.f58705c.compareTo(fVar.f58705c);
        }
        return compareTo;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AssetPriority{firstPriority=");
        k.append(this.f58704b);
        k.append(", secondPriority=");
        k.append(this.f58705c);
        k.append('}');
        return k.toString();
    }
}
