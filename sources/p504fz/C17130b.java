package p504fz;

import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.DistanceUtils;
import p451du.C16723t;
import q00.C19047a;
import q00.C19053d;

/* renamed from: fz.b */
public final /* synthetic */ class C17130b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C17131c f44353b;

    /* renamed from: c */
    public final /* synthetic */ ListItemView f44354c;

    /* renamed from: d */
    public final /* synthetic */ View f44355d;

    /* renamed from: e */
    public final /* synthetic */ int f44356e;

    /* renamed from: f */
    public final /* synthetic */ LatLonE6 f44357f;

    public /* synthetic */ C17130b(C17131c cVar, ListItemView listItemView, View view, int i, LatLonE6 latLonE6) {
        this.f44353b = cVar;
        this.f44354c = listItemView;
        this.f44355d = view;
        this.f44356e = i;
        this.f44357f = latLonE6;
    }

    public final void onSuccess(Object obj) {
        C17131c cVar = this.f44353b;
        ListItemView listItemView = this.f44354c;
        View view = this.f44355d;
        int i = this.f44356e;
        LatLonE6 latLonE6 = this.f44357f;
        String str = (String) obj;
        int i2 = C17131c.f44358w;
        cVar.getClass();
        if (str != null) {
            listItemView.setText((CharSequence) str);
            listItemView.setAccessoryText((CharSequence) DistanceUtils.m17934a((int) DistanceUtils.m17936c(view.getContext(), (float) i), view.getContext()));
            listItemView.setVisibility(0);
            if (((Boolean) ((C19047a) cVar.mo46750H1("CONFIGURATION")).mo51505b(C19053d.f48474m)).booleanValue()) {
                listItemView.setOnClickListener(new C16723t(3, cVar, latLonE6));
            }
        }
    }
}
