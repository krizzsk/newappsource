package p293w1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p293w1.C6966b;

/* renamed from: w1.a */
public abstract class C6963a extends BaseAdapter implements Filterable, C6966b.C6967a {

    /* renamed from: b */
    public boolean f21719b = false;

    /* renamed from: c */
    public boolean f21720c = true;

    /* renamed from: d */
    public Cursor f21721d = null;

    /* renamed from: e */
    public int f21722e = -1;

    /* renamed from: f */
    public C6964a f21723f = new C6964a();

    /* renamed from: g */
    public C6965b f21724g = new C6965b();

    /* renamed from: h */
    public C6966b f21725h;

    /* renamed from: w1.a$a */
    public class C6964a extends ContentObserver {
        public C6964a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            Cursor cursor;
            C6963a aVar = C6963a.this;
            if (aVar.f21720c && (cursor = aVar.f21721d) != null && !cursor.isClosed()) {
                aVar.f21719b = aVar.f21721d.requery();
            }
        }
    }

    /* renamed from: w1.a$b */
    public class C6965b extends DataSetObserver {
        public C6965b() {
        }

        public final void onChanged() {
            C6963a aVar = C6963a.this;
            aVar.f21719b = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            C6963a aVar = C6963a.this;
            aVar.f21719b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C6963a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo2041a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo2042b(Cursor cursor) {
        Cursor cursor2 = this.f21721d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C6964a aVar = this.f21723f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                C6965b bVar = this.f21724g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f21721d = cursor;
            if (cursor != null) {
                C6964a aVar2 = this.f21723f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                C6965b bVar2 = this.f21724g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f21722e = cursor.getColumnIndexOrThrow("_id");
                this.f21719b = true;
                notifyDataSetChanged();
            } else {
                this.f21722e = -1;
                this.f21719b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo2043c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo2044d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f21719b || (cursor = this.f21721d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f21719b) {
            return null;
        }
        this.f21721d.moveToPosition(i);
        if (view == null) {
            C6968c cVar = (C6968c) this;
            view = cVar.f21731k.inflate(cVar.f21730j, viewGroup, false);
        }
        mo2041a(view, this.f21721d);
        return view;
    }

    public final Filter getFilter() {
        if (this.f21725h == null) {
            this.f21725h = new C6966b(this);
        }
        return this.f21725h;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f21719b || (cursor = this.f21721d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f21721d;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f21719b || (cursor = this.f21721d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f21721d.getLong(this.f21722e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f21719b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f21721d.moveToPosition(i)) {
            if (view == null) {
                view = mo2044d(viewGroup);
            }
            mo2041a(view, this.f21721d);
            return view;
        } else {
            throw new IllegalStateException(C16759e.m42349e("couldn't move cursor to position ", i));
        }
    }
}
