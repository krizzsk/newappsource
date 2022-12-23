package p223q8;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import mf0.C24362h;
import p648me.C18364b;

/* renamed from: q8.c */
public final /* synthetic */ class C6214c implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f19630a;

    public /* synthetic */ C6214c(int i) {
        this.f19630a = i;
    }

    public final boolean accept(File file, String str) {
        switch (this.f19630a) {
            case 0:
                C24362h.m61210e(str, "name");
                return new Regex(C13555b.m33971j(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).mo60283b(str);
            default:
                Charset charset = C18364b.f46812d;
                if (!str.startsWith("event") || str.endsWith("_")) {
                    return false;
                }
                return true;
        }
    }
}
