package f80;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0475w0;
import com.facebook.appevents.C2342l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.C7606b;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p669mz.C18487d;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20944i0;
import z70.C13321a;
import z70.C13324c;
import z70.C13327e;
import z70.C13335l;

/* renamed from: f80.b */
public class C12635b extends C13324c {

    /* renamed from: e */
    public final C12638d f31230e;

    /* renamed from: f */
    public final C12634a f31231f;

    /* renamed from: f80.b$a */
    public static class C12636a implements View.OnClickListener, C0475w0.C0476a {

        /* renamed from: b */
        public final C12638d f31232b;

        public C12636a(C12638d dVar) {
            this.f31232b = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x002d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
                android.content.Context r1 = r5.getContext()
                r2 = 0
                r0.<init>(r1, r5, r2)
                int r5 = p824tp.C19743u.base_search_fragment_clear_history
                n.f r3 = new n.f
                r3.<init>(r1)
                androidx.appcompat.view.menu.f r1 = r0.f1650b
                r3.inflate(r5, r1)
                r0.f1653e = r4
                androidx.appcompat.view.menu.i r5 = r0.f1652d
                boolean r0 = r5.mo1208b()
                r1 = 1
                if (r0 == 0) goto L_0x0022
                goto L_0x002a
            L_0x0022:
                android.view.View r0 = r5.f984f
                if (r0 != 0) goto L_0x0027
                goto L_0x002b
            L_0x0027:
                r5.mo1210d(r2, r2, r2, r2)
            L_0x002a:
                r2 = 1
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                return
            L_0x002e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f80.C12635b.C12636a.onClick(android.view.View):void");
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != C19740r.action_delete) {
                return false;
            }
            C12638d dVar = this.f31232b;
            dVar.mo51499b();
            C18487d<T> dVar2 = dVar.f48438c;
            dVar2.f33804b.clear();
            dVar2.mo50910h();
            return true;
        }
    }

    public C12635b(Context context, C7606b bVar, C12638d dVar) {
        super(context, "recent_locations");
        this.f31230e = dVar;
        C12634a aVar = new C12634a(bVar);
        this.f31231f = aVar;
        dVar.mo51499b();
        dVar.f48438c.mo50903a(aVar);
    }

    /* renamed from: a */
    public final String mo23775a(String str, LatLonE6 latLonE6) {
        return "recent_locations";
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.forResult(this.f31230e).onSuccessTask(threadPoolExecutor, new C2342l(15));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: f */
    public final void mo23778f() {
        super.mo23778f();
        C12638d dVar = this.f31230e;
        dVar.mo51499b();
        dVar.f48438c.mo50904b(this.f31231f);
    }

    /* renamed from: i */
    public C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        return C13335l.m33605a(str, str2, locationDescriptor, (SearchAction) null, i);
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        return new C13327e(str, context.getString(C19746x.search_recent_section_title), arrayList, new C20944i0(Integer.valueOf(C19742t.section_header_accessory_overflow_button), new C12636a(this.f31230e)), (View) null);
    }
}
