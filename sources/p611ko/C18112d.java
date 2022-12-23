package p611ko;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.HashMap;
import p258t4.C6587a;
import p469eo.C16846b;
import p493fo.C17048b;

/* renamed from: ko.d */
public final class C18112d extends C17048b {

    /* renamed from: c */
    public final Context f46308c;

    public C18112d(Context context) {
        this.f46308c = context.getApplicationContext();
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        DisplayMetrics displayMetrics = this.f46308c.getResources().getDisplayMetrics();
        C17048b.m42897b(hashMap, new C18109a(displayMetrics), C18109a.class, (String) null);
        C18110b bVar2 = new C18110b(displayMetrics);
        C17048b.m42897b(hashMap, bVar2, C18110b.class, (String) null);
        C6587a aVar = new C6587a();
        C17048b.m42897b(hashMap, aVar, C6587a.class, (String) null);
        C17048b.m42897b(hashMap, new C18111c(bVar2, aVar), C18111c.class, (String) null);
    }
}
