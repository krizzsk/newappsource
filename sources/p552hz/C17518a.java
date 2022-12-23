package p552hz;

import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.DistanceUtils;
import p496fr.C17065b;
import q00.C19047a;
import q00.C19053d;

/* renamed from: hz.a */
public final /* synthetic */ class C17518a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C17520c f45097b;

    /* renamed from: c */
    public final /* synthetic */ ListItemView f45098c;

    /* renamed from: d */
    public final /* synthetic */ View f45099d;

    /* renamed from: e */
    public final /* synthetic */ int f45100e;

    /* renamed from: f */
    public final /* synthetic */ LatLonE6 f45101f;

    public /* synthetic */ C17518a(C17520c cVar, ListItemView listItemView, View view, int i, LatLonE6 latLonE6) {
        this.f45097b = cVar;
        this.f45098c = listItemView;
        this.f45099d = view;
        this.f45100e = i;
        this.f45101f = latLonE6;
    }

    public final void onSuccess(Object obj) {
        C17520c cVar = this.f45097b;
        ListItemView listItemView = this.f45098c;
        View view = this.f45099d;
        int i = this.f45100e;
        LatLonE6 latLonE6 = this.f45101f;
        String str = (String) obj;
        int i2 = C17520c.f45103w;
        cVar.getClass();
        if (str != null) {
            listItemView.setText((CharSequence) str);
            listItemView.setAccessoryText((CharSequence) DistanceUtils.m17934a((int) DistanceUtils.m17936c(view.getContext(), (float) i), view.getContext()));
            listItemView.setVisibility(0);
            if (((Boolean) ((C19047a) cVar.mo46750H1("CONFIGURATION")).mo51505b(C19053d.f48474m)).booleanValue()) {
                listItemView.setOnClickListener(new C17065b(7, cVar, latLonE6));
            }
        }
    }
}
