package p296w4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: w4.b */
public final class C6984b {

    /* renamed from: a */
    public long f21752a;

    /* renamed from: b */
    public String f21753b;

    /* renamed from: c */
    public final SimpleDateFormat f21754c;

    public C6984b() {
        this("HH:mm:ss,SSS", Locale.US);
    }

    public C6984b(String str, Locale locale) {
        this.f21752a = -1;
        this.f21753b = null;
        this.f21754c = new SimpleDateFormat(str, locale);
    }

    /* renamed from: a */
    public final String mo23245a(long j) {
        String str;
        synchronized (this) {
            if (j != this.f21752a) {
                this.f21752a = j;
                this.f21753b = this.f21754c.format(new Date(j));
            }
            str = this.f21753b;
        }
        return str;
    }
}
