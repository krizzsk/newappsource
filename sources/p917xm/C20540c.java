package p917xm;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13872r;
import p443dm.C16675a;
import p465ek.C16833a;
import p465ek.C16834b;
import p465ek.C16835c;
import p513gk.C17200a;
import p540hn.C17462c;
import p561ik.C17618a;
import p583jk.C17873f;
import p725pj.C18926a;
import p728pm.C18933a;
import p774rn.C19292b;
import p795sk.C19468a;
import p798sn.C19495c;
import p865vi.C20142a;
import p870vn.C20169i;
import p870vn.C20172l;
import p891wk.C20344a;
import p891wk.C20350e;
import p891wk.C20351f;
import p891wk.C20362q;
import p891wk.C20363r;
import p891wk.C20365t;
import p891wk.C20366u;
import p891wk.C20367v;
import p891wk.C20368w;
import p891wk.C20369x;
import p915xk.C20534a;
import p917xm.C20538b;
import p939yl.C20742c;
import p939yl.C20743d;
import p939yl.C20744e;
import p964zm.C20876b;

/* renamed from: xm.c */
public final class C20540c {

    /* renamed from: a */
    public final C20537a f51961a;

    /* renamed from: b */
    public final C20538b.C20539a f51962b;

    /* renamed from: c */
    public final C17462c f51963c;

    /* renamed from: d */
    public final C20142a f51964d;

    /* renamed from: e */
    public final C20169i f51965e;

    /* renamed from: f */
    public final C18933a f51966f;

    /* renamed from: g */
    public final C17873f f51967g;

    /* renamed from: h */
    public final C20744e f51968h;

    public C20540c(C20537a aVar, C20538b.C20539a aVar2, C17462c cVar, C20142a aVar3, C20169i iVar, C18933a aVar4, C17873f fVar, C20744e eVar) {
        this.f51961a = aVar;
        this.f51962b = aVar2;
        this.f51963c = cVar;
        this.f51964d = aVar3;
        this.f51965e = iVar;
        this.f51966f = aVar4;
        this.f51967g = fVar;
        this.f51968h = eVar;
    }

