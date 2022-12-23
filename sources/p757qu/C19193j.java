package p757qu;

import aa0.C7527d;
import android.content.Context;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Collections;
import java.util.Set;
import k00.C17988b;
import p757qu.C19188i;
import z00.C20795a;

/* renamed from: qu.j */
public final class C19193j implements SearchView.C0366m {

    /* renamed from: b */
    public final /* synthetic */ C19188i f48798b;

    public C19193j(C19188i iVar) {
        this.f48798b = iVar;
    }

    /* renamed from: A */
    public final void mo1843A(String str) {
        C19188i iVar = this.f48798b;
        iVar.f48790o.mo40229d(str);
        ((C7527d) iVar.f48791p.f47544h).mo23793a(str);
        iVar.f48791p.mo51049j();
        iVar.f48790o.mo40230e(str, iVar.f48791p.getItemCount(), Collections.singletonMap(AnalyticsAttributeKey.TYPE, "mot_out_of_radius_stations_selection"), (Set<String>) null);
        if (iVar.f48791p.getItemCount() == 0) {
            RecyclerView recyclerView = iVar.f48792q;
            Context requireContext = iVar.requireContext();
            C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
            recyclerView.mo4627l0(new C20795a(C17988b.m44611b(R.drawable.img_empty_state_search_location, requireContext), requireContext.getText(R.string.purchase_ticket_selection_station_search_empty_message), (CharSequence) null));
            return;
        }
        RecyclerView.Adapter adapter = iVar.f48792q.getAdapter();
        C19188i.C19192c cVar = iVar.f48791p;
        if (adapter != cVar) {
            iVar.f48792q.mo4627l0(cVar);
        }
    }

    /* renamed from: J */
    public final boolean mo1844J(String str) {
        return false;
    }
}
