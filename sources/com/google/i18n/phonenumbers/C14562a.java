package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.i18n.phonenumbers.a */
public final class C14562a {

    /* renamed from: w */
    public static final Phonemetadata$PhoneMetadata.Builder f36754w;

    /* renamed from: x */
    public static final Pattern f36755x = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");

    /* renamed from: y */
    public static final Pattern f36756y = Pattern.compile("[- ]");

    /* renamed from: z */
    public static final Pattern f36757z = Pattern.compile(" ");

    /* renamed from: a */
    public String f36758a = "";

    /* renamed from: b */
    public StringBuilder f36759b = new StringBuilder();

    /* renamed from: c */
    public String f36760c = "";

    /* renamed from: d */
    public StringBuilder f36761d = new StringBuilder();

    /* renamed from: e */
    public StringBuilder f36762e = new StringBuilder();

    /* renamed from: f */
    public boolean f36763f = true;

    /* renamed from: g */
    public boolean f36764g = false;

    /* renamed from: h */
    public boolean f36765h = false;

    /* renamed from: i */
    public boolean f36766i = false;

    /* renamed from: j */
    public final PhoneNumberUtil f36767j = PhoneNumberUtil.m36283j();

    /* renamed from: k */
    public String f36768k;

    /* renamed from: l */
    public Phonemetadata$PhoneMetadata f36769l;

    /* renamed from: m */
    public Phonemetadata$PhoneMetadata f36770m;

    /* renamed from: n */
    public int f36771n = 0;

    /* renamed from: o */
    public int f36772o = 0;

    /* renamed from: p */
    public int f36773p = 0;

    /* renamed from: q */
    public StringBuilder f36774q = new StringBuilder();

    /* renamed from: r */
    public boolean f36775r = false;

    /* renamed from: s */
    public String f36776s = "";

    /* renamed from: t */
    public StringBuilder f36777t = new StringBuilder();

    /* renamed from: u */
    public ArrayList f36778u = new ArrayList();

    /* renamed from: v */
    public RegexCache f36779v = new RegexCache(64);

    static {
        Phonemetadata$PhoneMetadata.Builder builder = new Phonemetadata$PhoneMetadata.Builder();
        builder.mo43823D();
        builder.mo43824E();
        f36754w = builder;
    }

    public C14562a(String str) {
        this.f36768k = str;
        Phonemetadata$PhoneMetadata h = mo43866h(str);
        this.f36770m = h;
        this.f36769l = h;
    }

    /* renamed from: a */
    public final String mo43859a(String str) {
        int length = this.f36774q.length();
        if (!this.f36775r || length <= 0 || this.f36774q.charAt(length - 1) == ' ') {
            return this.f36774q + str;
        }
        return new String(this.f36774q) + ' ' + str;
    }

    /* renamed from: b */
    public final String mo43860b() {
        boolean z;
        List<Phonemetadata$NumberFormat> list;
        boolean z2;
        boolean z3;
        if (this.f36777t.length() < 3) {
            return mo43859a(this.f36777t.toString());
        }
        String sb = this.f36777t.toString();
        if (!this.f36765h || this.f36776s.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f36770m.mo43799e() <= 0) {
            list = this.f36770m.mo43806l();
        } else {
            list = this.f36770m.mo43800f();
        }
        for (Phonemetadata$NumberFormat next : list) {
            if (this.f36776s.length() > 0) {
                String f = next.mo43775f();
                if (f.length() == 0 || PhoneNumberUtil.f36742y.matcher(f).matches()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && !next.mo43776g() && !next.mo43779i()) {
                }
            }
            if (this.f36776s.length() == 0 && !this.f36765h) {
                String f2 = next.mo43775f();
                if (f2.length() == 0 || PhoneNumberUtil.f36742y.matcher(f2).matches()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && !next.mo43776g()) {
                }
            }
            if (f36755x.matcher(next.getFormat()).matches()) {
                this.f36778u.add(next);
            }
        }
        mo43871m(sb);
        String f3 = mo43864f();
        if (f3.length() > 0) {
            return f3;
        }
        if (mo43870l()) {
            return mo43867i();
        }
        return this.f36761d.toString();
    }

