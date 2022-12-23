package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22733yi;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22738yl;
import com.veriff.sdk.internal.C22743yo;
import com.veriff.sdk.internal.C22752ys;
import java.io.IOException;
import java.util.regex.Pattern;

final class acs {

    /* renamed from: a */
    private static final char[] f53722a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final Pattern f53723b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: c */
    private final String f53724c;

    /* renamed from: d */
    private final C22738yl f53725d;

    /* renamed from: e */
    private String f53726e;

    /* renamed from: f */
    private C22738yl.C22739a f53727f;

    /* renamed from: g */
    private final C22752ys.C22753a f53728g = new C22752ys.C22753a();

    /* renamed from: h */
    private final C22736yk.C22737a f53729h;

    /* renamed from: i */
    private C22742yn f53730i;

    /* renamed from: j */
    private final boolean f53731j;

    /* renamed from: k */
    private C22743yo.C22744a f53732k;

    /* renamed from: l */
    private C22733yi.C22734a f53733l;

    /* renamed from: m */
    private C22754yt f53734m;

    /* renamed from: com.veriff.sdk.internal.acs$a */
    public static class C21381a extends C22754yt {

        /* renamed from: a */
        private final C22754yt f53735a;

        /* renamed from: b */
        private final C22742yn f53736b;

        public C21381a(C22754yt ytVar, C22742yn ynVar) {
            this.f53735a = ytVar;
            this.f53736b = ynVar;
        }

        /* renamed from: a */
        public C22742yn mo54065a() {
            return this.f53736b;
        }

        /* renamed from: b */
        public long mo54067b() throws IOException {
            return this.f53735a.mo54067b();
        }

        /* renamed from: a */
        public void mo54066a(abj abj) throws IOException {
            this.f53735a.mo54066a(abj);
        }
    }

    public acs(String str, C22738yl ylVar, String str2, C22736yk ykVar, C22742yn ynVar, boolean z, boolean z2, boolean z3) {
        this.f53724c = str;
        this.f53725d = ylVar;
        this.f53726e = str2;
        this.f53730i = ynVar;
        this.f53731j = z;
        if (ykVar != null) {
            this.f53729h = ykVar.mo57268b();
        } else {
            this.f53729h = new C22736yk.C22737a();
        }
        if (z2) {
            this.f53733l = new C22733yi.C22734a();
        } else if (z3) {
            C22743yo.C22744a aVar = new C22743yo.C22744a();
            this.f53732k = aVar;
            aVar.mo57336a(C22743yo.f57546e);
        }
    }

    /* renamed from: a */
    public void mo54060a(Object obj) {
        this.f53726e = obj.toString();
    }

    /* renamed from: b */
    public void mo54063b(String str, String str2, boolean z) {
        String str3 = this.f53726e;
        if (str3 != null) {
            C22738yl.C22739a d = this.f53725d.mo57288d(str3);
            this.f53727f = d;
            if (d != null) {
                this.f53726e = null;
            } else {
                StringBuilder k = C13555b.m33972k("Malformed URL. Base: ");
                k.append(this.f53725d);
                k.append(", Relative: ");
                k.append(this.f53726e);
                throw new IllegalArgumentException(k.toString());
            }
        }
        if (z) {
            this.f53727f.mo57313b(str, str2);
        } else {
            this.f53727f.mo57310a(str, str2);
        }
    }

    /* renamed from: c */
    public void mo54064c(String str, String str2, boolean z) {
        if (z) {
            this.f53733l.mo57257b(str, str2);
        } else {
            this.f53733l.mo57255a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo54061a(String str, String str2) {
        if (HttpHeader.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f53730i = C22742yn.m55639a(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(C25541a.m63881k("Malformed content type: ", str2), e);
            }
        } else {
            this.f53729h.mo57276a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo54055a(C22736yk ykVar) {
        this.f53729h.mo57274a(ykVar);
    }

    /* renamed from: a */
    public void mo54062a(String str, String str2, boolean z) {
        if (this.f53726e != null) {
            String a = m50772a(str2, z);
            String str3 = this.f53726e;
            String replace = str3.replace("{" + str + "}", a);
            if (!f53723b.matcher(replace).matches()) {
                this.f53726e = replace;
                return;
            }
            throw new IllegalArgumentException(C25541a.m63881k("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static String m50772a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                abi abi = new abi();
                abi.mo53871b(str, 0, i);
                m50773a(abi, str, i, length, z);
                return abi.mo53914r();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: a */
    private static void m50773a(abi abi, String str, int i, int i2, boolean z) {
        abi abi2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (abi2 == null) {
                        abi2 = new abi();
                    }
                    abi2.mo53851a(codePointAt);
                    while (!abi2.mo53890f()) {
                        byte j = abi2.mo53902j() & 255;
                        abi.mo53899i(37);
                        char[] cArr = f53722a;
                        abi.mo53899i((int) cArr[(j >> 4) & 15]);
                        abi.mo53899i((int) cArr[j & 15]);
                    }
                } else {
                    abi.mo53851a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void mo54056a(C22736yk ykVar, C22754yt ytVar) {
        this.f53732k.mo57335a(ykVar, ytVar);
    }

    /* renamed from: a */
    public void mo54057a(C22743yo.C22745b bVar) {
        this.f53732k.mo57337a(bVar);
    }

    /* renamed from: a */
    public void mo54058a(C22754yt ytVar) {
        this.f53734m = ytVar;
    }

    /* renamed from: a */
    public <T> void mo54059a(Class<T> cls, T t) {
        this.f53728g.mo57405a(cls, t);
    }

    /* renamed from: a */
    public C22752ys.C22753a mo54054a() {
        C22738yl ylVar;
        C22738yl.C22739a aVar = this.f53727f;
        if (aVar != null) {
            ylVar = aVar.mo57315c();
        } else {
            ylVar = this.f53725d.mo57286c(this.f53726e);
            if (ylVar == null) {
                StringBuilder k = C13555b.m33972k("Malformed URL. Base: ");
                k.append(this.f53725d);
                k.append(", Relative: ");
                k.append(this.f53726e);
                throw new IllegalArgumentException(k.toString());
            }
        }
        C21381a aVar2 = this.f53734m;
        if (aVar2 == null) {
            C22733yi.C22734a aVar3 = this.f53733l;
            if (aVar3 != null) {
                aVar2 = aVar3.mo57256a();
            } else {
                C22743yo.C22744a aVar4 = this.f53732k;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo57338a();
                } else if (this.f53731j) {
                    aVar2 = C22754yt.m55736a((C22742yn) null, new byte[0]);
                }
            }
        }
        C22742yn ynVar = this.f53730i;
        if (ynVar != null) {
            if (aVar2 != null) {
                aVar2 = new C21381a(aVar2, ynVar);
            } else {
                this.f53729h.mo57276a(HttpHeader.CONTENT_TYPE, ynVar.toString());
            }
        }
        return this.f53728g.mo57403a(ylVar).mo57402a(this.f53729h.mo57277a()).mo57407a(this.f53724c, aVar2);
    }
}
