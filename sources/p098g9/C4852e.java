package p098g9;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: g9.e */
public final class C4852e implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f16277a;

    public C4852e(String str) {
        this.f16277a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f16277a);
    }
}
