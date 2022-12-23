package z70;

import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.search.SearchAction;
import java.util.List;
import p583jk.C17884p;
import x00.C20440a;

/* renamed from: z70.a */
public final class C13321a {

    /* renamed from: a */
    public final String f33069a;

    /* renamed from: b */
    public final String f33070b;

    /* renamed from: c */
    public final String f33071c;

    /* renamed from: d */
    public final Image f33072d;

    /* renamed from: e */
    public final CharSequence f33073e;

    /* renamed from: f */
    public final List<C20440a> f33074f;

    /* renamed from: g */
    public final SearchAction f33075g;

    /* renamed from: h */
    public final int f33076h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13321a(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.moovit.image.model.ResourceImage r15, java.lang.CharSequence r16, java.lang.String r17, com.moovit.search.SearchAction r18, int r19) {
        /*
            r11 = this;
            r0 = r17
            r1 = 0
            if (r0 == 0) goto L_0x000e
            x00.a r2 = new x00.a
            r2.<init>((java.lang.CharSequence) r0, (java.lang.String) r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
        L_0x000e:
            r8 = r1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r18
            r10 = r19
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (com.moovit.image.model.Image) r6, (java.lang.CharSequence) r7, (java.util.List<x00.C20440a>) r8, (com.moovit.search.SearchAction) r9, (int) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z70.C13321a.<init>(java.lang.String, java.lang.String, java.lang.String, com.moovit.image.model.ResourceImage, java.lang.CharSequence, java.lang.String, com.moovit.search.SearchAction, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13321a)) {
            return false;
        }
        C13321a aVar = (C13321a) obj;
        if (!this.f33069a.equals(aVar.f33069a) || !this.f33070b.equals(aVar.f33070b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f33069a), C17884p.m44335F(this.f33070b));
    }

    public C13321a(String str, String str2, String str3, Image image, CharSequence charSequence, List<C20440a> list, SearchAction searchAction, int i) {
        C21100e.m49373x(str, "providerId");
        this.f33069a = str;
        C21100e.m49373x(str2, "id");
        this.f33070b = str2;
        C21100e.m49373x(str3, "type");
        this.f33071c = str3;
        this.f33072d = image;
        this.f33073e = charSequence;
        this.f33074f = list;
        this.f33075g = searchAction;
        this.f33076h = i;
    }
}
