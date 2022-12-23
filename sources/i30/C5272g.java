package i30;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.metroentities.MetroEntityType;
import i30.C5265a;
import i30.C5266b;
import java.util.ArrayList;
import p358af.C13437d;
import p906wz.C20430b;
import p906wz.C20431c;

/* renamed from: i30.g */
public abstract class C5272g<RQ extends C5265a<RQ, RS>, RS extends C5266b<RQ, RS>> extends C20430b<RQ, RS> {

    /* renamed from: i30.g$a */
    public static /* synthetic */ class C5273a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17423a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.metroentities.MetroEntityType[] r0 = com.moovit.metroentities.MetroEntityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17423a = r0
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_PATTERN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.BICYCLE_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.SHAPE_SEGMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17423a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.moovit.metroentities.MetroEntityType r1 = com.moovit.metroentities.MetroEntityType.TRANSIT_FREQUENCIES     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i30.C5272g.C5273a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final void mo21077b(C20431c cVar, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        C5265a aVar = (C5265a) cVar;
        C5268d a = C5268d.m13299a(arrayList);
        if (arrayList2.isEmpty()) {
            C5269e eVar = aVar.f17398x;
            for (MetroEntityType next : eVar.mo21069e()) {
                int size = eVar.mo21068d(next).size();
                switch (C5273a.f17423a[next.ordinal()]) {
                    case 1:
                        i = a.f17406c.size();
                        continue;
                    case 2:
                        i = a.f17405b.size();
                        continue;
                    case 3:
                        i = a.f17404a.size();
                        continue;
                    case 4:
                        i = a.f17407d.size();
                        continue;
                    case 5:
                        i = a.f17408e.size();
                        continue;
                    case 6:
                        i = a.f17409f.size();
                        continue;
                    case 7:
                        i = a.f17410g.size();
                        continue;
                    case 8:
                        i = a.f17411h.size();
                        continue;
                    default:
                        throw new ApplicationBugException("Unknown entity type: " + next);
                }
                if (i < size) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Server returned less entities of type ");
                    sb.append(next);
                    sb.append(" (");
                    sb.append(i);
                    sb.append(") than requested (");
                    throw new BadResponseException(C13437d.m33707l(sb, size, ")"));
                }
            }
        }
        mo21078e(aVar, a, arrayList2);
    }

    /* renamed from: e */
    public abstract void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList);
}
