package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p277ub.C6774a0;

public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f13473a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.C3874a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioProcessor$a */
    public static final class C3874a {

        /* renamed from: e */
        public static final C3874a f13474e = new C3874a(-1, -1, -1);

        /* renamed from: a */
        public final int f13475a;

        /* renamed from: b */
        public final int f13476b;

        /* renamed from: c */
        public final int f13477c;

        /* renamed from: d */
        public final int f13478d;

        public C3874a(int i, int i2, int i3) {
            int i4;
            this.f13475a = i;
            this.f13476b = i2;
            this.f13477c = i3;
            if (C6774a0.m15963w(i3)) {
                i4 = C6774a0.m15956p(i3, i2);
            } else {
                i4 = -1;
            }
            this.f13478d = i4;
        }

        public final String toString() {
            int i = this.f13475a;
            int i2 = this.f13476b;
            int i3 = this.f13477c;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i);
            sb.append(", channelCount=");
            sb.append(i2);
            sb.append(", encoding=");
            sb.append(i3);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: d */
    boolean mo15838d();

    /* renamed from: e */
    ByteBuffer mo15839e();

    /* renamed from: f */
    void mo15840f(ByteBuffer byteBuffer);

    void flush();

    /* renamed from: g */
    C3874a mo15842g(C3874a aVar) throws UnhandledAudioFormatException;

    /* renamed from: h */
    void mo15843h();

    boolean isActive();

    void reset();
}
