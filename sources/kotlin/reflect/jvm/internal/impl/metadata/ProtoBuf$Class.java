package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p988j$.util.Spliterator;
import vg0.C25091a;

public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {

    /* renamed from: b */
    public static final ProtoBuf$Class f60814b;

    /* renamed from: c */
    public static C23998a f60815c = new C23998a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int companionObjectName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Constructor> constructor_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$EnumEntry> enumEntry_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int fqName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Function> function_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingPropertyName_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nestedClassNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> nestedClassName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Property> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> supertypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> supertype_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeAlias> typeAlias_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public ProtoBuf$VersionRequirementTable versionRequirementTable_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    public enum Kind implements C24084f.C24085a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static C24084f.C24086b<Kind> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$a */
        public static class C23997a implements C24084f.C24086b<Kind> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return Kind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23997a();
        }

        private Kind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a */
    public static class C23998a extends C24077b<ProtoBuf$Class> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Class(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$b */
    public static final class C23999b extends GeneratedMessageLite.C24067c<ProtoBuf$Class, C23999b> {

        /* renamed from: e */
        public int f60816e;

        /* renamed from: f */
        public int f60817f = 6;

        /* renamed from: g */
        public int f60818g;

        /* renamed from: h */
        public int f60819h;

        /* renamed from: i */
        public List<ProtoBuf$TypeParameter> f60820i = Collections.emptyList();

        /* renamed from: j */
        public List<ProtoBuf$Type> f60821j = Collections.emptyList();

        /* renamed from: k */
        public List<Integer> f60822k = Collections.emptyList();

        /* renamed from: l */
        public List<Integer> f60823l = Collections.emptyList();

        /* renamed from: m */
        public List<ProtoBuf$Constructor> f60824m = Collections.emptyList();

        /* renamed from: n */
        public List<ProtoBuf$Function> f60825n = Collections.emptyList();

        /* renamed from: o */
        public List<ProtoBuf$Property> f60826o = Collections.emptyList();

        /* renamed from: p */
        public List<ProtoBuf$TypeAlias> f60827p = Collections.emptyList();

        /* renamed from: q */
        public List<ProtoBuf$EnumEntry> f60828q = Collections.emptyList();

        /* renamed from: r */
        public List<Integer> f60829r = Collections.emptyList();

        /* renamed from: s */
        public int f60830s;

        /* renamed from: t */
        public ProtoBuf$Type f60831t = ProtoBuf$Type.f60926b;

        /* renamed from: u */
        public int f60832u;

        /* renamed from: v */
        public ProtoBuf$TypeTable f60833v = ProtoBuf$TypeTable.f60972b;

        /* renamed from: w */
        public List<Integer> f60834w = Collections.emptyList();

        /* renamed from: x */
        public ProtoBuf$VersionRequirementTable f60835x = ProtoBuf$VersionRequirementTable.f60995b;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59689k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Class i = mo59687i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C23999b bVar = new C23999b();
            bVar.mo59688j(mo59687i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C23999b bVar = new C23999b();
            bVar.mo59688j(mo59687i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59688j((ProtoBuf$Class) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Class mo59687i() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class((GeneratedMessageLite.C24067c) this);
            int i = this.f60816e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Class.flags_ = this.f60817f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Class.fqName_ = this.f60818g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Class.companionObjectName_ = this.f60819h;
            if ((this.f60816e & 8) == 8) {
                this.f60820i = Collections.unmodifiableList(this.f60820i);
                this.f60816e &= -9;
            }
            protoBuf$Class.typeParameter_ = this.f60820i;
            if ((this.f60816e & 16) == 16) {
                this.f60821j = Collections.unmodifiableList(this.f60821j);
                this.f60816e &= -17;
            }
            protoBuf$Class.supertype_ = this.f60821j;
            if ((this.f60816e & 32) == 32) {
                this.f60822k = Collections.unmodifiableList(this.f60822k);
                this.f60816e &= -33;
            }
            protoBuf$Class.supertypeId_ = this.f60822k;
            if ((this.f60816e & 64) == 64) {
                this.f60823l = Collections.unmodifiableList(this.f60823l);
                this.f60816e &= -65;
            }
            protoBuf$Class.nestedClassName_ = this.f60823l;
            if ((this.f60816e & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                this.f60824m = Collections.unmodifiableList(this.f60824m);
                this.f60816e &= -129;
            }
            protoBuf$Class.constructor_ = this.f60824m;
            if ((this.f60816e & 256) == 256) {
                this.f60825n = Collections.unmodifiableList(this.f60825n);
                this.f60816e &= -257;
            }
            protoBuf$Class.function_ = this.f60825n;
            if ((this.f60816e & 512) == 512) {
                this.f60826o = Collections.unmodifiableList(this.f60826o);
                this.f60816e &= -513;
            }
            protoBuf$Class.property_ = this.f60826o;
            if ((this.f60816e & 1024) == 1024) {
                this.f60827p = Collections.unmodifiableList(this.f60827p);
                this.f60816e &= -1025;
            }
            protoBuf$Class.typeAlias_ = this.f60827p;
            if ((this.f60816e & 2048) == 2048) {
                this.f60828q = Collections.unmodifiableList(this.f60828q);
                this.f60816e &= -2049;
            }
            protoBuf$Class.enumEntry_ = this.f60828q;
            if ((this.f60816e & 4096) == 4096) {
                this.f60829r = Collections.unmodifiableList(this.f60829r);
                this.f60816e &= -4097;
            }
            protoBuf$Class.sealedSubclassFqName_ = this.f60829r;
            if ((i & 8192) == 8192) {
                i2 |= 8;
            }
            protoBuf$Class.inlineClassUnderlyingPropertyName_ = this.f60830s;
            if ((i & Spliterator.SUBSIZED) == 16384) {
                i2 |= 16;
            }
            protoBuf$Class.inlineClassUnderlyingType_ = this.f60831t;
            if ((i & 32768) == 32768) {
                i2 |= 32;
            }
            protoBuf$Class.inlineClassUnderlyingTypeId_ = this.f60832u;
            if ((i & SQLiteDatabase.OPEN_FULLMUTEX) == 65536) {
                i2 |= 64;
            }
            protoBuf$Class.typeTable_ = this.f60833v;
            if ((this.f60816e & SQLiteDatabase.OPEN_SHAREDCACHE) == 131072) {
                this.f60834w = Collections.unmodifiableList(this.f60834w);
                this.f60816e &= -131073;
            }
            protoBuf$Class.versionRequirement_ = this.f60834w;
            if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) == 262144) {
                i2 |= RecyclerView.C1119a0.FLAG_IGNORE;
            }
            protoBuf$Class.versionRequirementTable_ = this.f60835x;
            protoBuf$Class.bitField0_ = i2;
            return protoBuf$Class;
        }

        /* renamed from: j */
        public final void mo59688j(ProtoBuf$Class protoBuf$Class) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Class != ProtoBuf$Class.f60814b) {
                if (protoBuf$Class.mo59679o0()) {
                    int Y = protoBuf$Class.mo59662Y();
                    this.f60816e |= 1;
                    this.f60817f = Y;
                }
                if (protoBuf$Class.mo59680p0()) {
                    int Z = protoBuf$Class.mo59663Z();
                    this.f60816e |= 2;
                    this.f60818g = Z;
                }
                if (protoBuf$Class.mo59678n0()) {
                    int V = protoBuf$Class.mo59659V();
                    this.f60816e |= 4;
                    this.f60819h = V;
                }
                if (!protoBuf$Class.typeParameter_.isEmpty()) {
                    if (this.f60820i.isEmpty()) {
                        this.f60820i = protoBuf$Class.typeParameter_;
                        this.f60816e &= -9;
                    } else {
                        if ((this.f60816e & 8) != 8) {
                            this.f60820i = new ArrayList(this.f60820i);
                            this.f60816e |= 8;
                        }
                        this.f60820i.addAll(protoBuf$Class.typeParameter_);
                    }
                }
                if (!protoBuf$Class.supertype_.isEmpty()) {
                    if (this.f60821j.isEmpty()) {
                        this.f60821j = protoBuf$Class.supertype_;
                        this.f60816e &= -17;
                    } else {
                        if ((this.f60816e & 16) != 16) {
                            this.f60821j = new ArrayList(this.f60821j);
                            this.f60816e |= 16;
                        }
                        this.f60821j.addAll(protoBuf$Class.supertype_);
                    }
                }
                if (!protoBuf$Class.supertypeId_.isEmpty()) {
                    if (this.f60822k.isEmpty()) {
                        this.f60822k = protoBuf$Class.supertypeId_;
                        this.f60816e &= -33;
                    } else {
                        if ((this.f60816e & 32) != 32) {
                            this.f60822k = new ArrayList(this.f60822k);
                            this.f60816e |= 32;
                        }
                        this.f60822k.addAll(protoBuf$Class.supertypeId_);
                    }
                }
                if (!protoBuf$Class.nestedClassName_.isEmpty()) {
                    if (this.f60823l.isEmpty()) {
                        this.f60823l = protoBuf$Class.nestedClassName_;
                        this.f60816e &= -65;
                    } else {
                        if ((this.f60816e & 64) != 64) {
                            this.f60823l = new ArrayList(this.f60823l);
                            this.f60816e |= 64;
                        }
                        this.f60823l.addAll(protoBuf$Class.nestedClassName_);
                    }
                }
                if (!protoBuf$Class.constructor_.isEmpty()) {
                    if (this.f60824m.isEmpty()) {
                        this.f60824m = protoBuf$Class.constructor_;
                        this.f60816e &= -129;
                    } else {
                        if ((this.f60816e & RecyclerView.C1119a0.FLAG_IGNORE) != 128) {
                            this.f60824m = new ArrayList(this.f60824m);
                            this.f60816e |= RecyclerView.C1119a0.FLAG_IGNORE;
                        }
                        this.f60824m.addAll(protoBuf$Class.constructor_);
                    }
                }
                if (!protoBuf$Class.function_.isEmpty()) {
                    if (this.f60825n.isEmpty()) {
                        this.f60825n = protoBuf$Class.function_;
                        this.f60816e &= -257;
                    } else {
                        if ((this.f60816e & 256) != 256) {
                            this.f60825n = new ArrayList(this.f60825n);
                            this.f60816e |= 256;
                        }
                        this.f60825n.addAll(protoBuf$Class.function_);
                    }
                }
                if (!protoBuf$Class.property_.isEmpty()) {
                    if (this.f60826o.isEmpty()) {
                        this.f60826o = protoBuf$Class.property_;
                        this.f60816e &= -513;
                    } else {
                        if ((this.f60816e & 512) != 512) {
                            this.f60826o = new ArrayList(this.f60826o);
                            this.f60816e |= 512;
                        }
                        this.f60826o.addAll(protoBuf$Class.property_);
                    }
                }
                if (!protoBuf$Class.typeAlias_.isEmpty()) {
                    if (this.f60827p.isEmpty()) {
                        this.f60827p = protoBuf$Class.typeAlias_;
                        this.f60816e &= -1025;
                    } else {
                        if ((this.f60816e & 1024) != 1024) {
                            this.f60827p = new ArrayList(this.f60827p);
                            this.f60816e |= 1024;
                        }
                        this.f60827p.addAll(protoBuf$Class.typeAlias_);
                    }
                }
                if (!protoBuf$Class.enumEntry_.isEmpty()) {
                    if (this.f60828q.isEmpty()) {
                        this.f60828q = protoBuf$Class.enumEntry_;
                        this.f60816e &= -2049;
                    } else {
                        if ((this.f60816e & 2048) != 2048) {
                            this.f60828q = new ArrayList(this.f60828q);
                            this.f60816e |= 2048;
                        }
                        this.f60828q.addAll(protoBuf$Class.enumEntry_);
                    }
                }
                if (!protoBuf$Class.sealedSubclassFqName_.isEmpty()) {
                    if (this.f60829r.isEmpty()) {
                        this.f60829r = protoBuf$Class.sealedSubclassFqName_;
                        this.f60816e &= -4097;
                    } else {
                        if ((this.f60816e & 4096) != 4096) {
                            this.f60829r = new ArrayList(this.f60829r);
                            this.f60816e |= 4096;
                        }
                        this.f60829r.addAll(protoBuf$Class.sealedSubclassFqName_);
                    }
                }
                if (protoBuf$Class.mo59681q0()) {
                    int b0 = protoBuf$Class.mo59665b0();
                    this.f60816e |= 8192;
                    this.f60830s = b0;
                }
                if (protoBuf$Class.mo59682r0()) {
                    ProtoBuf$Type c0 = protoBuf$Class.mo59666c0();
                    if ((this.f60816e & Spliterator.SUBSIZED) != 16384 || (protoBuf$Type = this.f60831t) == ProtoBuf$Type.f60926b) {
                        this.f60831t = c0;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j0.mo59851j(c0);
                        this.f60831t = j0.mo59850i();
                    }
                    this.f60816e |= Spliterator.SUBSIZED;
                }
                if (protoBuf$Class.mo59683s0()) {
                    int d0 = protoBuf$Class.mo59667d0();
                    this.f60816e |= 32768;
                    this.f60832u = d0;
                }
                if (protoBuf$Class.mo59684t0()) {
                    ProtoBuf$TypeTable l0 = protoBuf$Class.mo59676l0();
                    if ((this.f60816e & SQLiteDatabase.OPEN_FULLMUTEX) != 65536 || (protoBuf$TypeTable = this.f60833v) == ProtoBuf$TypeTable.f60972b) {
                        this.f60833v = l0;
                    } else {
                        ProtoBuf$TypeTable.C24041b l = ProtoBuf$TypeTable.m59824l(protoBuf$TypeTable);
                        l.mo59889i(l0);
                        this.f60833v = l.mo59888h();
                    }
                    this.f60816e |= SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if (!protoBuf$Class.versionRequirement_.isEmpty()) {
                    if (this.f60834w.isEmpty()) {
                        this.f60834w = protoBuf$Class.versionRequirement_;
                        this.f60816e &= -131073;
                    } else {
                        if ((this.f60816e & SQLiteDatabase.OPEN_SHAREDCACHE) != 131072) {
                            this.f60834w = new ArrayList(this.f60834w);
                            this.f60816e |= SQLiteDatabase.OPEN_SHAREDCACHE;
                        }
                        this.f60834w.addAll(protoBuf$Class.versionRequirement_);
                    }
                }
                if (protoBuf$Class.mo59685u0()) {
                    ProtoBuf$VersionRequirementTable m0 = protoBuf$Class.mo59677m0();
                    if ((this.f60816e & SQLiteDatabase.OPEN_PRIVATECACHE) != 262144 || (protoBuf$VersionRequirementTable = this.f60835x) == ProtoBuf$VersionRequirementTable.f60995b) {
                        this.f60835x = m0;
                    } else {
                        ProtoBuf$VersionRequirementTable.C24049b bVar = new ProtoBuf$VersionRequirementTable.C24049b();
                        bVar.mo59924i(protoBuf$VersionRequirementTable);
                        bVar.mo59924i(m0);
                        this.f60835x = bVar.mo59923h();
                    }
                    this.f60816e |= SQLiteDatabase.OPEN_PRIVATECACHE;
                }
                mo59999h(protoBuf$Class);
                this.f61054b = this.f61054b.mo61617b(protoBuf$Class.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59689k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Class protoBuf$Class;
            try {
                ProtoBuf$Class.f60815c.getClass();
                mo59688j(new ProtoBuf$Class(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Class = (ProtoBuf$Class) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Class != null) {
                mo59688j(protoBuf$Class);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59689k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(0);
        f60814b = protoBuf$Class;
        protoBuf$Class.mo59686v0();
    }

    public ProtoBuf$Class() {
        throw null;
    }

    public ProtoBuf$Class(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: V */
    public final int mo59659V() {
        return this.companionObjectName_;
    }

    /* renamed from: W */
    public final List<ProtoBuf$Constructor> mo59660W() {
        return this.constructor_;
    }

    /* renamed from: X */
    public final List<ProtoBuf$EnumEntry> mo59661X() {
        return this.enumEntry_;
    }

    /* renamed from: Y */
    public final int mo59662Y() {
        return this.flags_;
    }

    /* renamed from: Z */
    public final int mo59663Z() {
        return this.fqName_;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.flags_);
        }
        if (this.supertypeId_.size() > 0) {
            codedOutputStream.mo59985v(18);
            codedOutputStream.mo59985v(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            codedOutputStream.mo59977n(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59976m(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            codedOutputStream.mo59978o(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            codedOutputStream.mo59978o(6, this.supertype_.get(i3));
        }
        if (this.nestedClassName_.size() > 0) {
            codedOutputStream.mo59985v(58);
            codedOutputStream.mo59985v(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            codedOutputStream.mo59977n(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            codedOutputStream.mo59978o(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            codedOutputStream.mo59978o(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            codedOutputStream.mo59978o(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            codedOutputStream.mo59978o(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            codedOutputStream.mo59978o(13, this.enumEntry_.get(i9));
        }
        if (this.sealedSubclassFqName_.size() > 0) {
            codedOutputStream.mo59985v(130);
            codedOutputStream.mo59985v(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i11 = 0; i11 < this.sealedSubclassFqName_.size(); i11++) {
            codedOutputStream.mo59977n(this.sealedSubclassFqName_.get(i11).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59976m(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59978o(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59976m(19, this.inlineClassUnderlyingTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo59978o(30, this.typeTable_);
        }
        for (int i12 = 0; i12 < this.versionRequirement_.size(); i12++) {
            codedOutputStream.mo59976m(31, this.versionRequirement_.get(i12).intValue());
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            codedOutputStream.mo59978o(32, this.versionRequirementTable_);
        }
        aVar.mo59998a(19000, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: a0 */
    public final List<ProtoBuf$Function> mo59664a0() {
        return this.function_;
    }

    /* renamed from: b0 */
    public final int mo59665b0() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    /* renamed from: c0 */
    public final ProtoBuf$Type mo59666c0() {
        return this.inlineClassUnderlyingType_;
    }

    /* renamed from: d0 */
    public final int mo59667d0() {
        return this.inlineClassUnderlyingTypeId_;
    }

    /* renamed from: e0 */
    public final List<Integer> mo59668e0() {
        return this.nestedClassName_;
    }

    /* renamed from: f0 */
    public final List<ProtoBuf$Property> mo59669f0() {
        return this.property_;
    }

    /* renamed from: g0 */
    public final List<Integer> mo59670g0() {
        return this.sealedSubclassFqName_;
    }

    public final C24090h getDefaultInstanceForType() {
        return f60814b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m60026b(1, this.flags_) + 0;
        } else {
            i = 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.supertypeId_.size(); i4++) {
            i3 += CodedOutputStream.m60027c(this.supertypeId_.get(i4).intValue());
        }
        int i5 = i + i3;
        if (!this.supertypeId_.isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m60027c(i3);
        }
        this.supertypeIdMemoizedSerializedSize = i3;
        if ((this.bitField0_ & 2) == 2) {
            i5 += CodedOutputStream.m60026b(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i5 += CodedOutputStream.m60026b(4, this.companionObjectName_);
        }
        for (int i6 = 0; i6 < this.typeParameter_.size(); i6++) {
            i5 += CodedOutputStream.m60028d(5, this.typeParameter_.get(i6));
        }
        for (int i7 = 0; i7 < this.supertype_.size(); i7++) {
            i5 += CodedOutputStream.m60028d(6, this.supertype_.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.nestedClassName_.size(); i9++) {
            i8 += CodedOutputStream.m60027c(this.nestedClassName_.get(i9).intValue());
        }
        int i11 = i5 + i8;
        if (!this.nestedClassName_.isEmpty()) {
            i11 = i11 + 1 + CodedOutputStream.m60027c(i8);
        }
        this.nestedClassNameMemoizedSerializedSize = i8;
        for (int i12 = 0; i12 < this.constructor_.size(); i12++) {
            i11 += CodedOutputStream.m60028d(8, this.constructor_.get(i12));
        }
        for (int i13 = 0; i13 < this.function_.size(); i13++) {
            i11 += CodedOutputStream.m60028d(9, this.function_.get(i13));
        }
        for (int i14 = 0; i14 < this.property_.size(); i14++) {
            i11 += CodedOutputStream.m60028d(10, this.property_.get(i14));
        }
        for (int i15 = 0; i15 < this.typeAlias_.size(); i15++) {
            i11 += CodedOutputStream.m60028d(11, this.typeAlias_.get(i15));
        }
        for (int i16 = 0; i16 < this.enumEntry_.size(); i16++) {
            i11 += CodedOutputStream.m60028d(13, this.enumEntry_.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.sealedSubclassFqName_.size(); i18++) {
            i17 += CodedOutputStream.m60027c(this.sealedSubclassFqName_.get(i18).intValue());
        }
        int i19 = i11 + i17;
        if (!this.sealedSubclassFqName_.isEmpty()) {
            i19 = i19 + 2 + CodedOutputStream.m60027c(i17);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = i17;
        if ((this.bitField0_ & 8) == 8) {
            i19 += CodedOutputStream.m60026b(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i19 += CodedOutputStream.m60028d(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i19 += CodedOutputStream.m60026b(19, this.inlineClassUnderlyingTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i19 += CodedOutputStream.m60028d(30, this.typeTable_);
        }
        int i21 = 0;
        for (int i22 = 0; i22 < this.versionRequirement_.size(); i22++) {
            i21 += CodedOutputStream.m60027c(this.versionRequirement_.get(i22).intValue());
        }
        int size = (this.versionRequirement_.size() * 2) + i19 + i21;
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            size += CodedOutputStream.m60028d(32, this.versionRequirementTable_);
        }
        int size2 = this.unknownFields.size() + mo59989f() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    /* renamed from: h0 */
    public final List<Integer> mo59672h0() {
        return this.supertypeId_;
    }

    /* renamed from: i0 */
    public final List<ProtoBuf$Type> mo59673i0() {
        return this.supertype_;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo59680p0()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.supertype_.size(); i2++) {
            if (!this.supertype_.get(i2).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.constructor_.size(); i3++) {
            if (!this.constructor_.get(i3).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.function_.size(); i4++) {
            if (!this.function_.get(i4).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.property_.size(); i5++) {
            if (!this.property_.get(i5).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.typeAlias_.size(); i6++) {
            if (!this.typeAlias_.get(i6).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.enumEntry_.size(); i7++) {
            if (!this.enumEntry_.get(i7).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo59682r0() && !this.inlineClassUnderlyingType_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo59684t0() && !this.typeTable_.isInitialized()) {
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

    /* renamed from: j0 */
    public final List<ProtoBuf$TypeAlias> mo59674j0() {
        return this.typeAlias_;
    }

    /* renamed from: k0 */
    public final List<ProtoBuf$TypeParameter> mo59675k0() {
        return this.typeParameter_;
    }

    /* renamed from: l0 */
    public final ProtoBuf$TypeTable mo59676l0() {
        return this.typeTable_;
    }

    /* renamed from: m0 */
    public final ProtoBuf$VersionRequirementTable mo59677m0() {
        return this.versionRequirementTable_;
    }

    /* renamed from: n0 */
    public final boolean mo59678n0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C23999b();
    }

    /* renamed from: o0 */
    public final boolean mo59679o0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: p0 */
    public final boolean mo59680p0() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: q0 */
    public final boolean mo59681q0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: r0 */
    public final boolean mo59682r0() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: s0 */
    public final boolean mo59683s0() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: t0 */
    public final boolean mo59684t0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final C24090h.C24091a toBuilder() {
        C23999b bVar = new C23999b();
        bVar.mo59688j(this);
        return bVar;
    }

    /* renamed from: u0 */
    public final boolean mo59685u0() {
        return (this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128;
    }

    /* renamed from: v0 */
    public final void mo59686v0() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.supertype_ = Collections.emptyList();
        this.supertypeId_ = Collections.emptyList();
        this.nestedClassName_ = Collections.emptyList();
        this.constructor_ = Collections.emptyList();
        this.function_ = Collections.emptyList();
        this.property_ = Collections.emptyList();
        this.typeAlias_ = Collections.emptyList();
        this.enumEntry_ = Collections.emptyList();
        this.sealedSubclassFqName_ = Collections.emptyList();
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ProtoBuf$Type.f60926b;
        this.inlineClassUnderlyingTypeId_ = 0;
        this.typeTable_ = ProtoBuf$TypeTable.f60972b;
        this.versionRequirement_ = Collections.emptyList();
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.f60995b;
    }

    public ProtoBuf$Class(int i) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v61, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX WARNING: type inference failed for: r16v4, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0314, code lost:
        r7 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Class(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r18, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r17.<init>()
            r4 = -1
            r1.supertypeIdMemoizedSerializedSize = r4
            r1.nestedClassNameMemoizedSerializedSize = r4
            r1.sealedSubclassFqNameMemoizedSerializedSize = r4
            r1.memoizedIsInitialized = r4
            r1.memoizedSerializedSize = r4
            r17.mo59686v0()
            vg0.a$b r4 = vg0.C25091a.m62862s()
            r5 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r6 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r4, r5)
            r7 = 0
            r8 = 0
        L_0x0022:
            r9 = 131072(0x20000, float:1.83671E-40)
            r10 = 16
            r11 = 8
            r5 = 64
            r15 = 32
            r14 = 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x03d2
            int r12 = r18.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r16 = 0
            switch(r12) {
                case 0: goto L_0x0310;
                case 8: goto L_0x0303;
                case 16: goto L_0x02e7;
                case 18: goto L_0x02b4;
                case 24: goto L_0x02a7;
                case 32: goto L_0x029a;
                case 42: goto L_0x0281;
                case 50: goto L_0x0267;
                case 56: goto L_0x024b;
                case 58: goto L_0x0217;
                case 66: goto L_0x01fb;
                case 74: goto L_0x01df;
                case 82: goto L_0x01c3;
                case 90: goto L_0x01a7;
                case 106: goto L_0x018b;
                case 128: goto L_0x016d;
                case 130: goto L_0x0137;
                case 136: goto L_0x012a;
                case 146: goto L_0x0101;
                case 152: goto L_0x00f4;
                case 242: goto L_0x00cb;
                case 248: goto L_0x00b0;
                case 250: goto L_0x007b;
                case 258: goto L_0x0040;
                default: goto L_0x0039;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x0039:
            r13 = 1
            boolean r5 = r1.mo59996m(r2, r6, r3, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0312
        L_0x0040:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 & r14
            if (r12 != r14) goto L_0x005d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = r1.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r13 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.mo59924i(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x005f
        L_0x0053:
            r2 = r0
            goto L_0x032b
        L_0x0056:
            r2 = r0
            goto L_0x0318
        L_0x0059:
            r0 = move-exception
            goto L_0x0053
        L_0x005b:
            r0 = move-exception
            goto L_0x0056
        L_0x005d:
            r13 = r16
        L_0x005f:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.f60996c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo60025g(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 == 0) goto L_0x0074
            r13.mo59924i(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = r13.mo59923h()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x0074:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | r14
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x007b:
            int r12 = r18.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r2.mo60022d(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13 = r8 & r9
            if (r13 == r9) goto L_0x0095
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x0095
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.versionRequirement_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | r9
        L_0x0095:
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x00ab
            java.util.List<java.lang.Integer> r13 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r16 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.add(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r14 = 128(0x80, float:1.794E-43)
            goto L_0x0095
        L_0x00ab:
            r2.mo60021c(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x00b0:
            r12 = r8 & r9
            if (r12 == r9) goto L_0x00bc
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.versionRequirement_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | r9
        L_0x00bc:
            java.util.List<java.lang.Integer> r12 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r13 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x00cb:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 & r5
            if (r12 != r5) goto L_0x00d6
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r12 = r1.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r16 = r12.mo59887m()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x00d6:
            r12 = r16
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.f60973c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r13 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.typeTable_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r12 == 0) goto L_0x00ed
            r12.mo59889i(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r12 = r12.mo59888h()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.typeTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x00ed:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | r5
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x00f4:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | r15
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.inlineClassUnderlyingTypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x0101:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 & r10
            if (r12 != r10) goto L_0x010c
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r12 = r1.inlineClassUnderlyingType_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r16 = r12.mo59840k0()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x010c:
            r12 = r16
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r13 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.inlineClassUnderlyingType_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r12 == 0) goto L_0x0123
            r12.mo59851j(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r12 = r12.mo59850i()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.inlineClassUnderlyingType_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x0123:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | r10
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x012a:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | r11
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.inlineClassUnderlyingPropertyName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x0137:
            int r12 = r18.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r2.mo60022d(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            r14 = 4096(0x1000, float:5.74E-42)
            if (r13 == r14) goto L_0x0154
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x0154
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.sealedSubclassFqName_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x0154:
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x0168
            java.util.List<java.lang.Integer> r13 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r14 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.add(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0154
        L_0x0168:
            r2.mo60021c(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x016d:
            r12 = r8 & 4096(0x1000, float:5.74E-42)
            r13 = 4096(0x1000, float:5.74E-42)
            if (r12 == r13) goto L_0x017c
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.sealedSubclassFqName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x017c:
            java.util.List<java.lang.Integer> r12 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r13 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x018b:
            r12 = r8 & 2048(0x800, float:2.87E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 == r13) goto L_0x019a
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.enumEntry_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 2048(0x800, float:2.87E-42)
        L_0x019a:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r12 = r1.enumEntry_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry.f60854c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x01a7:
            r12 = r8 & 1024(0x400, float:1.435E-42)
            r13 = 1024(0x400, float:1.435E-42)
            if (r12 == r13) goto L_0x01b6
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.typeAlias_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x01b6:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r12 = r1.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.f60951c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x01c3:
            r12 = r8 & 512(0x200, float:7.175E-43)
            r13 = 512(0x200, float:7.175E-43)
            if (r12 == r13) goto L_0x01d2
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.property_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 512(0x200, float:7.175E-43)
        L_0x01d2:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r12 = r1.property_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.f60898c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x01df:
            r12 = r8 & 256(0x100, float:3.59E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r12 == r13) goto L_0x01ee
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.function_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01ee:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r12 = r1.function_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.f60868c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x01fb:
            r12 = r8 & 128(0x80, float:1.794E-43)
            r13 = 128(0x80, float:1.794E-43)
            if (r12 == r13) goto L_0x020a
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.constructor_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 128(0x80, float:1.794E-43)
        L_0x020a:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r12 = r1.constructor_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor.f60837c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x0217:
            int r12 = r18.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r2.mo60022d(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13 = r8 & 64
            if (r13 == r5) goto L_0x0232
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x0232
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.nestedClassName_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 64
        L_0x0232:
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x0246
            java.util.List<java.lang.Integer> r13 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r14 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.add(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0232
        L_0x0246:
            r2.mo60021c(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x024b:
            r12 = r8 & 64
            if (r12 == r5) goto L_0x0258
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.nestedClassName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 64
        L_0x0258:
            java.util.List<java.lang.Integer> r12 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r13 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x0267:
            r12 = r8 & 16
            if (r12 == r10) goto L_0x0274
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.supertype_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 16
        L_0x0274:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r12 = r1.supertype_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x0281:
            r12 = r8 & 8
            if (r12 == r11) goto L_0x028e
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.typeParameter_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 8
        L_0x028e:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r1.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a r13 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.f60963c     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r13 = r2.mo60025g(r13, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x029a:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | 4
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.companionObjectName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x02a7:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12 = r12 | 2
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.fqName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x02b4:
            int r12 = r18.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r2.mo60022d(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13 = r8 & 32
            if (r13 == r15) goto L_0x02cf
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x02cf
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.supertypeId_ = r13     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 32
        L_0x02cf:
            int r13 = r18.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            if (r13 <= 0) goto L_0x02e3
            java.util.List<java.lang.Integer> r13 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r14 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13.add(r14)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x02cf
        L_0x02e3:
            r2.mo60021c(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0301
        L_0x02e7:
            r12 = r8 & 32
            if (r12 == r15) goto L_0x02f4
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.supertypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r8 = r8 | 32
        L_0x02f4:
            java.util.List<java.lang.Integer> r12 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r13 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r12.add(r13)     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
        L_0x0301:
            r13 = 1
            goto L_0x0315
        L_0x0303:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r13 = 1
            r12 = r12 | r13
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            int r12 = r18.mo60024f()     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            r1.flags_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0325, IOException -> 0x005b }
            goto L_0x0315
        L_0x0310:
            r13 = 1
            goto L_0x0314
        L_0x0312:
            if (r5 != 0) goto L_0x0315
        L_0x0314:
            r7 = 1
        L_0x0315:
            r5 = 1
            goto L_0x0022
        L_0x0318:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0059 }
            r3.<init>(r2)     // Catch:{ all -> 0x0059 }
            r3.mo60010b(r1)     // Catch:{ all -> 0x0059 }
            throw r3     // Catch:{ all -> 0x0059 }
        L_0x0325:
            r0 = move-exception
            r2 = r0
            r2.mo60010b(r1)     // Catch:{ all -> 0x0059 }
            throw r2     // Catch:{ all -> 0x0059 }
        L_0x032b:
            r3 = r8 & 32
            if (r3 != r15) goto L_0x0337
            java.util.List<java.lang.Integer> r3 = r1.supertypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertypeId_ = r3
        L_0x0337:
            r3 = r8 & 8
            if (r3 != r11) goto L_0x0343
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r3 = r1.typeParameter_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeParameter_ = r3
        L_0x0343:
            r3 = r8 & 16
            if (r3 != r10) goto L_0x034f
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r3 = r1.supertype_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertype_ = r3
        L_0x034f:
            r3 = r8 & 64
            if (r3 != r5) goto L_0x035b
            java.util.List<java.lang.Integer> r3 = r1.nestedClassName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.nestedClassName_ = r3
        L_0x035b:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r5) goto L_0x0369
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r3 = r1.constructor_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.constructor_ = r3
        L_0x0369:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 != r5) goto L_0x0377
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r3 = r1.function_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.function_ = r3
        L_0x0377:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r5 = 512(0x200, float:7.175E-43)
            if (r3 != r5) goto L_0x0385
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r3 = r1.property_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.property_ = r3
        L_0x0385:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r3 != r5) goto L_0x0393
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r3 = r1.typeAlias_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeAlias_ = r3
        L_0x0393:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r3 != r5) goto L_0x03a1
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r3 = r1.enumEntry_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.enumEntry_ = r3
        L_0x03a1:
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            r5 = 4096(0x1000, float:5.74E-42)
            if (r3 != r5) goto L_0x03af
            java.util.List<java.lang.Integer> r3 = r1.sealedSubclassFqName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.sealedSubclassFqName_ = r3
        L_0x03af:
            r3 = r8 & r9
            if (r3 != r9) goto L_0x03bb
            java.util.List<java.lang.Integer> r3 = r1.versionRequirement_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.versionRequirement_ = r3
        L_0x03bb:
            r6.mo59973i()     // Catch:{ IOException -> 0x03c8, all -> 0x03bf }
            goto L_0x03c8
        L_0x03bf:
            r0 = move-exception
            r2 = r0
            vg0.a r3 = r4.mo61632i()
            r1.unknownFields = r3
            throw r2
        L_0x03c8:
            vg0.a r3 = r4.mo61632i()
            r1.unknownFields = r3
            r17.mo59994k()
            throw r2
        L_0x03d2:
            r2 = r8 & 32
            if (r2 != r15) goto L_0x03de
            java.util.List<java.lang.Integer> r2 = r1.supertypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertypeId_ = r2
        L_0x03de:
            r2 = r8 & 8
            if (r2 != r11) goto L_0x03ea
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r2 = r1.typeParameter_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeParameter_ = r2
        L_0x03ea:
            r2 = r8 & 16
            if (r2 != r10) goto L_0x03f6
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.supertype_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertype_ = r2
        L_0x03f6:
            r2 = r8 & 64
            if (r2 != r5) goto L_0x0402
            java.util.List<java.lang.Integer> r2 = r1.nestedClassName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.nestedClassName_ = r2
        L_0x0402:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 != r3) goto L_0x0410
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r2 = r1.constructor_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.constructor_ = r2
        L_0x0410:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x041e
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r1.function_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.function_ = r2
        L_0x041e:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 != r3) goto L_0x042c
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r2 = r1.property_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.property_ = r2
        L_0x042c:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 != r3) goto L_0x043a
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r2 = r1.typeAlias_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeAlias_ = r2
        L_0x043a:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x0448
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r2 = r1.enumEntry_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.enumEntry_ = r2
        L_0x0448:
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L_0x0456
            java.util.List<java.lang.Integer> r2 = r1.sealedSubclassFqName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.sealedSubclassFqName_ = r2
        L_0x0456:
            r2 = r8 & r9
            if (r2 != r9) goto L_0x0462
            java.util.List<java.lang.Integer> r2 = r1.versionRequirement_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.versionRequirement_ = r2
        L_0x0462:
            r6.mo59973i()     // Catch:{ IOException -> 0x046f, all -> 0x0466 }
            goto L_0x046f
        L_0x0466:
            r0 = move-exception
            r2 = r0
            vg0.a r3 = r4.mo61632i()
            r1.unknownFields = r3
            throw r2
        L_0x046f:
            vg0.a r2 = r4.mo61632i()
            r1.unknownFields = r2
            r17.mo59994k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
