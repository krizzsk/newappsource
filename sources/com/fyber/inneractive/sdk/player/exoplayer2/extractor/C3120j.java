package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.j */
public final class C3120j {

    /* renamed from: c */
    public static final C3258g.C3259a f10804c = new C3121a();

    /* renamed from: d */
    public static final Pattern f10805d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f10806a = -1;

    /* renamed from: b */
    public int f10807b = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.j$a */
    public class C3121a implements C3258g.C3259a {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14186a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$b[] r2 = r8.f11715a
            int r3 = r2.length
            if (r1 >= r3) goto L_0x004e
            r2 = r2[r1]
            boolean r3 = r2 instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3254e
            if (r3 == 0) goto L_0x004b
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r2 = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3254e) r2
            java.lang.String r3 = r2.f11733c
            java.lang.String r2 = r2.f11734d
            java.lang.String r4 = "iTunSMPB"
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != 0) goto L_0x001d
            goto L_0x0047
        L_0x001d:
            java.util.regex.Pattern r3 = f10805d
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.find()
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r2.group(r4)     // Catch:{ NumberFormatException -> 0x0046 }
            r5 = 16
            int r3 = java.lang.Integer.parseInt(r3, r5)     // Catch:{ NumberFormatException -> 0x0046 }
            r6 = 2
            java.lang.String r2 = r2.group(r6)     // Catch:{ NumberFormatException -> 0x0046 }
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x0046 }
            if (r3 > 0) goto L_0x0040
            if (r2 <= 0) goto L_0x0047
        L_0x0040:
            r7.f10806a = r3     // Catch:{ NumberFormatException -> 0x0046 }
            r7.f10807b = r2     // Catch:{ NumberFormatException -> 0x0046 }
            r2 = 1
            goto L_0x0048
        L_0x0046:
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x004b
            return r4
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3120j.mo14186a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.a):boolean");
    }

    /* renamed from: a */
    public boolean mo14185a() {
        return (this.f10806a == -1 || this.f10807b == -1) ? false : true;
    }
}
