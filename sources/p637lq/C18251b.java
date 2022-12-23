package p637lq;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.widget.C0801k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButton;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.network.model.ServerId;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.Set;
import p054d0.C4278e0;
import p455dy.C16753e;
import p543hq.C17474b;
import p567iq.C17637d;
import p584jl.C17885a;
import p613kq.C18116c;
import p784rx.C19377c;
import z20.C20806a;

/* renamed from: lq.b */
public abstract class C18251b<A extends MoovitAppActivity> extends C18116c<A> implements C16753e.C16755b, BottomSheetMenuDialogFragment.C7965a {

    /* renamed from: u */
    public static final /* synthetic */ int f46567u = 0;

    /* renamed from: s */
    public C16753e f46568s;

    /* renamed from: t */
    public boolean f46569t;

    public C18251b(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public abstract Intent mo50665A2(boolean z);

    /* renamed from: B2 */
    public abstract ServerId mo50666B2();

    /* renamed from: C2 */
    public final void mo50667C2() {
        C16753e.m42310n(requireContext()).mo49443r(mo50666B2());
        Toast.makeText(requireContext(), R.string.line_removed_favorite, 0).show();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_removed");
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_ACCOUNT");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        this.f46568s = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
    }

    /* renamed from: l0 */
    public final void mo24850l0(BottomSheetMenuDialogFragment.MenuItem menuItem) {
        String str = menuItem.f24112b;
        str.getClass();
        if (str.equals(DiskLruCache.VERSION_1)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "add_line_stops_clicked");
            mo46797j2(aVar.mo49933a());
            Intent A2 = mo50665A2(false);
            if (A2 != null) {
                startActivityForResult(A2, 1001);
            }
        } else if (str.equals("2")) {
            mo50667C2();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        A a = this.f40822c;
        if (!((MoovitAppActivity) a).f37311x) {
            this.f46569t = true;
        } else if (a != null) {
            C19377c.m46656a(a, TrackingEvent.LINE_DETAIL_FAVORITE_LINES_TAB_SNACK_BAR_DISPLAYED, new C4278e0(a, 8));
        }
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

    /* renamed from: q */
    public final void mo44782q() {
        mo50668z2();
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        return Tasks.forResult(Boolean.valueOf(((C17637d) requireContext().getSystemService("ui_configuration")).f45348e));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        boolean z = true;
        Intent A2 = mo50665A2(true);
        if (A2 == null) {
            z = false;
        }
        if (!C16753e.m42310n(requireContext()).mo49441p(mo50666B2())) {
            C16753e.m42310n(requireContext()).mo49431e(mo50666B2());
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_added");
            mo46797j2(aVar.mo49933a());
            new C20806a.C20807a("add_favorite_line_tap").mo52935c();
            if (z) {
                startActivityForResult(A2, 1001);
            }
        } else if (!z) {
            mo50667C2();
        } else {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem(DiskLruCache.VERSION_1, R.drawable.ic_plus_24_on_surface_emphasis_medium, R.string.action_choose_station));
            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("2", R.drawable.ic_star_24_on_surface_emphasis_medium, R.string.action_unfavorite));
            BottomSheetMenuDialogFragment.m18151S1(arrayList).show(getChildFragmentManager(), "favorites_action_dialog");
        }
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
        C16753e eVar = this.f46568s;
        if (eVar != null) {
            eVar.mo49432f(this);
        }
    }

    /* renamed from: u2 */
    public final void mo50559u2() {
        super.mo50559u2();
        C16753e eVar = this.f46568s;
        if (eVar != null) {
            eVar.mo49444s(this);
        }
    }

    /* renamed from: v0 */
    public final void mo44783v0() {
        mo50668z2();
    }

    /* renamed from: y2 */
    public final void mo50563y2(Button button) {
        mo50668z2();
        if (this.f46569t) {
            A a = this.f40822c;
            if (a != null) {
                C19377c.m46656a(a, TrackingEvent.LINE_DETAIL_FAVORITE_LINES_TAB_SNACK_BAR_DISPLAYED, new C4278e0(a, 8));
            }
            this.f46569t = false;
        }
    }

    /* renamed from: z2 */
    public final void mo50668z2() {
        mo50560v2(C16753e.m42310n(requireContext()).mo49441p(mo50666B2()));
    }
}
