package p188o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0282b;
import androidx.appcompat.view.menu.C0290e;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0300j;

/* renamed from: o.d */
public abstract class C5899d implements C5901f, C0300j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f18974b;

    /* renamed from: m */
    public static int m14374m(C0290e eVar, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = eVar.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public static boolean m14375v(C0291f fVar) {
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo1045d(C0295h hVar) {
        return false;
    }

    public final int getId() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo1047h(C0295h hVar) {
        return false;
    }

    /* renamed from: k */
    public final void mo1075k(Context context, C0291f fVar) {
    }

    /* renamed from: l */
    public abstract void mo1056l(C0291f fVar);

    /* renamed from: o */
    public abstract void mo1058o(View view);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0290e eVar;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (C0290e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (C0290e) listAdapter;
        }
        C0291f fVar = eVar.f915b;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof C0282b)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        fVar.mo1125q(menuItem, this, i2);
    }

    /* renamed from: p */
    public abstract void mo1061p(boolean z);

    /* renamed from: q */
    public abstract void mo1062q(int i);

    /* renamed from: r */
    public abstract void mo1063r(int i);

    /* renamed from: s */
    public abstract void mo1064s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo1066t(boolean z);

    /* renamed from: u */
    public abstract void mo1067u(int i);
}
