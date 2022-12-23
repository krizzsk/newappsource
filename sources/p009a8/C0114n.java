package p009a8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import c00.C13733n;
import c70.C13749c;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo;
import com.tranzmate.moovit.protocol.payments.MVInputFieldValue;
import com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfoValue;
import com.veriff.sdk.internal.C22729yg;
import e80.C12616c;
import h60.C17353s0;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import m50.C18331g;
import p041ca.C1835u;
import p074e8.C4599b;
import p097g8.C4845a;
import p100gb.C4956a0;
import p135j8.C5396c;
import p173ma.C5735h;
import p173ma.C5739k;
import p237r9.C6269b;
import p262t8.C6606a;
import p277ub.C6777c;
import p302wa.C7004a;
import p664mu.C18443f;
import p684nq.C18584e;
import p781ru.C19329b;
import p810sz.C19617r;
import p838uf.C19904f;
import p862vf.C20118b;
import p973zv.C20912b;
import p977zz.C20944i0;
import p977zz.C20949l;
import p977zz.C20952m0;
import q60.C19086a;
import t60.C19630a;
import z70.C13324c;

/* renamed from: a8.n */
public final /* synthetic */ class C0114n implements FeatureManager.C2369a, C1835u.C1836a, C6777c, C5739k, C19904f.C19905a, SuccessContinuation, C20949l, C22729yg, C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f330b;

    public /* synthetic */ C0114n(int i) {
        this.f330b = i;
    }

    /* renamed from: a */
    public C5735h[] mo258a() {
        return new C5735h[]{new C7004a()};
    }

    public void accept(Object obj) {
        ((C4956a0.C4958b) obj).f16778b.release();
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo258a();
    }

    /* renamed from: c */
    public String mo253c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    public Object convert(Object obj) {
        boolean z;
        ProfileCertificateTextData profileCertificateTextData;
        switch (this.f330b) {
            case 0:
                return ((SearchLineItem) ((C20944i0) obj).f52692a).f41637b;
            case 1:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            case 2:
                return ((PaymentGatewayFragment.C16322a) obj).mo23105I();
            default:
                MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) obj;
                C19617r rVar = C17353s0.f44739a;
                PaymentCertificateStatus g = C17353s0.m43393g(mVAccountProfileRequiredInfo.status);
                MVProfileRequiredInfoValue mVProfileRequiredInfoValue = mVAccountProfileRequiredInfo.value;
                F f = mVProfileRequiredInfoValue.setField_;
                boolean z2 = true;
                if (f == MVProfileRequiredInfoValue._Fields.CERTIFICATE_INFO) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    profileCertificateTextData = null;
                } else {
                    if (f != MVProfileRequiredInfoValue._Fields.INPUT_FIELD_VALUE) {
                        z2 = false;
                    }
                    if (z2) {
                        MVInputFieldValue m = mVProfileRequiredInfoValue.mo30493m();
                        C20952m0<Integer> m0Var = C13749c.f33838a;
                        profileCertificateTextData = new ProfileCertificateTextData(new InputFieldValue(m.f27333id, m.value));
                    } else {
                        throw new IllegalStateException("Unknown MVProfileRequiredInfo type");
                    }
                }
                return new C20944i0(g, profileCertificateTextData);
        }
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        switch (this.f330b) {
            case 1:
                if (z) {
                    C4845a aVar = C4845a.f16269a;
                    Class<C4845a> cls = C4845a.class;
                    if (!C6606a.m15601b(cls)) {
                        try {
                            C4845a.f16270b = true;
                            C4845a.f16269a.mo20334a();
                            return;
                        } catch (Throwable th) {
                            C6606a.m15600a(cls, th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                C5396c cVar = C5396c.f17719a;
                Class<C4599b> cls2 = C4599b.class;
                if (z) {
                    C4599b bVar = C4599b.f15801a;
                    if (!C6606a.m15601b(cls2)) {
                        try {
                            C4599b.f15806f.set(true);
                            return;
                        } catch (Throwable th2) {
                            C6606a.m15600a(cls2, th2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C4599b bVar2 = C4599b.f15801a;
                    if (!C6606a.m15601b(cls2)) {
                        try {
                            C4599b.f15806f.set(false);
                            return;
                        } catch (Throwable th3) {
                            C6606a.m15600a(cls2, th3);
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f330b) {
            case 15:
                ((C15581b.C15582a) obj).mo45128G1();
                return true;
            case 16:
                int i = PaymentGatewayFragment.f42661y;
                ((PaymentGatewayFragment.C16322a) obj).mo23104E();
                return false;
            case 17:
                int i2 = C19086a.f48518r;
                ((C19086a.C19087a) obj).mo51519J0();
                return true;
            default:
                int i3 = C19630a.f49807u;
                ((C19630a.C19631a) obj).mo51849z1();
                return true;
        }
    }

    public Task then(Object obj) {
        C13324c.C13325a aVar;
        switch (this.f330b) {
            case 10:
                MotActivation motActivation = (MotActivation) obj;
                int i = C18584e.f47313w;
                if (motActivation == null) {
                    return Tasks.forResult(Collections.emptyList());
                }
                return C18443f.m45298d().mo50887a(motActivation.f38989f);
            case 11:
                Void voidR = (Void) obj;
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                return C20118b.m47697e().mo52354a();
            case 12:
                List list = (List) obj;
                C18443f fVar = C18443f.f47013e;
                if (list == null) {
                    list = Collections.emptyList();
                }
                return Tasks.forResult(list);
            case 13:
                S s = ((C20944i0) obj).f52693b;
                if (s != null) {
                    return Tasks.forResult((C19329b) s);
                }
                return Tasks.forCanceled();
            case 14:
                return Tasks.forResult(((C20912b) obj).f52658m);
            default:
                C12616c cVar = (C12616c) obj;
                if (cVar != null) {
                    aVar = new C13324c.C13325a((List<LocationDescriptor>) cVar.f31177m, (Map<LocationDescriptor, Integer>) cVar.f31178n);
                } else {
                    aVar = new C13324c.C13325a((List<LocationDescriptor>) null, (Map<LocationDescriptor, Integer>) null);
                }
                return Tasks.forResult(aVar);
        }
    }
}
