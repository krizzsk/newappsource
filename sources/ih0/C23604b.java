package ih0;

import java.io.InputStream;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import mf0.C24362h;
import p584jl.C17885a;
import rg0.C24810a;
import ug0.C25066c;
import wf0.C25137a;
import zf0.C25485t;

/* renamed from: ih0.b */
public final class C23604b extends DeserializedPackageFragmentImpl implements C25137a {

    /* renamed from: ih0.b$a */
    public static final class C23605a {
        /* renamed from: a */
        public static C23604b m57790a(C25066c cVar, C23792h hVar, C25485t tVar, InputStream inputStream, boolean z) {
            C24090h hVar2;
            C24362h.m61211f(cVar, "fqName");
            C24362h.m61211f(hVar, "storageManager");
            C24362h.m61211f(tVar, "module");
            try {
                C24810a aVar = C24810a.f62743f;
                C24810a a = C24810a.C24811a.m62340a(inputStream);
                C24810a aVar2 = C24810a.f62743f;
                if (a.mo61342b(aVar2)) {
                    C24079d dVar = C23603a.f59679m.f59201a;
                    ProtoBuf$PackageFragment.C24019a aVar3 = ProtoBuf$PackageFragment.f60891c;
                    aVar3.getClass();
                    C24078c cVar2 = new C24078c(inputStream);
                    hVar2 = (C24090h) aVar3.mo59643a(cVar2, dVar);
                    cVar2.mo60019a(0);
                    C24077b.m60077b(hVar2);
                    ProtoBuf$PackageFragment protoBuf$PackageFragment = (ProtoBuf$PackageFragment) hVar2;
                    C17885a.m44462t(inputStream, (Throwable) null);
                    C24362h.m61210e(protoBuf$PackageFragment, "proto");
                    return new C23604b(cVar, hVar, tVar, protoBuf$PackageFragment, a);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + a + ". Please update Kotlin");
            } catch (InvalidProtocolBufferException e) {
                e.mo60010b(hVar2);
                throw e;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C17885a.m44462t(inputStream, th);
                    throw th2;
                }
            }
        }
    }

    public C23604b(C25066c cVar, C23792h hVar, C25485t tVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, C24810a aVar) {
        super(cVar, hVar, tVar, protoBuf$PackageFragment, aVar);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("builtins package fragment for ");
        k.append(this.f53008f);
        k.append(" from ");
        k.append(DescriptorUtilsKt.m60289j(this));
        return k.toString();
    }
}
