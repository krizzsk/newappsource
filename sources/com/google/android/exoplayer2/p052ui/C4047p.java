package com.google.android.exoplayer2.p052ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import p220q5.C6179a;
import p244s3.C6446u;

/* renamed from: com.google.android.exoplayer2.ui.p */
public final class C4047p {

    /* renamed from: a */
    public static final Pattern f14489a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.p$a */
    public static class C4048a {

        /* renamed from: a */
        public final String f14490a;

        /* renamed from: b */
        public final Map<String, String> f14491b;

        public C4048a(String str, Map map) {
            this.f14490a = str;
            this.f14491b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.p$b */
    public static final class C4049b {

        /* renamed from: e */
        public static final C6446u f14492e = new C6446u(1);

        /* renamed from: f */
        public static final C6179a f14493f = new C6179a(2);

        /* renamed from: a */
        public final int f14494a;

        /* renamed from: b */
        public final int f14495b;

        /* renamed from: c */
        public final String f14496c;

        /* renamed from: d */
        public final String f14497d;

        public C4049b(int i, int i2, String str, String str2) {
            this.f14494a = i;
            this.f14495b = i2;
            this.f14496c = str;
            this.f14497d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.p$c */
    public static final class C4050c {

        /* renamed from: a */
        public final ArrayList f14498a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f14499b = new ArrayList();
    }

    /* renamed from: a */
    public static String m10919a(CharSequence charSequence) {
        return f14489a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
