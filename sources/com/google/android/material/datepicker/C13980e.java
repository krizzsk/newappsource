package com.google.android.material.datepicker;

import com.google.android.material.internal.C14076l;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import p355ac.C13409j;

/* renamed from: com.google.android.material.datepicker.e */
public abstract class C13980e extends C14076l {

    /* renamed from: b */
    public final TextInputLayout f34692b;

    /* renamed from: c */
    public final DateFormat f34693c;

    /* renamed from: d */
    public final CalendarConstraints f34694d;

    /* renamed from: e */
    public final String f34695e;

    /* renamed from: f */
    public final C13976c f34696f;

    /* renamed from: g */
    public C13978d f34697g;

    public C13980e(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f34693c = simpleDateFormat;
        this.f34692b = textInputLayout;
        this.f34694d = calendarConstraints;
        this.f34695e = textInputLayout.getContext().getString(C13409j.mtrl_picker_out_of_range);
        this.f34696f = new C13976c(this, str);
    }

    /* renamed from: a */
    public abstract void mo41552a();

    /* renamed from: b */
    public abstract void mo41553b(Long l);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a A[Catch:{ ParseException -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            com.google.android.material.textfield.TextInputLayout r8 = r6.f34692b
            com.google.android.material.datepicker.c r9 = r6.f34696f
            r8.removeCallbacks(r9)
            com.google.android.material.textfield.TextInputLayout r8 = r6.f34692b
            com.google.android.material.datepicker.d r9 = r6.f34697g
            r8.removeCallbacks(r9)
            com.google.android.material.textfield.TextInputLayout r8 = r6.f34692b
            r9 = 0
            r8.setError(r9)
            r6.mo41553b(r9)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x001e
            return
        L_0x001e:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.text.DateFormat r8 = r6.f34693c     // Catch:{ ParseException -> 0x0073 }
            java.lang.String r7 = r7.toString()     // Catch:{ ParseException -> 0x0073 }
            java.util.Date r7 = r8.parse(r7)     // Catch:{ ParseException -> 0x0073 }
            com.google.android.material.textfield.TextInputLayout r8 = r6.f34692b     // Catch:{ ParseException -> 0x0073 }
            r8.setError(r9)     // Catch:{ ParseException -> 0x0073 }
            long r8 = r7.getTime()     // Catch:{ ParseException -> 0x0073 }
            com.google.android.material.datepicker.CalendarConstraints r10 = r6.f34694d     // Catch:{ ParseException -> 0x0073 }
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r10 = r10.f34623d     // Catch:{ ParseException -> 0x0073 }
            boolean r10 = r10.mo41488v0(r8)     // Catch:{ ParseException -> 0x0073 }
            if (r10 == 0) goto L_0x0066
            com.google.android.material.datepicker.CalendarConstraints r10 = r6.f34694d     // Catch:{ ParseException -> 0x0073 }
            com.google.android.material.datepicker.Month r2 = r10.f34621b     // Catch:{ ParseException -> 0x0073 }
            r3 = 1
            long r4 = r2.mo41537g(r3)     // Catch:{ ParseException -> 0x0073 }
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0057
            com.google.android.material.datepicker.Month r10 = r10.f34622c     // Catch:{ ParseException -> 0x0073 }
            int r2 = r10.f34659f     // Catch:{ ParseException -> 0x0073 }
            long r4 = r10.mo41537g(r2)     // Catch:{ ParseException -> 0x0073 }
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            if (r3 == 0) goto L_0x0066
            long r7 = r7.getTime()     // Catch:{ ParseException -> 0x0073 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ ParseException -> 0x0073 }
            r6.mo41553b(r7)     // Catch:{ ParseException -> 0x0073 }
            return
        L_0x0066:
            com.google.android.material.datepicker.d r7 = new com.google.android.material.datepicker.d     // Catch:{ ParseException -> 0x0073 }
            r7.<init>(r6, r8)     // Catch:{ ParseException -> 0x0073 }
            r6.f34697g = r7     // Catch:{ ParseException -> 0x0073 }
            com.google.android.material.textfield.TextInputLayout r8 = r6.f34692b     // Catch:{ ParseException -> 0x0073 }
            r8.postDelayed(r7, r0)     // Catch:{ ParseException -> 0x0073 }
            goto L_0x007a
        L_0x0073:
            com.google.android.material.textfield.TextInputLayout r7 = r6.f34692b
            com.google.android.material.datepicker.c r8 = r6.f34696f
            r7.postDelayed(r8, r0)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C13980e.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
