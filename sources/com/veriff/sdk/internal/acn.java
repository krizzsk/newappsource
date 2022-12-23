package com.veriff.sdk.internal;

import bf0.C21050d;
import ce0.C21100e;
import com.appboy.Constants;
import com.appsflyer.internal.referrer.Payload;
import ff0.C23349c;
import gf0.C23413c;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25189k;
import wh0.C25192l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001c\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\bH\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo59060d2 = {"", "T", "Lck0/b;", "await", "(Lck0/b;Lff0/c;)Ljava/lang/Object;", "awaitNullable", "Lck0/r;", "awaitResponse", "Lck0/s;", "create", "(Lck0/s;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lff0/c;)Ljava/lang/Object;", "retrofit"}, mo59061k = 2, mo59062mv = {1, 4, 0})
public final class acn {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"", "T", "", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$a */
    public static final class C21349a extends Lambda implements C24236l<Throwable, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ ace f53644a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21349a(ace ace) {
            super(1);
            this.f53644a = ace;
        }

        /* renamed from: a */
        public final void mo54022a(Throwable th) {
            this.f53644a.mo54002a();
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo54022a((Throwable) obj);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"", "T", "", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$b */
    public static final class C21350b extends Lambda implements C24236l<Throwable, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ ace f53645a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21350b(ace ace) {
            super(1);
            this.f53645a = ace;
        }

        /* renamed from: a */
        public final void mo54023a(Throwable th) {
            this.f53645a.mo54002a();
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo54023a((Throwable) obj);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u000b"}, mo59060d2 = {"retrofit2/KotlinExtensions$await$2$2", "Lck0/d;", "Lck0/b;", "call", "", "t", "Lbf0/d;", "onFailure", "Lck0/r;", "response", "onResponse", "retrofit"}, mo59061k = 1, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$c */
    public static final class C21351c implements acg<T> {

        /* renamed from: a */
        public final /* synthetic */ C25189k f53646a;

        public C21351c(C25189k kVar) {
            this.f53646a = kVar;
        }

        /* renamed from: a */
        public void mo54010a(ace<T> ace, acu<T> acu) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(acu, Payload.RESPONSE);
            if (acu.mo54073d()) {
                T e = acu.mo54074e();
                if (e == null) {
                    Object a = ace.mo54005c().mo57391a(acm.class);
                    if (a != null) {
                        Method a2 = ((acm) a).mo54020a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        C24362h.m61207b(a2, "method");
                        Class<?> declaringClass = a2.getDeclaringClass();
                        C24362h.m61207b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a2.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        this.f53646a.resumeWith(C17885a.m44400G(new KotlinNullPointerException(sb.toString())));
                        return;
                    }
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                    C24362h.m61215j(C24362h.class.getName(), kotlinNullPointerException);
                    throw kotlinNullPointerException;
                }
                this.f53646a.resumeWith(e);
                return;
            }
            this.f53646a.resumeWith(C17885a.m44400G(new ack(acu)));
        }

        /* renamed from: a_ */
        public void mo54011a_(ace<T> ace, Throwable th) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(th, Constants.APPBOY_PUSH_TITLE_KEY);
            this.f53646a.resumeWith(C17885a.m44400G(th));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0016¨\u0006\u000b"}, mo59060d2 = {"retrofit2/KotlinExtensions$await$4$2", "Lck0/d;", "Lck0/b;", "call", "", "t", "Lbf0/d;", "onFailure", "Lck0/r;", "response", "onResponse", "retrofit"}, mo59061k = 1, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$d */
    public static final class C21352d implements acg<T> {

        /* renamed from: a */
        public final /* synthetic */ C25189k f53647a;

        public C21352d(C25189k kVar) {
            this.f53647a = kVar;
        }

        /* renamed from: a */
        public void mo54010a(ace<T> ace, acu<T> acu) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(acu, Payload.RESPONSE);
            if (acu.mo54073d()) {
                this.f53647a.resumeWith(acu.mo54074e());
            } else {
                this.f53647a.resumeWith(C17885a.m44400G(new ack(acu)));
            }
        }

        /* renamed from: a_ */
        public void mo54011a_(ace<T> ace, Throwable th) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(th, Constants.APPBOY_PUSH_TITLE_KEY);
            this.f53647a.resumeWith(C17885a.m44400G(th));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"T", "L;", "it", "Lbf0/d;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$e */
    public static final class C21353e extends Lambda implements C24236l<Throwable, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ ace f53648a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21353e(ace ace) {
            super(1);
            this.f53648a = ace;
        }

        /* renamed from: a */
        public final void mo54024a(Throwable th) {
            this.f53648a.mo54002a();
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo54024a((Throwable) obj);
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u000b"}, mo59060d2 = {"retrofit2/KotlinExtensions$awaitResponse$2$2", "Lck0/d;", "Lck0/b;", "call", "", "t", "Lbf0/d;", "onFailure", "Lck0/r;", "response", "onResponse", "retrofit"}, mo59061k = 1, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$f */
    public static final class C21354f implements acg<T> {

        /* renamed from: a */
        public final /* synthetic */ C25189k f53649a;

        public C21354f(C25189k kVar) {
            this.f53649a = kVar;
        }

        /* renamed from: a */
        public void mo54010a(ace<T> ace, acu<T> acu) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(acu, Payload.RESPONSE);
            this.f53649a.resumeWith(acu);
        }

        /* renamed from: a_ */
        public void mo54011a_(ace<T> ace, Throwable th) {
            C24362h.m61212g(ace, "call");
            C24362h.m61212g(th, Constants.APPBOY_PUSH_TITLE_KEY);
            this.f53649a.resumeWith(C17885a.m44400G(th));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$g */
    public static final class C21355g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C23349c f53650a;

        /* renamed from: b */
        public final /* synthetic */ Exception f53651b;

        public C21355g(C23349c cVar, Exception exc) {
            this.f53650a = cVar;
            this.f53651b = exc;
        }

        public final void run() {
            C21100e.m49351l0(this.f53650a).resumeWith(C17885a.m44400G(this.f53651b));
        }
    }

    @C23413c(mo58554c = "retrofit2.KotlinExtensions", mo58555f = "KotlinExtensions.kt", mo58556l = {113}, mo58557m = "suspendAndThrow")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo59060d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lff0/c;", "", "continuation", "", "suspendAndThrow"}, mo59061k = 3, mo59062mv = {1, 4, 0})
    /* renamed from: com.veriff.sdk.internal.acn$h */
    public static final class C21356h extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f53652a;

        /* renamed from: b */
        public int f53653b;

        /* renamed from: c */
        public Object f53654c;

        public C21356h(C23349c cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f53652a = obj;
            this.f53653b |= Integer.MIN_VALUE;
            return acn.m50700a((Exception) null, (C23349c<?>) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m50700a(java.lang.Exception r4, ff0.C23349c<?> r5) {
        /*
            boolean r0 = r5 instanceof com.veriff.sdk.internal.acn.C21356h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.veriff.sdk.internal.acn$h r0 = (com.veriff.sdk.internal.acn.C21356h) r0
            int r1 = r0.f53653b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f53653b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.acn$h r0 = new com.veriff.sdk.internal.acn$h
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f53652a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f53653b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f53654c
            java.lang.Exception r4 = (java.lang.Exception) r4
            p584jl.C17885a.m44475z0(r5)
            bf0.d r4 = bf0.C21050d.f52856a
            return r4
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p584jl.C17885a.m44475z0(r5)
            r0.f53654c = r4
            r0.f53653b = r3
            ci0.b r5 = wh0.C25184i0.f63459a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            com.veriff.sdk.internal.acn$g r3 = new com.veriff.sdk.internal.acn$g
            r3.<init>(r0, r4)
            r5.mo4335k(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.acn.m50700a(java.lang.Exception, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final <T> Object m50701b(ace<T> ace, C23349c<? super T> cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61821f(new C21350b(ace));
        ace.mo54003a(new C21352d(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* renamed from: c */
    public static final <T> Object m50702c(ace<T> ace, C23349c<? super acu<T>> cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61821f(new C21353e(ace));
        ace.mo54003a(new C21354f(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* renamed from: a */
    public static final <T> Object m50699a(ace<T> ace, C23349c<? super T> cVar) {
        C25192l lVar = new C25192l(1, C21100e.m49351l0(cVar));
        lVar.mo61821f(new C21349a(ace));
        ace.mo54003a(new C21351c(lVar));
        Object s = lVar.mo61834s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
