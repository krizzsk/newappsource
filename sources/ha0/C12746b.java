package ha0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.TransitLine;
import ja0.C12798g;
import java.util.ArrayList;
import o00.C18669f;
import o00.C18670g;
import o00.C18675k;
import p824tp.C19728f;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;

/* renamed from: ha0.b */
public class C12746b extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f31489j = 0;

    /* renamed from: h */
    public TransitLine f31490h;

    /* renamed from: i */
    public ArrayList f31491i;

    public C12746b() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f31491i = K1.getParcelableArrayList("stops");
        this.f31490h = (TransitLine) K1.getParcelable("line");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.line_stops_dialog, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        super.onViewCreated(view, bundle);
        ListItemView listItemView = (ListItemView) view.findViewById(C19740r.line);
        if (this.f31490h != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        listItemView.setVisibility(i);
        if (z) {
            C16181a.m41233b(C19728f.m47195a(view.getContext()).mo52082b(LinePresentationType.ITINERARY), listItemView, this.f31490h);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C19740r.stops);
        Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.mo4593g(C18670g.m45652e(UiUtils.m40248g(context, 4.0f)), -1);
        recyclerView.mo4593g(C18669f.m45651e(UiUtils.m40249h(context.getResources(), 16.0f)), -1);
        recyclerView.mo4593g(new C18675k(context, C19739q.shadow_scroll), -1);
        recyclerView.mo4593g(C12798g.m32602e(0, context, this.f31490h.mo24369b()), -1);
        recyclerView.setAdapter(new C12745a(context, this.f31491i));
    }
}
