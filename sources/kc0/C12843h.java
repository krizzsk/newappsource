package kc0;

import ac0.C7557a;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.moovit.database.sqlite.SQLiteDatabase;
import hc0.C12753b;
import java.util.List;
import kc0.C12844i;
import mf0.C24362h;

/* renamed from: kc0.h */
public final /* synthetic */ class C12843h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f31732b;

    /* renamed from: c */
    public final /* synthetic */ C12844i f31733c;

    /* renamed from: d */
    public final /* synthetic */ String f31734d;

    public /* synthetic */ C12843h(boolean z, C12844i iVar, String str) {
        this.f31732b = z;
        this.f31733c = iVar;
        this.f31734d = str;
    }

    public final void run() {
        boolean z = this.f31732b;
        C12844i iVar = this.f31733c;
        String str = this.f31734d;
        C24362h.m61211f(iVar, "this$0");
        C24362h.m61211f(str, "$url");
        if (z || !iVar.f31747e) {
            C12844i.C12846b bVar = iVar.f31745c;
            if (bVar != null) {
                ((C12753b) bVar).mo39556H(iVar.f31744b);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            List<ResolveInfo> queryIntentActivities = iVar.getContext().getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX);
            C24362h.m61210e(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            boolean z2 = !queryIntentActivities.isEmpty();
            if (z2) {
                iVar.getContext().startActivity(intent);
            } else if (!z2) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(str, "No external applications found to open the url: "));
            }
        } else {
            iVar.mo39681e(str, true);
        }
    }
}
