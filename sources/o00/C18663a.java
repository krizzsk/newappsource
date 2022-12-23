package o00;

import android.database.Cursor;
import android.database.DataSetObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1119a0;
import o10.C18690f;

/* renamed from: o00.a */
public abstract class C18663a<VH extends RecyclerView.C1119a0> extends RecyclerView.Adapter<VH> {

    /* renamed from: g */
    public final C18664a f47536g = new C18664a((C18690f) this);

    /* renamed from: h */
    public Cursor f47537h = null;

    /* renamed from: i */
    public boolean f47538i = false;

    /* renamed from: o00.a$a */
    public class C18664a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ C18663a f47539a;

        public C18664a(C18690f fVar) {
            this.f47539a = fVar;
        }

        public final void onChanged() {
            super.onChanged();
            C18663a aVar = this.f47539a;
            aVar.f47538i = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            super.onInvalidated();
            C18663a aVar = this.f47539a;
            aVar.f47538i = false;
            aVar.notifyDataSetChanged();
        }
    }

    public C18663a() {
        mo51045j((Cursor) null);
    }

    public int getItemCount() {
        Cursor cursor;
        if (!this.f47538i || (cursor = this.f47537h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* renamed from: j */
    public final void mo51045j(Cursor cursor) {
        boolean z;
        Cursor cursor2 = this.f47537h;
        if (cursor2 == cursor) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                cursor2.unregisterDataSetObserver(this.f47536g);
            }
            this.f47537h = cursor;
            if (cursor != null) {
                z = true;
            } else {
                z = false;
            }
            this.f47538i = z;
            if (z) {
                cursor.getColumnIndex("_id");
                this.f47537h.registerDataSetObserver(this.f47536g);
            }
            C18690f fVar = (C18690f) this;
            if (cursor != null) {
                fVar.f47581m = cursor.getColumnIndexOrThrow("stop_id");
                fVar.f47582n = cursor.getColumnIndexOrThrow("stop_name");
                fVar.f47583o = cursor.getColumnIndexOrThrow("stop_code");
                fVar.f47584p = cursor.getColumnIndexOrThrow("stop_image_data");
            } else {
                fVar.f47581m = -1;
                fVar.f47582n = -1;
                fVar.f47583o = -1;
                fVar.f47584p = -1;
            }
            notifyDataSetChanged();
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: k */
    public final Cursor mo51046k(int i) {
        Cursor cursor;
        if (!this.f47538i || (cursor = this.f47537h) == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid!");
        } else if (cursor.moveToPosition(i)) {
            return this.f47537h;
        } else {
            throw new IllegalStateException(C16759e.m42349e("couldn't move cursor to position ", i));
        }
    }
}
