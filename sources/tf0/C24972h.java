package tf0;

import bf0.C21050d;
import bg0.C21051a;
import bg0.C21054c;
import ce0.C21100e;
import cg0.C21183m;
import com.moovit.database.sqlite.SQLiteDatabase;
import dh0.C23273b;
import eg0.C23290a;
import eg0.C23292c;
import eg0.C23295e;
import eg0.C23297g;
import eg0.C23298h;
import gg0.C23418c;
import hg0.C23467h;
import hh0.C23494g;
import ig0.C23596c;
import ig0.C23600e;
import java.lang.ref.WeakReference;
import kg0.C23777b;
import kg0.C23778c;
import kg0.C23782f;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23869d;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.C23922a;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C23978a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mf0.C24361g;
import mf0.C24362h;
import mh0.C24382g;
import mh0.C24384h;
import p269u2.C6677a;
import p583jk.C17875h;
import p988j$.util.concurrent.ConcurrentHashMap;
import pg0.C24695c;
import qg0.C24744e;
import qg0.C24745f;
import qg0.C24765o;
import tg0.C24991g;
import ug0.C25069e;
import wf0.C25142f;
import yf0.C25299f;
import zf0.C25443g0;

/* renamed from: tf0.h */
public final class C24972h {

    /* renamed from: a */
    public static final ConcurrentHashMap f63109a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C23297g m62667a(Class<?> cls) {
        C21051a aVar;
        C21054c cVar;
        C24362h.m61211f(cls, "<this>");
        ClassLoader d = ReflectClassUtilKt.m58952d(cls);
        C24981l lVar = new C24981l(d);
        ConcurrentHashMap concurrentHashMap = f63109a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(lVar);
        if (weakReference != null) {
            C23297g gVar = (C23297g) weakReference.get();
            if (gVar != null) {
                return gVar;
            }
            concurrentHashMap.remove(lVar, weakReference);
        }
        C23295e eVar = r2;
        C23295e eVar2 = new C23295e(d);
        ClassLoader classLoader = C21050d.class.getClassLoader();
        C24362h.m61210e(classLoader, "Unit::class.java.classLoader");
        C23295e eVar3 = new C23295e(classLoader);
        C23292c cVar2 = r3;
        C23292c cVar3 = new C23292c(d);
        String k = C24362h.m61216k(d, "runtime module for ");
        C24361g gVar2 = C24361g.f61676e;
        C24361g gVar3 = gVar2;
        C23298h hVar = C23298h.f59081a;
        C24362h.m61211f(k, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = r13;
        LockBasedStorageManager lockBasedStorageManager2 = new LockBasedStorageManager("RuntimeModuleData");
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager2, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
        C23909c cVar4 = r10;
        C23909c cVar5 = new C23909c(C25069e.m62822k('<' + k + '>'), lockBasedStorageManager2, jvmBuiltIns, 56);
        lockBasedStorageManager2.mo60219j(new C25142f(jvmBuiltIns, cVar5));
        jvmBuiltIns.mo59407M(cVar5);
        C23978a aVar2 = r0;
        C23978a aVar3 = new C23978a();
        C23782f fVar = r5;
        C23782f fVar2 = new C23782f();
        C24981l lVar2 = lVar;
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager2, cVar5);
        C24765o.C24766a aVar4 = C24765o.C24766a.f62664a;
        C23295e eVar4 = eVar3;
        C23922a aVar5 = r4;
        C24361g gVar4 = gVar2;
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.f60552d;
        JavaTypeEnhancementState javaTypeEnhancementState2 = javaTypeEnhancementState;
        C23922a aVar6 = new C23922a(lockBasedStorageManager2, javaTypeEnhancementState);
        C23978a aVar7 = aVar3;
        C23782f fVar3 = fVar2;
        C23295e eVar5 = eVar2;
        C23909c cVar6 = cVar5;
        C23600e.C23601a aVar8 = C23600e.f59678a;
        JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
        C23596c.C23597a aVar9 = C23596c.C23597a.f59676a;
        C23777b bVar = r5;
        LockBasedStorageManager lockBasedStorageManager3 = lockBasedStorageManager2;
        C23273b bVar2 = r0;
        LockBasedStorageManager lockBasedStorageManager4 = lockBasedStorageManager;
        EmptyList emptyList = EmptyList.f60173b;
        C23273b bVar3 = new C23273b(lockBasedStorageManager3, emptyList);
        C25443g0.C25444a aVar10 = C25443g0.C25444a.f63738a;
        C23418c.C23419a aVar11 = C23418c.C23419a.f59200a;
        C23869d dVar = r0;
        C23869d dVar2 = new C23869d(cVar6, notFoundClasses);
        SignatureEnhancement signatureEnhancement = r0;
        C23778c.C23779a aVar12 = C23778c.C23779a.f60079a;
        SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(aVar6, javaTypeEnhancementState, new C24695c());
        C23467h.C23468a aVar13 = C23467h.C23468a.f59250a;
        C24382g.f61723b.getClass();
        C24384h hVar2 = C24382g.C24383a.f61725b;
        C21100e eVar6 = r3;
        C21100e eVar7 = new C21100e();
        EmptyList emptyList2 = emptyList;
        LockBasedStorageManager lockBasedStorageManager5 = lockBasedStorageManager3;
        C23777b bVar4 = new C23777b(lockBasedStorageManager4, cVar2, eVar, aVar2, aVar8, gVar3, aVar9, bVar2, hVar, fVar, aVar4, aVar10, aVar11, cVar4, dVar, aVar5, signatureEnhancement, aVar13, aVar12, hVar2, javaTypeEnhancementState2, eVar6);
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(bVar);
        C23978a aVar14 = aVar7;
        C23295e eVar8 = eVar5;
        C24745f fVar4 = new C24745f(eVar8, aVar14);
        C24744e eVar9 = new C24744e(cVar6, notFoundClasses, lockBasedStorageManager5, eVar8);
        C23867c cVar7 = cVar6.f60515e;
        JvmBuiltIns jvmBuiltIns3 = null;
        if (cVar7 instanceof JvmBuiltIns) {
            jvmBuiltIns3 = (JvmBuiltIns) cVar7;
        }
        C17875h hVar3 = C17875h.f45861e;
        if (jvmBuiltIns3 == null) {
            aVar = C21051a.C21052a.f52857a;
        } else {
            aVar = jvmBuiltIns3.mo59406L();
        }
        C21051a aVar15 = aVar;
        if (jvmBuiltIns3 == null) {
            cVar = C21054c.C21056b.f52859a;
        } else {
            cVar = jvmBuiltIns3.mo59406L();
        }
        LockBasedStorageManager lockBasedStorageManager6 = lockBasedStorageManager5;
        C23909c cVar8 = cVar6;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        C24361g gVar5 = gVar4;
        EmptyList emptyList3 = emptyList2;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        C23494g gVar6 = new C23494g(lockBasedStorageManager6, cVar8, fVar4, eVar9, lazyJavaPackageFragmentProvider2, gVar5, hVar3, emptyList3, notFoundClasses2, aVar15, cVar, C24991g.f63134a, hVar2, new C23273b(lockBasedStorageManager5, emptyList2), SQLiteDatabase.OPEN_PRIVATECACHE);
        aVar14.f60762a = gVar6;
        C6677a aVar16 = new C6677a(lazyJavaPackageFragmentProvider);
        fVar3.f60085a = aVar16;
        JvmBuiltInsCustomizer L = jvmBuiltIns2.mo59406L();
        C23494g gVar7 = gVar6;
        C23978a aVar17 = aVar14;
        NotFoundClasses notFoundClasses3 = notFoundClasses;
        C23295e eVar10 = eVar8;
        C25299f fVar5 = new C25299f(lockBasedStorageManager5, eVar4, cVar6, notFoundClasses3, L, jvmBuiltIns2.mo59406L(), hVar2, new C23273b(lockBasedStorageManager5, emptyList2));
        cVar6.mo59459l0(cVar6);
        cVar6.f60519i = new C21183m(C17875h.m44281E((LazyJavaPackageFragmentProvider) aVar16.f20758b, fVar5), C24362h.m61216k(cVar6, "CompositeProvider@RuntimeModuleData for "));
        C23297g gVar8 = new C23297g(gVar7, new C23290a(aVar17, eVar10));
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = f63109a;
            C24981l lVar3 = lVar2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap2.putIfAbsent(lVar3, new WeakReference(gVar8));
            if (weakReference2 == null) {
                return gVar8;
            }
            C23297g gVar9 = (C23297g) weakReference2.get();
            if (gVar9 != null) {
                return gVar9;
            }
            concurrentHashMap2.remove(lVar3, weakReference2);
            lVar2 = lVar3;
        }
    }
}
