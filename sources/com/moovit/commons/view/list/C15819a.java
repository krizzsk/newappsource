package com.moovit.commons.view.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import c00.C13717b;
import c00.C13730k;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.commons.view.list.C15819a.C15821b;
import com.moovit.commons.view.list.PositionedListItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m00.C18307b;
import p583jk.C17884p;
import p622kz.C18162d;

/* renamed from: com.moovit.commons.view.list.a */
public abstract class C15819a<V, VH, S extends C15821b<? extends V>, SH> extends C18307b<Object, View, VH> implements ExpandableListAdapter {

    /* renamed from: g */
    public ArrayList<S> f41251g;

    /* renamed from: h */
    public int f41252h;

    /* renamed from: i */
    public Drawable f41253i;

    /* renamed from: j */
    public int f41254j;

    /* renamed from: k */
    public Drawable f41255k;

    /* renamed from: l */
    public int f41256l;

    /* renamed from: m */
    public ArrayList<Integer> f41257m;

    /* renamed from: n */
    public int f41258n;

    /* renamed from: o */
    public boolean f41259o;

    /* renamed from: p */
    public int f41260p;

    /* renamed from: q */
    public boolean f41261q;

    /* renamed from: r */
    public boolean f41262r;

    /* renamed from: s */
    public boolean f41263s;

    /* renamed from: t */
    public boolean f41264t;

    /* renamed from: u */
    public final CollectionHashMap.ArrayListHashMap<Integer, View> f41265u;

    /* renamed from: v */
    public final CollectionHashMap.ArrayListHashMap<Integer, View> f41266v;

    /* renamed from: w */
    public boolean f41267w;

    /* renamed from: com.moovit.commons.view.list.a$a */
    public static class C15820a<V> extends C13730k<V> implements C15821b<V> {

        /* renamed from: c */
        public final CharSequence f41268c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15820a(String str, List list) {
            super(list == null ? new ArrayList() : list);
            this.f41268c = str;
        }

        /* renamed from: e */
        public int mo45699e() {
            return size();
        }

        public final V getItem(int i) {
            return get(i);
        }

        public final CharSequence getName() {
            return this.f41268c;
        }
    }

    /* renamed from: com.moovit.commons.view.list.a$b */
    public interface C15821b<V> {
        /* renamed from: e */
        int mo45699e();

        V getItem(int i);

        CharSequence getName();
    }

    public C15819a(Context context, boolean z, int i) {
        super(context, 0, 0);
        this.f41254j = -1;
        this.f41256l = -1;
        this.f41259o = false;
        this.f41261q = false;
        this.f41262r = false;
        this.f41263s = false;
        this.f41264t = false;
        this.f41265u = new CollectionHashMap.ArrayListHashMap<>();
        this.f41266v = new CollectionHashMap.ArrayListHashMap<>();
        this.f41267w = true;
        this.f41251g = new ArrayList<>();
        this.f41259o = false;
        this.f41258n = 0;
        this.f41261q = z;
        this.f41260p = i;
    }

    /* renamed from: B */
    public final int mo47287B(int i) {
        int binarySearch = Collections.binarySearch(this.f41257m, Integer.valueOf(i));
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        if (this.f41255k == null) {
            return binarySearch;
        }
        if (this.f41264t && i == 0) {
            return -6;
        }
        int i2 = binarySearch + 1;
        if (i2 >= this.f41257m.size() || this.f41257m.get(i2).intValue() != i + 1) {
            return binarySearch;
        }
        return -6;
    }

    /* renamed from: C */
    public int mo45033C(int i) {
        return 1;
    }

    /* renamed from: D */
    public void mo45034D(View view, S s, int i, V v, int i2, ViewGroup viewGroup) {
        Object obj;
        if (this.f41261q) {
            int i3 = C18162d.view_holder;
            obj = view.getTag(i3);
            if (obj == null) {
                obj = mo45836m(view);
            }
            view.setTag(i3, obj);
        } else {
            obj = null;
        }
        mo45835E(obj, s, i, v, i2);
    }

    /* renamed from: E */
    public void mo45835E(Object obj, C15821b bVar, int i, Object obj2, int i2) {
    }

    /* renamed from: F */
    public void mo45035F(View view, C15821b bVar, int i) {
        if (this.f41259o) {
            int i2 = C18162d.view_holder;
            Object tag = view.getTag(i2);
            if (tag == null) {
                tag = null;
            }
            view.setTag(i2, tag);
        }
    }

