package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import hh0.C23494g;
import hh0.C23499k;
import hh0.C23508q;
import jh0.C23730d;
import jh0.C23732f;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import sg0.C24871a;
import sg0.C24877d;
import ug0.C25066c;
import zf0.C25485t;

public abstract class DeserializedPackageFragmentImpl extends C23499k {

    /* renamed from: h */
    public final C24871a f61235h;

    /* renamed from: i */
    public final C23730d f61236i = null;

    /* renamed from: j */
    public final C24877d f61237j;

    /* renamed from: k */
    public final C23508q f61238k;

    /* renamed from: l */
    public ProtoBuf$PackageFragment f61239l;

    /* renamed from: m */
    public C23732f f61240m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(C25066c cVar, C23792h hVar, C25485t tVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, C24871a aVar) {
        super(cVar, hVar, tVar);
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(tVar, "module");
        this.f61235h = aVar;
        ProtoBuf$StringTable z = protoBuf$PackageFragment.mo59765z();
        C24362h.m61210e(z, "proto.strings");
        ProtoBuf$QualifiedNameTable y = protoBuf$PackageFragment.mo59764y();
        C24362h.m61210e(y, "proto.qualifiedNames");
        C24877d dVar = new C24877d(z, y);
        this.f61237j = dVar;
        this.f61238k = new C23508q(protoBuf$PackageFragment, dVar, aVar, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.f61239l = protoBuf$PackageFragment;
    }

    /* renamed from: N0 */
    public final void mo60189N0(C23494g gVar) {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f61239l;
        if (protoBuf$PackageFragment != null) {
            this.f61239l = null;
            ProtoBuf$Package x = protoBuf$PackageFragment.mo59763x();
            C24362h.m61210e(x, "proto.`package`");
            this.f61240m = new C23732f(this, x, this.f61237j, this.f61235h, this.f61236i, gVar, C24362h.m61216k(this, "scope of "), new DeserializedPackageFragmentImpl$initialize$1(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: l0 */
    public final C23508q mo58616l0() {
        return this.f61238k;
    }

    /* renamed from: o */
    public final MemberScope mo53528o() {
        C23732f fVar = this.f61240m;
        if (fVar != null) {
            return fVar;
        }
        C24362h.m61217l("_memberScope");
        throw null;
    }
}
