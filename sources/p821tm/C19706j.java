package p821tm;

import com.masabi.justride.sdk.helpers.ColourTransformerException;
import p583jk.C17870c;
import p583jk.C17873f;
import p796sl.C19476f;
import p868vl.C20154a;

/* renamed from: tm.j */
public final class C19706j {

    /* renamed from: a */
    public final C19476f f50046a;

    /* renamed from: b */
    public final C20154a f50047b;

    /* renamed from: c */
    public final C17873f f50048c;

    public C19706j(C19476f fVar, C20154a aVar, C17873f fVar2) {
        this.f50046a = fVar;
        this.f50047b = aVar;
        this.f50048c = fVar2;
    }

    /* renamed from: a */
    public static Integer m47171a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(C17870c.m44273a(str));
        } catch (ColourTransformerException unused) {
            return null;
        }
    }
}
