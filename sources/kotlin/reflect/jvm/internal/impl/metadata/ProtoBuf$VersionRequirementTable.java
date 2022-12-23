package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import vg0.C25099f;

public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$VersionRequirementTable f60995b;

    /* renamed from: c */
    public static C24048a f60996c = new C24048a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$VersionRequirement> requirement_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a */
    public static class C24048a extends C24077b<ProtoBuf$VersionRequirementTable> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirementTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b */
    public static final class C24049b extends GeneratedMessageLite.C24066b<ProtoBuf$VersionRequirementTable, C24049b> implements C25099f {

        /* renamed from: c */
        public int f60997c;

        /* renamed from: d */
        public List<ProtoBuf$VersionRequirement> f60998d = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59925j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$VersionRequirementTable h = mo59923h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24049b bVar = new C24049b();
            bVar.mo59924i(mo59923h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24049b bVar = new C24049b();
            bVar.mo59924i(mo59923h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59924i((ProtoBuf$VersionRequirementTable) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$VersionRequirementTable mo59923h() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this);
            if ((this.f60997c & 1) == 1) {
                this.f60998d = Collections.unmodifiableList(this.f60998d);
                this.f60997c &= -2;
            }
            protoBuf$VersionRequirementTable.requirement_ = this.f60998d;
            return protoBuf$VersionRequirementTable;
        }

        /* renamed from: i */
        public final void mo59924i(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable != ProtoBuf$VersionRequirementTable.f60995b) {
                if (!protoBuf$VersionRequirementTable.requirement_.isEmpty()) {
                    if (this.f60998d.isEmpty()) {
                        this.f60998d = protoBuf$VersionRequirementTable.requirement_;
                        this.f60997c &= -2;
                    } else {
                        if ((this.f60997c & 1) != 1) {
                            this.f60998d = new ArrayList(this.f60998d);
                            this.f60997c |= 1;
                        }
                        this.f60998d.addAll(protoBuf$VersionRequirementTable.requirement_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$VersionRequirementTable.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59925j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            try {
                ProtoBuf$VersionRequirementTable.f60996c.getClass();
                mo59924i(new ProtoBuf$VersionRequirementTable(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$VersionRequirementTable != null) {
                mo59924i(protoBuf$VersionRequirementTable);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59925j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable();
        f60995b = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.requirement_ = Collections.emptyList();
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            codedOutputStream.mo59978o(1, this.requirement_.get(i));
        }
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: g */
    public final int mo59921g() {
        return this.requirement_.size();
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
            i2 += CodedOutputStream.m60028d(1, this.requirement_.get(i3));
        }
        int size = this.unknownFields.size() + i2;
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: h */
    public final List<ProtoBuf$VersionRequirement> mo59922h() {
        return this.requirement_;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24049b();
    }

    public final C24090h.C24091a toBuilder() {
        C24049b bVar = new C24049b();
        bVar.mo59924i(this);
        return bVar;
    }

    public ProtoBuf$VersionRequirementTable() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$VersionRequirementTable(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.requirement_ = Collections.emptyList();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 10) {
                        if (!z2 || !true) {
                            this.requirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.requirement_.add(cVar.mo60025g(ProtoBuf$VersionRequirement.f60987c, dVar));
                    } else if (!cVar.mo60035q(n, j)) {
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
                if (z2 && true) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                }
                try {
                    j.mo59973i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.mo61632i();
                    throw th2;
                }
                this.unknownFields = bVar.mo61632i();
                throw th;
            }
        }
        if (z2 && true) {
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
        }
        try {
            j.mo59973i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.mo61632i();
            throw th3;
        }
        this.unknownFields = bVar.mo61632i();
    }
}
