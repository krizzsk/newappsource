package b90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c20.C13744a;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import ja0.C12797f;
import m80.C12869e;
import m80.C12870f;
import o00.C18676l;
import p495fq.C17057b;
import p977zz.C20935e;
import p977zz.C20964s0;

/* renamed from: b90.a */
public final class C7562a extends C18676l<PurchaseFilter, C18676l.C18679c<PurchaseFilter>, C12797f> {

    /* renamed from: j */
    public final Image f23048j;

    /* renamed from: k */
    public final String f23049k;

    /* renamed from: l */
    public final C20935e<PurchaseFilter> f23050l;

    public C7562a(Image image, String str, C17057b bVar) {
        this.f23048j = image;
        this.f23049k = str;
        this.f23050l = bVar;
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        if (C20964s0.m49090h(mo51052n(i).getName())) {
            return 10;
        }
        return 0;
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        if (i != 10) {
            return i == 0;
        }
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        PurchaseFilter purchaseFilter = (PurchaseFilter) mo51052n(i).getItem(i2);
        View view = ((C12797f) a0Var).itemView;
        C13744a.m34300b((ImageView) view.findViewById(C12869e.icon), purchaseFilter.f23340c);
        UiUtils.m40234B((TextView) view.findViewById(C12869e.title), purchaseFilter.f23341d);
        UiUtils.m40234B((TextView) view.findViewById(C12869e.subtitle), purchaseFilter.f23342e);
        view.setOnClickListener(new C4054t(11, this, purchaseFilter));
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() != 10) {
            C18676l.C18679c n = mo51052n(i);
            C13744a.m34300b((ImageView) fVar.mo39639f(C12869e.icon), this.f23048j);
            ((TextView) fVar.mo39639f(C12869e.title)).setText(n.getName());
            UiUtils.m40234B((TextView) fVar.mo39639f(C12869e.subtitle), this.f23049k);
        }
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_filter_card_item, viewGroup, false));
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        if (i == 10) {
            return new C12797f(new Space(viewGroup.getContext()));
        }
        return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_selection_cards_header, viewGroup, false));
    }
}
