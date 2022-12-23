package kotlin.reflect.jvm.internal;

import cf0.C21132f;
import cg0.C21187p;
import ch0.C21203b;
import com.google.android.play.core.assetpacks.C14256d1;
import eg0.C23290a;
import eg0.C23293d;
import eg0.C23297g;
import eh0.C23301b;
import java.util.ArrayList;
import java.util.List;
import jh0.C23732f;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import mf0.C24362h;
import p583jk.C17875h;
import p988j$.util.concurrent.ConcurrentHashMap;
import qg0.C24757k;
import sf0.C24866j;
import tf0.C24973i;
import ug0.C25065b;
import ug0.C25066c;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KPackageImpl$Data$scope$2 extends Lambda implements C24225a<MemberScope> {
    public final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$scope$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Object invoke() {
        List<C24757k> list;
        C24973i.C24974a aVar = this.this$0.f60242c;
        boolean z = false;
        C24866j<Object> jVar = KPackageImpl.Data.f60241g[0];
        C23293d dVar = (C23293d) aVar.invoke();
        if (dVar == null) {
            return MemberScope.C24119a.f61217b;
        }
        C24973i.C24974a aVar2 = this.this$0.f60226a;
        C24866j<Object> jVar2 = KDeclarationContainerImpl.Data.f60225b[0];
        Object invoke = aVar2.invoke();
        C24362h.m61210e(invoke, "<get-moduleData>(...)");
        C23290a aVar3 = ((C23297g) invoke).f59080b;
        aVar3.getClass();
        ConcurrentHashMap<C25065b, MemberScope> concurrentHashMap = aVar3.f59071c;
        C25065b d = dVar.mo58421d();
        MemberScope memberScope = concurrentHashMap.get(d);
        if (memberScope == null) {
            C25066c h = dVar.mo58421d().mo61574h();
            C24362h.m61210e(h, "fileClass.classId.packageFqName");
            KotlinClassHeader kotlinClassHeader = dVar.f59075b;
            KotlinClassHeader.Kind kind = kotlinClassHeader.f60764a;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            if (kind == kind2) {
                String[] strArr = kotlinClassHeader.f60766c;
                if (kind == kind2) {
                    z = true;
                }
                List<String> list2 = null;
                if (!z) {
                    strArr = null;
                }
                if (strArr != null) {
                    list2 = C21132f.m49428K0(strArr);
                }
                if (list2 == null) {
                    list2 = EmptyList.f60173b;
                }
                ArrayList arrayList = new ArrayList();
                for (String c : list2) {
                    C24757k b = C14256d1.m35484b(aVar3.f59070b, C25065b.m62790l(new C25066c(C21203b.m49812c(c).f53136a.replace('/', '.'))));
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                list = arrayList;
            } else {
                list = C17875h.m44280D(dVar);
            }
            C21187p pVar = new C21187p(aVar3.f59069a.mo59585c().f59312b, h);
            ArrayList arrayList2 = new ArrayList();
            for (C24757k a : list) {
                C23732f a2 = aVar3.f59069a.mo59583a(pVar, a);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            memberScope = C23301b.C23302a.m57389a("package " + h + " (" + dVar + ')', C23825c.m58499K0(arrayList2));
            MemberScope putIfAbsent = concurrentHashMap.putIfAbsent(d, memberScope);
            if (putIfAbsent != null) {
                memberScope = putIfAbsent;
            }
        }
        C24362h.m61210e(memberScope, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return memberScope;
    }
}
