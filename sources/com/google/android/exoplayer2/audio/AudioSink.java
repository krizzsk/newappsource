package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import p099ga.C4932s0;
import p125ia.C5316d;
import p125ia.C5326l;

public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.Format r8, boolean r9, java.lang.RuntimeException r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L_0x0005
                java.lang.String r0 = " (recoverable)"
                goto L_0x0007
            L_0x0005:
                java.lang.String r0 = ""
            L_0x0007:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = "Config("
                r2.append(r1)
                java.lang.String r1 = ", "
                p001a0.C0016g.m41y(r2, r5, r1, r6, r1)
                r2.append(r7)
                java.lang.String r5 = ")"
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r3.<init>(r5, r10)
                r3.audioTrackState = r4
                r3.isRecoverable = r9
                r3.format = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, com.google.android.exoplayer2.Format, boolean, java.lang.RuntimeException):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.actualPresentationTimeUs = r3
                r2.expectedPresentationTimeUs = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format2, boolean z) {
            super(C13715c.m34241g(36, "AudioTrack write failed: ", i));
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface C3875a {
    }

    /* renamed from: a */
    void mo15847a(C4932s0 s0Var);

    /* renamed from: b */
    C4932s0 mo15848b();

    /* renamed from: c */
    boolean mo15849c(Format format);

    /* renamed from: d */
    boolean mo15850d();

    /* renamed from: e */
    boolean mo15851e();

    /* renamed from: f */
    void mo15852f(C5326l lVar);

    void flush();

    /* renamed from: g */
    void mo15854g(int i);

    /* renamed from: h */
    void mo15855h(Format format, int[] iArr) throws ConfigurationException;

    /* renamed from: i */
    void mo15856i();

    /* renamed from: j */
    boolean mo15857j(ByteBuffer byteBuffer, long j, int i) throws InitializationException, WriteException;

    /* renamed from: k */
    int mo15858k(Format format);

    /* renamed from: l */
    void mo15859l() throws WriteException;

    /* renamed from: m */
    long mo15860m(boolean z);

    /* renamed from: n */
    void mo15861n();

    /* renamed from: o */
    void mo15862o();

    /* renamed from: p */
    void mo15863p();

    void pause();

    /* renamed from: q */
    void mo15865q(boolean z);

    /* renamed from: r */
    void mo15866r(C5316d dVar);

    void reset();

    void setVolume(float f);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, Format format2) {
            super(unhandledAudioFormatException);
            this.format = format2;
        }

        public ConfigurationException(String str, Format format2) {
            super(str);
            this.format = format2;
        }
    }
}
