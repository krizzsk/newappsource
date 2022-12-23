package p693nz;

import java.io.File;
import java.io.FileFilter;
import java.util.Set;

/* renamed from: nz.f */
public final /* synthetic */ class C18655f implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ Set f47520a;

    public /* synthetic */ C18655f(Set set) {
        this.f47520a = set;
    }

    public final boolean accept(File file) {
        return !this.f47520a.contains(file.getName()) && !".tm_cache_metadata".equals(file.getName());
    }
}
