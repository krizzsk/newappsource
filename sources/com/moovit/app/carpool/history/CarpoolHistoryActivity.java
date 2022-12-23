package com.moovit.app.carpool.history;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.history.C14812a;
import com.moovit.design.view.AlertMessageView;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.view.recyclerview.RecyclerViewWithEmptyView;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00.C18665b;
import p259t5.C6592b;
import p259t5.C6593c;

public class CarpoolHistoryActivity extends MoovitAppActivity implements CarpoolRidesProvider.C14793d, C14812a.C14813a {

    /* renamed from: m0 */
    public static final /* synthetic */ int f37778m0 = 0;

    /* renamed from: U */
    public CarpoolRidesProvider f37779U = CarpoolRidesProvider.f37661j;

    /* renamed from: X */
    public C14812a f37780X = new C14812a();

    /* renamed from: Y */
    public ProgressBar f37781Y;

    /* renamed from: Z */
    public ViewGroup f37782Z;

    /* renamed from: l0 */
    public AlertMessageView f37783l0;

    /* renamed from: F0 */
    public final void mo44841F0(int i) {
        if ((i & 8) != 0) {
            this.f37782Z.setVisibility(0);
            this.f37781Y.setVisibility(8);
            this.f37783l0.setVisibility(8);
            List<T> list = this.f37779U.f37666e.f37671a;
            C14812a aVar = this.f37780X;
            if (list.size() == 0) {
                list = null;
            }
            aVar.f37784g = list;
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f37779U.f37668g.remove(this);
    }

    /* renamed from: d0 */
    public final void mo44842d0(GcmPayload gcmPayload) {
        mo44866y2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_history_activity);
        RecyclerViewWithEmptyView recyclerViewWithEmptyView = (RecyclerViewWithEmptyView) findViewById(R.id.recycler);
        C14812a aVar = this.f37780X;
        aVar.f37785h = this;
        recyclerViewWithEmptyView.setAdapter(aVar);
        recyclerViewWithEmptyView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewWithEmptyView.mo4593g(new C18665b(recyclerViewWithEmptyView.getContext(), R.drawable.divider_horizontal_full), -1);
        recyclerViewWithEmptyView.setEmptyView(findViewById(R.id.empty_view));
        this.f37781Y = (ProgressBar) findViewById(R.id.progress);
        this.f37782Z = (ViewGroup) findViewById(R.id.rides_container);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.noNetworkErrorLayout);
        this.f37783l0 = alertMessageView;
        alertMessageView.setPositiveButtonClickListener(new C6592b(this, 6));
        this.f37783l0.setNegativeButtonClickListener(new C6593c(this, 7));
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f37779U.f37668g.put(this, 8);
        mo44866y2();
    }

    /* renamed from: g1 */
    public final void mo44843g1(int i) {
        this.f37783l0.setVisibility(0);
        this.f37781Y.setVisibility(8);
        this.f37782Z.setVisibility(8);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CARPOOL_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo44866y2() {
        if (this.f37779U.mo44834d(8)) {
            this.f37781Y.setVisibility(0);
            this.f37782Z.setVisibility(8);
            this.f37783l0.setVisibility(8);
            return;
        }
        mo44841F0(8);
    }
}
