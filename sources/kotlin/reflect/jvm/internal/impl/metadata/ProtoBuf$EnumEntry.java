package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import vg0.C25091a;

public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {

    /* renamed from: b */
    public static final ProtoBuf$EnumEntry f60853b;

    /* renamed from: c */
    public static C24008a f60854c = new C24008a();
    /* access modifiers changed from: private */
    public int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a */
    public static class C24008a extends C24077b<ProtoBuf$EnumEntry> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$EnumEntry(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$b */
    public static final class C24009b extends GeneratedMessageLite.C24067c<ProtoBuf$EnumEntry, C24009b> {

        /* renamed from: e */
        public int f60855e;

        /* renamed from: f */
        public int f60856f;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59711j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry((GeneratedMessageLite.C24067c) this);
            int i = 1;
            if ((this.f60855e & 1) != 1) {
                i = 0;
            }
            protoBuf$EnumEntry.name_ = this.f60856f;
            protoBuf$EnumEntry.bitField0_ = i;
            if (protoBuf$EnumEntry.isInitialized()) {
                return protoBuf$EnumEntry;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24009b bVar = new C24009b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry((GeneratedMessageLite.C24067c) this);
            int i = 1;
            if ((this.f60855e & 1) != 1) {
                i = 0;
            }
            protoBuf$EnumEntry.name_ = this.f60856f;
            protoBuf$EnumEntry.bitField0_ = i;
            bVar.mo59710i(protoBuf$EnumEntry);
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24009b bVar = new C24009b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry((GeneratedMessageLite.C24067c) this);
            int i = 1;
            if ((this.f60855e & 1) != 1) {
                i = 0;
            }
            protoBuf$EnumEntry.name_ = this.f60856f;
            protoBuf$EnumEntry.bitField0_ = i;
            bVar.mo59710i(protoBuf$EnumEntry);
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59710i((ProtoBuf$EnumEntry) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final void mo59710i(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
            if (protoBuf$EnumEntry != ProtoBuf$EnumEntry.f60853b) {
                if (protoBuf$EnumEntry.mo59709t()) {
                    int s = protoBuf$EnumEntry.mo59708s();
                    this.f60855e |= 1;
                    this.f60856f = s;
                }
                mo59999h(protoBuf$EnumEntry);
                this.f61054b = this.f61054b.mo61617b(protoBuf$EnumEntry.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59711j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$EnumEntry protoBuf$EnumEntry;
            try {
                ProtoBuf$EnumEntry.f60854c.getClass();
                mo59710i(new ProtoBuf$EnumEntry(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$EnumEntry = (ProtoBuf$EnumEntry) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$EnumEntry != null) {
                mo59710i(protoBuf$EnumEntry);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59711j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(0);
        f60853b = protoBuf$EnumEntry;
        protoBuf$EnumEntry.name_ = 0;
    }

    public ProtoBuf$EnumEntry() {
        throw null;
    }

    public ProtoBuf$EnumEntry(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C25541a l = mo59995l();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.name_);
        }
        l.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60853b;
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m60026b(1, this.name_);
        }
        int size = this.unknownFields.size() + mo59989f() + i2;
        this.memoizedSerializedSize = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo59988e()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24009b();
    }

    /* renamed from: s */
    public final int mo59708s() {
        return this.name_;
    }

    /* renamed from: t */
    public final boolean mo59709t() {
        return (this.bitField0_ & 1) == 1;
    }

    public final C24090h.C24091a toBuilder() {
        C24009b bVar = new C24009b();
        bVar.mo59710i(this);
        return bVar;
    }

    public ProtoBuf$EnumEntry(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$EnumEntry(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.name_ = 0;
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.name_ = cVar.mo60029k();
                    } else if (!mo59996m(cVar, j, dVar, n)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                e.mo60010b(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.mo60010b(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                try {
                    j.mo59973i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.mo61632i();
                    throw th2;
                }
                this.unknownFields = bVar.mo61632i();
                mo59994k();
                throw th;
            }
        }
        try {
            j.mo59973i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.mo61632i();
            throw th3;
        }
        this.unknownFields = bVar.mo61632i();
        mo59994k();
    }
}
