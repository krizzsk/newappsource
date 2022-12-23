package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
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

public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {

    /* renamed from: b */
    public static final ProtoBuf$PackageFragment f60890b;

    /* renamed from: c */
    public static C24019a f60891c = new C24019a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public ProtoBuf$Package package_;
    /* access modifiers changed from: private */
    public ProtoBuf$QualifiedNameTable qualifiedNames_;
    /* access modifiers changed from: private */
    public ProtoBuf$StringTable strings_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$a */
    public static class C24019a extends C24077b<ProtoBuf$PackageFragment> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$PackageFragment(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$b */
    public static final class C24020b extends GeneratedMessageLite.C24067c<ProtoBuf$PackageFragment, C24020b> {

        /* renamed from: e */
        public int f60892e;

        /* renamed from: f */
        public ProtoBuf$StringTable f60893f = ProtoBuf$StringTable.f60922b;

        /* renamed from: g */
        public ProtoBuf$QualifiedNameTable f60894g = ProtoBuf$QualifiedNameTable.f60912b;

        /* renamed from: h */
        public ProtoBuf$Package f60895h = ProtoBuf$Package.f60882b;

        /* renamed from: i */
        public List<ProtoBuf$Class> f60896i = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59768k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$PackageFragment i = mo59766i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24020b bVar = new C24020b();
            bVar.mo59767j(mo59766i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24020b bVar = new C24020b();
            bVar.mo59767j(mo59766i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59767j((ProtoBuf$PackageFragment) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$PackageFragment mo59766i() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment((GeneratedMessageLite.C24067c) this);
            int i = this.f60892e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$PackageFragment.strings_ = this.f60893f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$PackageFragment.qualifiedNames_ = this.f60894g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$PackageFragment.package_ = this.f60895h;
            if ((this.f60892e & 8) == 8) {
                this.f60896i = Collections.unmodifiableList(this.f60896i);
                this.f60892e &= -9;
            }
            protoBuf$PackageFragment.class__ = this.f60896i;
            protoBuf$PackageFragment.bitField0_ = i2;
            return protoBuf$PackageFragment;
        }

        /* renamed from: j */
        public final void mo59767j(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$StringTable protoBuf$StringTable;
            if (protoBuf$PackageFragment != ProtoBuf$PackageFragment.f60890b) {
                if (protoBuf$PackageFragment.mo59761C()) {
                    ProtoBuf$StringTable z = protoBuf$PackageFragment.mo59765z();
                    if ((this.f60892e & 1) != 1 || (protoBuf$StringTable = this.f60893f) == ProtoBuf$StringTable.f60922b) {
                        this.f60893f = z;
                    } else {
                        ProtoBuf$StringTable.C24029b bVar = new ProtoBuf$StringTable.C24029b();
                        bVar.mo59809i(protoBuf$StringTable);
                        bVar.mo59809i(z);
                        this.f60893f = bVar.mo59808h();
                    }
                    this.f60892e |= 1;
                }
                if (protoBuf$PackageFragment.mo59760B()) {
                    ProtoBuf$QualifiedNameTable y = protoBuf$PackageFragment.mo59764y();
                    if ((this.f60892e & 2) != 2 || (protoBuf$QualifiedNameTable = this.f60894g) == ProtoBuf$QualifiedNameTable.f60912b) {
                        this.f60894g = y;
                    } else {
                        ProtoBuf$QualifiedNameTable.C24027b bVar2 = new ProtoBuf$QualifiedNameTable.C24027b();
                        bVar2.mo59805i(protoBuf$QualifiedNameTable);
                        bVar2.mo59805i(y);
                        this.f60894g = bVar2.mo59804h();
                    }
                    this.f60892e |= 2;
                }
                if (protoBuf$PackageFragment.mo59759A()) {
                    ProtoBuf$Package x = protoBuf$PackageFragment.mo59763x();
                    if ((this.f60892e & 4) != 4 || (protoBuf$Package = this.f60895h) == ProtoBuf$Package.f60882b) {
                        this.f60895h = x;
                    } else {
                        ProtoBuf$Package.C24018b bVar3 = new ProtoBuf$Package.C24018b();
                        bVar3.mo59757j(protoBuf$Package);
                        bVar3.mo59757j(x);
                        this.f60895h = bVar3.mo59756i();
                    }
                    this.f60892e |= 4;
                }
                if (!protoBuf$PackageFragment.class__.isEmpty()) {
                    if (this.f60896i.isEmpty()) {
                        this.f60896i = protoBuf$PackageFragment.class__;
                        this.f60892e &= -9;
                    } else {
                        if ((this.f60892e & 8) != 8) {
                            this.f60896i = new ArrayList(this.f60896i);
                            this.f60892e |= 8;
                        }
                        this.f60896i.addAll(protoBuf$PackageFragment.class__);
                    }
                }
                mo59999h(protoBuf$PackageFragment);
                this.f61054b = this.f61054b.mo61617b(protoBuf$PackageFragment.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59768k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            try {
                ProtoBuf$PackageFragment.f60891c.getClass();
                mo59767j(new ProtoBuf$PackageFragment(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$PackageFragment = (ProtoBuf$PackageFragment) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$PackageFragment != null) {
                mo59767j(protoBuf$PackageFragment);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59768k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(0);
        f60890b = protoBuf$PackageFragment;
        protoBuf$PackageFragment.strings_ = ProtoBuf$StringTable.f60922b;
        protoBuf$PackageFragment.qualifiedNames_ = ProtoBuf$QualifiedNameTable.f60912b;
        protoBuf$PackageFragment.package_ = ProtoBuf$Package.f60882b;
        protoBuf$PackageFragment.class__ = Collections.emptyList();
    }

    public ProtoBuf$PackageFragment() {
        throw null;
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: A */
    public final boolean mo59759A() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: B */
    public final boolean mo59760B() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: C */
    public final boolean mo59761C() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59978o(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59978o(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59978o(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            codedOutputStream.mo59978o(4, this.class__.get(i));
        }
        aVar.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60890b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m60028d(1, this.strings_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m60028d(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60028d(3, this.package_);
        }
        for (int i3 = 0; i3 < this.class__.size(); i3++) {
            i += CodedOutputStream.m60028d(4, this.class__.get(i3));
        }
        int size = this.unknownFields.size() + mo59989f() + i;
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
        if (mo59760B() && !this.qualifiedNames_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59759A() || this.package_.isInitialized()) {
            for (int i = 0; i < this.class__.size(); i++) {
                if (!this.class__.get(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo59988e()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24020b();
    }

    public final C24090h.C24091a toBuilder() {
        C24020b bVar = new C24020b();
        bVar.mo59767j(this);
        return bVar;
    }

    /* renamed from: w */
    public final List<ProtoBuf$Class> mo59762w() {
        return this.class__;
    }

    /* renamed from: x */
    public final ProtoBuf$Package mo59763x() {
        return this.package_;
    }

    /* renamed from: y */
    public final ProtoBuf$QualifiedNameTable mo59764y() {
        return this.qualifiedNames_;
    }

    /* renamed from: z */
    public final ProtoBuf$StringTable mo59765z() {
        return this.strings_;
    }

    public ProtoBuf$PackageFragment(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r10, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.memoizedIsInitialized = r0
            r9.memoizedSerializedSize = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable.f60922b
            r9.strings_ = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.f60912b
            r9.qualifiedNames_ = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.f60882b
            r9.package_ = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r9.class__ = r0
            vg0.a$b r0 = new vg0.a$b
            r0.<init>()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0026:
            r5 = 8
            if (r3 != 0) goto L_0x012a
            int r6 = r10.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            if (r6 == 0) goto L_0x00f3
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00c5
            r7 = 18
            if (r6 == r7) goto L_0x0096
            r7 = 26
            if (r6 == r7) goto L_0x0068
            r7 = 34
            if (r6 == r7) goto L_0x0049
            boolean r5 = r9.mo59996m(r10, r2, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            if (r5 != 0) goto L_0x0026
            goto L_0x00f3
        L_0x0049:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x0056
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.class__ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r4 = r4 | 8
        L_0x0056:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r6 = r9.class__     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.f60815c     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r10.mo60025g(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            goto L_0x0026
        L_0x0062:
            r10 = move-exception
            goto L_0x0108
        L_0x0065:
            r10 = move-exception
            goto L_0x00f6
        L_0x0068:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r9.package_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b r8 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.mo59757j(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x007b:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.f60883c     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo60025g(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            if (r8 == 0) goto L_0x0090
            r8.mo59757j(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r8.mo59756i()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x0090:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            goto L_0x0026
        L_0x0096:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x00a9
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r9.qualifiedNames_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b r8 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.mo59805i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x00a9:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.f60913c     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo60025g(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            if (r8 == 0) goto L_0x00be
            r8.mo59805i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r8.mo59804h()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x00be:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            goto L_0x0026
        L_0x00c5:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00d7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r9.strings_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b r8 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r8.mo59809i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x00d7:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable.f60923c     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo60025g(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            if (r8 == 0) goto L_0x00ec
            r8.mo59809i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r8.mo59808h()     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
        L_0x00ec:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            r6 = r6 | r1
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x0103, IOException -> 0x0065 }
            goto L_0x0026
        L_0x00f3:
            r3 = 1
            goto L_0x0026
        L_0x00f6:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0062 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0062 }
            r11.<init>(r10)     // Catch:{ all -> 0x0062 }
            r11.mo60010b(r9)     // Catch:{ all -> 0x0062 }
            throw r11     // Catch:{ all -> 0x0062 }
        L_0x0103:
            r10 = move-exception
            r10.mo60010b(r9)     // Catch:{ all -> 0x0062 }
            throw r10     // Catch:{ all -> 0x0062 }
        L_0x0108:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x0114
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r11 = r9.class__
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.class__ = r11
        L_0x0114:
            r2.mo59973i()     // Catch:{ IOException -> 0x0120, all -> 0x0118 }
            goto L_0x0120
        L_0x0118:
            r10 = move-exception
            vg0.a r11 = r0.mo61632i()
            r9.unknownFields = r11
            throw r10
        L_0x0120:
            vg0.a r11 = r0.mo61632i()
            r9.unknownFields = r11
            r9.mo59994k()
            throw r10
        L_0x012a:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x0136
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r10 = r9.class__
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.class__ = r10
        L_0x0136:
            r2.mo59973i()     // Catch:{ IOException -> 0x0142, all -> 0x013a }
            goto L_0x0142
        L_0x013a:
            r10 = move-exception
            vg0.a r11 = r0.mo61632i()
            r9.unknownFields = r11
            throw r10
        L_0x0142:
            vg0.a r10 = r0.mo61632i()
            r9.unknownFields = r10
            r9.mo59994k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
