package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p389bl.C13641g;
import p626lf.C18201b;
import p810sz.C19575a;
import p810sz.C19576b;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20964s0;
import t00.C19623b;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.n */
public final class C20029n implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50866a;

    public /* synthetic */ C20029n(int i) {
        this.f50866a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        C13272f m2;
        ArrayList arrayList;
        C13272f m3;
        int i = this.f50866a;
        switch (i) {
            case 0:
                Context context = eVar.f33852a;
                if (UserContextLoader.m40004l(context)) {
                    Pattern compile = Pattern.compile("favorite_lines_([0-9]+)\\.dat");
                    Pattern compile2 = Pattern.compile("favorite_stops_([0-9]+)\\.dat");
                    String[] list = context.getFilesDir().list();
                    C19576b a = C19576b.m46958a(ServerId.f15140e);
                    C19575a a2 = C19575a.m46957a(ServerId.f15141f, false);
                    for (String str : list) {
                        Matcher matcher = compile.matcher(str);
                        Matcher matcher2 = compile2.matcher(str);
                        if ((matcher.matches() || matcher2.matches()) && (arrayList = (ArrayList) C13641g.m34133v(context, str, a2)) != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
                            if (arrayList.size() != linkedHashSet.size()) {
                                arrayList.clear();
                                arrayList.addAll(linkedHashSet);
                            }
                            C13641g.m34136y(context, str, arrayList, a);
                        }
                    }
                    return;
                }
                return;
            case 1:
                Context context2 = eVar.f33852a;
                if (UserContextLoader.m40004l(context2) && (m3 = UserContextLoader.m40005m(context2)) != null && !C20964s0.m49090h(m3.f32925a)) {
                    C18201b.m44928z(context2, m3.f32925a);
                    return;
                }
                return;
            case 2:
                return;
            default:
                Context context3 = eVar.f33852a;
                C19722a0 a0Var = null;
                switch (i) {
                    case 2:
                        if (UserContextLoader.m40004l(context3) && (m2 = UserContextLoader.m40005m(context3)) != null) {
                            a0Var = new C19722a0(m2);
                            break;
                        }
                    default:
                        if (UserContextLoader.m40004l(context3) && (m = UserContextLoader.m40005m(context3)) != null) {
                            a0Var = new C19722a0(m);
                            break;
                        }
                }
                if (a0Var != null && a0Var.f50160a.f32927c.f15142b == 362) {
                    C19623b c = C19731i.m47197a(context3).f50175e.mo51800c();
                    ServerId serverId = a0Var.f50160a.f32927c;
                    c.getClass();
                    C19623b.m47058d(context3, serverId);
                    return;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f50866a) {
            case 0:
                return "Upgrader240To241";
            case 1:
                return "Upgrader336To337";
            case 2:
                return "Upgrader401To402";
            default:
                return "Upgrader437To438";
        }
    }
}