    /* renamed from: a */
    public static C13487h m48258a(C18926a aVar) {
        return new C13487h(null, new C16833a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS)));
    }

    /* renamed from: b */
    public final C13487h<C19495c> mo52740b() {
        C13487h hVar;
        C13487h<C19495c> a;
        boolean z;
        Integer num;
        C13487h hVar2;
        C19468a aVar;
        C20537a aVar2 = this.f51961a;
        aVar2.getClass();
        try {
            List<String> list = aVar2.f51942d.mo51447a().f51528a;
            if (aVar2.f51945g.intValue() != aVar2.f51942d.mo51447a().f51529b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C13487h b = aVar2.f51941c.mo42802b(list, true);
                if (!b.mo40399a()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = ((List) b.f33365a).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hVar = new C13487h(new C20350e(hashMap), (C18926a) null);
                            break;
                        }
                        C20362q qVar = (C20362q) it.next();
                        C13487h<List<C19292b>> a2 = aVar2.f51940b.mo40780a(qVar.f51581C);
                        if (a2.mo40399a()) {
                            hVar = new C13487h(null, new C16834b(a2.f33366b, C16834b.f43810e, "Unable to load sync data"));
                            break;
                        }
                        List<C19292b> list2 = (List) a2.f33365a;
                        ArrayList arrayList = new ArrayList(list2.size());
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        for (C19292b bVar : list2) {
                            long longValue = bVar.f49048b.longValue();
                            arrayList.add(Long.valueOf(longValue));
                            C20876b bVar2 = aVar2.f51943e;
                            C13872r<byte[]> d = bVar2.f52610a.mo40787d(C21100e.m49328W(), C20876b.m48871a(longValue, qVar.f51581C));
                            if (d.mo40817a()) {
                                hVar2 = new C13487h(null, new C17200a(d.f34120b, C17200a.f44445h, "Read extra activation information failed"));
                            } else {
                                S s = d.f34119a;
                                if (s == null) {
                                    hVar2 = new C13487h(new C20534a(), (C18926a) null);
                                } else {
                                    try {
                                        hVar2 = new C13487h((C20534a) bVar2.f52611b.mo52732a(C20534a.class, new String((byte[]) s, StandardCharsets.UTF_8)), (C18926a) null);
                                    } catch (JSONException e) {
                                        hVar2 = new C13487h(null, new C17618a(e.getMessage()));
                                    }
                                }
                            }
                            if (hVar2.mo40399a()) {
                                aVar2.f51944f.mo52737a(hVar2.f33366b);
                                aVar = null;
                            } else {
                                aVar = ((C20534a) hVar2.f33365a).f51925a;
                            }
                            arrayList2.add(new C20363r(longValue, aVar));
                        }
                        String str = qVar.f51581C;
                        String brokerName = qVar.f51582D.getBrokerName();
                        C20344a aVar3 = qVar.f51608n;
                        Integer num2 = aVar3.f51512g;
                        if (num2 == null) {
                            num = -1;
                        } else {
                            num = Integer.valueOf(Math.max(num2.intValue() - aVar3.f51510e.intValue(), 0));
                        }
                        hashMap.put(qVar, new C20365t(arrayList, arrayList2, str, brokerName, num));
                    }
                } else {
                    hVar = new C13487h(null, new C16834b(b.f33366b, C16834b.f43810e, "Unable to load sync data"));
                }
            } else {
                hVar = new C13487h(new C20350e(Collections.emptyMap()), (C18926a) null);
            }
        } catch (ConvertedErrorException e2) {
            aVar2.f51939a.getClass();
            C18926a b2 = C17873f.m44275b(e2);
            if (b2.mo51438a(C16835c.f43820m.intValue(), "ticket.access")) {
                aVar2.f51944f.mo52737a(b2);
                hVar = new C13487h(new C20350e(Collections.emptyMap()), (C18926a) null);
            } else {
                hVar = new C13487h(null, new C16834b(b2, C16834b.f43810e, "Unable to load sync data"));
            }
        }
        C20744e eVar = this.f51968h;
        eVar.f52346e.mo40390a(new C20742c(eVar), CallBackOn.BACKGROUND_THREAD, new C20743d());
        if (hVar.mo40399a()) {
            return m48258a(hVar.f33366b);
        }
        C20350e eVar2 = (C20350e) hVar.f33365a;
        C20366u uVar = new C20366u();
        C20367v vVar = new C20367v();
        vVar.f51642a = new ArrayList(eVar2.f51527a.values());
        uVar.f51641b = vVar;
        C13487h C = this.f51964d.mo50642a(uVar).mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C16675a("ticket.sync", new HashMap()).mo49399a(C.f33366b));
        }
        C20368w wVar = (C20368w) C.f33365a;
        C20369x xVar = wVar.f51643d;
        C20538b.C20539a aVar4 = this.f51962b;
        C13487h<Void> C2 = new C20538b(aVar4.f51955a, aVar4.f51956b, aVar4.f51957c, aVar4.f51958d, aVar4.f51959e, aVar4.f51960f, eVar2, xVar.f51644a, new HashSet(xVar.f51645b)).mo40394C();
        if (C2.mo40399a()) {
            a = m48258a(C2.f33366b);
        } else {
            try {
                String str2 = wVar.f49976a.f49998b;
                C18933a aVar5 = this.f51966f;
                C20351f a3 = aVar5.mo51447a();
                C13487h a4 = aVar5.f48217b.mo52058a(new C20351f(a3.f51529b, aVar5.f48218c.mo49402a(), a3.f51528a, str2));
                if (!a4.mo40399a()) {
                    C13487h<C19495c> C3 = this.f51963c.mo40394C();
                    if (C3.mo40399a()) {
                        a = m48258a(C3.f33366b);
                    } else {
                        this.f51965e.mo52410a(new C20172l((C19495c) C3.f33365a));
                        return new C13487h<>(C3.f33365a, (C18926a) null);
                    }
                } else {
                    C17873f fVar = aVar5.f48219d;
                    C18926a aVar6 = a4.f33366b;
                    fVar.getClass();
                    throw C17873f.m44274a(aVar6);
                }
            } catch (ConvertedErrorException e3) {
                this.f51967g.getClass();
                a = m48258a(C17873f.m44275b(e3));
            }
        }
        return a;
    }
}
