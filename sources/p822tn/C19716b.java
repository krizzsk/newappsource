package p822tn;

import android.app.Application;
import ce0.C21100e;
import java.io.File;
import java.util.HashMap;
import p445do.C16689a;
import p445do.C16690b;
import p469eo.C16846b;
import p493fo.C17048b;
import p846un.C19960b;
import p846un.C19963e;

/* renamed from: tn.b */
public final class C19716b extends C17048b {

    /* renamed from: c */
    public final Application f50133c;

    /* renamed from: d */
    public final C19963e f50134d = new C19963e();

    /* renamed from: e */
    public final C16689a f50135e = new C16689a();

    public C19716b(Application application) {
        this.f50133c = application;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C19963e eVar = this.f50134d;
        C17048b.m42897b(hashMap, eVar, C19960b.class, (String) null);
        C17048b.m42896a(hashMap, eVar);
        C16689a aVar = this.f50135e;
        C17048b.m42897b(hashMap, aVar, C16690b.class, (String) null);
        C17048b.m42896a(hashMap, aVar);
        C17048b.m42897b(hashMap, new File(this.f50133c.getApplicationContext().getFilesDir(), C21100e.m49304E(new byte[]{106, 117, 115, 116, 114, 105, 100, 101})).getAbsolutePath(), String.class, "pathToJustrideDirectory");
    }
}
