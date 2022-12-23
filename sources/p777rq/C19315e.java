package p777rq;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.C1026n0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.R;
import e20.C16783l;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p716oy.C18860a;
import p949yv.C20772a;
import p977zz.C20961r;
import p977zz.C20975x0;

/* renamed from: rq.e */
public abstract class C19315e<A extends MoovitAppActivity> extends C18116c<A> {

    /* renamed from: u */
    public static final /* synthetic */ int f49157u = 0;

    /* renamed from: s */
    public final Handler f49158s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    public C20772a f49159t;

    public C19315e(Class<A> cls) {
        super(cls);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20772a aVar = (C20772a) new C1026n0(this).mo4313a(C20772a.class);
        this.f49159t = aVar;
        aVar.f52414d.observe(this, new C19314d(this, 0));
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.tripplan_itinerary_live_directions_share);
        C17885a.m44467v0(button, R.drawable.ic_share_16);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        boolean z;
        Itinerary z2 = mo51737z2();
        if (z2 == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        if (!C18860a.m45884a().f48019g || C16783l.m42470b(z2, 11, 12, 17, 15, 16, 14, 13)) {
            z = false;
        } else {
            z = true;
        }
        return Tasks.forResult(Boolean.valueOf(z));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        Itinerary z2 = mo51737z2();
        if (z2 != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "share_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, z2.f41894b);
            aVar.mo49939g(AnalyticsAttributeKey.SOURCE, "bar");
            mo46797j2(aVar.mo49933a());
            C20772a aVar2 = this.f49159t;
            if (C20975x0.m49118e(z2, aVar2.f52413c.getValue())) {
                C20961r value = aVar2.f52414d.getValue();
                if (value != null && value.f52711a) {
                    aVar2.f52414d.postValue(value);
                    return;
                }
                return;
            }
            aVar2.f52413c.setValue(z2);
        }
    }

    /* renamed from: z2 */
    public abstract Itinerary mo51737z2();
}
