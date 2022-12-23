package p935yg;

import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;

/* renamed from: yg.f */
public final class C20724f {

    /* renamed from: a */
    public final String f52323a;

    /* renamed from: b */
    public C20725g[] f52324b;

    /* renamed from: c */
    public EnumMap f52325c = null;

    public C20724f(String str, C20725g[] gVarArr) {
        System.currentTimeMillis();
        this.f52323a = str;
        this.f52324b = gVarArr;
    }

    /* renamed from: a */
    public final void mo52873a(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f52325c == null) {
            this.f52325c = new EnumMap(ResultMetadataType.class);
        }
        this.f52325c.put(resultMetadataType, obj);
    }

    public final String toString() {
        return this.f52323a;
    }
}
