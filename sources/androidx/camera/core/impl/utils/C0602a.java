package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.ExifData;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p078f0.C4639e;

/* renamed from: androidx.camera.core.impl.utils.a */
public final class C0602a implements Enumeration<Map<String, C4639e>> {

    /* renamed from: a */
    public final Enumeration<Map<String, C4639e>> f2053a;

    public C0602a(ExifData.C0599b bVar) {
        this.f2053a = Collections.enumeration(bVar.f2049a);
    }

    public final boolean hasMoreElements() {
        return this.f2053a.hasMoreElements();
    }

    public final Object nextElement() {
        return new HashMap(this.f2053a.nextElement());
    }
}
