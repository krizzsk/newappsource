package p578jf;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.widget.TextView;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import c10.C13740a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.moovit.app.home.dashboard.LocationServicesStateSection;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.dynamiclink.DynamicLinkActivity;
import com.moovit.image.ImageProviderFragment;
import com.moovit.location.C16202a;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.transit.LocationDescriptor;
import e90.C12618b;
import java.nio.ByteBuffer;
import java.util.List;
import m30.C5679b;
import m60.C18346e;
import m60.C18348f;
import n30.C5849b;
import p130j2.C5367a;
import p664mu.C18443f;
import p691nx.C18644b;
import p977zz.C20944i0;

/* renamed from: jf.u */
public final /* synthetic */ class C17843u implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f45815b;

    /* renamed from: c */
    public final /* synthetic */ Object f45816c;

    public /* synthetic */ C17843u(Object obj, int i) {
        this.f45815b = i;
        this.f45816c = obj;
    }

    public final void onSuccess(Object obj) {
        MicroMobilityAction microMobilityAction;
        switch (this.f45815b) {
            case 0:
                ((RemoteConfigManager) this.f45816c).m36073xc904e813((Boolean) obj);
                return;
            case 1:
                ((TaskCompletionSource) this.f45816c).setResult(obj);
                return;
            case 2:
                LocationServicesStateSection.m37694m2((LocationServicesStateSection) this.f45816c, (C16202a.C16203a) obj);
                return;
            case 3:
                Void voidR = (Void) obj;
                C5367a.m13473a(((C18443f) this.f45816c).f47015a).mo21147c(new Intent("com.moovit.app.mot.action.updated"));
                return;
            case 4:
                ((C1043v) this.f45816c).setValue((MoovitSubscriptionsManager.C15361d) obj);
                return;
            case 5:
                C18644b bVar = (C18644b) this.f45816c;
                int i = C18644b.f47509p;
                bVar.getClass();
                if (PaymentAccount.m64175c((PaymentAccount) obj, "GTT", PaymentAccountContextStatus.CONNECTED)) {
                    bVar.f47510n.setVisibility(0);
                    return;
                }
                return;
            case 6:
                int i2 = DynamicLinkActivity.f41472y;
                ((DynamicLinkActivity) this.f45816c).mo47920d1((C13740a) obj);
                return;
            case 7:
                Void voidR2 = (Void) obj;
                Bitmap.CompressFormat compressFormat = ImageProviderFragment.f41701o;
                ((ImageProviderFragment) this.f45816c).mo48179s2();
                return;
            case 8:
                int i3 = MicroMobilityRideDetailsActivity.f14839Y;
                ((TextView) this.f45816c).setText(((LocationDescriptor) obj).mo24313f());
                return;
            case 9:
                C5679b bVar2 = (C5679b) this.f45816c;
                int i4 = C5679b.f18460q;
                bVar2.getClass();
                C5849b bVar3 = new C5849b((ByteBuffer) obj);
                ServerId serverId = bVar2.f18461n;
                if (serverId != null && (microMobilityAction = bVar2.f18463p) != null) {
                    bVar2.mo21529m2(serverId, microMobilityAction, bVar3);
                    return;
                }
                return;
            case 10:
                ((C1040t) this.f45816c).postValue((List) obj);
                return;
            case 11:
                C18346e eVar = (C18346e) this.f45816c;
                C20944i0 i0Var = (C20944i0) obj;
                int i5 = C18346e.f46776t;
                eVar.getClass();
                String str = (String) i0Var.f52692a;
                WebInstruction webInstruction = (WebInstruction) i0Var.f52693b;
                if (eVar.getView() != null) {
                    eVar.f46779r.setWebChromeClient(new WebChromeClient());
                    eVar.f46779r.setWebViewClient(new C18348f(eVar, webInstruction));
                    eVar.f46779r.loadUrl(str);
                    return;
                }
                return;
            default:
                ((C12618b) this.f45816c).f31188v = (C12618b.C12621c) obj;
                return;
        }
    }
}
