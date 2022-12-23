package com.veriff.sdk.views.camera;

import android.media.AudioRecord;
import com.usebutton.sdk.internal.models.Configuration;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;
import p583jk.C17875h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/OsAudioSourceFactory;", "Lcom/veriff/sdk/views/camera/AudioSourceFactory;", "()V", "createAudioSource", "Lcom/veriff/sdk/views/camera/AudioSource;", "parameters", "Lcom/veriff/sdk/views/camera/AudioParameters;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ab */
public final class C22827ab implements C22862c {
    /* renamed from: a */
    public C22861b mo57634a(C22825a aVar) {
        int i;
        C24362h.m61211f(aVar, Configuration.KEY_PARAMETERS);
        int c = aVar.mo57623c();
        for (Number intValue : C17875h.m44281E(2, 3, 4)) {
            int intValue2 = intValue.intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(c, 16, intValue2);
                if (minBufferSize <= 0) {
                    i = 1024;
                } else {
                    i = minBufferSize;
                }
                AudioRecord audioRecord = new AudioRecord(1, c, 16, intValue2, i * 2);
                if (audioRecord.getState() == 1) {
                    return new C22826aa(audioRecord, i);
                }
            } catch (Exception e) {
                C24465j a = C22828ac.f57927a;
                a.mo60706d("Could not initialize audio format " + intValue2, e);
            }
        }
        return null;
    }
}
