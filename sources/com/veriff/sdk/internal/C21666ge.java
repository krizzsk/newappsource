package com.veriff.sdk.internal;

import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17884p;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0007H\u0002\"\u0016\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo59060d2 = {"AUDIO_CODECS", "", "Lcom/veriff/sdk/internal/analytics/AudioCodecInfo;", "CODECS", "Lcom/veriff/sdk/internal/analytics/CodecInfo;", "VIDEO_CODECS", "toCodecInfo", "Landroid/media/MediaCodecInfo;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ge */
public final class C21666ge {

    /* renamed from: a */
    private static final List<C21662gb> f54730a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C21662gb> f54731b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final List<C21656fy> f54732c;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x005e A[SYNTHETIC] */
    static {
        /*
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r1 = 0
            r0.<init>(r1)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L_0x004f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.length
            r6 = 0
        L_0x0016:
            java.lang.String r7 = "it"
            if (r6 >= r5) goto L_0x002b
            r8 = r0[r6]
            mf0.C24362h.m61210e(r8, r7)
            boolean r7 = r8.isEncoder()
            if (r7 == 0) goto L_0x0028
            r4.add(r8)
        L_0x0028:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x002b:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = cf0.C21136j.m49436X(r4, r2)
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5
            mf0.C24362h.m61210e(r5, r7)
            com.veriff.sdk.internal.gb r5 = m52608a(r5)
            r0.add(r5)
            goto L_0x0038
        L_0x004f:
            r0 = r3
        L_0x0050:
            f54730a = r0
            r4 = 1
            if (r0 == 0) goto L_0x009d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x009e
            java.lang.Object r6 = r0.next()
            r7 = r6
            com.veriff.sdk.internal.gb r7 = (com.veriff.sdk.internal.C21662gb) r7
            java.util.List r7 = r7.mo54946b()
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x007b
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x007b
        L_0x0079:
            r7 = 0
            goto L_0x0097
        L_0x007b:
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0079
            java.lang.Object r8 = r7.next()
            com.veriff.sdk.internal.gc r8 = (com.veriff.sdk.internal.C21663gc) r8
            java.util.Set r8 = r8.mo54951b()
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x007f
            r7 = 1
        L_0x0097:
            if (r7 == 0) goto L_0x005e
            r5.add(r6)
            goto L_0x005e
        L_0x009d:
            r5 = r3
        L_0x009e:
            f54731b = r5
            java.util.List<com.veriff.sdk.internal.gb> r0 = f54730a
            if (r0 == 0) goto L_0x0137
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ad:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.veriff.sdk.internal.gb r6 = (com.veriff.sdk.internal.C21662gb) r6
            java.util.List r6 = r6.mo54946b()
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x00ca
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x00ca
        L_0x00c8:
            r6 = 1
            goto L_0x00e5
        L_0x00ca:
            java.util.Iterator r6 = r6.iterator()
        L_0x00ce:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c8
            java.lang.Object r7 = r6.next()
            com.veriff.sdk.internal.gc r7 = (com.veriff.sdk.internal.C21663gc) r7
            java.util.Set r7 = r7.mo54951b()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00ce
            r6 = 0
        L_0x00e5:
            if (r6 == 0) goto L_0x00ad
            r3.add(r5)
            goto L_0x00ad
        L_0x00eb:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = cf0.C21136j.m49436X(r3, r2)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x00f8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r1.next()
            com.veriff.sdk.internal.gb r3 = (com.veriff.sdk.internal.C21662gb) r3
            java.lang.String r4 = r3.mo54945a()
            java.util.List r3 = r3.mo54946b()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = cf0.C21136j.m49436X(r3, r2)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x0119:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x012d
            java.lang.Object r6 = r3.next()
            com.veriff.sdk.internal.gc r6 = (com.veriff.sdk.internal.C21663gc) r6
            java.lang.String r6 = r6.mo54950a()
            r5.add(r6)
            goto L_0x0119
        L_0x012d:
            com.veriff.sdk.internal.fy r3 = new com.veriff.sdk.internal.fy
            r3.<init>(r4, r5)
            r0.add(r3)
            goto L_0x00f8
        L_0x0136:
            r3 = r0
        L_0x0137:
            f54732c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21666ge.<clinit>():void");
    }

    /* renamed from: a */
    private static final C21662gb m52608a(MediaCodecInfo mediaCodecInfo) {
        Set set;
        String name = mediaCodecInfo.getName();
        C24362h.m61210e(name, "name");
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C24362h.m61210e(supportedTypes, "supportedTypes");
        ArrayList arrayList = new ArrayList(supportedTypes.length);
        for (String str : supportedTypes) {
            C24362h.m61210e(str, "mime");
            int[] iArr = mediaCodecInfo.getCapabilitiesForType(str).colorFormats;
            C24362h.m61210e(iArr, "getCapabilitiesForType(mime).colorFormats");
            int length = iArr.length;
            if (length == 0) {
                set = EmptySet.f60175b;
            } else if (length != 1) {
                set = new LinkedHashSet(C13637c.m34083z(iArr.length));
                for (int valueOf : iArr) {
                    set.add(Integer.valueOf(valueOf));
                }
            } else {
                set = C17884p.m44348S(Integer.valueOf(iArr[0]));
            }
            arrayList.add(new C21663gc(str, set));
        }
        return new C21662gb(name, arrayList);
    }
}
