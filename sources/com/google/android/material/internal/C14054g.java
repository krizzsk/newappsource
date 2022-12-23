package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0307m;
import androidx.core.widget.C0801k;
import androidx.recyclerview.widget.C1174e0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13403d;
import p355ac.C13407h;

/* renamed from: com.google.android.material.internal.g */
public final class C14054g implements C0300j {

    /* renamed from: A */
    public int f35056A = -1;

    /* renamed from: B */
    public final C14055a f35057B = new C14055a();

    /* renamed from: b */
    public NavigationMenuView f35058b;

    /* renamed from: c */
    public LinearLayout f35059c;

    /* renamed from: d */
    public C0291f f35060d;

    /* renamed from: e */
    public int f35061e;

    /* renamed from: f */
    public C14057c f35062f;

    /* renamed from: g */
    public LayoutInflater f35063g;

    /* renamed from: h */
    public int f35064h = 0;

    /* renamed from: i */
    public ColorStateList f35065i;

    /* renamed from: j */
    public int f35066j = 0;

    /* renamed from: k */
    public ColorStateList f35067k;

    /* renamed from: l */
    public ColorStateList f35068l;

    /* renamed from: m */
    public Drawable f35069m;

    /* renamed from: n */
    public RippleDrawable f35070n;

    /* renamed from: o */
    public int f35071o;

    /* renamed from: p */
    public int f35072p;

    /* renamed from: q */
    public int f35073q;

    /* renamed from: r */
    public int f35074r;

    /* renamed from: s */
    public int f35075s;

    /* renamed from: t */
    public int f35076t;

    /* renamed from: u */
    public int f35077u;

    /* renamed from: v */
    public boolean f35078v;

    /* renamed from: w */
    public boolean f35079w = true;

    /* renamed from: x */
    public int f35080x;

    /* renamed from: y */
    public int f35081y;

    /* renamed from: z */
    public int f35082z;

