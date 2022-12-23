package com.moovit.commons.async;

import ce0.C21100e;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25189k;
import wh0.C25192l;

public final class AsyncExtKt {

    /* renamed from: com.moovit.commons.async.AsyncExtKt$a */
    public static final class C15729a implements OnFailureListener {

        /* renamed from: b */
        public final /* synthetic */ C25189k<R> f40959b;

        public C15729a(C25192l lVar) {
            this.f40959b = lVar;
        }

        public final void onFailure(Exception exc) {
            C24362h.m61211f(exc, "e");
            this.f40959b.resumeWith(C17885a.m44400G(exc));
        }
    }

    /* renamed from: com.moovit.commons.async.AsyncExtKt$b */
    public static final class C15730b implements OnCanceledListener {

        /* renamed from: b */
        public final /* synthetic */ C25189k<R> f40960b;

        public C15730b(C25192l lVar) {
            this.f40960b = lVar;
        }

        public final void onCanceled() {
            this.f40960b.mo61824m((Throwable) null);
        }
    }

    /* renamed from: com.moovit.commons.async.AsyncExtKt$c */
    public static final class C15731c implements OnSuccessListener {

        /* renamed from: b */
        public final /* synthetic */ C24236l f40961b;

        public C15731c(C24236l lVar) {
            this.f40961b = lVar;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            this.f40961b.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final <R> Object m40163a(Task<R> task, C23349c<? super R> cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61835t();
        task.addOnSuccessListener(new C15731c(new AsyncExtKt$await$2$1(lVar)));
        task.addOnFailureListener(new C15729a(lVar));
        task.addOnCanceledListener(new C15730b(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
