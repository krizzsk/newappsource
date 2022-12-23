package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0249h;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0302k;
import com.google.android.gms.location.places.Place;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import p114i.C5221g;

/* renamed from: androidx.appcompat.view.menu.d */
public final class C0288d implements C0300j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f906b;

    /* renamed from: c */
    public LayoutInflater f907c;

    /* renamed from: d */
    public C0291f f908d;

    /* renamed from: e */
    public ExpandedMenuView f909e;

    /* renamed from: f */
    public int f910f;

    /* renamed from: g */
    public C0300j.C0301a f911g;

    /* renamed from: h */
    public C0289a f912h;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    public class C0289a extends BaseAdapter {

        /* renamed from: b */
        public int f913b = -1;

        public C0289a() {
            mo1077a();
        }

        /* renamed from: a */
        public final void mo1077a() {
            C0291f fVar = C0288d.this.f908d;
            C0295h hVar = fVar.f943v;
            if (hVar != null) {
                fVar.mo1114i();
                ArrayList<C0295h> arrayList = fVar.f931j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.f913b = i;
                        return;
                    }
                }
            }
            this.f913b = -1;
        }

        /* renamed from: b */
        public final C0295h getItem(int i) {
            C0291f fVar = C0288d.this.f908d;
            fVar.mo1114i();
            ArrayList<C0295h> arrayList = fVar.f931j;
            C0288d.this.getClass();
            int i2 = i + 0;
            int i3 = this.f913b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public final int getCount() {
            C0291f fVar = C0288d.this.f908d;
            fVar.mo1114i();
            int size = fVar.f931j.size();
            C0288d.this.getClass();
            int i = size + 0;
            if (this.f913b < 0) {
                return i;
            }
            return i - 1;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0288d dVar = C0288d.this;
                view = dVar.f907c.inflate(dVar.f910f, viewGroup, false);
            }
            ((C0302k.C0303a) view).mo1009c(getItem(i));
            return view;
        }

        public final void notifyDataSetChanged() {
            mo1077a();
            super.notifyDataSetChanged();
        }
    }

    public C0288d(Context context, int i) {
        this.f910f = i;
        this.f906b = context;
        this.f907c = LayoutInflater.from(context);
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
        C0300j.C0301a aVar = this.f911g;
        if (aVar != null) {
            aVar.mo903b(fVar, z);
        }
    }

    /* renamed from: c */
    public final void mo1044c(C0300j.C0301a aVar) {
        this.f911g = aVar;
    }

    /* renamed from: d */
    public final boolean mo1045d(C0295h hVar) {
        return false;
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f909e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: f */
    public final boolean mo1052f(C0307m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        C0294g gVar = new C0294g(mVar);
        C0249h.C0250a aVar = new C0249h.C0250a(mVar.f922a);
        C0288d dVar = new C0288d(aVar.getContext(), C5221g.abc_list_menu_item_layout);
        gVar.f948d = dVar;
        dVar.f911g = gVar;
        C0291f fVar = gVar.f946b;
        fVar.mo1101b(dVar, fVar.f922a);
        C0288d dVar2 = gVar.f948d;
        if (dVar2.f912h == null) {
            dVar2.f912h = new C0289a();
        }
        C0289a aVar2 = dVar2.f912h;
        AlertController.C0216b bVar = aVar.f735a;
        bVar.f611m = aVar2;
        bVar.f612n = gVar;
        View view = mVar.f936o;
        if (view != null) {
            bVar.f603e = view;
        } else {
            bVar.f601c = mVar.f935n;
            aVar.setTitle(mVar.f934m);
        }
        aVar.f735a.f610l = gVar;
        C0249h create = aVar.create();
        gVar.f947c = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f947c.getWindow().getAttributes();
        attributes.type = Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3;
        attributes.flags |= SQLiteDatabase.OPEN_SHAREDCACHE;
        gVar.f947c.show();
        C0300j.C0301a aVar3 = this.f911g;
        if (aVar3 == null) {
            return true;
        }
        aVar3.mo904c(mVar);
        return true;
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        if (this.f909e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f909e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final int getId() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo1047h(C0295h hVar) {
        return false;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        C0289a aVar = this.f912h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        return false;
    }

    /* renamed from: k */
    public final void mo1075k(Context context, C0291f fVar) {
        if (this.f906b != null) {
            this.f906b = context;
            if (this.f907c == null) {
                this.f907c = LayoutInflater.from(context);
            }
        }
        this.f908d = fVar;
        C0289a aVar = this.f912h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f908d.mo1125q(this.f912h.getItem(i), this, 0);
    }
}
