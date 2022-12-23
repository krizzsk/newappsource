package com.moovit.app.itinerary;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ga0.C12702e;
import ga0.C12709i;
import ja0.C12797f;
import ja0.C12798g;
import java.util.ArrayList;
import java.util.List;
import o00.C18675k;
import p310x5.C7156a;
import p824tp.C19740r;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.itinerary.a */
public class C15035a extends C12702e {

    /* renamed from: u */
    public static final /* synthetic */ int f38527u = 0;

    /* renamed from: t */
    public C15037b f38528t = null;

    /* renamed from: com.moovit.app.itinerary.a$a */
    public class C15036a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TransitStop> f38529g;

        /* renamed from: h */
        public final ServerId f38530h;

        public C15036a(ArrayList arrayList, ServerId serverId) {
            this.f38529g = arrayList;
            this.f38530h = serverId;
        }

        public final int getItemCount() {
            return this.f38529g.size();
        }

        public final int getItemViewType(int i) {
            return C20975x0.m49118e(this.f38529g.get(i).f23730b, this.f38530h) ? 1 : 0;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            TransitStop transitStop = this.f38529g.get(i);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(transitStop);
            listItemView.setOnClickListener(new C7156a(1, this, transitStop));
            listItemView.setText((CharSequence) transitStop.f23731c);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.transitLineListItemStyle);
            listItemView.setLayoutParams(UiUtils.m40254m());
            C15780a.m40273f(0, listItemView);
            if (i == 0) {
                listItemView.setTitleThemeTextAppearance(R.attr.textAppearanceBody);
                listItemView.setTitleThemeTextColor(R.attr.colorOnSurface);
            }
            return new C12797f(listItemView);
        }
    }

    /* renamed from: com.moovit.app.itinerary.a$b */
    public interface C15037b {
        /* renamed from: g */
        void mo45307g(TransitStop transitStop);
    }

    /* renamed from: V1 */
    public static C15035a m38061V1(Context context, List<TransitStop> list, ServerId serverId, TransitLineGroup transitLineGroup) {
        C15035a aVar = new C15035a();
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        Resources resources = context.getResources();
        C21100e.m49373x(resources, "resources");
        Bundle bundle = new Bundle();
        CharSequence text = resources.getText(R.string.line_schedule_destination_header);
        if (text == null) {
            bundle.remove("title");
        }
        bundle.putCharSequence("title", text);
        bundle.putParcelable("selected_stop_id", serverId);
        bundle.putParcelable("line_group", transitLineGroup);
        bundle.putParcelableArrayList("stop_list", C13717b.m34264k(list));
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: U1 */
    public final void mo39472U1(C12709i iVar, Bundle bundle) {
        ((ViewGroup) iVar.findViewById(R.id.buttons)).setVisibility(8);
        Bundle arguments = getArguments();
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("stop_list");
        ServerId serverId = (ServerId) arguments.getParcelable("selected_stop_id");
        A a = this.f40792c;
        iVar.mo39501b(iVar.getLayoutInflater().inflate(R.layout.select_station_layout, (FrameLayout) iVar.findViewById(C19740r.content), false));
        C18675k kVar = new C18675k(a, R.drawable.shadow_scroll);
        C12798g e = C12798g.m32602e(0, a, (TransitLineGroup) arguments.getParcelable("line_group"));
        RecyclerView recyclerView = (RecyclerView) iVar.findViewById(R.id.recycler);
        recyclerView.mo4593g(e, -1);
        recyclerView.mo4593g(kVar, -1);
        recyclerView.setLayoutManager(new LinearLayoutManager(a));
        recyclerView.setAdapter(new C15036a(parcelableArrayList, serverId));
        if (serverId != null) {
            recyclerView.mo4589e0(parcelableArrayList.indexOf(serverId));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        A a = this.f40792c;
        if (a instanceof C15037b) {
            this.f38528t = (C15037b) a;
        }
    }
}