    /* renamed from: G */
    public final void mo47288G(ArrayList arrayList) {
        this.f41251g = new ArrayList<>(arrayList);
        mo47313p();
    }

    /* renamed from: a */
    public final View mo47289a(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        PositionedListItemView.ListItemPositionType listItemPositionType;
        int B = mo47287B(i2);
        int s = mo47314s(i2, B);
        if (s == -3) {
            return mo45037n(this.f41258n, B, viewGroup, layoutInflater);
        }
        View i3 = mo45036i(this.f41260p, B, s, viewGroup, layoutInflater);
        if (i3 instanceof PositionedListItemView) {
            PositionedListItemView positionedListItemView = (PositionedListItemView) i3;
            int e = mo47315x(B).mo45699e();
            if (e == 1) {
                listItemPositionType = PositionedListItemView.ListItemPositionType.SINGLE;
            } else if (s == 0) {
                listItemPositionType = PositionedListItemView.ListItemPositionType.FIRST;
            } else if (s == e - 1) {
                listItemPositionType = PositionedListItemView.ListItemPositionType.LAST;
            } else {
                listItemPositionType = PositionedListItemView.ListItemPositionType.MIDDLE;
            }
            positionedListItemView.setPositionType(listItemPositionType);
        }
        return i3;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public final void mo47291b(int i, View view) {
    }

    /* renamed from: d */
    public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
        int B = mo47287B(i);
        int s = mo47314s(i, B);
        C15821b x = mo47315x(B);
        if (s == -3) {
            mo45035F(view, x, B);
            return;
        }
        mo45034D(view, x, B, mo47315x(B).getItem(s), s, viewGroup);
    }

