package p637lq;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.C0436m1;
import androidx.core.widget.C0801k;
import com.google.android.material.button.MaterialButton;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.Set;
import p455dy.C16753e;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p784rx.C19377c;
import z20.C20806a;

/* renamed from: lq.d */
public class C18253d extends C18116c<StopDetailActivity> implements C16753e.C16757d {

    /* renamed from: t */
    public static final /* synthetic */ int f46570t = 0;

    /* renamed from: s */
    public C16753e f46571s;

    public C18253d() {
        super(StopDetailActivity.class);
    }

    /* renamed from: C */
    public final void mo44784C() {
        mo50669z2();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_ACCOUNT");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        this.f46571s = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
    }

    /* renamed from: f */
    public final void mo44785f() {
        mo50669z2();
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        button.setText(R.string.quick_action_favorite);
        if (button instanceof MaterialButton) {
            ((MaterialButton) button).setIconTint((ColorStateList) null);
        } else {
            C0801k.m2420b(button, (ColorStateList) null);
        }
        C17885a.m44467v0(button, R.drawable.quick_action_favorite_icon_selector);
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        String str;
        C16753e n = C16753e.m42310n(requireContext());
        ServerId serverId = ((StopDetailActivity) this.f40822c).f39657Z;
        if (n.mo49442q(serverId)) {
            n.mo49447v(serverId);
            Toast.makeText(requireContext(), R.string.stop_removed_favorite, 0).show();
            str = "favorite_removed";
        } else {
            n.mo49435i(serverId);
            if (mo46785T1("USER_ACCOUNT") && !((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46576g()) {
                C19377c.m46656a(requireContext(), TrackingEvent.FAVORITE_LINE_CONNECT_POP_UP_DISPLAYED, new C0436m1(this, 12));
            }
            Toast.makeText(requireContext(), R.string.stop_added_favorite, 0).show();
            new C20806a.C20807a("add_favorite_station_tap").mo52935c();
            str = "favorite_added";
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: s2 */
    public final void mo50557s2(Button button) {
        int i;
        if (button.isActivated()) {
            i = 2131952779;
        } else {
            i = 0;
        }
        C17885a.m44441i(button, i, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
    }

    /* renamed from: t2 */
    public final void mo50558t2() {
        super.mo50558t2();
        C16753e eVar = this.f46571s;
        if (eVar != null) {
            eVar.mo49436j(this);
        }
    }

    /* renamed from: u2 */
    public final void mo50559u2() {
        super.mo50559u2();
        C16753e eVar = this.f46571s;
        if (eVar != null) {
            eVar.mo49448w(this);
        }
    }

    /* renamed from: y2 */
    public final void mo50563y2(Button button) {
        mo50669z2();
    }

    /* renamed from: z2 */
    public final void mo50669z2() {
        mo50560v2(C16753e.m42310n(requireContext()).mo49442q(((StopDetailActivity) this.f40822c).f39657Z));
    }
}
