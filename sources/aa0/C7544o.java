package aa0;

import android.content.Context;
import ce0.C21100e;
import com.moovit.util.StyledText;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aa0.o */
public final class C7544o implements Callable<CharSequence> {

    /* renamed from: b */
    public final Context f23027b;

    /* renamed from: c */
    public final List<StyledText> f23028c;

    public C7544o(Context context, List<StyledText> list) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f23027b = context;
        this.f23028c = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r6.length() > 0) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r11 = this;
            java.util.List<com.moovit.util.StyledText> r0 = r11.f23028c
            boolean r0 = c00.C13717b.m34258e(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x00ea
        L_0x000b:
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            java.util.List<com.moovit.util.StyledText> r2 = r11.f23028c
            int r2 = r2.size()
            r0.<init>(r2)
            java.util.List<com.moovit.util.StyledText> r2 = r11.f23028c
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r2.next()
            com.moovit.util.StyledText r3 = (com.moovit.util.StyledText) r3
            com.moovit.image.model.Image r4 = r3.f23870b
            if (r4 != 0) goto L_0x002d
            goto L_0x001c
        L_0x002d:
            android.content.Context r5 = r11.f23027b
            r10.e r5 = p583jk.C17884p.m44353X(r5)
            r10.d r5 = r5.mo51642v(r4)
            r10.d r4 = r5.mo51628o0(r4)
            t6.c r4 = r4.mo10862d0()
            r0.put(r3, r4)
            goto L_0x001c
        L_0x0043:
            java.util.List<com.moovit.util.StyledText> r2 = r11.f23028c
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x004d
            goto L_0x00ea
        L_0x004d:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00e2
            java.lang.Object r4 = r2.next()
            com.moovit.util.StyledText r4 = (com.moovit.util.StyledText) r4
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x0073
            android.content.Context r5 = r11.f23027b
            int r6 = p824tp.C19746x.string_list_delimiter_dot
            java.lang.String r5 = r5.getString(r6)
            r3.append(r5)
        L_0x0073:
            if (r4 != 0) goto L_0x0076
            goto L_0x00da
        L_0x0076:
            android.content.Context r5 = r11.f23027b
            com.moovit.util.ColorScheme r6 = r4.f23872d
            int r6 = r6.getColorAttrId()
            int r5 = p977zz.C20941h.m49043f(r6, r5)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            java.lang.Object r7 = r0.get(r4)
            java.util.concurrent.Future r7 = (java.util.concurrent.Future) r7
            if (r7 == 0) goto L_0x00ad
            r8 = 5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x009a }
            java.lang.Object r7 = r7.get(r8, r10)     // Catch:{ Exception -> 0x009a }
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7     // Catch:{ Exception -> 0x009a }
            goto L_0x009c
        L_0x009a:
            r7 = r1
        L_0x009c:
            if (r7 == 0) goto L_0x00ad
            android.graphics.drawable.Drawable r7 = p141k1.C5450a.m13604g(r7)
            p141k1.C5450a.C5452b.m13616g(r7, r5)
            r8 = 2
            android.text.SpannableString r7 = p977zz.C20964s0.m49086d(r7, r8)
            r6.append(r7)
        L_0x00ad:
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x00b8
            r7 = 32
            r6.append(r7)
        L_0x00b8:
            java.lang.String r7 = r4.f23871c
            if (r7 == 0) goto L_0x00d3
            int r7 = r6.length()
            java.lang.String r4 = r4.f23871c
            r6.append(r4)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r5)
            int r5 = r6.length()
            r8 = 33
            r6.setSpan(r4, r7, r5, r8)
        L_0x00d3:
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r6 = r1
        L_0x00db:
            if (r6 == 0) goto L_0x0056
            r3.append(r6)
            goto L_0x0056
        L_0x00e2:
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r1 = r3
        L_0x00ea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.C7544o.call():java.lang.Object");
    }
}
