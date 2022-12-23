package com.google.protobuf;

/* renamed from: com.google.protobuf.e */
public abstract class C14600e {

    /* renamed from: com.google.protobuf.e$a */
    public static final class C14601a extends C14600e {

        /* renamed from: a */
        public int f36845a;

        /* renamed from: b */
        public int f36846b;

        /* renamed from: c */
        public int f36847c;

        /* renamed from: d */
        public int f36848d;

        /* renamed from: e */
        public int f36849e = Integer.MAX_VALUE;

        public C14601a(byte[] bArr, int i, int i2, boolean z) {
            this.f36845a = i2 + i;
            this.f36847c = i;
            this.f36848d = i;
        }

        /* renamed from: a */
        public final int mo44049a(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f36847c;
                int i3 = this.f36848d;
                int i4 = (i2 - i3) + i;
                if (i4 >= 0) {
                    int i5 = this.f36849e;
                    if (i4 <= i5) {
                        this.f36849e = i4;
                        int i6 = this.f36845a + this.f36846b;
                        this.f36845a = i6;
                        int i7 = i6 - i3;
                        if (i7 > i4) {
                            int i8 = i7 - i4;
                            this.f36846b = i8;
                            this.f36845a = i6 - i8;
                        } else {
                            this.f36846b = 0;
                        }
                        return i5;
                    }
                    throw InvalidProtocolBufferException.m36522b();
                }
                throw InvalidProtocolBufferException.m36521a();
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }
}
