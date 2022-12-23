package p977zz;

import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zz.j */
public final /* synthetic */ class C20945j implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ Set f52694a;

    public /* synthetic */ C20945j(HashSet hashSet) {
        this.f52694a = hashSet;
    }

    public final boolean accept(File file) {
        return this.f52694a.contains(file);
    }
}
