package p239rb;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: rb.i */
public final class C6297i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* renamed from: a */
    public static float m14901a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static long m14902b(String str) throws NumberFormatException {
        int i = C6774a0.f20959a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: c */
    public static void m14903c(C6803r rVar) throws ParserException {
        boolean z;
        String str;
        int i = rVar.f21039b;
        String d = rVar.mo22985d();
        if (d == null || !d.startsWith("WEBVTT")) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            rVar.mo23007z(i);
            String valueOf = String.valueOf(rVar.mo22985d());
            if (valueOf.length() != 0) {
                str = "Expected WEBVTT. Got ".concat(valueOf);
            } else {
                str = new String("Expected WEBVTT. Got ");
            }
            throw new ParserException(str);
        }
    }
}