    public final V getChild(int i, int i2) {
        return mo47315x(i).getItem(i2);
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mo45036i(this.f41260p, i, i2, viewGroup, this.f46689c);
            mo45704u(i);
        }
        mo45034D(view, mo47315x(i), i, mo47315x(i).getItem(i2), i2, viewGroup);
        return view;
    }

    public final int getChildrenCount(int i) {
        return mo47315x(i).mo45699e();
    }

    public final long getCombinedChildId(long j, long j2) {
        return (long) C17884p.m44333D(C17884p.m44334E(j), C17884p.m44334E(j2));
    }

    public final long getCombinedGroupId(long j) {
        return (long) C17884p.m44334E(j);
    }

    public final int getCount() {
        return this.f41252h;
    }

    public final Object getGroup(int i) {
        return mo47315x(i);
    }

    public final int getGroupCount() {
        return this.f41251g.size();
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mo45037n(this.f41258n, i, viewGroup, this.f46689c);
            mo45033C(i);
        }
        mo45035F(view, mo47315x(i), i);
        return view;
    }

    public final Object getItem(int i) {
        int s;
        int B = mo47287B(i);
        if (B == -6 || (s = mo47314s(i, B)) == -5 || s == -4) {
            return null;
        }
        if (s != -3) {
            return ((C15821b) this.f41251g.get(B)).getItem(s);
        }
        return this.f41251g.get(B);
    }

    public final long getItemId(int i) {
        int B = mo47287B(i);
        long j = (((long) B) | 0) << 32;
        if (B == -6) {
            return j;
        }
        return j | ((long) mo47314s(i, B));
    }

    public final int getItemViewType(int i) {
        int B = mo47287B(i);
        if (B == -6) {
            return 3;
        }
        int s = mo47314s(i, B);
        if (s == -5) {
            return -2;
        }
        if (s == -4) {
            return 2;
        }
        if (s != -3) {
            return mo45704u(B);
        }
        return mo45033C(B);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        int i2;
        int B = mo47287B(i);
        if (B != -6) {
            int s = mo47314s(i, B);
            if (s == -4) {
                if (view != null) {
                    return view;
                }
                int i3 = this.f41254j;
                if (i3 < 0) {
                    i3 = this.f41253i.getIntrinsicHeight();
                }
                View view2 = new View(this.f46688b);
                view2.setLayoutParams(new AbsListView.LayoutParams(-1, i3));
                view2.setBackgroundDrawable(this.f41253i);
                return view2;
            } else if (s != -5) {
                return super.getView(i, view, viewGroup);
            } else {
                int i4 = 1;
                int intValue = (i - this.f41257m.get(B).intValue()) - 1;
                int z2 = mo47316z(B);
                if (intValue < z2) {
                    List list = (List) this.f41265u.get(Integer.valueOf(B));
                    if (list == null) {
                        return null;
                    }
                    return (View) list.get(intValue);
                }
                int i5 = intValue - z2;
                int e = mo47315x(B).mo45699e();
                if (e == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f41262r && this.f41253i != null && !z && z2 > 0) {
                    i5--;
                }
                Drawable drawable = this.f41253i;
                if (drawable == null || z) {
                    i2 = 0;
                } else {
                    i2 = e - 1;
                }
                int i6 = (i5 - e) - i2;
                if (!this.f41263s || drawable == null || z) {
                    i4 = 0;
                }
                int i7 = i6 - i4;
                List list2 = (List) this.f41266v.get(Integer.valueOf(B));
                if (list2 == null) {
                    return null;
                }
                return (View) list2.get(i7);
            }
        } else if (view != null) {
            return view;
        } else {
            int i8 = this.f41256l;
            if (i8 < 0) {
                i8 = this.f41255k.getIntrinsicHeight();
            }
            View view3 = new View(this.f46688b);
            view3.setLayoutParams(new AbsListView.LayoutParams(-1, i8));
            view3.setBackgroundDrawable(this.f41255k);
            return view3;
        }
    }

    public int getViewTypeCount() {
        return 5;
    }

    /* renamed from: i */
    public View mo45036i(int i, int i2, int i3, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final boolean isEmpty() {
        return C13717b.m34258e(this.f41251g);
    }

    public final boolean isEnabled(int i) {
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 4;
    }

    /* renamed from: m */
    public Object mo45836m(View view) {
        return null;
    }

    /* renamed from: n */
    public View mo45037n(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public final void notifyDataSetChanged() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f41255k == null || !this.f41264t) {
            i = 0;
        } else {
            i = 1;
        }
        this.f41252h = i;
        this.f41257m = new ArrayList<>(this.f41251g.size());
        for (int i7 = 0; i7 < this.f41251g.size(); i7++) {
            int e = ((C15821b) this.f41251g.get(i7)).mo45699e();
            if (e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f41255k == null || i7 == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (this.f41253i == null || z) {
                i3 = 0;
            } else {
                i3 = e - 1;
            }
            int z2 = mo47316z(i7);
            if (!this.f41262r || this.f41253i == null || z2 == 0 || z) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            List list = (List) this.f41266v.get(Integer.valueOf(i7));
            if (list == null) {
                i5 = 0;
            } else {
                i5 = list.size();
            }
            if (!this.f41263s || this.f41253i == null || i5 == 0 || z) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.f41257m.add(Integer.valueOf(this.f41252h + i2));
            this.f41252h = e + 1 + i3 + i2 + z2 + i4 + i5 + i6 + this.f41252h;
        }
        super.notifyDataSetChanged();
        this.f41267w = true;
    }

    public final void onGroupCollapsed(int i) {
    }

    public final void onGroupExpanded(int i) {
    }

    /* renamed from: p */
    public final void mo47313p() {
        if (this.f41267w) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: s */
    public final int mo47314s(int i, int i2) {
        boolean z;
        int intValue = i - this.f41257m.get(i2).intValue();
        if (intValue == 0) {
            return -3;
        }
        int i3 = intValue - 1;
        int e = mo47315x(i2).mo45699e();
        int i4 = 0;
        if (e == 0) {
            z = true;
        } else {
            z = false;
        }
        int z2 = mo47316z(i2);
        if (z2 > 0) {
            if (i3 < z2) {
                return -5;
            }
            i3 -= z2;
            if (this.f41262r && this.f41253i != null && !z) {
                if (i3 == 0) {
                    return -4;
                }
                i3--;
            }
        }
        Drawable drawable = this.f41253i;
        if (drawable != null && !z) {
            i4 = e - 1;
        }
        int i5 = e + i4;
        if (i3 >= i5) {
            int i6 = i3 - i5;
            if (!this.f41263s || drawable == null || z || i6 != 0) {
                return -5;
            }
            return -4;
        } else if (drawable == null) {
            return i3;
        } else {
            if (i3 % 2 == 1) {
                return -4;
            }
            return (i3 + 1) / 2;
        }
    }

    /* renamed from: u */
    public int mo45704u(int i) {
        return 0;
    }

    /* renamed from: x */
    public final S mo47315x(int i) {
        return (C15821b) this.f41251g.get(i);
    }

    /* renamed from: z */
    public final int mo47316z(int i) {
        List list = (List) this.f41265u.get(Integer.valueOf(i));
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
