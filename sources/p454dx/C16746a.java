package p454dx;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.view.TodRideView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import ja0.C12797f;
import o00.C18676l;
import p496fr.C17064a;

/* renamed from: dx.a */
public final class C16746a extends C18676l<TodRide, C18676l.C18679c<TodRide>, C12797f> {

    /* renamed from: j */
    public final C16747a f43606j;

    /* renamed from: dx.a$a */
    public interface C16747a {
        /* renamed from: C0 */
        void mo46292C0(TodRide todRide);
    }

    public C16746a(C16747a aVar) {
        this.f43606j = aVar;
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        TodRide todRide = (TodRide) mo51052n(i).getItem(i2);
        TodRideView todRideView = (TodRideView) ((C12797f) a0Var).itemView;
        todRideView.setTodRide(todRide);
        todRideView.setOnClickListener(new C17064a(8, this, todRide));
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        TodRideView todRideView = new TodRideView(viewGroup.getContext(), (AttributeSet) null);
        todRideView.setLayoutParams(UiUtils.m40254m());
        return new C12797f(todRideView);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
        listItemView.setLayoutParams(UiUtils.m40254m());
        return new C12797f(listItemView);
    }
}
