package com.moovit.app.stopdetail;

import aa0.C7527d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.C15351d;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPattern;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.Map;
import o00.C18668e;
import p952yy.C20787c;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.stopdetail.e */
public final class C15355e extends C18668e<C15351d.C15354c, C15351d, C7527d<String>> implements C15340c.C15349i {

    /* renamed from: j */
    public final ServerId f39752j;

    public C15355e(C15351d dVar, ServerId serverId) {
        super(dVar, dVar.f39737k);
        C21100e.m49373x(serverId, "stopId");
        this.f39752j = serverId;
    }

    /* renamed from: b */
    public final void mo45890b(String str) {
        ((C7527d) this.f47544h).mo23793a(str);
        mo51049j();
    }

    /* renamed from: d */
    public final RecyclerView.Adapter mo45891d() {
        return this;
    }

    /* renamed from: e */
    public final void mo45892e(Context context, Time time, boolean z, Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map) {
        ((C15351d) this.f47543g).mo45892e(context, time, z, map);
        mo51049j();
    }

    /* renamed from: f */
    public final boolean mo45893f() {
        return true;
    }

    public final int getItemCount() {
        int itemCount = ((C15351d) this.f47543g).getItemCount();
        int itemCount2 = super.getItemCount();
        if (itemCount <= 0 || itemCount2 != 0) {
            return itemCount2;
        }
        return 1;
    }

    public final int getItemViewType(int i) {
        int itemCount = ((C15351d) this.f47543g).getItemCount();
        int itemCount2 = super.getItemCount();
        if (itemCount <= 0 || itemCount2 != 0) {
            return super.getItemViewType(i);
        }
        return 40;
    }

    /* renamed from: h */
    public final boolean mo45894h() {
        ((C15351d) this.f47543g).getClass();
        return false;
    }

    /* renamed from: k */
    public final boolean mo45935k(RecyclerView.Adapter adapter, int i, Object obj) {
        S s;
        DbEntityRef<TransitPattern> dbEntityRef;
        TransitPattern transitPattern;
        int b;
        C15351d dVar = (C15351d) adapter;
        C7527d dVar2 = (C7527d) obj;
        if (this.f39752j == null || dVar.getItemViewType(i) != 31) {
            return true;
        }
        C20944i0 i0Var = dVar.f39738l.get(i);
        if (!(i0Var == null || (s = i0Var.f52693b) == null || (dbEntityRef = ((Time) s).f23905f) == null || (transitPattern = dbEntityRef.get()) == null || (b = transitPattern.mo24384b(this.f39752j)) == -1)) {
            int f = transitPattern.mo24389f();
            for (String o : transitPattern.f23710d.subList(Math.min(b + 1, f), f)) {
                if (dVar2.mo19661o(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C15351d.C15354c cVar = (C15351d.C15354c) a0Var;
        if (cVar.getItemViewType() != 40) {
            super.onBindViewHolder(cVar, i);
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 40) {
            return new C15351d.C15354c(C13715c.m34239e(viewGroup, R.layout.stop_detail_empty_trips_search, viewGroup, false));
        }
        return (C15351d.C15354c) super.onCreateViewHolder(viewGroup, i);
    }
}
