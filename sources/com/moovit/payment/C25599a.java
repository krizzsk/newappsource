package com.moovit.payment;

import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24236l;
import v40.C25746a;
import w40.C25761d;
import wh0.C25192l;

/* renamed from: com.moovit.payment.a */
public final class C25599a {

    /* renamed from: com.moovit.payment.a$a */
    public static final class C25600a implements OnSuccessListener {

        /* renamed from: b */
        public final /* synthetic */ C24236l f63828b;

        public C25600a(C24236l lVar) {
            this.f63828b = lVar;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            this.f63828b.invoke(obj);
        }
    }

    /* renamed from: a */
    public static Object m63997a(C25761d dVar, C23349c cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61835t();
        dVar.mo83587b(false).addOnSuccessListener(new C25600a(new PaymentAccountManagerExtKt$loadPaymentAccount$2$1(lVar))).addOnFailureListener(new C25746a(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
