package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.c */
public abstract class C3880c implements AudioProcessor {

    /* renamed from: b */
    public AudioProcessor.C3874a f13513b;

    /* renamed from: c */
    public AudioProcessor.C3874a f13514c;

    /* renamed from: d */
    public AudioProcessor.C3874a f13515d;

    /* renamed from: e */
    public AudioProcessor.C3874a f13516e;

    /* renamed from: f */
    public ByteBuffer f13517f;

    /* renamed from: g */
    public ByteBuffer f13518g;

    /* renamed from: h */
    public boolean f13519h;

    public C3880c() {
        ByteBuffer byteBuffer = AudioProcessor.f13473a;
        this.f13517f = byteBuffer;
        this.f13518g = byteBuffer;
        AudioProcessor.C3874a aVar = AudioProcessor.C3874a.f13474e;
        this.f13515d = aVar;
        this.f13516e = aVar;
        this.f13513b = aVar;
        this.f13514c = aVar;
    }

    /* renamed from: a */
    public abstract AudioProcessor.C3874a mo15889a(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    /* renamed from: b */
    public void mo15890b() {
    }

    /* renamed from: c */
    public void mo15891c() {
    }

    /* renamed from: d */
    public boolean mo15838d() {
        return this.f13519h && this.f13518g == AudioProcessor.f13473a;
    }

    /* renamed from: e */
    public ByteBuffer mo15839e() {
        ByteBuffer byteBuffer = this.f13518g;
        this.f13518g = AudioProcessor.f13473a;
        return byteBuffer;
    }

    public final void flush() {
        this.f13518g = AudioProcessor.f13473a;
        this.f13519h = false;
        this.f13513b = this.f13515d;
        this.f13514c = this.f13516e;
        mo15890b();
    }

    /* renamed from: g */
    public final AudioProcessor.C3874a mo15842g(AudioProcessor.C3874a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f13515d = aVar;
        this.f13516e = mo15889a(aVar);
        if (isActive()) {
            return this.f13516e;
        }
        return AudioProcessor.C3874a.f13474e;
    }

    /* renamed from: h */
    public final void mo15843h() {
        this.f13519h = true;
        mo15891c();
    }

    /* renamed from: i */
    public void mo15892i() {
    }

    public boolean isActive() {
        return this.f13516e != AudioProcessor.C3874a.f13474e;
    }

    /* renamed from: j */
    public final ByteBuffer mo15893j(int i) {
        if (this.f13517f.capacity() < i) {
            this.f13517f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f13517f.clear();
        }
        ByteBuffer byteBuffer = this.f13517f;
        this.f13518g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f13517f = AudioProcessor.f13473a;
        AudioProcessor.C3874a aVar = AudioProcessor.C3874a.f13474e;
        this.f13515d = aVar;
        this.f13516e = aVar;
        this.f13513b = aVar;
        this.f13514c = aVar;
        mo15892i();
    }
}
