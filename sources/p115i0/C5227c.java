package p115i0;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.JsonReader;
import android.view.Surface;
import androidx.camera.core.C0631r;
import androidx.camera.core.SurfaceRequest;
import androidx.recyclerview.widget.RecyclerView;
import b50.C25545b;
import c00.C13733n;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.perf.p414v1.C14523g;
import com.google.protobuf.CodedOutputStream;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.ticketing.ticket.C7754b;
import com.moovit.ticketing.ticket.TicketId;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import m50.C18331g;
import p041ca.C1835u;
import p042cb.C1843a;
import p173ma.C5735h;
import p173ma.C5739k;
import p199oa.C6016b;
import p237r9.C6271d;
import p237r9.C6274g;
import p277ub.C6774a0;
import p543hq.C17474b;
import p601ke.C18028a;
import p687nt.C18589b;
import p798sn.C19493a;
import p805su.C19560p;
import p910xf.C20474c;
import p910xf.C20482k;
import p910xf.C20488n;
import p924xt.C20584a;
import p946ys.C20760a;
import p970zs.C20889c;
import p977zz.C20944i0;
import p977zz.C20949l;
import s80.C13070g;
import s90.C13072a;
import v40.C25754i;
import zendesk.support.Article;

/* renamed from: i0.c */
public final /* synthetic */ class C5227c implements C0631r.C0635d, FeatureManager.C2369a, C6274g, C1835u.C1836a, C5739k, MediaCodecUtil.C3934e, C1843a.C1844a, C18028a.C18029a, C6271d, C20488n.C20489a, SuccessContinuation, C20949l, RecyclerView.C1126h, C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f17319b;

    public /* synthetic */ C5227c(int i) {
        this.f17319b = i;
    }

    /* renamed from: a */
    public void mo2576a(SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.f1841b.getWidth(), surfaceRequest.f1841b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.mo2359a(surface, C14226d.m35352s0(), new C5228d(surface, surfaceTexture));
    }

    public Object apply(Object obj) {
        C14523g gVar = (C14523g) obj;
        gVar.getClass();
        try {
            int serializedSize = gVar.getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.f36799b;
            CodedOutputStream.C14570a aVar = new CodedOutputStream.C14570a(bArr, serializedSize);
            gVar.mo43942a(aVar);
            if (aVar.mo43930U() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(gVar.mo43985d("byte array"), e);
        }
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo21005j();
    }

    /* renamed from: c */
    public boolean mo6656c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Object convert(Object obj) {
        switch (this.f17319b) {
            case 0:
                return ((ServiceAlert) obj).f23190b;
            case 1:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 2:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            case 3:
                return C13070g.m33009a((C19493a) obj);
            default:
                return ((TicketId) obj).f23511b;
        }
    }

    /* renamed from: d */
    public void mo21004d(Exception exc) {
    }

    /* renamed from: e */
    public void mo19991e(Object obj, C20482k.C20483a aVar) {
        ((C20474c) obj).mo52668a();
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        return C18028a.m44701a(jsonReader);
    }

    /* renamed from: g */
    public int mo255g(int i, int i2) {
        int i3 = C20584a.f52069c;
        return (i - i2) - 1;
    }

    /* renamed from: h */
    public int mo256h(Object obj) {
        Pattern pattern = MediaCodecUtil.f13830a;
        String str = ((C3941c) obj).f13853a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (C6774a0.f20959a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        p262t8.C6606a.m15600a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0023 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo246i(boolean r8) {
        /*
            r7 = this;
            int r0 = r7.f17319b
            r1 = 1
            switch(r0) {
                case 1: goto L_0x002c;
                case 2: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0034
        L_0x0007:
            if (r8 == 0) goto L_0x002b
            c8.a r8 = p040c8.C1802a.f6291a
            java.lang.Class<c8.a> r8 = p040c8.C1802a.class
            boolean r0 = p262t8.C6606a.m15601b(r8)
            if (r0 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            java.util.concurrent.Executor r0 = p009a8.C0115o.m212c()     // Catch:{ Exception -> 0x0023 }
            com.facebook.appevents.f r2 = new com.facebook.appevents.f     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0023 }
            r0.execute(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x002b
        L_0x0021:
            r0 = move-exception
            goto L_0x0028
        L_0x0023:
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0021 }
            a8.o r8 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0021 }
            goto L_0x002b
        L_0x0028:
            p262t8.C6606a.m15600a(r8, r0)
        L_0x002b:
            return
        L_0x002c:
            if (r8 == 0) goto L_0x0031
            p009a8.C0115o.f344n = r1
            goto L_0x0033
        L_0x0031:
            a8.o r8 = p009a8.C0115o.f331a
        L_0x0033:
            return
        L_0x0034:
            if (r8 == 0) goto L_0x00ab
            a8.o r8 = p009a8.C0115o.f331a
            boolean r8 = p009a8.C0098d0.m169b()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = com.facebook.internal.C2397f0.m6331y()
            if (r8 == 0) goto L_0x0045
            goto L_0x00ab
        L_0x0045:
            java.io.File r8 = p584jl.C17885a.m44425V()
            r0 = 0
            if (r8 != 0) goto L_0x004f
            java.io.File[] r8 = new java.io.File[r0]
            goto L_0x005d
        L_0x004f:
            u8.d r2 = new u8.d
            r2.<init>()
            java.io.File[] r8 = r8.listFiles(r2)
            java.lang.String r2 = "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }"
            mf0.C24362h.m61210e(r8, r2)
        L_0x005d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r8.length
            r4 = 0
        L_0x0064:
            if (r4 >= r3) goto L_0x0080
            r5 = r8[r4]
            int r4 = r4 + 1
            u8.a r6 = new u8.a
            r6.<init>((java.io.File) r5)
            java.lang.String r5 = r6.f20821b
            if (r5 == 0) goto L_0x0079
            java.lang.Long r5 = r6.f20822c
            if (r5 == 0) goto L_0x0079
            r5 = 1
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            if (r5 == 0) goto L_0x0064
            r2.add(r6)
            goto L_0x0064
        L_0x0080:
            u8.b r8 = new u8.b
            r8.<init>(r0)
            cf0.C21139m.m49437Y(r2, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
        L_0x008d:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x00a1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r1) goto L_0x00a1
            java.lang.Object r1 = r2.get(r0)
            r8.put(r1)
            int r0 = r0 + 1
            goto L_0x008d
        L_0x00a1:
            u8.c r0 = new u8.c
            r0.<init>(r2)
            java.lang.String r1 = "error_reports"
            p584jl.C17885a.m44463t0(r1, r8, r0)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i0.C5227c.mo246i(boolean):void");
    }

    public boolean invoke(Object obj) {
        switch (this.f17319b) {
            case 14:
                int i = C18589b.f47322n;
                ((C18589b.C18590a) obj).mo50983S0();
                return false;
            default:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) obj;
                int i2 = C16328a.f42681h;
                PaymentGatewayInstructions c = paymentGatewayFragment.f42664p.mo52452c();
                CreditCardInstructions creditCardInstructions = null;
                if (c != null) {
                    creditCardInstructions = c.f42679d;
                }
                CreditCardInstructions creditCardInstructions2 = creditCardInstructions;
                if (creditCardInstructions2 != null) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_change_clicked");
                    paymentGatewayFragment.mo46797j2(aVar.mo49933a());
                    paymentGatewayFragment.f42663o.mo772a(PaymentCreditCardActivity.m64074y2(paymentGatewayFragment.requireContext(), creditCardInstructions2, CreditCardRequest.Action.CHANGE, true, C25754i.payment_registration_change_card_title, C25754i.payment_change_card_subtitle));
                }
                return false;
        }
    }

    /* renamed from: j */
    public C5735h[] mo21005j() {
        return new C5735h[]{new C6016b()};
    }

    public Task then(Object obj) {
        List list;
        C20760a aVar = null;
        switch (this.f17319b) {
            case 13:
                Article article = (Article) obj;
                if (article != null) {
                    aVar = C20889c.m48880a(article);
                }
                return Tasks.forResult(aVar);
            case 16:
                C20944i0 i0Var = (C20944i0) obj;
                int i = C19560p.f49719q;
                if (i0Var != null) {
                    list = (List) i0Var.f52692a;
                } else {
                    list = Collections.emptyList();
                }
                return Tasks.forResult(list);
            case 18:
                C25545b bVar = (C25545b) obj;
                return Tasks.forResult(new C25643a.C25646c((CreditCardPaymentMethod) null));
            default:
                int i2 = C7754b.f23531v;
                return Tasks.forResult(((C13072a) obj).f32332a);
        }
    }
}
