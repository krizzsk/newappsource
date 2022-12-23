package p413co;

import android.content.Context;
import ce0.C21100e;
import com.masabi.justride.sdk.platform.storage.MigrateToGcmEncryptionJob;
import java.io.File;
import java.util.HashMap;
import p413co.C13862i;
import p469eo.C16846b;
import p493fo.C17048b;
import p677nj.C18558c;
import p677nj.C18570m;
import p680nm.C18576a;
import p846un.C19963e;
import p868vl.C20157d;
import p916xl.C20536b;

/* renamed from: co.e */
public final class C13857e extends C17048b {

    /* renamed from: c */
    public final Context f34091c;

    public C13857e(Context context) {
        this.f34091c = context;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C16846b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        Class cls = C18570m.class;
        Class cls2 = C20157d.class;
        Class cls3 = String.class;
        File file = new File(this.f34091c.getCacheDir(), C21100e.m49304E(new byte[]{106, 117, 115, 116, 114, 105, 100, 101}));
        file.mkdir();
        C13862i.C13863a aVar = new C13862i.C13863a(file, (C19963e) bVar2.mo49505a(C19963e.class, (String) null));
        C18576a aVar2 = new C18576a(file);
        C13874t tVar = new C13874t((String) bVar2.mo49505a(cls3, "pathToJustrideDirectory"), aVar, (C20157d) bVar2.mo49505a(cls2, (String) null), (C18570m) bVar2.mo49505a(cls, (String) null));
        C13865k kVar = r9;
        String str = "pathToJustrideDirectory";
        C13865k kVar2 = new C13865k(this.f34091c, (C20157d) bVar2.mo49505a(cls2, (String) null), (C18570m) bVar2.mo49505a(cls, (String) null), (String) bVar2.mo49505a(cls3, "pathToJustrideDirectory"), tVar);
        MigrateToGcmEncryptionJob migrateToGcmEncryptionJob = r9;
        C13874t tVar2 = tVar;
        C13874t tVar3 = tVar;
        C13864j jVar = new C13864j((String) bVar2.mo49505a(cls3, str), (C20157d) bVar2.mo49505a(cls2, (String) null), tVar, (C18570m) bVar2.mo49505a(cls, (String) null));
        C18576a aVar3 = aVar2;
        MigrateToGcmEncryptionJob migrateToGcmEncryptionJob2 = new MigrateToGcmEncryptionJob((C20157d) bVar2.mo49505a(cls2, (String) null), (C18570m) bVar2.mo49505a(cls, (String) null), (String) bVar2.mo49505a(cls3, str), tVar2, aVar, (C18558c.C18559a) bVar2.mo49505a(C18558c.C18559a.class, (String) null), (C20536b) bVar2.mo49505a(C20536b.class, (String) null));
        C13865k kVar3 = kVar;
        C13860h hVar = new C13860h(kVar3, jVar, migrateToGcmEncryptionJob);
        C13873s sVar = new C13873s(aVar, hVar);
        C13859g gVar = new C13859g(new C13866l(sVar, (C18570m) bVar2.mo49505a(cls, (String) null), (String) bVar2.mo49505a(cls3, str)), (C20157d) bVar2.mo49505a(cls2, (String) null));
        HashMap hashMap3 = hashMap;
        C17048b.m42897b(hashMap3, aVar, C13862i.C13863a.class, (String) null);
        C17048b.m42897b(hashMap3, aVar3, C18576a.class, (String) null);
        C17048b.m42897b(hashMap3, tVar3, C13874t.class, (String) null);
        C17048b.m42897b(hashMap3, kVar3, C13865k.class, (String) null);
        C17048b.m42897b(hashMap3, jVar, C13864j.class, (String) null);
        C17048b.m42897b(hashMap3, migrateToGcmEncryptionJob, MigrateToGcmEncryptionJob.class, (String) null);
        C17048b.m42897b(hashMap3, hVar, C13860h.class, (String) null);
        C17048b.m42897b(hashMap3, gVar, C13859g.class, (String) null);
        C17048b.m42897b(hashMap3, sVar, C13873s.class, (String) null);
    }
}
