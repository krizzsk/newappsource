package com.veriff.sdk.views.camera;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bf0.C21050d;
import bi0.C21073k;
import ci0.C21207b;
import com.appboy.support.AppboyImageUtils;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21637fn;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21719gi;
import com.veriff.sdk.internal.C21783is;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C21791iy;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22035mq;
import com.veriff.sdk.internal.C22036mr;
import com.veriff.sdk.internal.C22047nb;
import com.veriff.sdk.internal.C22061nh;
import com.veriff.sdk.internal.C22201oj;
import com.veriff.sdk.internal.C22232os;
import com.veriff.sdk.internal.C22336qo;
import com.veriff.sdk.internal.C22346qq;
import com.veriff.sdk.internal.C22420rr;
import com.veriff.sdk.internal.C22466rz;
import com.veriff.sdk.internal.C22499sd;
import com.veriff.sdk.internal.C22549tg;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22686xi;
import com.veriff.sdk.internal.C22689xj;
import com.veriff.sdk.internal.C22700xq;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.C22934e;
import com.veriff.sdk.views.ScreenRunner;
import com.veriff.sdk.views.base.verification.C22814a;
import com.veriff.sdk.views.camera.C22863d;
import com.veriff.sdk.views.camera.C22875j;
import id0.C23579a;
import id0.C23580b;
import id0.C23581c;
import id0.C23585g;
import java.io.File;
import java.util.List;
import java.util.UUID;
import mobi.lab.veriff.data.C24420a;
import mobi.lab.veriff.data.C24422b;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24467l;
import mobi.lab.veriff.util.C24469n;
import p584jl.C17885a;
import wh0.C25162c0;
import wh0.C25184i0;

public class FlowActivity extends C22814a implements C22686xi.C22688b, C22863d.C22867d, s$c, C22934e {

    /* renamed from: l */
    private s$b f57906l;

    /* renamed from: m */
    private s$a f57907m;

    /* renamed from: n */
    private C22047nb f57908n;

    /* renamed from: o */
    private C22061nh f57909o;

    /* renamed from: p */
    private C22036mr f57910p;

    /* renamed from: q */
    private String f57911q;

    /* renamed from: r */
    private C24424c f57912r;

    /* renamed from: s */
    private ScreenRunner f57913s;

    /* renamed from: t */
    private ScreenRunner f57914t;

    /* renamed from: u */
    private C22904r f57915u;

    /* renamed from: v */
    private C22700xq f57916v;

    /* renamed from: w */
    private C22686xi f57917w;

    /* renamed from: com.veriff.sdk.views.camera.FlowActivity$2 */
    public static /* synthetic */ class C228242 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57919a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.internal.jp[] r0 = com.veriff.sdk.internal.C21882jp.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57919a = r0
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.FACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.DOCUMENT_FRONT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.DOCUMENT_BACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.DOCUMENT_AND_FACE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.DOCUMENT_BACK_BARCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.DOCUMENT_NFC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f57919a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.veriff.sdk.internal.jp r1 = com.veriff.sdk.internal.C21882jp.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.FlowActivity.C228242.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ C22833ah m56113A() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ C22549tg m56114B() {
        return this.f57907m.mo57765a().mo57021e().mo60569a().mo55485d();
    }

