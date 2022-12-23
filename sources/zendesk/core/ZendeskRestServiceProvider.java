package zendesk.core;

import ck0.C21261p;
import ck0.C21268s;
import hi0.C23558r;
import hi0.C23566v;
import java.util.ArrayList;
import java.util.concurrent.Executor;

class ZendeskRestServiceProvider implements RestServiceProvider {
    private final C23566v mediaHttpClient;
    public final C21268s retrofit;
    public final C23566v standardOkHttpClient;

    public ZendeskRestServiceProvider(C21268s sVar, C23566v vVar, C23566v vVar2, C23566v vVar3) {
        this.retrofit = sVar;
        this.mediaHttpClient = vVar;
        this.standardOkHttpClient = vVar2;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2) {
        C21268s sVar = this.retrofit;
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C21261p pVar = C21261p.f53214a;
        C23558r rVar = sVar.f53233c;
        arrayList.addAll(sVar.f53234d);
        arrayList2.addAll(sVar.f53235e);
        arrayList2.remove(arrayList2.size() - 1);
        Executor executor = sVar.f53236f;
        boolean z = sVar.f53237g;
        C23566v vVar = this.standardOkHttpClient;
        vVar.getClass();
        C23566v.C23568b bVar = new C23566v.C23568b(vVar);
        bVar.mo58715a(new UserAgentAndClientHeadersInterceptor(str, str2));
        C23566v vVar2 = new C23566v(bVar);
        if (rVar != null) {
            Executor b = executor == null ? pVar.mo53604b() : executor;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(pVar.mo53603a(b));
            return new C21268s(vVar2, rVar, new ArrayList(arrayList), arrayList3, b, z).mo53617b(cls);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public C23566v getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        C23566v vVar = this.standardOkHttpClient;
        vVar.getClass();
        C23566v.C23568b bVar = new C23566v.C23568b(vVar);
        customNetworkConfig.configureOkHttpClient(bVar);
        bVar.mo58715a(new UserAgentAndClientHeadersInterceptor(str, str2));
        C21268s sVar = this.retrofit;
        sVar.getClass();
        C21268s.C21270b bVar2 = new C21268s.C21270b(sVar);
        customNetworkConfig.configureRetrofit(bVar2);
        bVar2.mo53625c(new C23566v(bVar));
        return bVar2.mo53624b().mo53617b(cls);
    }
}
