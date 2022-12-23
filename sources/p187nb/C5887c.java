package p187nb;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0016g;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p583jk.C17875h;

/* renamed from: nb.c */
public final class C5887c {

    /* renamed from: a */
    public final String f18922a;

    /* renamed from: b */
    public final int f18923b;

    /* renamed from: c */
    public final Integer f18924c;

    /* renamed from: d */
    public final float f18925d;

    /* renamed from: e */
    public final boolean f18926e;

    /* renamed from: f */
    public final boolean f18927f;

    /* renamed from: g */
    public final boolean f18928g;

    /* renamed from: h */
    public final boolean f18929h;

    /* renamed from: nb.c$a */
    public static final class C5888a {

        /* renamed from: a */
        public final int f18930a;

        /* renamed from: b */
        public final int f18931b;

        /* renamed from: c */
        public final int f18932c;

        /* renamed from: d */
        public final int f18933d;

        /* renamed from: e */
        public final int f18934e;

        /* renamed from: f */
        public final int f18935f;

        /* renamed from: g */
        public final int f18936g;

        /* renamed from: h */
        public final int f18937h;

        /* renamed from: i */
        public final int f18938i;

        public C5888a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f18930a = i;
            this.f18931b = i2;
            this.f18932c = i3;
            this.f18933d = i4;
            this.f18934e = i5;
            this.f18935f = i6;
            this.f18936g = i7;
            this.f18937h = i8;
            this.f18938i = i9;
        }
    }

    /* renamed from: nb.c$b */
    public static final class C5889b {

        /* renamed from: a */
        public static final Pattern f18939a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b */
        public static final Pattern f18940b = Pattern.compile(C6774a0.m15950j("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c */
        public static final Pattern f18941c = Pattern.compile(C6774a0.m15950j("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d */
        public static final Pattern f18942d = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public static PointF m14350a(String str) {
            String str2;
            String str3;
            Matcher matcher = f18940b.matcher(str);
            Matcher matcher2 = f18941c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    new StringBuilder(str.length() + 82);
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }
    }

    public C5887c(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18922a = str;
        this.f18923b = i;
        this.f18924c = num;
        this.f18925d = f;
        this.f18926e = z;
        this.f18927f = z2;
        this.f18928g = z3;
        this.f18929h = z4;
    }

    /* renamed from: a */
    public static int m14347a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            return -1;
        }
        "Ignoring unknown alignment: ".concat(valueOf);
        return -1;
    }

    /* renamed from: b */
    public static boolean m14348b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(C0016g.m25h(str, 33));
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            C6776b0.m15968a(sb.toString(), e);
            return false;
        }
    }

    /* renamed from: c */
    public static Integer m14349c(String str) {
        long j;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            if (j <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44301k(z);
            int v = Ints.m35900v(((j >> 24) & 255) ^ 255);
            int v2 = Ints.m35900v((j >> 16) & 255);
            return Integer.valueOf(Color.argb(v, Ints.m35900v(j & 255), Ints.m35900v((j >> 8) & 255), v2));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(C0016g.m25h(str, 36));
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            C6776b0.m15968a(sb.toString(), e);
            return null;
        }
    }
}
