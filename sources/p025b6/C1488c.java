package p025b6;

import com.bumptech.glide.C2125f;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import p060d6.C4397l;

/* renamed from: b6.c */
public final class C1488c<T> implements C1495h<T> {

    /* renamed from: b */
    public final List f5390b;

    @SafeVarargs
    public C1488c(C1495h<T>... hVarArr) {
        if (hVarArr.length != 0) {
            this.f5390b = Arrays.asList(hVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        for (C1495h a : this.f5390b) {
            a.mo5841a(messageDigest);
        }
    }

    /* renamed from: b */
    public final C4397l mo5844b(C2125f fVar, C4397l lVar, int i, int i2) {
        C4397l lVar2 = lVar;
        for (C1495h b : this.f5390b) {
            C4397l b2 = b.mo5844b(fVar, lVar2, i, i2);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(b2)) {
                lVar2.mo10979a();
            }
            lVar2 = b2;
        }
        return lVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1488c) {
            return this.f5390b.equals(((C1488c) obj).f5390b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5390b.hashCode();
    }
}
