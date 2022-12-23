package p166m2;

import java.io.File;
import java.io.FileFilter;

/* renamed from: m2.b */
public final class C5664b implements FileFilter {
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
