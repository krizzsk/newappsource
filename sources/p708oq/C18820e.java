package p708oq;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.navigation.NavigationService;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p977zz.C20943i;
import z20.C20806a;

/* renamed from: oq.e */
public abstract class C18820e<A extends MoovitAppActivity> extends C18116c<A> {

    /* renamed from: oq.e$a */
    public class C18821a extends LocationSettingsFixer.C16200b {

        /* renamed from: d */
        public final /* synthetic */ TransitLine f47929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18821a(Context context, TransitLine transitLine) {
            super(context, R.string.location_rational_start_line_navigation_not_permitted_message);
            this.f47929d = transitLine;
        }

        /* renamed from: b */
        public final void mo23896b(Location location) {
            C18820e eVar = C18820e.this;
            eVar.startActivity(MultiLegNavActivity.m38729U2(eVar.requireContext(), this.f47929d.f23687c));
        }
    }

    public C18820e(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public abstract boolean mo51310A2();

    /* renamed from: B2 */
    public abstract boolean mo51311B2();

    /* renamed from: C2 */
    public final void mo51313C2(TransitLine transitLine) {
        CharSequence charSequence;
        Context requireContext = requireContext();
        if (C20943i.m49051d(30)) {
            charSequence = requireContext.getString(R.string.location_rational_start_itinerary_navigation_message_new, new Object[]{requireContext.getPackageManager().getBackgroundPermissionOptionLabel()});
        } else {
            charSequence = requireContext.getText(R.string.location_rational_start_line_navigation_message);
        }
        LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((C15682c<?>) this);
        aVar.f42258e = Boolean.TRUE;
        aVar.f42259f = true;
        aVar.f42256c = requireContext.getText(R.string.location_rational_start_line_navigation_title);
        aVar.f42257d = charSequence;
        aVar.mo48528a(new C18821a(requireContext(), transitLine));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TRIP_PLAN_SUPPORT_VALIDATOR");
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 2131952776, R.attr.roundedButtonMediumStyle, 2131953355);
        button.setText(R.string.quick_action_start);
        C17885a.m44467v0(button, R.drawable.ic_go_16);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        if (!Boolean.TRUE.equals(mo46776J1("TRIP_PLAN_SUPPORT_VALIDATOR"))) {
            return Tasks.forResult(Boolean.FALSE);
        }
        return Tasks.forResult(Boolean.valueOf(mo51311B2()));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        TransitLine z2;
        if (!mo51310A2()) {
            mo46797j2(new C17474b(AnalyticsEventKey.START_RIDE_CLICKED));
            new C20806a.C20807a("live_directions_navigate_tap").mo52935c();
            NavigationService navigationService = ((MoovitAppActivity) this.f40822c).f37310S.f15350a;
            if (navigationService != null && (z2 = mo51312z2()) != null) {
                if (navigationService.mo19688w().size() > 0) {
                    AlertDialogFragment.C15856a i = new AlertDialogFragment.C15856a(getResources()).mo47682k("confirm_new_trip_dialog_tag").mo47683l(R.string.tripplan_itinerary_existingtrip_title).mo47678g(R.string.tripplan_itinerary_existingtrip_description).mo47681j(R.string.popup_start).mo47680i(R.string.popup_cancel);
                    i.f41328b.putParcelable("line", z2);
                    i.mo47673b().show(getChildFragmentManager(), "confirm_new_trip_dialog_tag");
                    return;
                }
                mo51313C2(z2);
            }
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("confirm_new_trip_dialog_tag".equals(str)) {
            if (i == -1) {
                NavigationService.m11306G(requireContext());
                mo51313C2((TransitLine) bundle.getParcelable("line"));
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: z2 */
    public abstract TransitLine mo51312z2();
}
