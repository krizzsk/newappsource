package w80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import ja0.C12797f;
import m80.C12869e;
import m80.C12870f;
import m80.C12875k;
import o00.C18676l;
import p501fw.C17102a;
import p583jk.C17884p;
import p644lx.C18284b;

/* renamed from: w80.b */
public abstract class C13220b<T> extends C18676l<T, C13219a<T>, C12797f> {

    /* renamed from: j */
    public final C18284b f32793j = new C18284b(this, 14);

    /* renamed from: k */
    public final C17102a f32794k = new C17102a(this, 24);

    /* renamed from: A */
    public abstract void mo23784A();

    /* renamed from: B */
    public abstract View mo23785B(ViewGroup viewGroup);

    /* renamed from: C */
    public abstract void mo23786C(T t);

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        C13219a aVar = (C13219a) mo51052n(i);
        if (aVar.f32791e == null || i2 != aVar.mo40089e() - 1) {
            return 1;
        }
        return 2;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        C12797f fVar = (C12797f) a0Var;
        int itemViewType = fVar.getItemViewType();
        if (itemViewType == 1) {
            Object obj = ((C13219a) mo51052n(i)).get(i2);
            fVar.itemView.setTag(obj);
            fVar.itemView.setOnClickListener(this.f32793j);
            mo23787z(fVar, obj);
        } else if (itemViewType == 2) {
            ImageView imageView = (ImageView) fVar.mo39639f(C12869e.image_view);
            Image image = ((C13219a) mo51052n(i)).f32791e;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22738w(0).mo22730m(0).mo10850T(imageView);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unsupported view type: ", itemViewType));
        }
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        C13219a aVar = (C13219a) mo51052n(i);
        ImageView imageView = (ImageView) fVar.mo39639f(C12869e.agency_icon);
        Image image = aVar.f32790d;
        if (image != null) {
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            imageView.setVisibility(0);
        } else {
            C17884p.m44354Y(imageView).mo10872n(imageView);
            imageView.setVisibility(8);
        }
        UiUtils.m40234B((TextView) fVar.mo39639f(C12869e.agency_name), aVar.f47556c);
        TextView textView = (TextView) fVar.mo39639f(C12869e.applied_filters);
        UiUtils.m40234B(textView, C12875k.m32661a(aVar.f32792f));
        View f = fVar.mo39639f(C12869e.change_filters);
        f.setOnClickListener(this.f32794k);
        f.setVisibility(textView.getVisibility());
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            view = mo23785B(viewGroup);
        } else if (i == 2) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_attribution_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unsupported view type: ", i));
        }
        return new C12797f(view);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_selection_header, viewGroup, false));
    }

    /* renamed from: z */
    public abstract void mo23787z(C12797f fVar, T t);
}
