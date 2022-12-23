package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a0 */
public class C3476a0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a0$a */
    public static class C3477a extends C3476a0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public C3477a(String str) {
            super(str);
        }
    }

    public C3476a0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C3476a0 m8727a() {
        return new C3476a0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static C3476a0 m8728b() {
        return new C3476a0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static C3476a0 m8729c() {
        return new C3476a0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static C3477a m8730d() {
        return new C3477a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C3476a0 m8731e() {
        return new C3476a0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static C3476a0 m8732f() {
        return new C3476a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static C3476a0 m8733g() {
        return new C3476a0("Failed to parse the message.");
    }

    /* renamed from: h */
    public static C3476a0 m8734h() {
        return new C3476a0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    public static C3476a0 m8735i() {
        return new C3476a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
