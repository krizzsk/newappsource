package m00;

import aa0.C7527d;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import c00.C13717b;
import com.moovit.app.metro.selection.MetroListActivity;
import java.util.ArrayList;
import p977zz.C20944i0;

/* renamed from: m00.c */
public abstract class C18308c<I, F> extends BaseAdapter {

    /* renamed from: b */
    public Adapter f46693b;

    /* renamed from: c */
    public F f46694c;

    /* renamed from: d */
    public final ArrayList f46695d;

    /* renamed from: m00.c$a */
    public class C18309a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ C18308c f46696a;

        public C18309a(MetroListActivity.C15135d dVar) {
            this.f46696a = dVar;
        }

        public final void onChanged() {
            this.f46696a.mo50724a();
        }

        public final void onInvalidated() {
            this.f46696a.mo50724a();
        }
    }

    public C18308c(Adapter adapter, F f) {
        this.f46693b = adapter;
        this.f46694c = f;
        this.f46695d = new ArrayList(adapter.getCount());
        mo50724a();
        adapter.registerDataSetObserver(new C18309a((MetroListActivity.C15135d) this));
    }

    /* renamed from: a */
    public final void mo50724a() {
        this.f46695d.clear();
        Adapter adapter = this.f46693b;
        F f = this.f46694c;
        ArrayList arrayList = this.f46695d;
        int count = adapter.getCount();
        if (f == null) {
            arrayList.addAll(new C13717b.C13718a(0, count));
        } else {
            for (int i = 0; i < count; i++) {
                if (((C7527d) f).mo19661o((C20944i0) adapter.getItem(i))) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        notifyDataSetChanged();
    }

    public final boolean areAllItemsEnabled() {
        Adapter adapter = this.f46693b;
        if (!(adapter instanceof ListAdapter)) {
            return true;
        }
        return ((ListAdapter) adapter).areAllItemsEnabled();
    }

    /* renamed from: b */
    public final int mo50726b(int i) {
        return ((Integer) this.f46695d.get(i)).intValue();
    }

    public final int getCount() {
        return this.f46695d.size();
    }

    public final Object getItem(int i) {
        return this.f46693b.getItem(mo50726b(i));
    }

    public final long getItemId(int i) {
        return this.f46693b.getItemId(mo50726b(i));
    }

    public final int getItemViewType(int i) {
        return this.f46693b.getItemViewType(mo50726b(i));
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f46693b.getView(mo50726b(i), view, viewGroup);
    }

    public final int getViewTypeCount() {
        return this.f46693b.getViewTypeCount();
    }

    public final boolean hasStableIds() {
        return this.f46693b.hasStableIds();
    }

    public final boolean isEnabled(int i) {
        Adapter adapter = this.f46693b;
        if (!(adapter instanceof ListAdapter)) {
            return true;
        }
        return ((ListAdapter) adapter).isEnabled(mo50726b(i));
    }
}
