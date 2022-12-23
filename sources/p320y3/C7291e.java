package p320y3;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p296w4.C6984b;
import p988j$.util.DesugarTimeZone;

/* renamed from: y3.e */
public final class C7291e extends C7289c {

    /* renamed from: h */
    public C6984b f22409h = null;

    public final void start() {
        Locale locale;
        String c = mo22242c();
        if (c == null) {
            c = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        if (c.equals("ISO8601")) {
            c = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale2 = Locale.ENGLISH;
        List<String> list = this.f19697f;
        if (list != null) {
            if (list.size() > 1) {
                timeZone = DesugarTimeZone.getTimeZone(list.get(1));
            }
            if (list.size() > 2) {
                String[] split = list.get(2).split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                if (split.length > 1) {
                    locale = new Locale(split[0], split[1]);
                } else {
                    locale = new Locale(split[0]);
                }
                locale2 = locale;
            }
        }
        try {
            this.f22409h = new C6984b(c, locale2);
        } catch (IllegalArgumentException e) {
            this.f19696e.mo22868l(C25541a.m63881k("Could not instantiate SimpleDateFormat with pattern ", c), e);
            this.f22409h = new C6984b("yyyy-MM-dd HH:mm:ss,SSS", locale2);
        }
        this.f22409h.f21754c.setTimeZone(timeZone);
    }
}