    /* renamed from: a */
    public static Intent m56115a(Context context, C24426d dVar, C21895jw jwVar, String str, C24424c cVar, List<C21791iy> list, List<C21791iy> list2) {
        Intent intent = new Intent(context, FlowActivity.class);
        intent.setFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
        C22814a.m56078a(intent, dVar, jwVar);
        intent.putExtra("mobi.lab.veriff.views.camera.EXTRA_DOCUMENT_TYPE", str);
        intent.putExtra("mobi.lab.veriff.views.camera.EXTRA_COUNTRY", cVar);
        String str2 = null;
        String a = jwVar.mo55638a() != null ? jwVar.mo55638a().mo56957a() : null;
        if (jwVar.mo55639b() != null) {
            str2 = jwVar.mo55639b().mo56957a();
        }
        intent.putExtra("mobi.lab.veriff.views.camera.EXTRA_SESSION", m56116a(a, str2, list, list2));
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ C21050d m56118b(Integer num) {
        mo56153a(num);
        return C21050d.f52856a;
    }

    /* renamed from: c */
    private C22904r m56121c(C24422b bVar) {
        switch (C228242.f57919a[bVar.mo60569a().mo55486e().ordinal()]) {
            case 1:
                C22201oj b = this.f56065c.mo54911e().mo56109b();
                if (b instanceof C22201oj.C22204b) {
                    if (mo57577m().mo55467s()) {
                        mo56159j().mo54908b().mo54921a(C21716gg.m52941d(bVar.mo60569a(), mo57577m()));
                        return m56117a(((C22201oj.C22204b) b).mo56112a());
                    }
                    mo56159j().mo54908b().mo54921a(C21716gg.m52898a(bVar.mo60569a(), mo57577m(), C21667gf.C21709b.flag_disabled));
                } else if (b instanceof C22201oj.C22202a) {
                    mo56159j().mo54908b().mo54921a(C21716gg.m52898a(bVar.mo60569a(), mo57577m(), ((C22201oj.C22202a) b).mo56111a()));
                }
                return m56127r();
            case 2:
            case 3:
            case 4:
                return m56127r();
            case 5:
                return m56128s();
            case 6:
                return m56129t();
            case 7:
                return m56130u();
            default:
                StringBuilder k = C13555b.m33972k("Unknown context ");
                k.append(bVar.mo60569a().mo55486e());
                throw new IllegalStateException(k.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.veriff.sdk.views.camera.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.veriff.sdk.views.camera.j$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.veriff.sdk.views.camera.j$a} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.veriff.sdk.views.camera.C22904r m56127r() {
        /*
            r17 = this;
            r14 = r17
            com.veriff.sdk.views.camera.ai r3 = new com.veriff.sdk.views.camera.ai
            com.veriff.sdk.internal.ix r0 = r17.mo57577m()
            id0.d r1 = new id0.d
            r1.<init>(r14)
            r3.<init>(r0, r1)
            com.veriff.sdk.views.camera.h r11 = new com.veriff.sdk.views.camera.h
            com.veriff.sdk.internal.fp r0 = r14.f56065c
            com.veriff.sdk.internal.nk r2 = r0.mo54909c()
            com.veriff.sdk.internal.ix r4 = r17.mo57577m()
            com.veriff.sdk.views.camera.s$a r0 = r14.f57907m
            com.veriff.sdk.internal.wm r5 = r0.mo57765a()
            java.lang.String r6 = r14.f57911q
            com.veriff.sdk.internal.fp r0 = r14.f56065c
            mobi.lab.veriff.util.h r0 = r0.mo54912f()
            mobi.lab.veriff.util.g r0 = r0.mo60696b()
            java.lang.String r7 = r0.mo60678c()
            r0 = r11
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.veriff.sdk.internal.xq r12 = new com.veriff.sdk.internal.xq
            mobi.lab.veriff.data.d r0 = r17.mo56158h_()
            com.veriff.sdk.internal.xo r0 = r0.mo60604g()
            r12.<init>(r14, r0)
            com.veriff.sdk.internal.ix r0 = r17.mo57577m()
            boolean r0 = r0.mo55453f()
            if (r0 == 0) goto L_0x0065
            com.veriff.sdk.internal.fp r0 = r17.mo56159j()
            com.veriff.sdk.internal.kf r0 = r0.mo54910d()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "nowebrtc build used with inflow_feedback_face_detection=true"
            r1.<init>(r2)
            com.veriff.sdk.internal.gj r2 = com.veriff.sdk.internal.C21720gj.video
            java.lang.String r3 = "createCameraScreen"
            r0.mo55691b(r1, r3, r2)
        L_0x0065:
            com.veriff.sdk.views.camera.j$b r0 = com.veriff.sdk.views.camera.C22875j.f58068b
            com.veriff.sdk.views.camera.j r0 = r0.mo57742a()
            if (r0 != 0) goto L_0x00a4
            id0.e r0 = new id0.e
            r0.<init>()
            boolean r1 = r11.mo57700c()
            if (r1 == 0) goto L_0x007d
            id0.c r0 = new id0.c
            r0.<init>(r11)
        L_0x007d:
            r10 = r0
            com.veriff.sdk.views.camera.j$a r13 = new com.veriff.sdk.views.camera.j$a
            mobi.lab.veriff.util.l r2 = new mobi.lab.veriff.util.l
            r2.<init>()
            com.veriff.sdk.internal.fp r3 = r14.f56065c
            com.veriff.sdk.internal.nb r4 = r14.f57908n
            com.veriff.sdk.internal.ix r5 = r17.mo57577m()
            com.veriff.sdk.internal.fm r6 = com.veriff.sdk.internal.C21637fn.m52520a()
            com.veriff.sdk.internal.fm r7 = com.veriff.sdk.internal.C21637fn.m52523c()
            com.veriff.sdk.internal.fm r8 = com.veriff.sdk.internal.C21637fn.m52526f()
            com.veriff.sdk.internal.fm r9 = com.veriff.sdk.internal.C21637fn.m52527g()
            r0 = r13
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00a5
        L_0x00a4:
            r13 = r0
        L_0x00a5:
            com.veriff.sdk.views.camera.n r15 = new com.veriff.sdk.views.camera.n
            com.veriff.sdk.internal.fm r4 = com.veriff.sdk.internal.C21637fn.m52523c()
            com.veriff.sdk.internal.fp r0 = r14.f56065c
            com.veriff.sdk.internal.fu r5 = r0.mo54908b()
            com.veriff.sdk.internal.fp r0 = r14.f56065c
            mobi.lab.veriff.util.h r0 = r0.mo54912f()
            com.veriff.sdk.internal.ex r6 = r0.mo60691a()
            com.veriff.sdk.internal.ix r7 = r17.mo57577m()
            com.veriff.sdk.internal.nh r8 = r14.f57909o
            mobi.lab.veriff.util.l r9 = new mobi.lab.veriff.util.l
            r9.<init>()
            com.veriff.sdk.internal.fp r0 = r14.f56065c
            com.veriff.sdk.internal.oh r16 = r0.mo54911e()
            r0 = r15
            r1 = r17
            r2 = r17
            r3 = r11
            r10 = r12
            r11 = r16
            r12 = r13
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.FlowActivity.m56127r():com.veriff.sdk.views.camera.r");
    }

    /* renamed from: s */
    private C22904r m56128s() {
        return new C22232os(this, this, new C24467l(), mo56159j().mo54908b(), this.f56065c.mo54910d(), mo57577m(), this.f57907m.mo57765a(), mo56159j().mo54912f(), mo56158h_().mo60604g(), this.f57909o, mo56159j().mo54909c(), C21637fn.m52524d(), C21637fn.m52520a(), C21637fn.m52523c());
    }

    /* renamed from: t */
    private C22904r m56129t() {
        C21645fu b = this.f56065c.mo54908b();
        C24467l lVar = r6;
        C24467l lVar2 = new C24467l();
        return new C22499sd(this, this, this, b, lVar, this.f56065c.mo54910d(), this.f56065c.mo54912f(), mo56158h_().mo60604g(), mo57577m(), this.f57907m.mo57765a(), this.f56065c.mo54909c(), this.f57908n, C22420rr.f56591a.mo56498a(this, mo57577m()), this.f57907m.mo57769b(), this.f57912r, this.f57916v);
    }

    /* renamed from: u */
    private C22904r m56130u() {
        C22875j.C22876a aVar;
        C23581c cVar;
        C22871h v = m56131v();
        C22875j a = C22875j.f58068b.mo57742a();
        if (a == null) {
            new C23580b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r1v3 ? I:id0.b) =  call: id0.b.<init>():void type: CONSTRUCTOR in method: com.veriff.sdk.views.camera.FlowActivity.u():com.veriff.sdk.views.camera.r, dex: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v3 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                com.veriff.sdk.views.camera.h r0 = r14.m56131v()
                com.veriff.sdk.views.camera.j$b r1 = com.veriff.sdk.views.camera.C22875j.f58068b
                com.veriff.sdk.views.camera.j r1 = r1.mo57742a()
                if (r1 != 0) goto L_0x0043
                id0.b r1 = new id0.b
                r1.<init>()
                boolean r2 = r0.mo57700c()
                if (r2 == 0) goto L_0x001c
                id0.c r1 = new id0.c
                r1.<init>(r0)
            L_0x001c:
                r10 = r1
                com.veriff.sdk.views.camera.j$a r11 = new com.veriff.sdk.views.camera.j$a
                mobi.lab.veriff.util.l r2 = new mobi.lab.veriff.util.l
                r2.<init>()
                com.veriff.sdk.internal.fp r3 = r14.f56065c
                com.veriff.sdk.internal.nb r4 = r14.f57908n
                com.veriff.sdk.internal.ix r5 = r14.mo57577m()
                com.veriff.sdk.internal.fm r6 = com.veriff.sdk.internal.C21637fn.m52520a()
                com.veriff.sdk.internal.fm r7 = com.veriff.sdk.internal.C21637fn.m52523c()
                com.veriff.sdk.internal.fm r8 = com.veriff.sdk.internal.C21637fn.m52526f()
                com.veriff.sdk.internal.fm r9 = com.veriff.sdk.internal.C21637fn.m52527g()
                r0 = r11
                r1 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r5 = r11
                goto L_0x0044
            L_0x0043:
                r5 = r1
            L_0x0044:
                com.veriff.sdk.internal.nv r13 = new com.veriff.sdk.internal.nv
                com.veriff.sdk.internal.xq r3 = r14.f57916v
                com.veriff.sdk.internal.fp r0 = r14.f56065c
                mobi.lab.veriff.util.h r0 = r0.mo54912f()
                com.veriff.sdk.internal.ex r4 = r0.mo60691a()
                com.veriff.sdk.views.camera.s$a r0 = r14.f57907m
                com.veriff.sdk.internal.wm r6 = r0.mo57765a()
                com.veriff.sdk.internal.mr r7 = r14.f57910p
                com.veriff.sdk.internal.nh r8 = r14.f57909o
                com.veriff.sdk.internal.fm r9 = com.veriff.sdk.internal.C21637fn.m52523c()
                com.veriff.sdk.internal.fp r10 = r14.f56065c
                com.veriff.sdk.internal.ix r11 = r14.mo57577m()
                r0 = r13
                r1 = r14
                r2 = r14
                r12 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.FlowActivity.m56130u():com.veriff.sdk.views.camera.r");
        }

        /* renamed from: v */
        private C22871h m56131v() {
            return new C22871h(this, this.f56065c.mo54909c(), new C22834ai(mo57577m(), new C23585g(this)), mo57577m(), this.f57907m.mo57765a(), this.f57911q, this.f56065c.mo54912f().mo60696b().mo60678c());
        }

        /* renamed from: w */
        private void m56132w() {
            this.f57913s.mo57559a();
            this.f57915u = null;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ C22549tg m56133x() {
            return this.f57907m.mo57765a().mo57021e().mo60569a().mo55485d();
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public static /* synthetic */ C22833ah m56134y() {
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static /* synthetic */ C22833ah m56135z() {
            return null;
        }

        /* renamed from: d */
        public void mo57611d() {
            this.f57906l.mo57785d();
        }

        /* renamed from: e */
        public void mo57612e() {
            this.f57906l.mo57786e();
        }

        /* renamed from: f */
        public void mo57613f() {
            this.f57906l.mo57787f();
        }

        /* renamed from: g */
        public void mo57614g() {
            this.f57906l.mo57788g();
        }

        /* renamed from: h */
        public void mo57615h() {
            this.f57906l.mo57789h();
        }

        /* renamed from: i */
        public void mo57616i() {
            this.f57906l.mo57790i();
        }

        /* renamed from: n */
        public void mo57617n() {
            this.f57915u.mo56012b_();
        }

        /* renamed from: o */
        public void mo57618o() {
            C24469n.C24470a aVar = C24469n.f61931a;
            aVar.mo60714a(mo56158h_().mo60604g(), this.f56065c.mo54912f().mo60691a(), mo57577m());
            try {
                this.f57914t.mo57561a((C22932d) new C22930y(this, this.f57916v));
                m56132w();
                aVar.mo60718d();
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            this.f57917w.onResult(i, i2, intent);
        }

        public void onBackPressed() {
            if (!this.f57914t.mo56147f()) {
                mo57597a(this.f57914t.getPage(), C21719gi.BACK_BUTTON);
            } else if (!this.f57913s.mo56147f()) {
                mo57597a(this.f57913s.getPage(), C21719gi.BACK_BUTTON);
            }
        }

        public void onDestroy() {
            super.onDestroy();
            this.f57913s.destroy();
            this.f57914t.destroy();
        }

        public void onPause() {
            super.onPause();
            this.f57913s.pause();
            this.f57914t.pause();
        }

        public void onResume() {
            super.onResume();
            this.f57913s.resume();
            this.f57914t.resume();
        }

        public void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putParcelable("mobi.lab.veriff.views.camera.STATE_SESSION", this.f57907m.mo57765a());
            bundle.putParcelable("mobi.lab.veriff.views.camera.STATE_MRZ_INFO", this.f57907m.mo57769b());
        }

        public void onStart() {
            super.onStart();
            this.f57913s.start();
            this.f57914t.start();
        }

        public void onStop() {
            super.onStop();
            this.f57913s.stop();
            this.f57914t.stop();
        }

        /* renamed from: p */
        public void mo57619p() {
            m56132w();
            this.f57914t.mo57559a();
            this.f57890h.mo57582a(this.f57907m.mo57765a(), this.f57911q);
        }

        /* renamed from: q */
        public void mo57620q() {
            this.f57914t.mo57559a();
        }

        /* renamed from: b */
        private void m56119b(C24422b bVar) {
            C22904r rVar = this.f57915u;
            if (rVar == null || !rVar.mo56011a(bVar.mo60569a().mo55486e())) {
                C24469n.C24470a aVar = C24469n.f61931a;
                aVar.mo60714a(mo56158h_().mo60604g(), this.f56065c.mo54912f().mo60691a(), mo57577m());
                try {
                    C22904r c = m56121c(bVar);
                    this.f57915u = c;
                    this.f57913s.mo57561a((C22932d) c);
                    aVar.mo60718d();
                } catch (Throwable th) {
                    C24469n.f61931a.mo60718d();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private static C22661wm m56116a(String str, String str2, List<C21791iy> list, List<C21791iy> list2) {
            return new C22661wm(UUID.randomUUID().toString(), str, str2, new C24420a(list), list2);
        }

        /* renamed from: a */
        public void mo57572a(boolean z, Bundle bundle) {
            C22466rz rzVar;
            C22661wm wmVar;
            if (bundle != null) {
                wmVar = (C22661wm) bundle.getParcelable("mobi.lab.veriff.views.camera.STATE_SESSION");
                rzVar = (C22466rz) bundle.getParcelable("mobi.lab.veriff.views.camera.STATE_MRZ_INFO");
            } else {
                wmVar = (C22661wm) getIntent().getParcelableExtra("mobi.lab.veriff.views.camera.EXTRA_SESSION");
                rzVar = (C22466rz) getIntent().getParcelableExtra("mobi.lab.veriff.views.camera.EXTRA_MRZ_INFO");
                if (rzVar == null) {
                    rzVar = C22466rz.f56684a.mo56569a();
                }
            }
            C22661wm wmVar2 = wmVar;
            C22466rz rzVar2 = rzVar;
            this.f57916v = new C22700xq(this, this.f56064b.mo60604g());
            this.f57911q = getIntent().getStringExtra("mobi.lab.veriff.views.camera.EXTRA_DOCUMENT_TYPE");
            this.f57912r = (C24424c) getIntent().getParcelableExtra("mobi.lab.veriff.views.camera.EXTRA_COUNTRY");
            final C22929x xVar = new C22929x(this);
            setContentView(xVar);
            ScreenRunner screenRunner = new ScreenRunner(xVar.getFlowContainer());
            this.f57913s = screenRunner;
            screenRunner.create();
            ScreenRunner screenRunner2 = new ScreenRunner(xVar.getOverlayContainer());
            this.f57914t = screenRunner2;
            screenRunner2.create();
            this.f57914t.mo57560a((ScreenRunner.C22806a) new ScreenRunner.C22806a(this) {
                /* renamed from: a */
                public void mo57563a(C22932d dVar) {
                    xVar.getFlowContainer().setInert(true);
                }

                /* renamed from: a */
                public void mo57562a() {
                    xVar.getFlowContainer().setInert(false);
                }
            });
            C22926w wVar = new C22926w(new C23579a(this));
            this.f57913s.mo57560a(wVar.mo57810b());
            this.f57914t.mo57560a(wVar.mo57809a());
            C22035mq mqVar = new C22035mq(this, mo56158h_().mo60603f());
            this.f57908n = mqVar;
            this.f57909o = new C22061nh(mqVar, mo56159j().mo54910d());
            this.f57910p = new C22036mr(this.f57908n, mo56159j().mo54910d());
            this.f57907m = new C22906t(mo57577m(), this.f56065c.mo54909c(), wmVar2, rzVar2, this.f57911q, this.f56065c.mo54912f().mo60697c());
            C22689xj a = C22689xj.f57342b.mo57076a();
            if (a == null) {
                a = new C22689xj.C22690a();
            }
            this.f57917w = a.create(this, this);
            C22907u uVar = new C22907u(this, this.f57907m, mo56159j().mo54908b(), mo56159j().mo54910d(), mo57577m(), C17885a.m44426W(this));
            this.f57906l = uVar;
            uVar.mo56242a();
        }

        /* renamed from: b */
        public void mo57609b() {
            this.f57906l.mo57784c();
        }

        /* renamed from: b */
        public void mo57074b(List<? extends Uri> list) {
            C22904r rVar = this.f57915u;
            if (rVar != null) {
                rVar.mo56009a(list);
                return;
            }
            throw new IllegalStateException("Screen cannot be null when showing file selection");
        }

        /* renamed from: c */
        public void mo57610c() {
            this.f57906l.mo57786e();
        }

        /* renamed from: a */
        public void mo57605a(C24422b bVar) {
            m56119b(bVar);
            this.f57915u.mo56010a(bVar);
        }

        /* renamed from: a */
        public void mo57607a(boolean z, int i) {
            mo56155a(z, i, this.f57907m.mo57765a());
        }

        /* renamed from: a */
        public void mo57596a(int i) {
            Intent putExtra = new Intent(this, FlowActivity.class).addFlags(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES).putExtra("mobi.lab.veriff.views.camera.EXTRA_DOCUMENT_TYPE", this.f57911q).putExtra("mobi.lab.veriff.views.camera.EXTRA_SESSION", this.f57907m.mo57765a()).putExtra("mobi.lab.veriff.views.camera.EXTRA_MRZ_INFO", this.f57907m.mo57769b());
            C22814a.m56078a(putExtra, this.f56064b, this.f57888f);
            this.f57890h.mo57578a(i, this.f57907m.mo57765a(), putExtra);
        }

        /* renamed from: a */
        public void mo57595a() {
            this.f57906l.mo57783b();
        }

        /* renamed from: a */
        public void mo57604a(List<C21791iy> list) {
            C24469n.C24470a aVar = C24469n.f61931a;
            aVar.mo60714a(mo56158h_().mo60604g(), this.f56065c.mo54912f().mo60691a(), mo57577m());
            try {
                ScreenRunner screenRunner = this.f57914t;
                C22700xq xqVar = this.f57916v;
                C21789ix m = mo57577m();
                C21616ex a = mo56159j().mo54912f().mo60691a();
                C21207b bVar = C25184i0.f63459a;
                screenRunner.mo57561a((C22932d) new C22336qo(this, this, xqVar, list, m, a, C21073k.f52890a, mo56159j().mo54909c(), mo56159j().mo54913g(), mo56158h_().mo60597b(), mo56159j().mo54908b()));
                m56132w();
                aVar.mo60718d();
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo57598a(C21791iy iyVar) {
            C24469n.C24470a aVar = C24469n.f61931a;
            aVar.mo60714a(mo56158h_().mo60604g(), this.f56065c.mo54912f().mo60691a(), mo57577m());
            try {
                this.f57914t.mo57561a((C22932d) new C22346qq(this, this, this.f56065c.mo54912f(), iyVar, mo57577m(), mo56159j().mo54908b(), this.f57916v));
                aVar.mo60718d();
            } catch (Throwable th) {
                C24469n.f61931a.mo60718d();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo57597a(C21783is isVar, C21719gi giVar) {
            mo56152a(isVar, giVar, this.f57907m.mo57765a());
        }

        /* renamed from: a */
        public void mo57600a(C22466rz rzVar) {
            this.f57906l.mo57778a(rzVar);
        }

        /* renamed from: a */
        public void mo57603a(File file) {
            this.f57906l.mo57781a(file);
        }

        /* renamed from: a */
        public void mo57599a(C21791iy iyVar, List<C21791iy> list) {
            this.f57914t.mo57559a();
            this.f57906l.mo57777a(iyVar, list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.veriff.sdk.views.camera.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.veriff.sdk.views.camera.j$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.veriff.sdk.views.camera.j$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.veriff.sdk.views.camera.j$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.veriff.sdk.views.camera.C22904r m56117a(com.veriff.sdk.detector.FaceDetector r17) {
            /*
                r16 = this;
                r14 = r16
                com.veriff.sdk.views.camera.h r0 = r16.m56131v()
                com.veriff.sdk.views.camera.j$b r1 = com.veriff.sdk.views.camera.C22875j.f58068b
                com.veriff.sdk.views.camera.j r1 = r1.mo57742a()
                if (r1 != 0) goto L_0x0045
                id0.f r1 = new id0.f
                r1.<init>()
                boolean r2 = r0.mo57700c()
                if (r2 == 0) goto L_0x001e
                id0.c r1 = new id0.c
                r1.<init>(r0)
            L_0x001e:
                r10 = r1
                com.veriff.sdk.views.camera.j$a r11 = new com.veriff.sdk.views.camera.j$a
                mobi.lab.veriff.util.l r2 = new mobi.lab.veriff.util.l
                r2.<init>()
                com.veriff.sdk.internal.fp r3 = r14.f56065c
                com.veriff.sdk.internal.nb r4 = r14.f57908n
                com.veriff.sdk.internal.ix r5 = r16.mo57577m()
                com.veriff.sdk.internal.fm r6 = com.veriff.sdk.internal.C21637fn.m52520a()
                com.veriff.sdk.internal.fm r7 = com.veriff.sdk.internal.C21637fn.m52523c()
                com.veriff.sdk.internal.fm r8 = com.veriff.sdk.internal.C21637fn.m52526f()
                com.veriff.sdk.internal.fm r9 = com.veriff.sdk.internal.C21637fn.m52527g()
                r0 = r11
                r1 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x0046
            L_0x0045:
                r11 = r1
            L_0x0046:
                com.veriff.sdk.internal.od r15 = new com.veriff.sdk.internal.od
                com.veriff.sdk.internal.fp r0 = r16.mo56159j()
                com.veriff.sdk.internal.fu r3 = r0.mo54908b()
                com.veriff.sdk.internal.fp r0 = r16.mo56159j()
                com.veriff.sdk.internal.kf r4 = r0.mo54910d()
                com.veriff.sdk.internal.ix r5 = r16.mo57577m()
                com.veriff.sdk.internal.fp r0 = r16.mo56159j()
                com.veriff.sdk.internal.nk r6 = r0.mo54909c()
                com.veriff.sdk.internal.fp r0 = r16.mo56159j()
                mobi.lab.veriff.util.h r7 = r0.mo54912f()
                mobi.lab.veriff.util.l r8 = new mobi.lab.veriff.util.l
                r8.<init>()
                com.veriff.sdk.views.camera.s$a r0 = r14.f57907m
                com.veriff.sdk.internal.wm r9 = r0.mo57765a()
                com.veriff.sdk.internal.nh r10 = r14.f57909o
                r0 = r15
                r1 = r16
                r2 = r16
                r12 = r17
                r13 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.FlowActivity.m56117a(com.veriff.sdk.detector.FaceDetector):com.veriff.sdk.views.camera.r");
        }

        /* renamed from: a */
        public void mo57606a(C25162c0<Boolean> c0Var) {
            this.f57906l.mo57782a(c0Var);
        }

        /* renamed from: a */
        public void mo57602a(C22849ao aoVar) {
            this.f57906l.mo57780a(aoVar);
        }

        /* renamed from: a */
        public void mo57601a(C22833ah ahVar, File file, long j, long j2) {
            this.f57906l.mo57779a(ahVar, file, j, j2);
        }

        /* renamed from: a */
        public void mo57608a(String[] strArr) {
            this.f57917w.showFilesSelector(strArr, mo57577m().mo55443T());
        }
    }
