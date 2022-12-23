package com.google.android.exoplayer2.p052ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.ui.c */
public final class C4031c implements C4035d0 {

    /* renamed from: a */
    public final Resources f14488a;

    public C4031c(Resources resources) {
        resources.getClass();
        this.f14488a = resources;
    }

    /* renamed from: a */
    public final String mo16661a(Format format) {
        int i = format.f13414i;
        if (i == -1) {
            return "";
        }
        return this.f14488a.getString(C4044m.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    /* renamed from: b */
    public final String mo16662b(Format format) {
        String str;
        Locale locale;
        String[] strArr = new String[2];
        String str2 = format.f13409d;
        String str3 = "";
        if (TextUtils.isEmpty(str2) || "und".equals(str2)) {
            str = str3;
        } else {
            if (C6774a0.f20959a >= 21) {
                locale = Locale.forLanguageTag(str2);
            } else {
                locale = new Locale(str2);
            }
            str = locale.getDisplayName();
        }
        strArr[0] = str;
        strArr[1] = mo16663c(format);
        String d = mo16664d(strArr);
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        if (!TextUtils.isEmpty(format.f13408c)) {
            str3 = format.f13408c;
        }
        return str3;
    }

    /* renamed from: c */
    public final String mo16663c(Format format) {
        String str;
        if ((format.f13411f & 2) != 0) {
            str = this.f14488a.getString(C4044m.exo_track_role_alternate);
        } else {
            str = "";
        }
        if ((format.f13411f & 4) != 0) {
            str = mo16664d(str, this.f14488a.getString(C4044m.exo_track_role_supplementary));
        }
        if ((format.f13411f & 8) != 0) {
            str = mo16664d(str, this.f14488a.getString(C4044m.exo_track_role_commentary));
        }
        if ((format.f13411f & 1088) == 0) {
            return str;
        }
        return mo16664d(str, this.f14488a.getString(C4044m.exo_track_role_closed_captions));
    }

    /* renamed from: d */
    public final String mo16664d(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f14488a.getString(C4044m.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
