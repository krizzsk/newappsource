package com.veriff.sdk.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.yi */
public final class C22733yi extends C22754yt {

    /* renamed from: a */
    private static final C22742yn f57510a = C22742yn.m55639a("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List<String> f57511b;

    /* renamed from: c */
    private final List<String> f57512c;

    /* renamed from: com.veriff.sdk.internal.yi$a */
    public static final class C22734a {

        /* renamed from: a */
        private final List<String> f57513a;

        /* renamed from: b */
        private final List<String> f57514b;

        /* renamed from: c */
        private final Charset f57515c;

        public C22734a() {
            this((Charset) null);
        }

        /* renamed from: a */
        public C22734a mo57255a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f57513a.add(C22738yl.m55574a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f57515c));
                this.f57514b.add(C22738yl.m55574a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f57515c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C22734a mo57257b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f57513a.add(C22738yl.m55574a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f57515c));
                this.f57514b.add(C22738yl.m55574a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f57515c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public C22734a(Charset charset) {
            this.f57513a = new ArrayList();
            this.f57514b = new ArrayList();
            this.f57515c = charset;
        }

        /* renamed from: a */
        public C22733yi mo57256a() {
            return new C22733yi(this.f57513a, this.f57514b);
        }
    }

    public C22733yi(List<String> list, List<String> list2) {
        this.f57511b = C22766za.m55828a(list);
        this.f57512c = C22766za.m55828a(list2);
    }

    /* renamed from: a */
    public C22742yn mo54065a() {
        return f57510a;
    }

    /* renamed from: b */
    public long mo54067b() {
        return m55538a((abj) null, true);
    }

    /* renamed from: a */
    public void mo54066a(abj abj) throws IOException {
        m55538a(abj, false);
    }

    /* renamed from: a */
    private long m55538a(abj abj, boolean z) {
        abi abi;
        if (z) {
            abi = new abi();
        } else {
            abi = abj.mo53875c();
        }
        int size = this.f57511b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                abi.mo53899i(38);
            }
            abi.mo53870b(this.f57511b.get(i));
            abi.mo53899i(61);
            abi.mo53870b(this.f57512c.get(i));
        }
        if (!z) {
            return 0;
        }
        long b = abi.mo53864b();
        abi.mo53920v();
        return b;
    }
}
