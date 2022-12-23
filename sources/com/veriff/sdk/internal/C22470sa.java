package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22561tq;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import p583jk.C17875h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, mo59060d2 = {"CONFIDENCE_THRESHOLD", "", "DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "REMOTE_DATE_FORMAT", "isConfident", "", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse$Mrz;)Z", "toCalendar", "Ljava/util/Calendar;", "", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sa */
public final class C22470sa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final SimpleDateFormat f56694a;

    /* renamed from: b */
    private static final SimpleDateFormat f56695b;

    static {
        Locale locale = Locale.US;
        f56694a = new SimpleDateFormat("yyMMdd", locale);
        f56695b = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m54782b(C22561tq.C22566c cVar) {
        boolean z;
        List<Double> E = C17875h.m44281E(cVar.mo56784b(), cVar.mo56785c(), cVar.mo56783a());
        if (!(E instanceof Collection) || !E.isEmpty()) {
            for (Double d : E) {
                if (d == null || d.doubleValue() <= 0.9d) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Calendar m54781b(String str) {
        try {
            Date parse = f56695b.parse(str);
            if (parse != null) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                return instance;
            }
        } catch (ParseException unused) {
        }
        return null;
    }
}
