package p506gd;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: gd.h */
public final class C17177h implements C17179j {

    /* renamed from: a */
    public final /* synthetic */ Set f44419a;

    /* renamed from: b */
    public final /* synthetic */ C17184o f44420b;

    /* renamed from: c */
    public final /* synthetic */ C17182m f44421c;

    public C17177h(C17182m mVar, HashSet hashSet, C17184o oVar) {
        this.f44421c = mVar;
        this.f44419a = hashSet;
        this.f44420b = oVar;
    }

    /* renamed from: a */
    public final void mo49766a(ZipFile zipFile, HashSet hashSet) throws IOException {
        Set set = this.f44419a;
        C17182m mVar = this.f44421c;
        C17184o oVar = this.f44420b;
        HashSet hashSet2 = new HashSet();
        mVar.mo49768c(oVar, hashSet, new C17178i(hashSet2, oVar, zipFile));
        set.addAll(hashSet2);
    }
}
