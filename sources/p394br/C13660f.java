package p394br;

import android.content.Context;
import android.net.Uri;
import c00.C13733n;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.moovit.app.intro.onboarding.OnboardingFragment;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.app.wondo.tickets.model.WondoReward;
import com.moovit.design.view.NumericStepperView;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.profile.C25705a;
import com.moovit.transit.TransitStop;
import com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo;
import com.tranzmate.moovit.protocol.payments.MVProfileCertificateInfo;
import com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfoValue;
import com.veriff.sdk.camera.core.Preview;
import com.veriff.sdk.camera.core.SurfaceRequest;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import h60.C17353s0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p095g6.C4832a;
import p110h8.C5149h;
import p173ma.C5735h;
import p173ma.C5739k;
import p203p1.C6031d;
import p227r.C6227a;
import p238ra.C6279d;
import p262t8.C6606a;
import p269u2.C6678b;
import p435de.C16596f;
import p785ry.C19381a;
import p785ry.C19385e;
import p810sz.C19617r;
import p838uf.C19904f;
import p977zz.C20949l;
import w50.C20283g;
import y50.C20703a;
import zendesk.support.Request;

/* renamed from: br.f */
public final /* synthetic */ class C13660f implements C13733n, C6031d, FeatureManager.C2369a, C5739k, C19904f.C19905a, SuccessContinuation, C20949l, C4832a.C4837c, Preview.SurfaceProvider, C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f33692b;

    public /* synthetic */ C13660f(int i) {
        this.f33692b = i;
    }

    /* renamed from: a */
    public boolean mo19808a() {
        return false;
    }

    public Object apply(Object obj) {
        switch (this.f33692b) {
            case 0:
                C6678b bVar = (C6678b) obj;
                return null;
            case 1:
                return ((DepositInstructions) obj).f63959c;
            default:
                C20703a aVar = (C20703a) obj;
                BigDecimal bigDecimal = C20283g.f51427r;
                if (aVar != null) {
                    return aVar.f52285i;
                }
                return null;
        }
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo40533d();
    }

    /* renamed from: c */
    public String mo253c(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return FirebaseCommonRegistrar.m35903b(installerPackageName);
        }
        return "";
    }

    public Object convert(Object obj) {
        boolean z;
        switch (this.f33692b) {
            case 0:
                return ((SearchLocationItem) obj).f39457b;
            case 1:
                return ((TransitStop) obj).f23731c;
            case 2:
                ServerId serverId = C15284a.f39471U;
                return SearchLocationItem.m39101c((LocationFavorite) obj, LocationFavorite.FavoriteType.DEFAULT);
            case 3:
                return ((TodSubscription) obj).getId();
            case 4:
                return Integer.valueOf(((NumericStepperView) obj).getCounter());
            default:
                C19617r rVar = C17353s0.f44739a;
                MVProfileRequiredInfoValue mVProfileRequiredInfoValue = ((MVAccountProfileRequiredInfo) obj).value;
                F f = mVProfileRequiredInfoValue.setField_;
                F f2 = MVProfileRequiredInfoValue._Fields.CERTIFICATE_INFO;
                boolean z2 = true;
                if (f == f2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (f != MVProfileRequiredInfoValue._Fields.INPUT_FIELD_VALUE) {
                        z2 = false;
                    }
                    if (z2) {
                        return mVProfileRequiredInfoValue.mo30493m().f27333id;
                    }
                    throw new IllegalStateException("Unknown MVAccountProfileRequiredInfo type");
                } else if (f == f2) {
                    return ((MVProfileCertificateInfo) mVProfileRequiredInfoValue.value_).certificateKey;
                } else {
                    StringBuilder k = C13555b.m33972k("Cannot get field 'certificateInfo' because union is currently set to ");
                    k.append(MVProfileRequiredInfoValue.m25141l((MVProfileRequiredInfoValue._Fields) mVProfileRequiredInfoValue.setField_).f63355a);
                    throw new RuntimeException(k.toString());
                }
        }
    }

    /* renamed from: d */
    public C5735h[] mo40533d() {
        return new C5735h[]{new C6279d()};
    }

    public void handle(Throwable th) {
        C16596f.m42113a().mo49364c(new GlideException("Uncaught glide exception", th));
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        if (z) {
            C5149h hVar = C5149h.f17195a;
            Class<C5149h> cls = C5149h.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    C5149h.f17196b.set(true);
                    C5149h.m13061a();
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f33692b) {
            case 7:
                int i = OnboardingFragment.f38460s;
                ((OnboardingFragment.C15023b) obj).mo45258D();
                return true;
            default:
                int i2 = C25705a.f64111h;
                ((C25705a.C25706a) obj).mo83552S0();
                return true;
        }
    }

    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        CameraUseCaseAdapter.lambda$createExtraPreview$2(surfaceRequest);
    }

    public Task then(Object obj) {
        List<WondoReward> list;
        boolean z;
        switch (this.f33692b) {
            case 6:
                if (((Request) obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Tasks.forResult(Boolean.valueOf(z));
            default:
                C19381a aVar = (C19381a) obj;
                C19385e eVar = C19385e.f49315c;
                if (aVar != null) {
                    list = aVar.f49306d.f40745b;
                } else {
                    list = Collections.emptyList();
                }
                return Tasks.forResult(list);
        }
    }
}
