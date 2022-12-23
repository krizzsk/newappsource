package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0302k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.e */
public final class C0290e extends BaseAdapter {

    /* renamed from: b */
    public C0291f f915b;

    /* renamed from: c */
    public int f916c = -1;

    /* renamed from: d */
    public boolean f917d;

    /* renamed from: e */
    public final boolean f918e;

    /* renamed from: f */
    public final LayoutInflater f919f;

    /* renamed from: g */
    public final int f920g;

    public C0290e(C0291f fVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f918e = z;
        this.f919f = layoutInflater;
        this.f915b = fVar;
        this.f920g = i;
        mo1084a();
    }

    /* renamed from: a */
    public final void mo1084a() {
        C0291f fVar = this.f915b;
        C0295h hVar = fVar.f943v;
        if (hVar != null) {
            fVar.mo1114i();
            ArrayList<C0295h> arrayList = fVar.f931j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == hVar) {
                    this.f916c = i;
                    return;
                }
            }
        }
        this.f916c = -1;
    }

    /* renamed from: b */
    public final C0295h getItem(int i) {
        ArrayList<C0295h> arrayList;
        if (this.f918e) {
            C0291f fVar = this.f915b;
            fVar.mo1114i();
            arrayList = fVar.f931j;
        } else {
            arrayList = this.f915b.mo1118l();
        }
        int i2 = this.f916c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public final int getCount() {
        ArrayList<C0295h> arrayList;
        if (this.f918e) {
            C0291f fVar = this.f915b;
            fVar.mo1114i();
            arrayList = fVar.f931j;
        } else {
            arrayList = this.f915b.mo1118l();
        }
        if (this.f916c < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.f919f.inflate(this.f920g, viewGroup, false);
        }
        int i3 = getItem(i).f953b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).f953b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f915b.mo1119m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C0302k.C0303a aVar = (C0302k.C0303a) view;
        if (this.f917d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1009c(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        mo1084a();
        super.notifyDataSetChanged();
    }
}
