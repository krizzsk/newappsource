package ha0;

import a00.C13382a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;

/* renamed from: ha0.a */
public final class C12745a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final Context f31486g;

    /* renamed from: h */
    public final LayoutInflater f31487h;

    /* renamed from: i */
    public final List<TransitStop> f31488i;

    public C12745a(Context context, ArrayList arrayList) {
        this.f31486g = context;
        this.f31487h = LayoutInflater.from(context);
        C21100e.m49373x(arrayList, "lineStops");
        this.f31488i = arrayList;
    }

    public final int getItemCount() {
        return this.f31488i.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        boolean z;
        int i2;
        ListItemView listItemView = (ListItemView) ((C12797f) a0Var).mo39639f(C19740r.item);
        TransitStop transitStop = this.f31488i.get(i);
        if (i == this.f31488i.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        listItemView.setTitle((CharSequence) transitStop.f23731c);
        if (z) {
            i2 = C19735m.textAppearanceCaptionStrong;
        } else {
            i2 = C19735m.textAppearanceCaption;
        }
        listItemView.setTitleThemeTextAppearance(i2);
        listItemView.setContentDescription(C13382a.m33667c(this.f31486g.getString(C19746x.voice_over_lineview_station_name, new Object[]{listItemView.getTitle()}), listItemView.getSubtitle()));
        View accessoryView = listItemView.getAccessoryView();
        if (accessoryView != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(accessoryView, 1);
        }
        listItemView.setActivated(z);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(this.f31487h.inflate(C19742t.line_stop_dialog_view, viewGroup, false));
    }
}
