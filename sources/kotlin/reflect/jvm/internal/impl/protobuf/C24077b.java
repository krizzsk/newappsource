package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import vg0.C25100g;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
public abstract class C24077b<MessageType extends C24090h> implements C25100g<MessageType> {
    static {
        int i = C24079d.f61077b;
    }

    /* renamed from: b */
    public static void m60077b(C24090h hVar) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (hVar != null && !hVar.isInitialized()) {
            if (hVar instanceof C24074a) {
                C24074a aVar = (C24074a) hVar;
                uninitializedMessageException = new UninitializedMessageException();
            } else {
                uninitializedMessageException = new UninitializedMessageException();
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
            invalidProtocolBufferException.mo60010b(hVar);
            throw invalidProtocolBufferException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE) != 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.m60072c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.protobuf.C24090h mo60018c(java.io.ByteArrayInputStream r6, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r7) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r5 = this;
            int r0 = r6.read()     // Catch:{ IOException -> 0x0068 }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r6 = 0
            goto L_0x004f
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x0068 }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.m60072c()     // Catch:{ IOException -> 0x0068 }
            throw r6     // Catch:{ IOException -> 0x0068 }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x0060
            int r3 = r6.read()     // Catch:{ IOException -> 0x0068 }
            if (r3 == r1) goto L_0x005b
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0058
        L_0x003a:
            kotlin.reflect.jvm.internal.impl.protobuf.a$a$a r1 = new kotlin.reflect.jvm.internal.impl.protobuf.a$a$a
            r1.<init>(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.c r6 = new kotlin.reflect.jvm.internal.impl.protobuf.c
            r6.<init>(r1)
            java.lang.Object r7 = r5.mo59643a(r6, r7)
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = (kotlin.reflect.jvm.internal.impl.protobuf.C24090h) r7
            r0 = 0
            r6.mo60019a(r0)     // Catch:{ InvalidProtocolBufferException -> 0x0053 }
            r6 = r7
        L_0x004f:
            m60077b(r6)
            return r6
        L_0x0053:
            r6 = move-exception
            r6.mo60010b(r7)
            throw r6
        L_0x0058:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.m60072c()     // Catch:{ IOException -> 0x0068 }
            throw r6     // Catch:{ IOException -> 0x0068 }
        L_0x0060:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ IOException -> 0x0068 }
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r7)     // Catch:{ IOException -> 0x0068 }
            throw r6     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r6 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24077b.mo60018c(java.io.ByteArrayInputStream, kotlin.reflect.jvm.internal.impl.protobuf.d):kotlin.reflect.jvm.internal.impl.protobuf.h");
    }
}
