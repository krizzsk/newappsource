package p223q8;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.text.Regex;
import mf0.C24362h;

/* renamed from: q8.b */
public final /* synthetic */ class C6213b implements FilenameFilter {
    public final boolean accept(File file, String str) {
        C24362h.m61210e(str, "name");
        return new Regex(C13555b.m33971j(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).mo60283b(str);
    }
}
