package com.moovit.view.p340cc;

import android.text.Editable;
import com.moovit.view.p340cc.MaskFormatterWatcher;
import h00.C17292b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import p977zz.C20950l0;

/* renamed from: com.moovit.view.cc.c */
public final class C7961c extends MaskFormatterWatcher {

    /* renamed from: k */
    public static final Pattern f24102k = Pattern.compile("(0[1-9]|1[0-2])([2-3]\\d)");

    /* renamed from: l */
    public static final SimpleDateFormat f24103l = new SimpleDateFormat("MMyy", Locale.ENGLISH);

    /* renamed from: m */
    public static final C20950l0<Integer> f24104m = new C20950l0<>(2, 9);

    /* renamed from: g */
    public final Calendar f24105g = Calendar.getInstance();

    /* renamed from: h */
    public final Calendar f24106h = Calendar.getInstance();

    /* renamed from: i */
    public boolean f24107i = false;

    /* renamed from: j */
    public Date f24108j = null;

    public C7961c(CreditCardInputView creditCardInputView) {
        super(creditCardInputView, MaskFormatterWatcher.AllowanceLevel.SUGGEST_FIX);
    }

    /* renamed from: a */
    public final void mo24834a(Editable editable, int i) {
        editable.setSpan(new C17292b(), i - 1, i, 33);
    }

    /* renamed from: b */
    public final int mo24836b() {
        return 4;
    }

    /* renamed from: c */
    public final boolean mo24838c(Editable editable) {
        if (editable.length() != 1 || !f24104m.mo53020a(Integer.valueOf(Integer.parseInt(editable.toString())))) {
            int length = editable.length();
            int i = length - 1;
            editable.charAt(i);
            editable.replace(i, length, "");
            return false;
        }
        editable.insert(0, "0");
        return true;
    }

    /* renamed from: d */
    public final void mo24839d(String str) {
        Date date;
        int length = str.length();
        if (!this.f24107i || length != 4 || (date = this.f24108j) == null) {
            this.f24086b.mo24813r(-1, -1, false);
            return;
        }
        this.f24106h.setTime(date);
        int i = this.f24106h.get(1);
        this.f24086b.mo24813r(this.f24106h.get(2) + 1, i, true);
    }

    /* renamed from: e */
    public final void mo24840e(Editable editable) {
        for (C17292b removeSpan : (C17292b[]) editable.getSpans(0, editable.length(), C17292b.class)) {
            editable.removeSpan(removeSpan);
        }
    }

    /* renamed from: f */
    public final boolean mo24841f(int i) {
        return i == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d A[Catch:{ ParseException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e A[Catch:{ ParseException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[Catch:{ ParseException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[Catch:{ ParseException -> 0x007a }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24842g(java.lang.CharSequence r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.regex.Pattern r1 = f24102k     // Catch:{ ParseException -> 0x007a }
            java.util.regex.Matcher r1 = r1.matcher(r6)     // Catch:{ ParseException -> 0x007a }
            boolean r2 = r1.matches()     // Catch:{ ParseException -> 0x007a }
            r3 = 1
            if (r2 != 0) goto L_0x0017
            boolean r1 = r1.hitEnd()     // Catch:{ ParseException -> 0x007a }
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            r5.f24107i = r1     // Catch:{ ParseException -> 0x007a }
            if (r1 == 0) goto L_0x0077
            int r1 = r6.length()     // Catch:{ ParseException -> 0x007a }
            r2 = 4
            if (r1 != r2) goto L_0x0077
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            java.util.Date r2 = new java.util.Date     // Catch:{ ParseException -> 0x007a }
            r2.<init>()     // Catch:{ ParseException -> 0x007a }
            r1.setTime(r2)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            r2 = 5
            r1.set(r2, r3)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            r4 = 11
            r1.set(r4, r0)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            r4 = 12
            r1.set(r4, r0)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            r4 = 13
            r1.set(r4, r0)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            r4 = 14
            r1.set(r4, r0)     // Catch:{ ParseException -> 0x007a }
            java.text.SimpleDateFormat r1 = f24103l     // Catch:{ ParseException -> 0x007a }
            java.lang.String r6 = r6.toString()     // Catch:{ ParseException -> 0x007a }
            java.util.Date r6 = r1.parse(r6)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24106h     // Catch:{ ParseException -> 0x007a }
            r1.setTime(r6)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24106h     // Catch:{ ParseException -> 0x007a }
            r1.set(r2, r3)     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r1 = r5.f24106h     // Catch:{ ParseException -> 0x007a }
            java.util.Calendar r2 = r5.f24105g     // Catch:{ ParseException -> 0x007a }
            boolean r1 = r1.before(r2)     // Catch:{ ParseException -> 0x007a }
            if (r1 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            r5.f24107i = r3     // Catch:{ ParseException -> 0x007a }
            if (r3 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r6 = 0
        L_0x0075:
            r5.f24108j = r6     // Catch:{ ParseException -> 0x007a }
        L_0x0077:
            boolean r6 = r5.f24107i     // Catch:{ ParseException -> 0x007a }
            return r6
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.view.p340cc.C7961c.mo24842g(java.lang.CharSequence):boolean");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.f24086b.mo24819u();
    }
}
