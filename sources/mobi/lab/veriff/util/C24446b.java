package mobi.lab.veriff.util;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import zh0.C25522c;
import zh0.C25523d;
import zh0.C25529j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo59060d2 = {"Lmobi/lab/veriff/util/Clock;", "", "", "currentMillis", "delayMs", "Lzh0/c;", "ticker", "(JLff0/c;)Ljava/lang/Object;", "start", "timeSince", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.b */
public interface C24446b {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.b$a */
    public static final class C24447a {

        @C23413c(mo58554c = "mobi.lab.veriff.util.Clock$ticker$2", mo58555f = "Clock.kt", mo58556l = {22, 23}, mo58557m = "invokeSuspend")
        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzh0/d;", "", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
        /* renamed from: mobi.lab.veriff.util.b$a$a */
        public static final class C24448a extends SuspendLambda implements C24240p<C25523d<? super Long>, C23349c<? super C21050d>, Object> {

            /* renamed from: a */
            public int f61882a;

            /* renamed from: b */
            public final /* synthetic */ C24446b f61883b;

            /* renamed from: c */
            public final /* synthetic */ long f61884c;

            /* renamed from: d */
            private /* synthetic */ Object f61885d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24448a(C24446b bVar, long j, C23349c cVar) {
                super(2, cVar);
                this.f61883b = bVar;
                this.f61884c = j;
            }

            public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
                C24362h.m61211f(cVar, "completion");
                C24448a aVar = new C24448a(this.f61883b, this.f61884c, cVar);
                aVar.f61885d = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C24448a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: zh0.d} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r8.f61882a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r3) goto L_0x001c
                    if (r1 != r2) goto L_0x0014
                    java.lang.Object r1 = r8.f61885d
                    zh0.d r1 = (zh0.C25523d) r1
                    p584jl.C17885a.m44475z0(r9)
                    goto L_0x0035
                L_0x0014:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x001c:
                    java.lang.Object r1 = r8.f61885d
                    zh0.d r1 = (zh0.C25523d) r1
                    p584jl.C17885a.m44475z0(r9)
                    r9 = r8
                    goto L_0x0065
                L_0x0025:
                    p584jl.C17885a.m44475z0(r9)
                    java.lang.Object r9 = r8.f61885d
                    r1 = r9
                    zh0.d r1 = (zh0.C25523d) r1
                    long r4 = r8.f61884c
                    r6 = 1
                    int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r9 < 0) goto L_0x0075
                L_0x0035:
                    r9 = r8
                L_0x0036:
                    kotlin.coroutines.CoroutineContext r4 = r9.getContext()
                    wh0.y0$b r5 = wh0.C25232y0.C25234b.f63506b
                    kotlin.coroutines.CoroutineContext$a r4 = r4.mo53081c(r5)
                    wh0.y0 r4 = (wh0.C25232y0) r4
                    if (r4 == 0) goto L_0x004c
                    boolean r4 = r4.isActive()
                    if (r4 != r3) goto L_0x004c
                    r4 = 1
                    goto L_0x004d
                L_0x004c:
                    r4 = 0
                L_0x004d:
                    if (r4 == 0) goto L_0x0072
                    mobi.lab.veriff.util.b r4 = r9.f61883b
                    long r4 = r4.mo60661a()
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r4)
                    r9.f61885d = r1
                    r9.f61882a = r3
                    java.lang.Object r4 = r1.emit(r6, r9)
                    if (r4 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    long r4 = r9.f61884c
                    r9.f61885d = r1
                    r9.f61882a = r2
                    java.lang.Object r4 = p845um.C19958a.m47431e(r4, r9)
                    if (r4 != r0) goto L_0x0036
                    return r0
                L_0x0072:
                    bf0.d r9 = bf0.C21050d.f52856a
                    return r9
                L_0x0075:
                    java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Cannot tick with an interval smaller than 1ms"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.util.C24446b.C24447a.C24448a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: a */
        public static long m61492a(C24446b bVar, long j) {
            return bVar.mo60661a() - j;
        }

        /* renamed from: a */
        public static Object m61493a(C24446b bVar, long j, C23349c<? super C25522c<Long>> cVar) {
            return new C25529j(new C24448a(bVar, j, (C23349c) null));
        }
    }

    /* renamed from: a */
    long mo60661a();

    /* renamed from: a */
    long mo60662a(long j);

    /* renamed from: a */
    Object mo60663a(long j, C23349c<? super C25522c<Long>> cVar);
}
