package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import bg0.C21051a;
import bg0.C21053b;
import bg0.C21054c;
import cf0.C21136j;
import dh0.C23273b;
import hh0.C23485b;
import hh0.C23494g;
import hh0.C23498j;
import hh0.C23500l;
import hh0.C23502m;
import ih0.C23603a;
import ih0.C23604b;
import ih0.C23606c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import mf0.C24362h;
import mh0.C24384h;
import ug0.C25066c;
import zf0.C25485t;
import zf0.C25487v;

public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* renamed from: b */
    public final C23606c f61259b = new C23606c();

    /* renamed from: a */
    public C25487v mo59372a(C23792h hVar, C25485t tVar, Iterable<? extends C21053b> iterable, C21054c cVar, C21051a aVar, boolean z) {
        C23792h hVar2 = hVar;
        C25485t tVar2 = tVar;
        C24362h.m61211f(hVar2, "storageManager");
        C24362h.m61211f(tVar2, "builtInsModule");
        C24362h.m61211f(iterable, "classDescriptorFactories");
        C24362h.m61211f(cVar, "platformDependentDeclarationFilter");
        C24362h.m61211f(aVar, "additionalClassPartsProvider");
        Set<C25066c> set = C23872e.f60334m;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f61259b);
        C24362h.m61211f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(set, 10));
        for (C25066c cVar2 : set) {
            C23603a.f59679m.getClass();
            String a = C23603a.m57789a(cVar2);
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke(a);
            if (inputStream != null) {
                arrayList.add(C23604b.C23605a.m57790a(cVar2, hVar2, tVar2, inputStream, z));
            } else {
                throw new IllegalStateException(C24362h.m61216k(a, "Resource not found in classpath: "));
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(hVar2, tVar2);
        C23498j jVar = new C23498j(packageFragmentProviderImpl);
        C23603a aVar2 = C23603a.f59679m;
        C23485b bVar = new C23485b(tVar2, notFoundClasses, aVar2);
        C23500l.C23501a aVar3 = C23500l.f59341f0;
        C23502m.C23503a aVar4 = C23502m.C23503a.f59342b;
        C23494g gVar = r0;
        C24079d dVar = aVar2.f59201a;
        PackageFragmentProviderImpl packageFragmentProviderImpl2 = packageFragmentProviderImpl;
        C23494g gVar2 = new C23494g(hVar, tVar, jVar, bVar, packageFragmentProviderImpl, aVar3, aVar4, iterable, notFoundClasses, aVar, cVar, dVar, (C24384h) null, new C23273b(hVar2, EmptyList.f60173b), 327680);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C23604b) it.next()).mo60189N0(gVar);
        }
        return packageFragmentProviderImpl2;
    }
}
