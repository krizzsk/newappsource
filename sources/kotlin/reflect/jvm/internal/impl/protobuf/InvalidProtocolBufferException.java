package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private C24090h unfinishedMessage = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m60072c() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public final C24090h mo60009a() {
        return this.unfinishedMessage;
    }

    /* renamed from: b */
    public final void mo60010b(C24090h hVar) {
        this.unfinishedMessage = hVar;
    }
}
