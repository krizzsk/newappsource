package com.veriff.sdk.internal;

import bf0.C21050d;
import cf0.C21136j;
import com.veriff.sdk.internal.C22048nc;
import com.veriff.sdk.internal.C22561tq;
import com.veriff.sdk.internal.qn$b;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import yh0.C25308c;
import zh0.C25522c;
import zh0.C25523d;
import zh0.C25529j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b2\u00103J(\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\tH\u0002J=\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\r0-8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo59060d2 = {"Lcom/veriff/sdk/views/inflow/InflowAtEndModel;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$Model;", "", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "completed", "Lkotlin/Pair;", "Lcom/veriff/sdk/internal/upload/Media;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "getInflowFailedReplies", "", "Lcom/veriff/sdk/internal/data/FlowStep;", "getResponsesToShow", "Lzh0/d;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "step", "result", "", "isFirstTry", "media", "Lbf0/d;", "displayInflow", "(Lzh0/d;Lcom/veriff/sdk/internal/data/FlowStep;Lmobi/lab/veriff/data/api/request/response/InflowResponse;ZLcom/veriff/sdk/internal/upload/Media;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "getAnalytics", "()Lcom/veriff/sdk/internal/analytics/Analytics;", "confirmedInflowSteps", "Ljava/util/List;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lyh0/c;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$Action;", "input", "Lyh0/c;", "getInput", "()Lyh0/c;", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "uploadManager", "Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "getUploadManager", "()Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;", "Lzh0/c;", "viewStates", "Lzh0/c;", "getViewStates", "()Lzh0/c;", "<init>", "(Lcom/veriff/sdk/internal/analytics/Analytics;Lcom/veriff/sdk/internal/upload/uploadmanager/UploadManager;Lyh0/c;Ljava/util/List;Lcom/veriff/sdk/internal/data/FeatureFlags;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qj */
public final class C22326qj {

    /* renamed from: a */
    private final C25522c<qn$b> f56314a = new C25529j(new C22327a(this, (C23349c) null));

    /* renamed from: b */
    private final C21645fu f56315b;

    /* renamed from: c */
    private final C22064nk f56316c;

    /* renamed from: d */
    private final C25308c<qn$a> f56317d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C21791iy> f56318e;

    /* renamed from: f */
    private final C21789ix f56319f;

    @C23413c(mo58554c = "com.veriff.sdk.views.inflow.InflowAtEndModel$viewStates$1", mo58555f = "InflowAtEndModel.kt", mo58556l = {50, 51, 71, 75, 78, 87, 94}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lzh0/d;", "Lcom/veriff/sdk/views/inflow/InflowAtEndMvi$ViewState;", "Lbf0/d;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.qj$a */
    public static final class C22327a extends SuspendLambda implements C24240p<C25523d<? super qn$b>, C23349c<? super C21050d>, Object> {

        /* renamed from: a */
        public Object f56320a;

        /* renamed from: b */
        public Object f56321b;

        /* renamed from: c */
        public Object f56322c;

        /* renamed from: d */
        public Object f56323d;

        /* renamed from: e */
        public Object f56324e;

        /* renamed from: f */
        public Object f56325f;

        /* renamed from: g */
        public Object f56326g;

        /* renamed from: h */
        public int f56327h;

        /* renamed from: i */
        public final /* synthetic */ C22326qj f56328i;

        /* renamed from: j */
        private /* synthetic */ Object f56329j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22327a(C22326qj qjVar, C23349c cVar) {
            super(2, cVar);
            this.f56328i = qjVar;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            C22327a aVar = new C22327a(this.f56328i, cVar);
            aVar.f56329j = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22327a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.veriff.sdk.internal.tq} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0347, code lost:
            if (r11.emit(r2, r6) != r1) goto L_0x034a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0349, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x034c, code lost:
            return bf0.C21050d.f52856a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x034d, code lost:
            r3 = com.veriff.sdk.internal.qn$b.C22332b.f56337a;
            r2.f56329j = null;
            r2.f56320a = null;
            r2.f56321b = null;
            r2.f56322c = null;
            r2.f56323d = null;
            r2.f56324e = null;
            r2.f56325f = null;
            r2.f56326g = null;
            r2.f56327h = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0366, code lost:
            if (r12.emit(r3, r2) != r1) goto L_0x0369;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0368, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x036b, code lost:
            return bf0.C21050d.f52856a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c9, code lost:
            if (r10.hasNext() == false) goto L_0x034d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00cb, code lost:
            r8 = (java.util.Map.Entry) r10.next();
            r9 = (com.veriff.sdk.internal.C21791iy) r8.getKey();
            r8 = (java.util.List) r8.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e7, code lost:
            if (com.veriff.sdk.internal.C22326qj.m54405a(r2.f56328i).contains(r9) == false) goto L_0x00ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ea, code lost:
            r13 = new java.util.ArrayList();
            r14 = new java.util.ArrayList();
            r8 = r8.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00fc, code lost:
            if (r8.hasNext() == false) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00fe, code lost:
            r15 = r8.next();
            r16 = (com.veriff.sdk.internal.C22060ng) r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x010c, code lost:
            if ((r16.mo55935b() instanceof com.veriff.sdk.internal.C22048nc.C22052d) != false) goto L_0x0119;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0114, code lost:
            if ((r16.mo55935b() instanceof com.veriff.sdk.internal.C22048nc.C22053e) == false) goto L_0x0117;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0117, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0119, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0122, code lost:
            if (java.lang.Boolean.valueOf(r6).booleanValue() == false) goto L_0x0128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
            r13.add(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0128, code lost:
            r14.add(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x012c, code lost:
            r6 = new kotlin.Pair(r13, r14);
            r8 = (java.util.List) r6.mo59066a();
            r6 = (java.util.List) r6.mo59067b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0141, code lost:
            if (r8.isEmpty() == false) goto L_0x0148;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0143, code lost:
            r15 = r9;
            r14 = r10;
            r13 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0148, code lost:
            r13 = com.veriff.sdk.internal.qn$b.C22333c.f56338a;
            r2.f56329j = r12;
            r2.f56320a = r11;
            r2.f56321b = r10;
            r2.f56322c = r9;
            r2.f56323d = r8;
            r2.f56324e = r6;
            r2.f56325f = null;
            r2.f56326g = null;
            r2.f56327h = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0160, code lost:
            if (r12.emit(r13, r2) != r1) goto L_0x0163;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0162, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0163, code lost:
            r19 = r6;
            r6 = r2;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0168, code lost:
            r13 = new java.util.ArrayList(cf0.C21136j.m49436X(r8, 10));
            r14 = r12;
            r12 = r10;
            r19 = r8.iterator();
            r8 = r2;
            r2 = r13;
            r13 = r11;
            r11 = r9;
            r9 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0185, code lost:
            if (r9.hasNext() == false) goto L_0x01c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0187, code lost:
            r15 = r6.f56328i.mo56337c();
            r10 = ((com.veriff.sdk.internal.C22060ng) r9.next()).mo55934a();
            r6.f56329j = r14;
            r6.f56320a = r13;
            r6.f56321b = r12;
            r6.f56322c = r11;
            r6.f56323d = r2;
            r6.f56324e = r9;
            r6.f56325f = r8;
            r6.f56326g = r2;
            r6.f56327h = 2;
            r10 = r15.mo55951b(r10, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ad, code lost:
            if (r10 != r1) goto L_0x01b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x01af, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b0, code lost:
            r15 = r14;
            r14 = r13;
            r13 = r12;
            r12 = r11;
            r11 = r9;
            r9 = r8;
            r8 = r6;
            r6 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b8, code lost:
            r2.add((com.veriff.sdk.internal.C22060ng) r10);
            r2 = r6;
            r6 = r8;
            r8 = r9;
            r9 = r11;
            r11 = r12;
            r12 = r13;
            r13 = r14;
            r14 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c6, code lost:
            r15 = r11;
            r19 = r6;
            r6 = kotlin.collections.C23825c.m58527x0((java.util.List) r2, r8);
            r2 = r19;
            r20 = r14;
            r14 = r12;
            r12 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d7, code lost:
            r8 = r6 instanceof java.util.Collection;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d9, code lost:
            if (r8 == false) goto L_0x01e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01df, code lost:
            if (r6.isEmpty() == false) goto L_0x01e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e2, code lost:
            r9 = r6.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ea, code lost:
            if (r9.hasNext() == false) goto L_0x0219;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ec, code lost:
            r10 = (com.veriff.sdk.internal.C22060ng) r9.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f8, code lost:
            if ((r10.mo55935b() instanceof com.veriff.sdk.internal.C22048nc.C22050b) == false) goto L_0x020c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0208, code lost:
            if (((com.veriff.sdk.internal.C22048nc.C22050b) r10.mo55935b()).mo55903a().mo56763b() == false) goto L_0x020c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x020a, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x020c, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0215, code lost:
            if (java.lang.Boolean.valueOf(r10).booleanValue() == false) goto L_0x01e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0217, code lost:
            r9 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0219, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x021a, code lost:
            if (r9 == false) goto L_0x021d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x021d, code lost:
            r9 = com.veriff.sdk.internal.C22326qj.m54406a(r2.f56328i, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0227, code lost:
            if (r9.isEmpty() == false) goto L_0x022d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0229, code lost:
            r11 = r13;
            r10 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x022d, code lost:
            r10 = (kotlin.Pair) kotlin.collections.C23825c.m58522s0(r9);
            r16 = (com.veriff.sdk.internal.C22046na) r10.mo59066a();
            r11 = r10.mo59067b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0246, code lost:
            if (r9.size() >= 2) goto L_0x024a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0248, code lost:
            r9 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x024a, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x024b, code lost:
            if (r8 == false) goto L_0x0254;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0251, code lost:
            if (r6.isEmpty() == false) goto L_0x0254;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0254, code lost:
            r6 = r6.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x025c, code lost:
            if (r6.hasNext() == false) goto L_0x0276;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0272, code lost:
            if (java.lang.Boolean.valueOf(((com.veriff.sdk.internal.C22060ng) r6.next()).mo55935b() instanceof com.veriff.sdk.internal.C22048nc.C22051c).booleanValue() == false) goto L_0x0258;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0274, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0276, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0277, code lost:
            r8 = r2.f56328i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
            if (r9 == false) goto L_0x027f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x027b, code lost:
            if (r6 != false) goto L_0x027f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x027d, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x027f, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0280, code lost:
            r2.f56329j = r12;
            r2.f56320a = r13;
            r2.f56321b = r14;
            r2.f56322c = r15;
            r2.f56323d = r11;
            r2.f56324e = null;
            r2.f56325f = null;
            r2.f56326g = null;
            r2.f56327h = 3;
            r17 = r11;
            r18 = r12;
            r12 = r6;
            r6 = r13;
            r13 = r16;
            r16 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a3, code lost:
            if (r8.mo56334a(r12, r15, r11, r12, r13, r2) != r1) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a5, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a6, code lost:
            r10 = r6;
            r8 = r15;
            r9 = r16;
            r11 = r18;
            r6 = r2;
            r2 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02af, code lost:
            r12 = r6.f56328i.mo56338d();
            r6.f56329j = r11;
            r6.f56320a = r10;
            r6.f56321b = r9;
            r6.f56322c = r8;
            r6.f56323d = r2;
            r6.f56327h = 4;
            r12 = r12.mo60331x(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c6, code lost:
            if (r12 != r1) goto L_0x02c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c8, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c9, code lost:
            r12 = com.veriff.sdk.internal.C22328qk.f56330a[((com.veriff.sdk.internal.qn$a) r12).ordinal()];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d3, code lost:
            if (r12 == 1) goto L_0x0315;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d5, code lost:
            if (r12 == 2) goto L_0x02f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d7, code lost:
            if (r12 == 3) goto L_0x02da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x02da, code lost:
            r12 = com.veriff.sdk.internal.qn$b.C22331a.f56336a;
            r6.f56329j = r11;
            r6.f56320a = r10;
            r6.f56321b = r9;
            r6.f56322c = r8;
            r6.f56323d = r2;
            r6.f56327h = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ed, code lost:
            if (r11.emit(r12, r6) != r1) goto L_0x02af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ef, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x02f0, code lost:
            r10.add(r8);
            r12 = r6.f56328i.mo56336b();
            r2 = com.veriff.sdk.internal.C21716gg.m52893a(r6.f56328i.mo56339e(), r8, r2.mo56764c());
            mf0.C24362h.m61210e(r2, "EventFactory.feedbackCon…ags, step, result.failed)");
            r12.mo54921a(r2);
            r2 = r6;
            r12 = r11;
            r11 = r10;
            r10 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0315, code lost:
            r3 = r6.f56328i.mo56336b();
            r2 = com.veriff.sdk.internal.C21716gg.m52919b(r6.f56328i.mo56339e(), r8, r2.mo56764c());
            mf0.C24362h.m61210e(r2, "EventFactory.feedbackTry…ags, step, result.failed)");
            r3.mo54921a(r2);
            r2 = new com.veriff.sdk.internal.qn$b.C22334d(r8, r10);
            r6.f56329j = null;
            r6.f56320a = null;
            r6.f56321b = null;
            r6.f56322c = null;
            r6.f56323d = null;
            r6.f56327h = 5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f56327h
                r3 = 3
                r4 = 2
                r5 = 0
                r7 = 1
                switch(r2) {
                    case 0: goto L_0x00a2;
                    case 1: goto L_0x0084;
                    case 2: goto L_0x0055;
                    case 3: goto L_0x001a;
                    case 4: goto L_0x0039;
                    case 5: goto L_0x0034;
                    case 6: goto L_0x001a;
                    case 7: goto L_0x0015;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0015:
                p584jl.C17885a.m44475z0(r22)
                goto L_0x0369
            L_0x001a:
                java.lang.Object r2 = r0.f56323d
                com.veriff.sdk.internal.tq r2 = (com.veriff.sdk.internal.C22561tq) r2
                java.lang.Object r8 = r0.f56322c
                com.veriff.sdk.internal.iy r8 = (com.veriff.sdk.internal.C21791iy) r8
                java.lang.Object r9 = r0.f56321b
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f56320a
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r0.f56329j
                zh0.d r11 = (zh0.C25523d) r11
                p584jl.C17885a.m44475z0(r22)
                r6 = r0
                goto L_0x02af
            L_0x0034:
                p584jl.C17885a.m44475z0(r22)
                goto L_0x034a
            L_0x0039:
                java.lang.Object r2 = r0.f56323d
                com.veriff.sdk.internal.tq r2 = (com.veriff.sdk.internal.C22561tq) r2
                java.lang.Object r8 = r0.f56322c
                com.veriff.sdk.internal.iy r8 = (com.veriff.sdk.internal.C21791iy) r8
                java.lang.Object r9 = r0.f56321b
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f56320a
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r0.f56329j
                zh0.d r11 = (zh0.C25523d) r11
                p584jl.C17885a.m44475z0(r22)
                r12 = r22
                r6 = r0
                goto L_0x02c9
            L_0x0055:
                java.lang.Object r2 = r0.f56326g
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r8 = r0.f56325f
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Object r9 = r0.f56324e
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.f56323d
                java.util.Collection r10 = (java.util.Collection) r10
                java.lang.Object r11 = r0.f56322c
                com.veriff.sdk.internal.iy r11 = (com.veriff.sdk.internal.C21791iy) r11
                java.lang.Object r12 = r0.f56321b
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r0.f56320a
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r14 = r0.f56329j
                zh0.d r14 = (zh0.C25523d) r14
                p584jl.C17885a.m44475z0(r22)
                r6 = r10
                r15 = r14
                r10 = r22
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r9
                r9 = r8
                r8 = r0
                goto L_0x01b8
            L_0x0084:
                java.lang.Object r2 = r0.f56324e
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r8 = r0.f56323d
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r9 = r0.f56322c
                com.veriff.sdk.internal.iy r9 = (com.veriff.sdk.internal.C21791iy) r9
                java.lang.Object r10 = r0.f56321b
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.f56320a
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r0.f56329j
                zh0.d r12 = (zh0.C25523d) r12
                p584jl.C17885a.m44475z0(r22)
                r6 = r0
                goto L_0x0168
            L_0x00a2:
                p584jl.C17885a.m44475z0(r22)
                java.lang.Object r2 = r0.f56329j
                zh0.d r2 = (zh0.C25523d) r2
                com.veriff.sdk.internal.qj r8 = r0.f56328i
                java.util.List r8 = r8.f56318e
                java.util.ArrayList r8 = kotlin.collections.C23825c.m58500L0(r8)
                com.veriff.sdk.internal.qj r9 = r0.f56328i
                java.util.Map r9 = r9.m54409f()
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
                r12 = r2
                r11 = r8
                r10 = r9
                r2 = r0
            L_0x00c5:
                boolean r8 = r10.hasNext()
                if (r8 == 0) goto L_0x034d
                java.lang.Object r8 = r10.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r9 = r8.getKey()
                com.veriff.sdk.internal.iy r9 = (com.veriff.sdk.internal.C21791iy) r9
                java.lang.Object r8 = r8.getValue()
                java.util.List r8 = (java.util.List) r8
                com.veriff.sdk.internal.qj r13 = r2.f56328i
                java.util.List r13 = r13.f56318e
                boolean r13 = r13.contains(r9)
                if (r13 == 0) goto L_0x00ea
                goto L_0x00c5
            L_0x00ea:
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x00f8:
                boolean r15 = r8.hasNext()
                if (r15 == 0) goto L_0x012c
                java.lang.Object r15 = r8.next()
                r16 = r15
                com.veriff.sdk.internal.ng r16 = (com.veriff.sdk.internal.C22060ng) r16
                com.veriff.sdk.internal.nc r6 = r16.mo55935b()
                boolean r6 = r6 instanceof com.veriff.sdk.internal.C22048nc.C22052d
                if (r6 != 0) goto L_0x0119
                com.veriff.sdk.internal.nc r6 = r16.mo55935b()
                boolean r6 = r6 instanceof com.veriff.sdk.internal.C22048nc.C22053e
                if (r6 == 0) goto L_0x0117
                goto L_0x0119
            L_0x0117:
                r6 = 0
                goto L_0x011a
            L_0x0119:
                r6 = 1
            L_0x011a:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x0128
                r13.add(r15)
                goto L_0x00f8
            L_0x0128:
                r14.add(r15)
                goto L_0x00f8
            L_0x012c:
                kotlin.Pair r6 = new kotlin.Pair
                r6.<init>(r13, r14)
                java.lang.Object r8 = r6.mo59066a()
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r6 = r6.mo59067b()
                java.util.List r6 = (java.util.List) r6
                boolean r13 = r8.isEmpty()
                if (r13 == 0) goto L_0x0148
                r15 = r9
                r14 = r10
                r13 = r11
                goto L_0x01d7
            L_0x0148:
                com.veriff.sdk.internal.qn$b$c r13 = com.veriff.sdk.internal.qn$b.C22333c.f56338a
                r2.f56329j = r12
                r2.f56320a = r11
                r2.f56321b = r10
                r2.f56322c = r9
                r2.f56323d = r8
                r2.f56324e = r6
                r2.f56325f = r5
                r2.f56326g = r5
                r2.f56327h = r7
                java.lang.Object r13 = r12.emit(r13, r2)
                if (r13 != r1) goto L_0x0163
                return r1
            L_0x0163:
                r19 = r6
                r6 = r2
                r2 = r19
            L_0x0168:
                java.util.ArrayList r13 = new java.util.ArrayList
                r14 = 10
                int r14 = cf0.C21136j.m49436X(r8, r14)
                r13.<init>(r14)
                java.util.Iterator r8 = r8.iterator()
                r14 = r12
                r12 = r10
                r19 = r8
                r8 = r2
                r2 = r13
                r13 = r11
                r11 = r9
                r9 = r19
            L_0x0181:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x01c6
                java.lang.Object r10 = r9.next()
                com.veriff.sdk.internal.ng r10 = (com.veriff.sdk.internal.C22060ng) r10
                com.veriff.sdk.internal.qj r15 = r6.f56328i
                com.veriff.sdk.internal.nk r15 = r15.mo56337c()
                com.veriff.sdk.internal.na r10 = r10.mo55934a()
                r6.f56329j = r14
                r6.f56320a = r13
                r6.f56321b = r12
                r6.f56322c = r11
                r6.f56323d = r2
                r6.f56324e = r9
                r6.f56325f = r8
                r6.f56326g = r2
                r6.f56327h = r4
                java.lang.Object r10 = r15.mo55951b(r10, r6)
                if (r10 != r1) goto L_0x01b0
                return r1
            L_0x01b0:
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r9
                r9 = r8
                r8 = r6
                r6 = r2
            L_0x01b8:
                com.veriff.sdk.internal.ng r10 = (com.veriff.sdk.internal.C22060ng) r10
                r2.add(r10)
                r2 = r6
                r6 = r8
                r8 = r9
                r9 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r15
                goto L_0x0181
            L_0x01c6:
                java.util.List r2 = (java.util.List) r2
                java.util.ArrayList r2 = kotlin.collections.C23825c.m58527x0(r2, r8)
                r15 = r11
                r19 = r6
                r6 = r2
                r2 = r19
                r20 = r14
                r14 = r12
                r12 = r20
            L_0x01d7:
                boolean r8 = r6 instanceof java.util.Collection
                if (r8 == 0) goto L_0x01e2
                boolean r9 = r6.isEmpty()
                if (r9 == 0) goto L_0x01e2
                goto L_0x0219
            L_0x01e2:
                java.util.Iterator r9 = r6.iterator()
            L_0x01e6:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0219
                java.lang.Object r10 = r9.next()
                com.veriff.sdk.internal.ng r10 = (com.veriff.sdk.internal.C22060ng) r10
                com.veriff.sdk.internal.nc r11 = r10.mo55935b()
                boolean r11 = r11 instanceof com.veriff.sdk.internal.C22048nc.C22050b
                if (r11 == 0) goto L_0x020c
                com.veriff.sdk.internal.nc r10 = r10.mo55935b()
                com.veriff.sdk.internal.nc$b r10 = (com.veriff.sdk.internal.C22048nc.C22050b) r10
                com.veriff.sdk.internal.tq r10 = r10.mo55903a()
                boolean r10 = r10.mo56763b()
                if (r10 == 0) goto L_0x020c
                r10 = 1
                goto L_0x020d
            L_0x020c:
                r10 = 0
            L_0x020d:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x01e6
                r9 = 1
                goto L_0x021a
            L_0x0219:
                r9 = 0
            L_0x021a:
                if (r9 == 0) goto L_0x021d
                goto L_0x0229
            L_0x021d:
                com.veriff.sdk.internal.qj r9 = r2.f56328i
                java.util.List r9 = r9.m54407a((java.util.List<com.veriff.sdk.internal.C22060ng>) r6)
                boolean r10 = r9.isEmpty()
                if (r10 == 0) goto L_0x022d
            L_0x0229:
                r11 = r13
                r10 = r14
                goto L_0x00c5
            L_0x022d:
                java.lang.Object r10 = kotlin.collections.C23825c.m58522s0(r9)
                kotlin.Pair r10 = (kotlin.Pair) r10
                java.lang.Object r11 = r10.mo59066a()
                r16 = r11
                com.veriff.sdk.internal.na r16 = (com.veriff.sdk.internal.C22046na) r16
                java.lang.Object r10 = r10.mo59067b()
                r11 = r10
                com.veriff.sdk.internal.tq r11 = (com.veriff.sdk.internal.C22561tq) r11
                int r9 = r9.size()
                if (r9 >= r4) goto L_0x024a
                r9 = 1
                goto L_0x024b
            L_0x024a:
                r9 = 0
            L_0x024b:
                if (r8 == 0) goto L_0x0254
                boolean r8 = r6.isEmpty()
                if (r8 == 0) goto L_0x0254
                goto L_0x0276
            L_0x0254:
                java.util.Iterator r6 = r6.iterator()
            L_0x0258:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x0276
                java.lang.Object r8 = r6.next()
                com.veriff.sdk.internal.ng r8 = (com.veriff.sdk.internal.C22060ng) r8
                com.veriff.sdk.internal.nc r8 = r8.mo55935b()
                boolean r8 = r8 instanceof com.veriff.sdk.internal.C22048nc.C22051c
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x0258
                r6 = 1
                goto L_0x0277
            L_0x0276:
                r6 = 0
            L_0x0277:
                com.veriff.sdk.internal.qj r8 = r2.f56328i
                if (r9 == 0) goto L_0x027f
                if (r6 != 0) goto L_0x027f
                r6 = 1
                goto L_0x0280
            L_0x027f:
                r6 = 0
            L_0x0280:
                r2.f56329j = r12
                r2.f56320a = r13
                r2.f56321b = r14
                r2.f56322c = r15
                r2.f56323d = r11
                r2.f56324e = r5
                r2.f56325f = r5
                r2.f56326g = r5
                r2.f56327h = r3
                r9 = r12
                r10 = r15
                r17 = r11
                r18 = r12
                r12 = r6
                r6 = r13
                r13 = r16
                r16 = r14
                r14 = r2
                java.lang.Object r8 = r8.mo56334a(r9, r10, r11, r12, r13, r14)
                if (r8 != r1) goto L_0x02a6
                return r1
            L_0x02a6:
                r10 = r6
                r8 = r15
                r9 = r16
                r11 = r18
                r6 = r2
                r2 = r17
            L_0x02af:
                com.veriff.sdk.internal.qj r12 = r6.f56328i
                yh0.c r12 = r12.mo56338d()
                r6.f56329j = r11
                r6.f56320a = r10
                r6.f56321b = r9
                r6.f56322c = r8
                r6.f56323d = r2
                r13 = 4
                r6.f56327h = r13
                java.lang.Object r12 = r12.mo60331x(r6)
                if (r12 != r1) goto L_0x02c9
                return r1
            L_0x02c9:
                com.veriff.sdk.internal.qn$a r12 = (com.veriff.sdk.internal.qn$a) r12
                int[] r13 = com.veriff.sdk.internal.C22328qk.f56330a
                int r12 = r12.ordinal()
                r12 = r13[r12]
                if (r12 == r7) goto L_0x0315
                if (r12 == r4) goto L_0x02f0
                if (r12 == r3) goto L_0x02da
                goto L_0x02af
            L_0x02da:
                com.veriff.sdk.internal.qn$b$a r12 = com.veriff.sdk.internal.qn$b.C22331a.f56336a
                r6.f56329j = r11
                r6.f56320a = r10
                r6.f56321b = r9
                r6.f56322c = r8
                r6.f56323d = r2
                r13 = 6
                r6.f56327h = r13
                java.lang.Object r12 = r11.emit(r12, r6)
                if (r12 != r1) goto L_0x02af
                return r1
            L_0x02f0:
                r10.add(r8)
                com.veriff.sdk.internal.qj r12 = r6.f56328i
                com.veriff.sdk.internal.fu r12 = r12.mo56336b()
                com.veriff.sdk.internal.qj r13 = r6.f56328i
                com.veriff.sdk.internal.ix r13 = r13.mo56339e()
                java.util.List r2 = r2.mo56764c()
                com.veriff.sdk.internal.gf r2 = com.veriff.sdk.internal.C21716gg.m52893a((com.veriff.sdk.internal.C21789ix) r13, (com.veriff.sdk.internal.C21791iy) r8, (java.util.List<java.lang.String>) r2)
                java.lang.String r8 = "EventFactory.feedbackCon…ags, step, result.failed)"
                mf0.C24362h.m61210e(r2, r8)
                r12.mo54921a((com.veriff.sdk.internal.C21667gf) r2)
                r2 = r6
                r12 = r11
                r11 = r10
                r10 = r9
                goto L_0x00c5
            L_0x0315:
                com.veriff.sdk.internal.qj r3 = r6.f56328i
                com.veriff.sdk.internal.fu r3 = r3.mo56336b()
                com.veriff.sdk.internal.qj r4 = r6.f56328i
                com.veriff.sdk.internal.ix r4 = r4.mo56339e()
                java.util.List r2 = r2.mo56764c()
                com.veriff.sdk.internal.gf r2 = com.veriff.sdk.internal.C21716gg.m52919b(r4, r8, r2)
                java.lang.String r4 = "EventFactory.feedbackTry…ags, step, result.failed)"
                mf0.C24362h.m61210e(r2, r4)
                r3.mo54921a((com.veriff.sdk.internal.C21667gf) r2)
                com.veriff.sdk.internal.qn$b$d r2 = new com.veriff.sdk.internal.qn$b$d
                r2.<init>(r8, r10)
                r6.f56329j = r5
                r6.f56320a = r5
                r6.f56321b = r5
                r6.f56322c = r5
                r6.f56323d = r5
                r3 = 5
                r6.f56327h = r3
                java.lang.Object r2 = r11.emit(r2, r6)
                if (r2 != r1) goto L_0x034a
                return r1
            L_0x034a:
                bf0.d r1 = bf0.C21050d.f52856a
                return r1
            L_0x034d:
                com.veriff.sdk.internal.qn$b$b r3 = com.veriff.sdk.internal.qn$b.C22332b.f56337a
                r2.f56329j = r5
                r2.f56320a = r5
                r2.f56321b = r5
                r2.f56322c = r5
                r2.f56323d = r5
                r2.f56324e = r5
                r2.f56325f = r5
                r2.f56326g = r5
                r4 = 7
                r2.f56327h = r4
                java.lang.Object r2 = r12.emit(r3, r2)
                if (r2 != r1) goto L_0x0369
                return r1
            L_0x0369:
                bf0.d r1 = bf0.C21050d.f52856a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22326qj.C22327a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22326qj(C21645fu fuVar, C22064nk nkVar, C25308c<qn$a> cVar, List<? extends C21791iy> list, C21789ix ixVar) {
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(nkVar, "uploadManager");
        C24362h.m61211f(cVar, "input");
        C24362h.m61211f(list, "confirmedInflowSteps");
        C24362h.m61211f(ixVar, "featureFlags");
        this.f56315b = fuVar;
        this.f56316c = nkVar;
        this.f56317d = cVar;
        this.f56318e = list;
        this.f56319f = ixVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Map<C21791iy, List<C22060ng>> m54409f() {
        boolean z;
        List<C22060ng> e = this.f56316c.mo55957e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (C22329ql.m54416a(((C22060ng) next).mo55934a()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList) {
            C21791iy a = C22329ql.m54416a(((C22060ng) next2).mo55934a());
            C24362h.m61208c(a);
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a, obj);
            }
            ((List) obj).add(next2);
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public final C22064nk mo56337c() {
        return this.f56316c;
    }

    /* renamed from: d */
    public final C25308c<qn$a> mo56338d() {
        return this.f56317d;
    }

    /* renamed from: e */
    public final C21789ix mo56339e() {
        return this.f56319f;
    }

    /* renamed from: b */
    public final C21645fu mo56336b() {
        return this.f56315b;
    }

    /* renamed from: a */
    public C25522c<qn$b> mo56335a() {
        return this.f56314a;
    }

    /* renamed from: a */
    public final Object mo56334a(C25523d<? super qn$b> dVar, C21791iy iyVar, C22561tq tqVar, boolean z, C22046na naVar, C23349c<? super C21050d> cVar) {
        String str;
        C21645fu fuVar = this.f56315b;
        C21789ix ixVar = this.f56319f;
        C22561tq.C22563b d = tqVar.mo56765d();
        if (d == null || (str = d.mo56773c()) == null) {
            str = "";
        }
        C21667gf a = C21716gg.m52892a(ixVar, iyVar, str, !z, tqVar.mo56764c(), (Double) null);
        C24362h.m61210e(a, "EventFactory.feedbackScr…       null\n            )");
        fuVar.mo54921a(a);
        File c = naVar.mo55888c();
        C22561tq.C22563b d2 = tqVar.mo56765d();
        C24362h.m61208c(d2);
        Object emit = dVar.emit(new qn$b.C22335e(c, iyVar, z, d2, tqVar.mo56764c()), cVar);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C21050d.f52856a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<Pair<C22046na, C22561tq>> m54407a(List<C22060ng> list) {
        ArrayList<C22060ng> arrayList = new ArrayList<>();
        for (T next : list) {
            C22060ng ngVar = (C22060ng) next;
            if ((ngVar.mo55935b() instanceof C22048nc.C22050b) && ((C22048nc.C22050b) ngVar.mo55935b()).mo55903a().mo56762a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        for (C22060ng ngVar2 : arrayList) {
            C22046na a = ngVar2.mo55934a();
            C22048nc b = ngVar2.mo55935b();
            if (b != null) {
                arrayList2.add(new Pair(a, ((C22048nc.C22050b) b).mo55903a()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.veriff.sdk.internal.upload.MediaUploadStatus.Completed");
            }
        }
        return arrayList2;
    }
}
