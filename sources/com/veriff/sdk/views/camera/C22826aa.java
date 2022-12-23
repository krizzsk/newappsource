package com.veriff.sdk.views.camera;

import android.media.AudioRecord;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/OsAudioSource;", "Lcom/veriff/sdk/views/camera/AudioSource;", "Ljava/nio/ByteBuffer;", "buffer", "", "read", "Lbf0/d;", "release", "start", "stop", "Landroid/media/AudioRecord;", "audioRecord", "Landroid/media/AudioRecord;", "bufferSize", "I", "getBufferSize", "()I", "<init>", "(Landroid/media/AudioRecord;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.aa */
public final class C22826aa implements C22861b {

    /* renamed from: a */
    private final AudioRecord f57925a;

    /* renamed from: b */
    private final int f57926b;

    public C22826aa(AudioRecord audioRecord, int i) {
        C24362h.m61211f(audioRecord, "audioRecord");
        this.f57925a = audioRecord;
        this.f57926b = i;
    }

    /* renamed from: a */
    public void mo57630a() {
        this.f57925a.startRecording();
    }

    /* renamed from: b */
    public void mo57631b() {
        this.f57925a.stop();
    }

    /* renamed from: c */
    public void mo57632c() {
        this.f57925a.release();
    }

    /* renamed from: d */
    public int mo57633d() {
        return this.f57926b;
    }

    /* renamed from: a */
    public int mo57629a(ByteBuffer byteBuffer) {
        C24362h.m61211f(byteBuffer, "buffer");
        return this.f57925a.read(byteBuffer, mo57633d());
    }
}
