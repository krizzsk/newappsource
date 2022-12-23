package p054d0;

import androidx.camera.core.CameraX;
import androidx.camera.lifecycle.C0648c;
import androidx.camera.lifecycle.C0649d;
import androidx.camera.lifecycle.C0650e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.appboy.support.AppboyFileUtils;
import com.facebook.appevents.p047ml.ModelManager;
import com.facebook.internal.C2380b0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.play.core.appupdate.C14226d;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;
import p102h0.C5019d;
import p102h0.C5023g;
import p135j8.C5401f;
import p148k8.C5523b;
import p713ov.C18831a;
import p977zz.C20949l;

/* renamed from: d0.x0 */
public final /* synthetic */ class C4319x0 implements CallbackToFutureAdapter.C0674b, C5401f.C5402a, C2380b0.C2381a, SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f15295b;

    /* renamed from: c */
    public final /* synthetic */ Object f15296c;

    /* renamed from: d */
    public final /* synthetic */ Object f15297d;

    public /* synthetic */ C4319x0(int i, Object obj, Object obj2) {
        this.f15295b = i;
        this.f15296c = obj;
        this.f15297d = obj2;
    }

    /* renamed from: a */
    public final void mo19838a(File file) {
        ModelManager.C2345a aVar = (ModelManager.C2345a) this.f15296c;
        C24362h.m61211f(aVar, "$slave");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        aVar.f8557g = (C5523b) this.f15297d;
        aVar.f8556f = file;
        Runnable runnable = aVar.f8558h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f15295b) {
            case 0:
                ((AtomicReference) this.f15296c).set(aVar);
                return ((String) this.f15297d) + "-status";
            default:
                C0650e eVar = (C0650e) this.f15296c;
                CameraX cameraX = (CameraX) this.f15297d;
                synchronized (eVar.f2229a) {
                    C5023g.m12853a(C5019d.m12842a(eVar.f2231c).mo20734c(new C0648c(cameraX), C14226d.m35352s0()), new C0649d(cameraX, aVar), C14226d.m35352s0());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    public final boolean invoke(Object obj) {
        ((C18831a.C18832a) obj).mo45757P0(((C18831a) this.f15296c).f47945n, (String) this.f15297d);
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task then(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f15295b
            r2 = 0
            switch(r1) {
                case 4: goto L_0x004a;
                case 5: goto L_0x0008;
                case 6: goto L_0x000c;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = r25
            goto L_0x02e7
        L_0x000c:
            java.lang.Object r1 = r0.f15296c
            com.moovit.app.wondo.tickets.offers.WondoOffersActivity r1 = (com.moovit.app.wondo.tickets.offers.WondoOffersActivity) r1
            java.lang.Object r3 = r0.f15297d
            java.lang.String r3 = (java.lang.String) r3
            r4 = r26
            ry.a r4 = (p785ry.C19381a) r4
            int r5 = com.moovit.app.wondo.tickets.offers.WondoOffersActivity.f40757Z
            r1.getClass()
            if (r4 == 0) goto L_0x0044
            java.util.List<com.moovit.app.wondo.tickets.model.WondoOffer> r1 = r4.f49304b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
            goto L_0x0044
        L_0x0028:
            boolean r1 = p977zz.C20964s0.m49090h(r3)
            if (r1 == 0) goto L_0x0031
            java.util.List<com.moovit.app.wondo.tickets.model.WondoOffer> r1 = r4.f49304b
            goto L_0x003c
        L_0x0031:
            java.util.List<com.moovit.app.wondo.tickets.model.WondoOffer> r1 = r4.f49304b
            uy.a r5 = new uy.a
            r5.<init>(r3, r2)
            java.util.ArrayList r1 = c00.C13723g.m34282c(r1, r5)
        L_0x003c:
            zz.i0<java.lang.String, java.lang.String> r2 = r4.f49308f
            zz.i0 r3 = new zz.i0
            r3.<init>(r1, r2)
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r1
        L_0x004a:
            java.lang.Object r1 = r0.f15296c
            com.moovit.app.help.feedback.FeedbackFormActivity r1 = (com.moovit.app.help.feedback.FeedbackFormActivity) r1
            java.lang.Object r3 = r0.f15297d
            ws.j r3 = (p899ws.C20410j) r3
            r4 = r26
            java.lang.String r4 = (java.lang.String) r4
            int r5 = com.moovit.app.help.feedback.FeedbackFormActivity.f38102u0
            android.content.Context r1 = r1.getApplicationContext()
            zendesk.support.ProviderStore r5 = p970zs.C20889c.m48881b(r1)
            if (r5 != 0) goto L_0x006a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.forResult(r1)
            goto L_0x02e6
        L_0x006a:
            java.lang.String r6 = r3.f51713d
            java.lang.String r7 = r3.f51714e
            zendesk.core.AnonymousIdentity$Builder r8 = new zendesk.core.AnonymousIdentity$Builder
            r8.<init>()
            zendesk.core.AnonymousIdentity$Builder r6 = r8.withNameIdentifier(r6)
            zendesk.core.AnonymousIdentity$Builder r6 = r6.withEmailIdentifier(r7)
            zendesk.core.Identity r6 = r6.build()
            zendesk.core.Zendesk r7 = zendesk.core.Zendesk.INSTANCE
            r7.setIdentity(r6)
            r6 = 2
            r7 = 1
            if (r4 != 0) goto L_0x008b
            java.lang.String r4 = r3.f51717h
            goto L_0x0099
        L_0x008b:
            java.lang.String r8 = p977zz.C20964s0.f52718a
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = r3.f51717h
            r9[r2] = r10
            r9[r7] = r4
            java.lang.String r4 = p977zz.C20964s0.m49102t(r8, r9)
        L_0x0099:
            zendesk.support.CreateRequest r8 = new zendesk.support.CreateRequest
            r8.<init>()
            java.lang.String r9 = r3.f51718i
            r8.setSubject(r9)
            r8.setDescription(r4)
            com.moovit.app.help.feedback.CategoryType r4 = r3.f51711b
            java.lang.String r4 = r4.getCategoryTypeTag()
            com.moovit.app.help.feedback.FeedbackType r9 = r3.f51712c
            java.lang.String r9 = r9.getFeedbackTypeTag()
            java.lang.String r10 = r3.f51710a
            java.util.List<java.lang.String> r11 = r3.f51719j
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r7
            java.lang.String r12 = r3.f51715f
            long r13 = p977zz.C20930c.m49023e(r1)
            java.lang.String r15 = r3.f51716g
            if (r15 == 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            java.lang.String r15 = "unknown"
        L_0x00c9:
            java.util.HashSet r16 = p824tp.C19728f.f50164e
            java.lang.String r6 = "metro_context"
            java.lang.Object r6 = r1.getSystemService(r6)
            tp.f r6 = (p824tp.C19728f) r6
            java.lang.String r16 = "None"
            if (r6 != 0) goto L_0x00da
            r7 = r16
            goto L_0x00e2
        L_0x00da:
            g30.h r7 = r6.f50165a
            com.moovit.network.model.ServerId r7 = r7.f16126a
            java.lang.String r7 = r7.mo19751c()
        L_0x00e2:
            if (r6 != 0) goto L_0x00e7
            r2 = r16
            goto L_0x00eb
        L_0x00e7:
            g30.h r2 = r6.f50165a
            java.lang.String r2 = r2.f16129d
        L_0x00eb:
            if (r6 != 0) goto L_0x00f0
            r0 = r16
            goto L_0x00f4
        L_0x00f0:
            g30.h r0 = r6.f50165a
            java.lang.String r0 = r0.f16130e
        L_0x00f4:
            if (r6 != 0) goto L_0x00f9
            r6 = r16
            goto L_0x00fd
        L_0x00f9:
            g30.h r6 = r6.f50165a
            java.lang.String r6 = r6.f16141p
        L_0x00fd:
            r17 = r5
            r5 = 2131887517(0x7f12059d, float:1.9409643E38)
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = android.os.Build.MANUFACTURER
            r18 = r3
            java.lang.String r3 = android.os.Build.MODEL
            r19 = r8
            r8 = 16
            zendesk.support.CustomField[] r8 = new zendesk.support.CustomField[r8]
            r20 = r15
            zendesk.support.CustomField r15 = new zendesk.support.CustomField
            r21 = 28114565(0x1acfe85, double:1.38904407E-316)
            r23 = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r21)
            java.lang.String r14 = "android"
            r15.<init>(r13, r14)
            r13 = 0
            r8[r13] = r15
            zendesk.support.CustomField r14 = new zendesk.support.CustomField
            r21 = 360003256220(0x53d1ddbf9c, double:1.778652412893E-312)
            java.lang.Long r15 = java.lang.Long.valueOf(r21)
            r14.<init>(r15, r4)
            r4 = 1
            r8[r4] = r14
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r14 = 360000412060(0x53d1b2599c, double:1.778638360875E-312)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r4.<init>(r14, r9)
            r9 = 2
            r8[r9] = r4
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r14 = 360003055300(0x53d1daaec4, double:1.778651420216E-312)
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r4.<init>(r9, r7)
            r7 = 3
            r8[r7] = r4
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r14 = 360003055320(0x53d1daaed8, double:1.778651420315E-312)
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r4.<init>(r9, r2)
            r2 = 4
            r8[r2] = r4
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r14 = 360018202319(0x53d2c1cecf, double:1.778726256433E-312)
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r0.getClass()
            int r14 = r0.hashCode()
            r15 = 2058(0x80a, float:2.884E-42)
            r13 = 5
            if (r14 == r15) goto L_0x01bd
            switch(r14) {
                case 65: goto L_0x01b2;
                case 66: goto L_0x01a7;
                case 67: goto L_0x019c;
                case 68: goto L_0x0191;
                case 69: goto L_0x0186;
                default: goto L_0x0185;
            }
        L_0x0185:
            goto L_0x01c5
        L_0x0186:
            java.lang.String r14 = "E"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x018f
            goto L_0x01c5
        L_0x018f:
            r0 = 4
            goto L_0x01c8
        L_0x0191:
            java.lang.String r14 = "D"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x019a
            goto L_0x01c5
        L_0x019a:
            r0 = 3
            goto L_0x01c8
        L_0x019c:
            java.lang.String r14 = "C"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01a5
            goto L_0x01c5
        L_0x01a5:
            r0 = 2
            goto L_0x01c8
        L_0x01a7:
            java.lang.String r14 = "B"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01b0
            goto L_0x01c5
        L_0x01b0:
            r0 = 1
            goto L_0x01c8
        L_0x01b2:
            java.lang.String r14 = "A"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01bb
            goto L_0x01c5
        L_0x01bb:
            r0 = 0
            goto L_0x01c8
        L_0x01bd:
            java.lang.String r14 = "A+"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01c7
        L_0x01c5:
            r0 = -1
            goto L_0x01c8
        L_0x01c7:
            r0 = 5
        L_0x01c8:
            if (r0 == 0) goto L_0x01e6
            r14 = 1
            if (r0 == r14) goto L_0x01e3
            r14 = 2
            if (r0 == r14) goto L_0x01e0
            if (r0 == r7) goto L_0x01dd
            if (r0 == r2) goto L_0x01da
            if (r0 == r13) goto L_0x01d7
            goto L_0x01e8
        L_0x01d7:
            java.lang.String r16 = "metro_class_aa"
            goto L_0x01e8
        L_0x01da:
            java.lang.String r16 = "metro_class_e"
            goto L_0x01e8
        L_0x01dd:
            java.lang.String r16 = "metro_class_d"
            goto L_0x01e8
        L_0x01e0:
            java.lang.String r16 = "metro_class_c"
            goto L_0x01e8
        L_0x01e3:
            java.lang.String r16 = "metro_class_b"
            goto L_0x01e8
        L_0x01e6:
            java.lang.String r16 = "metro_class_a"
        L_0x01e8:
            r0 = r16
            r4.<init>(r9, r0)
            r8[r13] = r4
            zendesk.support.CustomField r0 = new zendesk.support.CustomField
            r13 = 360008147279(0x53d228614f, double:1.778676577935E-312)
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r0.<init>(r2, r6)
            r2 = 6
            r8[r2] = r0
            r0 = 7
            zendesk.support.CustomField r4 = new zendesk.support.CustomField
            r6 = 360003055340(0x53d1daaeec, double:1.778651420414E-312)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.<init>(r6, r1)
            r8[r0] = r4
            r0 = 8
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r6 = 360003055380(0x53d1daaf14, double:1.77865142061E-312)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "5.108.1.564"
            r1.<init>(r4, r6)
            r8[r0] = r1
            r0 = 9
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r6 = 360007958599(0x53d2258047, double:1.77867564573E-312)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r1.<init>(r4, r5)
            r8[r0] = r1
            r0 = 10
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r4 = 360007949040(0x53d2255af0, double:1.778675598504E-312)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.<init>(r4, r3)
            r8[r0] = r1
            r0 = 11
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r3 = 360009691779(0x53d23ff283, double:1.77868420878E-312)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.<init>(r3, r10)
            r8[r0] = r1
            r0 = 12
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r3 = 360010309499(0x53d2495f7b, double:1.77868726072E-312)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            if (r11 == 0) goto L_0x026d
            java.lang.String r4 = "Yes"
            goto L_0x026f
        L_0x026d:
            java.lang.String r4 = "No"
        L_0x026f:
            r1.<init>(r3, r4)
            r8[r0] = r1
            r0 = 13
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r3 = 7180377832338(0x687cfdebb92, double:3.547578011118E-311)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.<init>(r3, r12)
            r8[r0] = r1
            r0 = 14
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r3 = 4505981160978(0x41921680e12, double:2.226250492447E-311)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r23)
            r1.<init>(r3, r4)
            r8[r0] = r1
            r0 = 15
            zendesk.support.CustomField r1 = new zendesk.support.CustomField
            r3 = 360010135199(0x53d246b69f, double:1.778686399565E-312)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r15 = r20
            r1.<init>(r3, r15)
            r8[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r8)
            r1 = r19
            r1.setCustomFields(r0)
            r3 = r18
            java.util.List<java.lang.String> r0 = r3.f51719j
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x02c6
            r1.setAttachments(r0)
        L_0x02c6:
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            zendesk.support.RequestProvider r3 = r17.requestProvider()
            zs.c$a r4 = new zs.c$a
            r4.<init>(r0)
            r3.createRequest(r1, r4)
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            java.util.concurrent.ExecutorService r1 = com.moovit.MoovitExecutors.COMPUTATION
            br.f r3 = new br.f
            r3.<init>(r2)
            com.google.android.gms.tasks.Task r1 = r0.onSuccessTask(r1, r3)
        L_0x02e6:
            return r1
        L_0x02e7:
            java.lang.Object r1 = r0.f15296c
            m80.v r1 = (m80.C12887v) r1
            java.lang.Object r2 = r0.f15297d
            v80.b r2 = (v80.C13184b) r2
            r3 = r26
            c70.e r3 = (c70.C13752e) r3
            java.util.concurrent.ThreadPoolExecutor r4 = m80.C12887v.f31893d
            r1.getClass()
            java.util.concurrent.ExecutorService r4 = com.moovit.MoovitExecutors.f37327IO
            q80.g r5 = new q80.g
            com.moovit.MoovitApplication<?, ?, ?> r1 = r1.f31895a
            p80.b r1 = m80.C12887v.m32670f(r1)
            r5.<init>(r3, r1, r2)
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.call(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054d0.C4319x0.then(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
