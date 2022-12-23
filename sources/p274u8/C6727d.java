package p274u8;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.text.Regex;
import mf0.C24362h;

/* renamed from: u8.d */
public final /* synthetic */ class C6727d implements FilenameFilter {
    public final boolean accept(File file, String str) {
        C24362h.m61210e(str, "name");
        return new Regex(C13555b.m33971j(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).mo60283b(str);
    }
}
