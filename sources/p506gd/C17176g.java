package p506gd;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: gd.g */
public final class C17176g implements C17179j {

    /* renamed from: a */
    public final /* synthetic */ C17184o f44415a;

    /* renamed from: b */
    public final /* synthetic */ Set f44416b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f44417c;

    /* renamed from: d */
    public final /* synthetic */ C17182m f44418d;

    public C17176g(C17182m mVar, C17184o oVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f44418d = mVar;
        this.f44415a = oVar;
        this.f44416b = hashSet;
        this.f44417c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo49766a(ZipFile zipFile, HashSet hashSet) throws IOException {
        this.f44418d.mo49768c(this.f44415a, hashSet, new C17175f(this));
    }
}