    /* renamed from: c */
    public final String mo43861c() {
        this.f36763f = true;
        this.f36766i = false;
        this.f36778u.clear();
        this.f36771n = 0;
        this.f36759b.setLength(0);
        this.f36760c = "";
        return mo43860b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43862d() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = r4.f36777t
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.i18n.phonenumbers.PhoneNumberUtil r2 = r4.f36767j
            java.lang.StringBuilder r3 = r4.f36777t
            int r2 = r2.mo43754d(r3, r0)
            if (r2 != 0) goto L_0x001a
            return r1
        L_0x001a:
            java.lang.StringBuilder r3 = r4.f36777t
            r3.setLength(r1)
            java.lang.StringBuilder r1 = r4.f36777t
            r1.append(r0)
            com.google.i18n.phonenumbers.PhoneNumberUtil r0 = r4.f36767j
            java.lang.String r0 = r0.mo43764q(r2)
            java.lang.String r1 = "001"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003b
            com.google.i18n.phonenumbers.PhoneNumberUtil r0 = r4.f36767j
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r0 = r0.mo43760k(r2)
            r4.f36770m = r0
            goto L_0x0049
        L_0x003b:
            java.lang.String r1 = r4.f36768k
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0049
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r0 = r4.mo43866h(r0)
            r4.f36770m = r0
        L_0x0049:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r4.f36774q
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r4.f36776s = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.C14562a.mo43862d():boolean");
    }

    /* renamed from: e */
    public final boolean mo43863e() {
        RegexCache regexCache = this.f36779v;
        StringBuilder k = C13555b.m33972k("\\+|");
        k.append(this.f36770m.mo43798d());
        Matcher matcher = regexCache.mo43873a(k.toString()).matcher(this.f36762e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f36765h = true;
        int end = matcher.end();
        this.f36777t.setLength(0);
        this.f36777t.append(this.f36762e.substring(end));
        this.f36774q.setLength(0);
        this.f36774q.append(this.f36762e.substring(0, end));
        if (this.f36762e.charAt(0) != '+') {
            this.f36774q.append(' ');
        }
        return true;
    }

    /* renamed from: f */
    public final String mo43864f() {
        Iterator it = this.f36778u.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            Matcher matcher = this.f36779v.mo43873a(phonemetadata$NumberFormat.mo43778h()).matcher(this.f36777t);
            if (matcher.matches()) {
                this.f36775r = f36756y.matcher(phonemetadata$NumberFormat.mo43775f()).find();
                String a = mo43859a(matcher.replaceAll(phonemetadata$NumberFormat.getFormat()));
                if (PhoneNumberUtil.m36289z(a, PhoneNumberUtil.f36727j).contentEquals(this.f36762e)) {
                    return a;
                }
            }
        }
        return "";
    }

    /* renamed from: g */
    public final void mo43865g() {
        this.f36758a = "";
        this.f36761d.setLength(0);
        this.f36762e.setLength(0);
        this.f36759b.setLength(0);
        this.f36771n = 0;
        this.f36760c = "";
        this.f36774q.setLength(0);
        this.f36776s = "";
        this.f36777t.setLength(0);
        this.f36763f = true;
        this.f36764g = false;
        this.f36773p = 0;
        this.f36772o = 0;
        this.f36765h = false;
        this.f36766i = false;
        this.f36778u.clear();
        this.f36775r = false;
        if (!this.f36770m.equals(this.f36769l)) {
            this.f36770m = mo43866h(this.f36768k);
        }
    }

    /* renamed from: h */
    public final Phonemetadata$PhoneMetadata mo43866h(String str) {
        Phonemetadata$PhoneMetadata l = this.f36767j.mo43761l(this.f36767j.mo43764q(this.f36767j.mo43758h(str)));
        if (l != null) {
            return l;
        }
        return f36754w;
    }

    /* renamed from: i */
    public final String mo43867i() {
        int length = this.f36777t.length();
        if (length <= 0) {
            return this.f36774q.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = mo43868j(this.f36777t.charAt(i));
        }
        if (this.f36763f) {
            return mo43859a(str);
        }
        return this.f36761d.toString();
    }

    /* renamed from: j */
    public final String mo43868j(char c) {
        Matcher matcher = f36757z.matcher(this.f36759b);
        if (matcher.find(this.f36771n)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.f36759b.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.f36771n = start;
            return this.f36759b.substring(0, start + 1);
        }
        if (this.f36778u.size() == 1) {
            this.f36763f = false;
        }
        this.f36760c = "";
        return this.f36761d.toString();
    }

