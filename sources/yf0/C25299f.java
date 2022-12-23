package yf0;

import com.moovit.database.sqlite.SQLiteDatabase;
import dh0.C23273b;
import eg0.C23295e;
import hh0.C23485b;
import hh0.C23494g;
import hh0.C23498j;
import hh0.C23500l;
import hh0.C23502m;
import ih0.C23603a;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C23882a;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C24125a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mf0.C24362h;
import mh0.C24384h;
import p583jk.C17875h;
import xf0.C25249a;

/* renamed from: yf0.f */
public final class C25299f extends C24125a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25299f(LockBasedStorageManager lockBasedStorageManager, C23295e eVar, C23909c cVar, NotFoundClasses notFoundClasses, JvmBuiltInsCustomizer jvmBuiltInsCustomizer, JvmBuiltInsCustomizer jvmBuiltInsCustomizer2, C24384h hVar, C23273b bVar) {
        super(lockBasedStorageManager, eVar, cVar);
        LockBasedStorageManager lockBasedStorageManager2 = lockBasedStorageManager;
        C23909c cVar2 = cVar;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer3 = jvmBuiltInsCustomizer;
        C24362h.m61211f(jvmBuiltInsCustomizer3, "additionalClassPartsProvider");
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer4 = jvmBuiltInsCustomizer2;
        C24362h.m61211f(jvmBuiltInsCustomizer4, "platformDependentDeclarationFilter");
        C24384h hVar2 = hVar;
        C24362h.m61211f(hVar2, "kotlinTypeChecker");
        C23498j jVar = new C23498j(this);
        C23603a aVar = C23603a.f59679m;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        C23494g gVar = r0;
        C23494g gVar2 = new C23494g(lockBasedStorageManager2, cVar2, jVar, new C23485b(cVar2, notFoundClasses2, aVar), this, C23500l.f59341f0, C23502m.C23503a.f59342b, C17875h.m44281E(new C25249a(lockBasedStorageManager2, cVar2), new C23882a(lockBasedStorageManager2, cVar2)), notFoundClasses2, jvmBuiltInsCustomizer3, jvmBuiltInsCustomizer4, aVar.f59201a, hVar2, bVar, SQLiteDatabase.OPEN_PRIVATECACHE);
        this.f61256d = gVar;
    }
}
