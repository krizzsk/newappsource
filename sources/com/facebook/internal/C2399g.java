package com.facebook.internal;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0207b;
import bf0.C21050d;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;
import p009a8.C0107g;

/* renamed from: com.facebook.internal.g */
public final /* synthetic */ class C2399g implements C0206a {

    /* renamed from: b */
    public final /* synthetic */ C0107g f8638b;

    /* renamed from: c */
    public final /* synthetic */ int f8639c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f8640d;

    public /* synthetic */ C2399g(C0107g gVar, int i, Ref$ObjectRef ref$ObjectRef) {
        this.f8638b = gVar;
        this.f8639c = i;
        this.f8640d = ref$ObjectRef;
    }

    /* renamed from: b */
    public final void mo771b(Object obj) {
        C0107g gVar = this.f8638b;
        int i = this.f8639c;
        Ref$ObjectRef ref$ObjectRef = this.f8640d;
        Pair pair = (Pair) obj;
        C24362h.m61211f(ref$ObjectRef, "$launcher");
        if (gVar == null) {
            gVar = new CallbackManagerImpl();
        }
        Object obj2 = pair.first;
        C24362h.m61210e(obj2, "result.first");
        gVar.onActivityResult(i, ((Number) obj2).intValue(), (Intent) pair.second);
        C0207b bVar = (C0207b) ref$ObjectRef.element;
        if (bVar != null) {
            synchronized (bVar) {
                bVar.mo773b();
                ref$ObjectRef.element = null;
                C21050d dVar = C21050d.f52856a;
            }
        }
    }
}
