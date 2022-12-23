package p764rd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: rd.a */
public final class C19253a {

    /* renamed from: g */
    public static final String[] f48898g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    public static final SimpleDateFormat f48899h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f48900a;

    /* renamed from: b */
    public final String f48901b;

    /* renamed from: c */
    public final String f48902c;

    /* renamed from: d */
    public final Date f48903d;

    /* renamed from: e */
    public final long f48904e;

    /* renamed from: f */
    public final long f48905f;

    public C19253a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f48900a = str;
        this.f48901b = str2;
        this.f48902c = str3;
        this.f48903d = date;
        this.f48904e = j;
        this.f48905f = j2;
    }
}
