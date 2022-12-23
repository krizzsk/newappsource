package p225qa;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;
import p225qa.C6219b;
import p277ub.C6776b0;

/* renamed from: qa.e */
public final class C6224e {

    /* renamed from: a */
    public static final String[] f19654a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f19655b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f19656c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r6 == -1) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r6 = -9223372036854775807L;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p225qa.C6219b m14804a(java.lang.String r23) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            ak0.a r0 = ak0.C21006a.m49161a()
            org.xmlpull.v1.XmlPullParser r0 = r0.mo53086b()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r23
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = p277ub.C6776b0.m15971d(r0, r1)
            if (r2 == 0) goto L_0x00e4
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m35687D()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r3
        L_0x0028:
            r0.next()
            java.lang.String r7 = "rdf:Description"
            boolean r7 = p277ub.C6776b0.m15971d(r0, r7)
            r8 = 0
            if (r7 == 0) goto L_0x00b0
            java.lang.String[] r2 = f19654a
            r5 = 0
            r6 = 0
        L_0x0038:
            r7 = 4
            r9 = 1
            if (r6 >= r7) goto L_0x004f
            r10 = r2[r6]
            java.lang.String r10 = p277ub.C6776b0.m15969b(r0, r10)
            if (r10 == 0) goto L_0x004c
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004c:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            return r8
        L_0x0053:
            java.lang.String[] r2 = f19655b
            r6 = 0
        L_0x0056:
            if (r6 >= r7) goto L_0x006e
            r10 = r2[r6]
            java.lang.String r10 = p277ub.C6776b0.m15969b(r0, r10)
            if (r10 == 0) goto L_0x006b
            long r6 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x006f
            goto L_0x006e
        L_0x006b:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006e:
            r6 = r3
        L_0x006f:
            java.lang.String[] r2 = f19656c
            r10 = 0
        L_0x0072:
            r11 = 2
            if (r10 >= r11) goto L_0x00aa
            r12 = r2[r10]
            java.lang.String r12 = p277ub.C6776b0.m15969b(r0, r12)
            if (r12 == 0) goto L_0x00a7
            long r15 = java.lang.Long.parseLong(r12)
            qa.b$a r2 = new qa.b$a
            r19 = 0
            r21 = 0
            java.lang.String r18 = "image/jpeg"
            r17 = r2
            r17.<init>(r18, r19, r21)
            qa.b$a r10 = new qa.b$a
            r17 = 0
            java.lang.String r14 = "video/mp4"
            r13 = r10
            r13.<init>(r14, r15, r17)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r5] = r2
            r12[r9] = r10
            ce0.C21100e.m49350l(r12)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m35690x(r11, r12)
            goto L_0x00ae
        L_0x00a7:
            int r10 = r10 + 1
            goto L_0x0072
        L_0x00aa:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.m35687D()
        L_0x00ae:
            r5 = r6
            goto L_0x00d1
        L_0x00b0:
            java.lang.String r7 = "Container:Directory"
            boolean r7 = p277ub.C6776b0.m15971d(r0, r7)
            if (r7 == 0) goto L_0x00c1
            java.lang.String r2 = "Container"
            java.lang.String r7 = "Item"
            com.google.common.collect.ImmutableList r2 = m14805b(r0, r2, r7)
            goto L_0x00d1
        L_0x00c1:
            java.lang.String r7 = "GContainer:Directory"
            boolean r7 = p277ub.C6776b0.m15971d(r0, r7)
            if (r7 == 0) goto L_0x00d1
            java.lang.String r2 = "GContainer"
            java.lang.String r7 = "GContainerItem"
            com.google.common.collect.ImmutableList r2 = m14805b(r0, r2, r7)
        L_0x00d1:
            boolean r7 = p277ub.C6776b0.m15970c(r0, r1)
            if (r7 == 0) goto L_0x0028
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00de
            return r8
        L_0x00de:
            qa.b r0 = new qa.b
            r0.<init>(r5, r2)
            return r0
        L_0x00e4:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Couldn't find xmp metadata"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p225qa.C6224e.m14804a(java.lang.String):qa.b");
    }

    /* renamed from: b */
    public static ImmutableList<C6219b.C6220a> m14805b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        int i = ImmutableList.f36196c;
        ImmutableList.C14367a aVar = new ImmutableList.C14367a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C6776b0.m15971d(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String b = C6776b0.m15969b(xmlPullParser, concat3);
                String b2 = C6776b0.m15969b(xmlPullParser, concat4);
                String b3 = C6776b0.m15969b(xmlPullParser, concat5);
                String b4 = C6776b0.m15969b(xmlPullParser, concat6);
                if (b == null || b2 == null) {
                    return ImmutableList.m35687D();
                }
                if (b3 != null) {
                    j = Long.parseLong(b3);
                } else {
                    j = 0;
                }
                if (b4 != null) {
                    j2 = Long.parseLong(b4);
                } else {
                    j2 = 0;
                }
                aVar.mo43128b(new C6219b.C6220a(b, j, j2));
            }
        } while (!C6776b0.m15970c(xmlPullParser, concat2));
        return aVar.mo43129c();
    }
}
