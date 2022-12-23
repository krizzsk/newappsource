package com.veriff.sdk.internal;

import android.content.Context;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.qn$b;
import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.C22822c;
import com.veriff.sdk.views.C22934e;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;
import yh0.C25308c;
import zh0.C25522c;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndScreen;", "Lcom/veriff/sdk/views/LifecycleScreen;", "Lbf0/d;", "destroy", "Lyh0/c;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$Action;", "inputs", "Lyh0/c;", "Lcom/veriff/sdk/views/inflow/InflowAtEndModel;", "model", "Lcom/veriff/sdk/views/inflow/InflowAtEndModel;", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "Lcom/veriff/sdk/views/inflow/InflowAtEndView;", "view", "Lcom/veriff/sdk/views/inflow/InflowAtEndView;", "getView", "()Lcom/veriff/sdk/views/inflow/InflowAtEndView;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/views/ScreenHost;", "host", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "confirmedInflowSteps", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/Strings;", "strings", "Lkotlinx/coroutines/CoroutineDispatcher;", "main", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/squareup/picasso/Picasso;", "picasso", "", "baseUrl", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/views/ScreenHost;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Ljava/util/List;Lcom/veriff/sdk/internal/data/FeatureFlags;Lcom/veriff/sdk/Strings;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lcom/squareup/picasso/Picasso;Ljava/lang/String;Lcom/veriff/sdk/internal/analytics/Analytics;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qo */
public final class C22336qo extends C22822c {

    /* renamed from: a */
    private final C25308c<qn$a> f56346a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22326qj f56347b;

    /* renamed from: c */
    private final C22339qp f56348c;

    /* renamed from: d */
    private final C21783is f56349d = C21783is.inflow_at_end;

    @C23413c(mo58554c = "com.veriff.sdk.views.inflow.InflowAtEndScreen$1", mo58555f = "InflowAtEndScreen.kt", mo58556l = {73}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qo$1 */
    public static final class C223371 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public int f56350a;

        /* renamed from: b */
        public final /* synthetic */ C22336qo f56351b;

        @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo59060d2 = {"com/veriff/sdk/internal/qo$1$a", "Lzh0/d;", "value", "Lbf0/d;", "emit", "(Ljava/lang/Object;Lff0/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.qo$1$a */
        public static final class C22338a implements C25523d<qn$b> {

            /* renamed from: a */
            public final /* synthetic */ C223371 f56353a;

            public C22338a(C223371 r1) {
                this.f56353a = r1;
            }

            public Object emit(Object obj, C23349c cVar) {
                qn$b qn_b = (qn$b) obj;
                if (C24362h.m61206a(qn_b, qn$b.C22332b.f56337a)) {
                    eVar2.mo57613f();
                } else if (qn_b instanceof qn$b.C22334d) {
                    qn$b.C22334d dVar = (qn$b.C22334d) qn_b;
                    eVar2.mo57599a(dVar.mo56340a(), dVar.mo56341b());
                } else if (C24362h.m61206a(qn_b, qn$b.C22333c.f56338a)) {
                    this.f56353a.f56351b.getView().mo56354a();
                } else if (qn_b instanceof qn$b.C22335e) {
                    this.f56353a.f56351b.getView().setState((qn$b.C22335e) qn_b);
                } else if (C24362h.m61206a(qn_b, qn$b.C22331a.f56336a)) {
                    eVar2.mo57597a(C21783is.inflow_at_end, C21719gi.CLOSE_BUTTON);
                }
                return C21050d.f52856a;
            }
        }

        {
            this.f56351b = r1;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C223371(this.f56351b, eVar2, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C223371) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f56350a;
            if (i == 0) {
                C17885a.m44475z0(obj);
                C25522c<qn$b> a = this.f56351b.f56347b.mo56335a();
                C22338a aVar = new C22338a(this);
                this.f56350a = 1;
                if (a.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C17885a.m44475z0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C21050d.f52856a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22336qo(Context context, C22934e eVar, C22700xq xqVar, List<? extends C21791iy> list, C21789ix ixVar, C21616ex exVar, CoroutineDispatcher coroutineDispatcher, C22064nk nkVar, C21512ci ciVar, String str, C21645fu fuVar) {
        super((C22808a) null, 1, (DefaultConstructorMarker) null);
        final C22934e eVar2 = eVar;
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        Context context2 = context;
        C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(eVar2, "host");
        C22700xq xqVar2 = xqVar;
        C24362h.m61211f(xqVar2, "veriffResourcesProvider");
        List<? extends C21791iy> list2 = list;
        C24362h.m61211f(list2, "confirmedInflowSteps");
        C21789ix ixVar2 = ixVar;
        C24362h.m61211f(ixVar2, "featureFlags");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(coroutineDispatcher2, "main");
        C22064nk nkVar2 = nkVar;
        C24362h.m61211f(nkVar2, "uploadManager");
        C24362h.m61211f(ciVar, "picasso");
        C24362h.m61211f(str, "baseUrl");
        C21645fu fuVar2 = fuVar;
        C24362h.m61211f(fuVar2, "analytics");
        AbstractChannel d = C17885a.m44433d(0, (BufferOverflow) null, 7);
        this.f56346a = d;
        C22326qj qjVar = qjVar2;
        C22326qj qjVar2 = new C22326qj(fuVar2, nkVar2, d, list2, ixVar2);
        this.f56347b = qjVar;
        this.f56348c = new C22339qp(context2, xqVar2, mo57591d(), coroutineDispatcher, exVar, ciVar, str, d);
        C25177g.m63218b(mo57591d(), coroutineDispatcher2, new C223371(this, (C23349c) null), 2);
    }

    public void destroy() {
        super.destroy();
        this.f56346a.mo60342E((Throwable) null);
    }

    public C21783is getPage() {
        return this.f56349d;
    }

    /* renamed from: a */
    public C22339qp getView() {
        return this.f56348c;
    }
}
