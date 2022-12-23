package p708oq;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationService;
import com.tranzmate.R;
import e20.C16783l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p641lu.C18277b;
import p977zz.C20943i;
import p977zz.C20975x0;
import z20.C20806a;

/* renamed from: oq.b */
public abstract class C18816b<A extends MoovitAppActivity> extends C18116c<A> {

    /* renamed from: oq.b$a */
    public class C18817a extends LocationSettingsFixer.C16200b {
        public C18817a(Context context) {
            super(context, R.string.location_rational_start_itinerary_navigation_not_permitted_message);
        }

        /* renamed from: b */
        public final void mo23896b(Location location) {
            Itinerary z2 = C18816b.this.mo51308z2();
            if (z2 != null) {
                C18816b bVar = C18816b.this;
                bVar.startActivity(MultiLegNavActivity.m38728T2(bVar.requireContext(), z2, -1, (String) null));
            }
        }
    }

    public C18816b(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public final void mo51309A2() {
        CharSequence charSequence;
        if (mo51308z2() != null) {
            Context requireContext = requireContext();
            if (C20943i.m49051d(30)) {
                charSequence = requireContext.getString(R.string.location_rational_start_itinerary_navigation_message_new, new Object[]{requireContext.getPackageManager().getBackgroundPermissionOptionLabel()});
            } else {
                charSequence = requireContext.getText(R.string.location_rational_start_line_navigation_message);
            }
            LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((C15682c<?>) this);
            aVar.f42258e = Boolean.TRUE;
            aVar.f42259f = true;
            aVar.f42256c = requireContext.getText(R.string.location_rational_start_itinerary_navigation_title);
            aVar.f42257d = charSequence;
            aVar.mo48528a(new C18817a(requireContext()));
        }
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
        return Tasks.forResult((Boolean) mo46776J1("TRIP_PLAN_SUPPORT_VALIDATOR"));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        NavigationService navigationService = ((MoovitAppActivity) this.f40822c).f37310S.f15350a;
        if (navigationService != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "live_direction_button_type");
            aVar.mo49939g(AnalyticsAttributeKey.SOURCE, "bar");
            mo46797j2(aVar.mo49933a());
            new C20806a.C20807a("live_directions_navigate_tap").mo52935c();
            HashSet w = navigationService.mo19688w();
            if (C13717b.m34258e(w)) {
                mo51309A2();
                return;
            }
            String str = null;
            Iterator it = w.iterator();
            while (it.hasNext()) {
                Navigable navigable = (Navigable) it.next();
                Itinerary z2 = mo51308z2();
                if (navigable instanceof ItineraryNavigable) {
                    Itinerary itinerary = ((ItineraryNavigable) navigable).f39149j;
                    C18277b bVar = C16783l.f43688a;
                    boolean z = false;
                    if (z2 != null && itinerary != null && C20975x0.m49118e(z2.f41894b, itinerary.f41894b)) {
                        List<Leg> u0 = z2.mo48295u0();
                        List<Leg> u02 = itinerary.mo48295u0();
                        int i = 0;
                        while (true) {
                            if (i >= u0.size()) {
                                z = true;
                                break;
                            }
                            Leg leg = u0.get(i);
                            Leg leg2 = u02.get(i);
                            if ((leg instanceof MultiTransitLinesLeg) && (leg2 instanceof MultiTransitLinesLeg) && !C20975x0.m49118e(leg, leg2)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (z) {
                        str = navigable.mo19639e0();
                    }
                }
            }
            if (str != null) {
                FragmentActivity requireActivity = requireActivity();
                int i2 = MultiLegNavActivity.f39101S0;
                Intent intent = new Intent(requireActivity, MultiLegNavActivity.class);
                intent.putExtra("navigable_id_key", str);
                startActivity(intent);
                return;
            }
            new AlertDialogFragment.C15856a(getResources()).mo47682k("confirm_new_trip_dialog_tag").mo47683l(R.string.tripplan_itinerary_existingtrip_title).mo47678g(R.string.tripplan_itinerary_existingtrip_description).mo47681j(R.string.popup_start).mo47680i(R.string.popup_cancel).mo47673b().show(getChildFragmentManager(), "confirm_new_trip_dialog_tag");
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("confirm_new_trip_dialog_tag".equals(str)) {
            if (i == -1) {
                NavigationService.m11306G(requireContext());
                mo51309A2();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: z2 */
    public abstract Itinerary mo51308z2();
}
