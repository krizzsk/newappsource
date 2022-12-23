package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.C3727s;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zendesk.support.Constants;

/* renamed from: com.fyber.inneractive.sdk.web.s */
public class C3791s {

    /* renamed from: g */
    public static final Pattern f13065g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h */
    public static final SimpleDateFormat f13066h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a */
    public final byte[] f13067a;

    /* renamed from: b */
    public final Map<String, String> f13068b;

    /* renamed from: c */
    public final String f13069c;

    /* renamed from: d */
    public final String f13070d;

    /* renamed from: e */
    public final int f13071e;

    /* renamed from: f */
    public final String f13072f;

    public C3791s(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.f13067a = bArr;
        this.f13068b = map;
        this.f13069c = str;
        this.f13070d = str2;
        this.f13071e = i;
        this.f13072f = str3;
    }

    /* renamed from: a */
    public boolean mo15498a() {
        boolean z;
        String str;
        int i;
        if (TextUtils.isEmpty(this.f13072f)) {
            return false;
        }
        loop0:
        while (true) {
            z = true;
            for (String next : this.f13068b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (next != null && next.equalsIgnoreCase(Constants.STANDARD_CACHING_HEADER)) {
                    String str2 = this.f13068b.get(next);
                    if (str2 != null) {
                        Pattern pattern = f13065g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str2.toLowerCase(locale));
                        if (!matcher.find() || matcher.groupCount() != 1) {
                            i = 0;
                        } else {
                            i = C3727s.m9986a(matcher.group(1), 0);
                        }
                        if ((str2.toLowerCase(locale).contains("public") || str2.toLowerCase(locale).contains("private") || ((long) i) > TimeUnit.SECONDS.convert(1, TimeUnit.HOURS)) && !str2.toLowerCase(locale).contains("no-") && !str2.toLowerCase(locale).contains("must-")) {
                        }
                    } else {
                        continue;
                    }
                } else if (next == null || !next.equalsIgnoreCase("Vary")) {
                    if (next != null && next.equalsIgnoreCase("Pragma")) {
                        String str3 = this.f13068b.get(next);
                        if (str3 != null) {
                            z = !str3.equalsIgnoreCase("no-cache");
                        }
                    } else if (!(next == null || !next.equalsIgnoreCase("Expires") || (str = this.f13068b.get(next)) == null)) {
                        try {
                            Date parse = f13066h.parse(str);
                            if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS) > System.currentTimeMillis()) {
                            }
                        } catch (ParseException unused) {
                            continue;
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        return z;
    }

    /* renamed from: b */
    public WebResourceResponse mo15499b() {
        return new WebResourceResponse(this.f13069c, this.f13070d, this.f13071e, this.f13072f, this.f13068b, new ByteArrayInputStream(this.f13067a));
    }
}
