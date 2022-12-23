package com.moovit.commons.appdata;

import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import p646lz.C18299a;
import wh0.C25189k;
import wh0.C25192l;

public final class AppDataManagerExtKt {

    /* renamed from: com.moovit.commons.appdata.AppDataManagerExtKt$a */
    public static final class C15727a implements OnFailureListener {

        /* renamed from: b */
        public final /* synthetic */ C25189k<T> f40957b;

        public C15727a(C25192l lVar) {
            this.f40957b = lVar;
        }

        public final void onFailure(Exception exc) {
            C24362h.m61211f(exc, "e");
            this.f40957b.resumeWith(C17885a.m44400G(exc));
        }
    }

    /* renamed from: com.moovit.commons.appdata.AppDataManagerExtKt$b */
    public static final class C15728b implements OnSuccessListener {

        /* renamed from: b */
        public final /* synthetic */ C24236l f40958b;

        public C15728b(C24236l lVar) {
            this.f40958b = lVar;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            this.f40958b.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final <T> Object m40161a(C18299a aVar, String str, C23349c<? super T> cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61835t();
        aVar.mo50699k(str).addOnSuccessListener(new C15728b(new AppDataManagerExtKt$load$2$1(lVar))).addOnFailureListener(new C15727a(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
