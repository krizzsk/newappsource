package p753qq;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.itinerary.C15055k;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.tranzmate.R;
import e20.C16783l;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p641lu.C18277b;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: qq.d */
public abstract class C19155d<A extends MoovitAppActivity> extends C18116c<A> {
    public C19155d(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public int mo51594A2() {
        return -1;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.tripplan_itinerary_live_directions_report);
        C17885a.m44467v0(button, R.drawable.ic_report_16);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        boolean z;
        Itinerary z2 = mo51595z2();
        C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
        if (z2 == null || !((Boolean) aVar.mo51505b(C20199a.f51284k0)).booleanValue() || !C16783l.m42470b(z2, 2, 9)) {
            z = false;
        } else {
            z = true;
        }
        return Tasks.forResult(Boolean.valueOf(z));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_report_button_type");
        aVar.mo49939g(AnalyticsAttributeKey.SOURCE, "bar");
        mo46797j2(aVar.mo49933a());
        Itinerary z2 = mo51595z2();
        if (z2 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            int A2 = mo51594A2();
            List<T> emptyList = Collections.emptyList();
            List<T> emptyList2 = Collections.emptyList();
            if (A2 >= 0) {
                Leg leg = z2.mo48295u0().get(A2);
                emptyList = DbEntityRef.getEntities(C16783l.m42484p(Collections.singletonList(leg)));
                emptyList2 = DbEntityRef.getEntities(C16783l.m42483o(Collections.singletonList(leg)));
            }
            if (emptyList.isEmpty() && emptyList2.isEmpty()) {
                C18277b bVar = C16783l.f43688a;
                emptyList = DbEntityRef.getEntities(C16783l.m42484p(z2.mo48295u0()));
                emptyList2 = DbEntityRef.getEntities(C16783l.m42483o(z2.mo48295u0()));
            }
            if (!emptyList.isEmpty() || !emptyList2.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("stopsExtra", C13717b.m34264k(emptyList));
                bundle.putParcelableArrayList("linesExtra", C13717b.m34264k(emptyList2));
                C15055k kVar = new C15055k();
                kVar.setArguments(bundle);
                kVar.show(childFragmentManager, "LineOrStopSelectionDialog");
            }
        }
    }

    /* renamed from: z2 */
    public abstract Itinerary mo51595z2();
}
