package z70;

import a00.C13382a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.search.SearchAction;
import com.moovit.search.SearchLocationActivity;
import com.moovit.util.DistanceUtils;
import ja0.C12797f;
import o00.C18676l;
import p583jk.C17884p;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p872vp.C20195b;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: z70.b */
public final class C13322b extends C18676l<C13321a, C13327e, C12797f> {

    /* renamed from: j */
    public final C13323a f33077j = new C13323a();

    /* renamed from: k */
    public final SearchLocationActivity f33078k;

    /* renamed from: z70.b$a */
    public class C13323a implements View.OnClickListener {
        public C13323a() {
        }

        public final void onClick(View view) {
            C13321a aVar = (C13321a) view.getTag(C19740r.view_tag_param1);
            SearchAction searchAction = (SearchAction) view.getTag(C19740r.view_tag_param2);
            Integer num = (Integer) view.getTag(C19740r.view_tag_param3);
            if (aVar != null && searchAction != null && num != null) {
                C13322b.this.f33078k.mo23892C2(aVar, searchAction, num.intValue());
            }
        }
    }

    public C13322b(SearchLocationActivity searchLocationActivity) {
        C21100e.m49373x(searchLocationActivity, "host");
        this.f33078k = searchLocationActivity;
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        int i3;
        C13327e eVar = (C13327e) mo51052n(i);
        if (eVar.f33088f == null) {
            i3 = -1;
        } else {
            i3 = eVar.size();
        }
        if (i3 == i2) {
            return 11;
        }
        return super.mo40090m(i, i2);
    }

    /* renamed from: p */
    public final int mo23815p(int i) {
        if (C20964s0.m49090h(((C13327e) mo51052n(i)).f47556c)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        return i == 11 || super.mo40091r(i);
    }

    /* renamed from: s */
    public final boolean mo23816s(int i) {
        if (i != 10) {
            return i == 0;
        }
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() != 11) {
            Context e = fVar.mo39638e();
            C13321a aVar = (C13321a) ((C13327e) mo51052n(i)).get(i2);
            int l = mo51051l(i, i2);
            View view = fVar.itemView;
            int i3 = C19740r.view_tag_param1;
            view.setTag(i3, aVar);
            int i4 = C19740r.view_tag_param2;
            view.setTag(i4, SearchAction.DEFAULT);
            int i5 = C19740r.view_tag_param3;
            view.setTag(i5, Integer.valueOf(l));
            view.setOnClickListener(this.f33077j);
            ImageView imageView = (ImageView) fVar.mo39639f(C19740r.image);
            if (aVar.f33072d != null) {
                imageView.setVisibility(0);
                C17884p.m44354Y(imageView).mo51642v(aVar.f33072d).mo51628o0(aVar.f33072d).mo10850T(imageView);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView) fVar.mo39639f(C19740r.distance);
            int i6 = aVar.f33076h;
            if (i6 > 0) {
                textView.setText(DistanceUtils.m17934a((int) DistanceUtils.m17936c(e, (float) i6), e));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            UiUtils.m40234B((TextView) fVar.mo39639f(C19740r.title), aVar.f33073e);
            ImagesOrTextsView imagesOrTextsView = (ImagesOrTextsView) fVar.mo39639f(C19740r.subtitle);
            if (!C13717b.m34258e(aVar.f33074f)) {
                imagesOrTextsView.setItems(aVar.f33074f);
                imagesOrTextsView.setVisibility(0);
            } else {
                imagesOrTextsView.setVisibility(8);
            }
            C13382a.m33674j(view, aVar.f33073e, C20195b.m47767k(aVar.f33074f));
            ImageView imageView2 = (ImageView) fVar.mo39639f(C19740r.accessory);
            imageView2.setTag(i3, aVar);
            imageView2.setTag(i4, aVar.f33075g);
            imageView2.setTag(i5, Integer.valueOf(l));
            imageView2.setOnClickListener(this.f33077j);
            SearchAction searchAction = aVar.f33075g;
            if (searchAction != null) {
                UiUtils.m40264w(imageView2, searchAction.drawableResId, 8);
                imageView2.setContentDescription(imageView2.getResources().getString(aVar.f33075g.accessibilityResId));
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        View view2 = ((C13327e) mo51052n(i)).f33088f;
        FrameLayout frameLayout = (FrameLayout) fVar.itemView;
        if (view2 == null) {
            frameLayout.removeAllViews();
            return;
        }
        ViewParent parent = view2.getParent();
        if (frameLayout != parent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(view2, UiUtils.m40254m());
        }
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        if (fVar.getItemViewType() != 10) {
            C13327e eVar = (C13327e) mo51052n(i);
            ListItemView listItemView = (ListItemView) fVar.itemView;
            listItemView.setTitle(eVar.f47556c);
            C20944i0<Integer, View.OnClickListener> i0Var = eVar.f33087e;
            if (i0Var != null) {
                listItemView.setAccessoryView(((Integer) i0Var.f52692a).intValue());
                View accessoryView = listItemView.getAccessoryView();
                accessoryView.setOnClickListener((View.OnClickListener) i0Var.f52693b);
                accessoryView.setContentDescription(accessoryView.getContext().getString(C19746x.voice_over_options));
                return;
            }
            listItemView.setAccessoryView((View) null);
        }
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        if (i != 11) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C19742t.search_location_list_item, viewGroup, false);
        } else {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(UiUtils.m40254m());
            view = frameLayout;
        }
        return new C12797f(view);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        Space space;
        if (i == 10) {
            space = new Space(viewGroup.getContext());
        } else {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
            listItemView.setAccessoryIgnoreHorizontalPadding(true);
            space = listItemView;
        }
        space.setLayoutParams(UiUtils.m40254m());
        return new C12797f(space);
    }
}
