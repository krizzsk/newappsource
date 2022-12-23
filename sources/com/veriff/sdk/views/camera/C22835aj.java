package com.veriff.sdk.views.camera;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Size;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p583jk.C17884p;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo59060d2 = {"AUDIO_MIME", "", "VIDEO_CONTAINER", "", "VIDEO_MIME", "VIDEO_TARGET_MAX_SIZE", "Landroid/util/Size;", "getVIDEO_TARGET_MAX_SIZE$annotations", "()V", "YUV420_COLOR_FORMATS", "", "getYUV420_COLOR_FORMATS", "()Ljava/util/Set;", "audioCodecFor", "Landroid/media/MediaCodecInfo;", "Landroid/media/MediaCodecList;", "mime", "videoCodecFor", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.aj */
public final class C22835aj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Size f57948a = new Size(1024, 768);

    /* renamed from: b */
    private static final Set<Integer> f57949b = C17884p.m44349T(19, 20, 21, 39);

    /* renamed from: a */
    public static final Set<Integer> m56193a() {
        return f57949b;
    }

    /* renamed from: a */
    public static final MediaCodecInfo m56192a(MediaCodecList mediaCodecList, String str) {
        C24362h.m61211f(mediaCodecList, "$this$audioCodecFor");
        C24362h.m61211f(str, "mime");
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        C24362h.m61210e(codecInfos, "codecInfos");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            C24362h.m61210e(mediaCodecInfo, "it");
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        for (Object next : arrayList) {
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) next;
            C24362h.m61210e(mediaCodecInfo2, "it");
            String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
            C24362h.m61210e(supportedTypes, "it.supportedTypes");
            if (C23816b.m58437S0(supportedTypes, str)) {
                C24362h.m61210e(next, "codecInfos\n        .filt…me in it.supportedTypes }");
                return (MediaCodecInfo) next;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b */
    public static final MediaCodecInfo m56194b(MediaCodecList mediaCodecList, String str) {
        boolean z;
        C24362h.m61211f(mediaCodecList, "$this$videoCodecFor");
        C24362h.m61211f(str, "mime");
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        C24362h.m61210e(codecInfos, "codecInfos");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            C24362h.m61210e(mediaCodecInfo, "it");
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) next;
            C24362h.m61210e(mediaCodecInfo2, "it");
            String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
            C24362h.m61210e(supportedTypes, "it.supportedTypes");
            if (C23816b.m58437S0(supportedTypes, str)) {
                arrayList2.add(next);
            }
        }
        for (Object next2 : arrayList2) {
            int[] iArr = ((MediaCodecInfo) next2).getCapabilitiesForType("video/avc").colorFormats;
            C24362h.m61210e(iArr, "it.getCapabilitiesForType(VIDEO_MIME).colorFormats");
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    continue;
                    break;
                }
                if (f57949b.contains(Integer.valueOf(iArr[i]))) {
                    z = true;
                    continue;
                    break;
                }
                i++;
            }
            if (z) {
                C24362h.m61210e(next2, "codecInfos\n        .filt… YUV420_COLOR_FORMATS } }");
                return (MediaCodecInfo) next2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
