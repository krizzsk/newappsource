package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.mlkit.vision.common.internal.a */
public final class C14565a {

    /* renamed from: a */
    public final HashMap f36797a = new HashMap();

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$a */
    public static class C14566a {
    }

    public C14565a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C14566a) it.next()).getClass();
            if (!this.f36797a.containsKey((Object) null) || ((Integer) Preconditions.checkNotNull((Integer) hashMap.get((Object) null))).intValue() <= 0) {
                this.f36797a.put((Object) null, (Object) null);
                hashMap.put((Object) null, 0);
            }
        }
    }
}
