package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
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

public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {

    /* renamed from: b */
    public static final ProtoBuf$Package f60882b;

    /* renamed from: c */
    public static C24017a f60883c = new C24017a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Property> property_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeAlias> typeAlias_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public ProtoBuf$VersionRequirementTable versionRequirementTable_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a */
    public static class C24017a extends C24077b<ProtoBuf$Package> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Package(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b */
    public static final class C24018b extends GeneratedMessageLite.C24067c<ProtoBuf$Package, C24018b> {

        /* renamed from: e */
        public int f60884e;

        /* renamed from: f */
        public List<ProtoBuf$Function> f60885f = Collections.emptyList();

        /* renamed from: g */
        public List<ProtoBuf$Property> f60886g = Collections.emptyList();

        /* renamed from: h */
        public List<ProtoBuf$TypeAlias> f60887h = Collections.emptyList();

        /* renamed from: i */
        public ProtoBuf$TypeTable f60888i = ProtoBuf$TypeTable.f60972b;

        /* renamed from: j */
        public ProtoBuf$VersionRequirementTable f60889j = ProtoBuf$VersionRequirementTable.f60995b;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59758k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Package i = mo59756i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24018b bVar = new C24018b();
            bVar.mo59757j(mo59756i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24018b bVar = new C24018b();
            bVar.mo59757j(mo59756i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59757j((ProtoBuf$Package) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Package mo59756i() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package((GeneratedMessageLite.C24067c) this);
            int i = this.f60884e;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f60885f = Collections.unmodifiableList(this.f60885f);
                this.f60884e &= -2;
            }
            protoBuf$Package.function_ = this.f60885f;
            if ((this.f60884e & 2) == 2) {
                this.f60886g = Collections.unmodifiableList(this.f60886g);
                this.f60884e &= -3;
            }
            protoBuf$Package.property_ = this.f60886g;
            if ((this.f60884e & 4) == 4) {
                this.f60887h = Collections.unmodifiableList(this.f60887h);
                this.f60884e &= -5;
            }
            protoBuf$Package.typeAlias_ = this.f60887h;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            protoBuf$Package.typeTable_ = this.f60888i;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            protoBuf$Package.versionRequirementTable_ = this.f60889j;
            protoBuf$Package.bitField0_ = i2;
            return protoBuf$Package;
        }

        /* renamed from: j */
        public final void mo59757j(ProtoBuf$Package protoBuf$Package) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            if (protoBuf$Package != ProtoBuf$Package.f60882b) {
                if (!protoBuf$Package.function_.isEmpty()) {
                    if (this.f60885f.isEmpty()) {
                        this.f60885f = protoBuf$Package.function_;
                        this.f60884e &= -2;
                    } else {
                        if ((this.f60884e & 1) != 1) {
                            this.f60885f = new ArrayList(this.f60885f);
                            this.f60884e |= 1;
                        }
                        this.f60885f.addAll(protoBuf$Package.function_);
                    }
                }
                if (!protoBuf$Package.property_.isEmpty()) {
                    if (this.f60886g.isEmpty()) {
                        this.f60886g = protoBuf$Package.property_;
                        this.f60884e &= -3;
                    } else {
                        if ((this.f60884e & 2) != 2) {
                            this.f60886g = new ArrayList(this.f60886g);
                            this.f60884e |= 2;
                        }
                        this.f60886g.addAll(protoBuf$Package.property_);
                    }
                }
                if (!protoBuf$Package.typeAlias_.isEmpty()) {
                    if (this.f60887h.isEmpty()) {
                        this.f60887h = protoBuf$Package.typeAlias_;
                        this.f60884e &= -5;
                    } else {
                        if ((this.f60884e & 4) != 4) {
                            this.f60887h = new ArrayList(this.f60887h);
                            this.f60884e |= 4;
                        }
                        this.f60887h.addAll(protoBuf$Package.typeAlias_);
                    }
                }
                if (protoBuf$Package.mo59753E()) {
                    ProtoBuf$TypeTable C = protoBuf$Package.mo59751C();
                    if ((this.f60884e & 8) != 8 || (protoBuf$TypeTable = this.f60888i) == ProtoBuf$TypeTable.f60972b) {
                        this.f60888i = C;
                    } else {
                        ProtoBuf$TypeTable.C24041b l = ProtoBuf$TypeTable.m59824l(protoBuf$TypeTable);
                        l.mo59889i(C);
                        this.f60888i = l.mo59888h();
                    }
                    this.f60884e |= 8;
                }
                if (protoBuf$Package.mo59754F()) {
                    ProtoBuf$VersionRequirementTable D = protoBuf$Package.mo59752D();
                    if ((this.f60884e & 16) != 16 || (protoBuf$VersionRequirementTable = this.f60889j) == ProtoBuf$VersionRequirementTable.f60995b) {
                        this.f60889j = D;
                    } else {
                        ProtoBuf$VersionRequirementTable.C24049b bVar = new ProtoBuf$VersionRequirementTable.C24049b();
                        bVar.mo59924i(protoBuf$VersionRequirementTable);
                        bVar.mo59924i(D);
                        this.f60889j = bVar.mo59923h();
                    }
                    this.f60884e |= 16;
                }
                mo59999h(protoBuf$Package);
                this.f61054b = this.f61054b.mo61617b(protoBuf$Package.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59758k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Package protoBuf$Package;
            try {
                ProtoBuf$Package.f60883c.getClass();
                mo59757j(new ProtoBuf$Package(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Package = (ProtoBuf$Package) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Package != null) {
                mo59757j(protoBuf$Package);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59758k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(0);
        f60882b = protoBuf$Package;
        protoBuf$Package.function_ = Collections.emptyList();
        protoBuf$Package.property_ = Collections.emptyList();
        protoBuf$Package.typeAlias_ = Collections.emptyList();
        protoBuf$Package.typeTable_ = ProtoBuf$TypeTable.f60972b;
        protoBuf$Package.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.f60995b;
    }

    public ProtoBuf$Package() {
        throw null;
    }

    public ProtoBuf$Package(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: A */
    public final List<ProtoBuf$Property> mo59749A() {
        return this.property_;
    }

    /* renamed from: B */
    public final List<ProtoBuf$TypeAlias> mo59750B() {
        return this.typeAlias_;
    }

    /* renamed from: C */
    public final ProtoBuf$TypeTable mo59751C() {
        return this.typeTable_;
    }

    /* renamed from: D */
    public final ProtoBuf$VersionRequirementTable mo59752D() {
        return this.versionRequirementTable_;
    }

    /* renamed from: E */
    public final boolean mo59753E() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: F */
    public final boolean mo59754F() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        for (int i = 0; i < this.function_.size(); i++) {
            codedOutputStream.mo59978o(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            codedOutputStream.mo59978o(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            codedOutputStream.mo59978o(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59978o(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59978o(32, this.versionRequirementTable_);
        }
        aVar.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60882b;
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.function_.size(); i3++) {
            i2 += CodedOutputStream.m60028d(3, this.function_.get(i3));
        }
        for (int i4 = 0; i4 < this.property_.size(); i4++) {
            i2 += CodedOutputStream.m60028d(4, this.property_.get(i4));
        }
        for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
            i2 += CodedOutputStream.m60028d(5, this.typeAlias_.get(i5));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m60028d(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m60028d(32, this.versionRequirementTable_);
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
        for (int i = 0; i < this.function_.size(); i++) {
            if (!this.function_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            if (!this.property_.get(i2).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            if (!this.typeAlias_.get(i3).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo59753E() && !this.typeTable_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59988e()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24018b();
    }

    public final C24090h.C24091a toBuilder() {
        C24018b bVar = new C24018b();
        bVar.mo59757j(this);
        return bVar;
    }

    /* renamed from: z */
    public final List<ProtoBuf$Function> mo59755z() {
        return this.function_;
    }

    public ProtoBuf$Package(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Package(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r11, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.memoizedIsInitialized = r0
            r10.memoizedSerializedSize = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r10.function_ = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r10.property_ = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r10.typeAlias_ = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.f60972b
            r10.typeTable_ = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.f60995b
            r10.versionRequirementTable_ = r0
            vg0.a$b r0 = new vg0.a$b
            r0.<init>()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r0, r1)
            r3 = 0
            r4 = 0
        L_0x002e:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x0150
            int r7 = r11.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            if (r7 == 0) goto L_0x0101
            r8 = 26
            if (r7 == r8) goto L_0x00e7
            r8 = 34
            if (r7 == r8) goto L_0x00cd
            r8 = 42
            if (r7 == r8) goto L_0x00b3
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x0089
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x0055
            boolean r5 = r10.mo59996m(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            if (r5 != 0) goto L_0x002e
            goto L_0x0101
        L_0x0055:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x006e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r10.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r9 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r9.mo59924i(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x006e
        L_0x0068:
            r11 = move-exception
            goto L_0x0116
        L_0x006b:
            r11 = move-exception
            goto L_0x0104
        L_0x006e:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.f60996c     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo60025g(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            if (r9 == 0) goto L_0x0083
            r9.mo59924i(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r9.mo59923h()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
        L_0x0083:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7 = r7 | r6
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x002e
        L_0x0089:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x0097
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r10.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.m59824l(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
        L_0x0097:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.f60973c     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo60025g(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            if (r9 == 0) goto L_0x00ac
            r9.mo59889i(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r9.mo59888h()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
        L_0x00ac:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7 = r7 | r1
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x002e
        L_0x00b3:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x00c0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.typeAlias_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r4 = r4 | 4
        L_0x00c0:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r7 = r10.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.f60951c     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo60025g(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x002e
        L_0x00cd:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00da
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.property_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r4 = r4 | 2
        L_0x00da:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r7 = r10.property_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.f60898c     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo60025g(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x002e
        L_0x00e7:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00f4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r10.function_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r4 = r4 | 1
        L_0x00f4:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r7 = r10.function_     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.f60868c     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo60025g(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0111, IOException -> 0x006b }
            goto L_0x002e
        L_0x0101:
            r3 = 1
            goto L_0x002e
        L_0x0104:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0068 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0068 }
            r12.<init>(r11)     // Catch:{ all -> 0x0068 }
            r12.mo60010b(r10)     // Catch:{ all -> 0x0068 }
            throw r12     // Catch:{ all -> 0x0068 }
        L_0x0111:
            r11 = move-exception
            r11.mo60010b(r10)     // Catch:{ all -> 0x0068 }
            throw r11     // Catch:{ all -> 0x0068 }
        L_0x0116:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x0122
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r12 = r10.function_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.function_ = r12
        L_0x0122:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x012e
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r12 = r10.property_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.property_ = r12
        L_0x012e:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x013a
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r12 = r10.typeAlias_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.typeAlias_ = r12
        L_0x013a:
            r2.mo59973i()     // Catch:{ IOException -> 0x0146, all -> 0x013e }
            goto L_0x0146
        L_0x013e:
            r11 = move-exception
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            throw r11
        L_0x0146:
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            r10.mo59994k()
            throw r11
        L_0x0150:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x015c
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = r10.function_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.function_ = r11
        L_0x015c:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0168
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = r10.property_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.property_ = r11
        L_0x0168:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x0174
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = r10.typeAlias_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.typeAlias_ = r11
        L_0x0174:
            r2.mo59973i()     // Catch:{ IOException -> 0x0180, all -> 0x0178 }
            goto L_0x0180
        L_0x0178:
            r11 = move-exception
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            throw r11
        L_0x0180:
            vg0.a r11 = r0.mo61632i()
            r10.unknownFields = r11
            r10.mo59994k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