    /* renamed from: com.google.android.material.internal.g$a */
    public class C14055a implements View.OnClickListener {
        public C14055a() {
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C14057c cVar = C14054g.this.f35062f;
            boolean z = true;
            if (cVar != null) {
                cVar.f35086i = true;
            }
            C0295h itemData = navigationMenuItemView.getItemData();
            C14054g gVar = C14054g.this;
            boolean q = gVar.f35060d.mo1125q(itemData, gVar, 0);
            if (itemData == null || !itemData.isCheckable() || !q) {
                z = false;
            } else {
                C14054g.this.f35062f.mo41879k(itemData);
            }
            C14054g gVar2 = C14054g.this;
            C14057c cVar2 = gVar2.f35062f;
            if (cVar2 != null) {
                cVar2.f35086i = false;
            }
            if (z) {
                gVar2.mo1054i(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.g$b */
    public static class C14056b extends C14066l {
        public C14056b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* renamed from: com.google.android.material.internal.g$c */
    public class C14057c extends RecyclerView.Adapter<C14066l> {

        /* renamed from: g */
        public final ArrayList<C14059e> f35084g = new ArrayList<>();

        /* renamed from: h */
        public C0295h f35085h;

        /* renamed from: i */
        public boolean f35086i;

        public C14057c() {
            mo41878j();
        }

        public final int getItemCount() {
            return this.f35084g.size();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            C14059e eVar = this.f35084g.get(i);
            if (eVar instanceof C14060f) {
                return 2;
            }
            if (eVar instanceof C14058d) {
                return 3;
            }
            if (!(eVar instanceof C14061g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C14061g) eVar).f35090a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: j */
        public final void mo41878j() {
            if (!this.f35086i) {
                this.f35086i = true;
                this.f35084g.clear();
                this.f35084g.add(new C14058d());
                int i = -1;
                int size = C14054g.this.f35060d.mo1118l().size();
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    C0295h hVar = C14054g.this.f35060d.mo1118l().get(i2);
                    if (hVar.isChecked()) {
                        mo41879k(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.mo1152f(z);
                    }
                    if (hVar.hasSubMenu()) {
                        C0307m mVar = hVar.f966o;
                        if (mVar.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f35084g.add(new C14060f(C14054g.this.f35082z, z ? 1 : 0));
                            }
                            this.f35084g.add(new C14061g(hVar));
                            int size2 = mVar.size();
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < size2) {
                                C0295h hVar2 = (C0295h) mVar.getItem(i4);
                                if (hVar2.isVisible()) {
                                    if (!z3 && hVar2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.mo1152f(z);
                                    }
                                    if (hVar.isChecked()) {
                                        mo41879k(hVar);
                                    }
                                    this.f35084g.add(new C14061g(hVar2));
                                }
                                i4++;
                                z = false;
                            }
                            if (z3) {
                                int size3 = this.f35084g.size();
                                for (int size4 = this.f35084g.size(); size4 < size3; size4++) {
                                    ((C14061g) this.f35084g.get(size4)).f35091b = true;
                                }
                            }
                        }
                    } else {
                        int i5 = hVar.f953b;
                        if (i5 != i) {
                            i3 = this.f35084g.size();
                            if (hVar.getIcon() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C14059e> arrayList = this.f35084g;
                                int i6 = C14054g.this.f35082z;
                                arrayList.add(new C14060f(i6, i6));
                            }
                        } else if (!z2 && hVar.getIcon() != null) {
                            int size5 = this.f35084g.size();
                            for (int i7 = i3; i7 < size5; i7++) {
                                ((C14061g) this.f35084g.get(i7)).f35091b = true;
                            }
                            z2 = true;
                        }
                        C14061g gVar = new C14061g(hVar);
                        gVar.f35091b = z2;
                        this.f35084g.add(gVar);
                        i = i5;
                    }
                    i2++;
                    z = false;
                }
                this.f35086i = false;
            }
        }

        /* renamed from: k */
        public final void mo41879k(C0295h hVar) {
            if (this.f35085h != hVar && hVar.isCheckable()) {
                C0295h hVar2 = this.f35085h;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f35085h = hVar;
                hVar.setChecked(true);
            }
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            Drawable drawable;
            C14066l lVar = (C14066l) a0Var;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(C14054g.this.f35068l);
                int i2 = C14054g.this.f35066j;
                if (i2 != 0) {
                    navigationMenuItemView.setTextAppearance(i2);
                }
                ColorStateList colorStateList = C14054g.this.f35067k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable2 = C14054g.this.f35069m;
                if (drawable2 != null) {
                    drawable = drawable2.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(navigationMenuItemView, drawable);
                RippleDrawable rippleDrawable = C14054g.this.f35070n;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                C14061g gVar = (C14061g) this.f35084g.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f35091b);
                C14054g gVar2 = C14054g.this;
                int i3 = gVar2.f35071o;
                int i4 = gVar2.f35072p;
                navigationMenuItemView.setPadding(i3, i4, i3, i4);
                navigationMenuItemView.setIconPadding(C14054g.this.f35073q);
                C14054g gVar3 = C14054g.this;
                if (gVar3.f35078v) {
                    navigationMenuItemView.setIconSize(gVar3.f35074r);
                }
                navigationMenuItemView.setMaxLines(C14054g.this.f35080x);
                navigationMenuItemView.mo1009c(gVar.f35090a);
            } else if (itemViewType == 1) {
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((C14061g) this.f35084g.get(i)).f35090a.f956e);
                int i5 = C14054g.this.f35064h;
                if (i5 != 0) {
                    C0801k.m2424f(textView, i5);
                }
                int i6 = C14054g.this.f35077u;
                int paddingTop = textView.getPaddingTop();
                C14054g.this.getClass();
                textView.setPadding(i6, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList2 = C14054g.this.f35065i;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
            } else if (itemViewType == 2) {
                C14060f fVar = (C14060f) this.f35084g.get(i);
                View view = lVar.itemView;
                C14054g gVar4 = C14054g.this;
                view.setPadding(gVar4.f35075s, fVar.f35088a, gVar4.f35076t, fVar.f35089b);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 a0Var;
            if (i == 0) {
                C14054g gVar = C14054g.this;
                a0Var = new C14063i(gVar.f35063g, viewGroup, gVar.f35057B);
            } else if (i == 1) {
                a0Var = new C14065k(C14054g.this.f35063g, viewGroup);
            } else if (i == 2) {
                a0Var = new C14064j(C14054g.this.f35063g, viewGroup);
            } else if (i != 3) {
                return null;
            } else {
                return new C14056b(C14054g.this.f35059c);
            }
            return a0Var;
        }

        public final void onViewRecycled(RecyclerView.C1119a0 a0Var) {
            C14066l lVar = (C14066l) a0Var;
            if (lVar instanceof C14063i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f34943A;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f34952z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.g$d */
    public static class C14058d implements C14059e {
    }

    /* renamed from: com.google.android.material.internal.g$e */
    public interface C14059e {
    }

    /* renamed from: com.google.android.material.internal.g$f */
    public static class C14060f implements C14059e {

        /* renamed from: a */
        public final int f35088a;

        /* renamed from: b */
        public final int f35089b;

        public C14060f(int i, int i2) {
            this.f35088a = i;
            this.f35089b = i2;
        }
    }

    /* renamed from: com.google.android.material.internal.g$g */
    public static class C14061g implements C14059e {

        /* renamed from: a */
        public final C0295h f35090a;

        /* renamed from: b */
        public boolean f35091b;

        public C14061g(C0295h hVar) {
            this.f35090a = hVar;
        }
    }

    /* renamed from: com.google.android.material.internal.g$h */
    public class C14062h extends C1174e0 {
        public C14062h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            C14057c cVar = C14054g.this.f35062f;
            if (C14054g.this.f35059c.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < C14054g.this.f35062f.getItemCount(); i2++) {
                if (C14054g.this.f35062f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            gVar.f20334a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.g$i */
    public static class C14063i extends C14066l {
        public C14063i(LayoutInflater layoutInflater, ViewGroup viewGroup, C14055a aVar) {
            super(layoutInflater.inflate(C13407h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(aVar);
        }
    }

    /* renamed from: com.google.android.material.internal.g$j */
    public static class C14064j extends C14066l {
        public C14064j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C13407h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.g$k */
    public static class C14065k extends C14066l {
        public C14065k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C13407h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.g$l */
    public static abstract class C14066l extends RecyclerView.C1119a0 {
        public C14066l(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
    }

    /* renamed from: d */
    public final boolean mo1045d(C0295h hVar) {
        return false;
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
        C0295h hVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C0295h hVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f35058b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C14057c cVar = this.f35062f;
                cVar.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    cVar.f35086i = true;
                    int size = cVar.f35084g.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C14059e eVar = cVar.f35084g.get(i2);
                        if ((eVar instanceof C14061g) && (hVar2 = ((C14061g) eVar).f35090a) != null && hVar2.f952a == i) {
                            cVar.mo41879k(hVar2);
                            break;
                        }
                        i2++;
                    }
                    cVar.f35086i = false;
                    cVar.mo41878j();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f35084g.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C14059e eVar2 = cVar.f35084g.get(i3);
                        if (!(!(eVar2 instanceof C14061g) || (hVar = ((C14061g) eVar2).f35090a) == null || (actionView = hVar.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(hVar.f952a)) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f35059c.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo1052f(C0307m mVar) {
        return false;
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f35058b != null) {
            SparseArray sparseArray = new SparseArray();
            this.f35058b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C14057c cVar = this.f35062f;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            C0295h hVar = cVar.f35085h;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f952a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f35084g.size();
            for (int i = 0; i < size; i++) {
                C14059e eVar = cVar.f35084g.get(i);
                if (eVar instanceof C14061g) {
                    C0295h hVar2 = ((C14061g) eVar).f35090a;
                    if (hVar2 != null) {
                        view = hVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(hVar2.f952a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f35059c != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f35059c.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final int getId() {
        return this.f35061e;
    }

    /* renamed from: h */
    public final boolean mo1047h(C0295h hVar) {
        return false;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        C14057c cVar = this.f35062f;
        if (cVar != null) {
            cVar.mo41878j();
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        return false;
    }

    /* renamed from: k */
    public final void mo1075k(Context context, C0291f fVar) {
        this.f35063g = LayoutInflater.from(context);
        this.f35060d = fVar;
        this.f35082z = context.getResources().getDimensionPixelOffset(C13403d.design_navigation_separator_vertical_padding);
    }
}