    /* renamed from: k */
    public final String mo43869k(char c, boolean z) {
        boolean z2;
        this.f36761d.append(c);
        if (z) {
            this.f36772o = this.f36761d.length();
        }
        if (Character.isDigit(c) || (this.f36761d.length() == 1 && PhoneNumberUtil.f36732o.matcher(Character.toString(c)).matches())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f36763f = false;
            this.f36764g = true;
        } else {
            if (c == '+') {
                this.f36762e.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                this.f36762e.append(c);
                this.f36777t.append(c);
            }
            if (z) {
                this.f36773p = this.f36762e.length();
            }
        }
        if (this.f36763f) {
            int length = this.f36762e.length();
            if (length == 0 || length == 1 || length == 2) {
                return this.f36761d.toString();
            }
            if (length == 3) {
                if (mo43863e()) {
                    this.f36766i = true;
                } else {
                    this.f36776s = mo43872n();
                    return mo43860b();
                }
            }
            if (this.f36766i) {
                if (mo43862d()) {
                    this.f36766i = false;
                }
                return this.f36774q + this.f36777t.toString();
            } else if (this.f36778u.size() <= 0) {
                return mo43860b();
            } else {
                String j = mo43868j(c);
                String f = mo43864f();
                if (f.length() > 0) {
                    return f;
                }
                mo43871m(this.f36777t.toString());
                if (mo43870l()) {
                    return mo43867i();
                }
                if (this.f36763f) {
                    return mo43859a(j);
                }
                return this.f36761d.toString();
            }
        } else if (this.f36764g) {
            return this.f36761d.toString();
        } else {
            if (!mo43863e()) {
                if (this.f36776s.length() > 0) {
                    this.f36777t.insert(0, this.f36776s);
                    this.f36774q.setLength(this.f36774q.lastIndexOf(this.f36776s));
                }
                if (!this.f36776s.equals(mo43872n())) {
                    this.f36774q.append(' ');
                    return mo43861c();
                }
            } else if (mo43862d()) {
                return mo43861c();
            }
            return this.f36761d.toString();
        }
    }

    /* renamed from: l */
    public final boolean mo43870l() {
        String str;
        boolean z;
        Iterator it = this.f36778u.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            String h = phonemetadata$NumberFormat.mo43778h();
            if (this.f36760c.equals(h)) {
                return false;
            }
            String h2 = phonemetadata$NumberFormat.mo43778h();
            this.f36759b.setLength(0);
            String format = phonemetadata$NumberFormat.getFormat();
            Matcher matcher = this.f36779v.mo43873a(h2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            if (group.length() < this.f36777t.length()) {
                str = "";
            } else {
                str = group.replaceAll(h2, format).replaceAll("9", " ");
            }
            if (str.length() > 0) {
                this.f36759b.append(str);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f36760c = h;
                this.f36775r = f36756y.matcher(phonemetadata$NumberFormat.mo43775f()).find();
                this.f36771n = 0;
                return true;
            }
            it.remove();
        }
        this.f36763f = false;
        return false;
    }

    /* renamed from: m */
    public final void mo43871m(String str) {
        int length = str.length() - 3;
        Iterator it = this.f36778u.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            if (phonemetadata$NumberFormat.mo43774e() != 0) {
                if (!this.f36779v.mo43873a(phonemetadata$NumberFormat.mo43773d(Math.min(length, phonemetadata$NumberFormat.mo43774e() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: n */
    public final String mo43872n() {
        boolean z;
        int i = 1;
        if (this.f36770m.mo43795a() != 1 || this.f36777t.charAt(0) != '1' || this.f36777t.charAt(1) == '0' || this.f36777t.charAt(1) == '1') {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sb = this.f36774q;
            sb.append('1');
            sb.append(' ');
            this.f36765h = true;
        } else {
            if (this.f36770m.mo43821y()) {
                Matcher matcher = this.f36779v.mo43873a(this.f36770m.mo43804j()).matcher(this.f36777t);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f36765h = true;
                    i = matcher.end();
                    this.f36774q.append(this.f36777t.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.f36777t.substring(0, i);
        this.f36777t.delete(0, i);
        return substring;
    }
}
