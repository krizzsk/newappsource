package p145k5;

import com.appboy.Appboy;
import com.facebook.internal.C2397f0;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import mf0.C24362h;

/* renamed from: k5.m */
public final /* synthetic */ class C5494m implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f18035a;

    public /* synthetic */ C5494m(int i) {
        this.f18035a = i;
    }

    public final boolean accept(File file, String str) {
        switch (this.f18035a) {
            case 0:
                return Appboy.m5396a(file, str);
            case 1:
                C2397f0 f0Var = C2397f0.f8630a;
                return Pattern.matches("cpu[0-9]+", str);
            default:
                C24362h.m61210e(str, "name");
                return new Regex(C13555b.m33971j(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).mo60283b(str);
        }
    }
}
