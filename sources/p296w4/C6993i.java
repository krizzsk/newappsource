package p296w4;

import com.google.android.play.core.appupdate.C14226d;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import p066e0.C4436j0;
import p070e4.C4548c;
import p070e4.C4550e;
import p257t3.C6557a;
import p283v4.C6859d;

/* renamed from: w4.i */
public final class C6993i {

    /* renamed from: a */
    public static PrintStream f21762a = System.out;

    /* renamed from: b */
    public static C6984b f21763b = new C6984b();

    /* renamed from: a */
    public static void m16476a(StringBuilder sb, String str, C6859d dVar) {
        String str2;
        StringBuilder sb2;
        String str3;
        if (dVar.mo23115e()) {
            sb2 = C13555b.m33972k(str);
            str2 = "+ ";
        } else {
            sb2 = C13555b.m33972k(str);
            str2 = "|-";
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        C6984b bVar = f21763b;
        if (bVar != null) {
            sb.append(bVar.mo23245a(dVar.mo23111a().longValue()));
            sb.append(" ");
        }
        sb.append(sb3);
        sb.append(dVar);
        sb.append(C4550e.f15684a);
        if (dVar.mo23113c() != null) {
            Throwable c = dVar.mo23113c();
            LinkedList linkedList = new LinkedList();
            C14226d.m35353t0(linkedList, c, (StackTraceElement[]) null);
            for (String str4 : (String[]) linkedList.toArray(new String[0])) {
                if (!str4.startsWith("Caused by: ")) {
                    if (Character.isDigit(str4.charAt(0))) {
                        str3 = "\t... ";
                    } else {
                        str3 = "\tat ";
                    }
                    sb.append(str3);
                }
                sb.append(str4);
                sb.append(C4550e.f15684a);
            }
        }
        if (dVar.mo23115e()) {
            Iterator<C6859d> it = dVar.iterator();
            while (it.hasNext()) {
                m16476a(sb, str + "  ", it.next());
            }
        }
    }

    /* renamed from: b */
    public static void m16477b(C6557a aVar) {
        if (aVar != null) {
            C4548c cVar = aVar.f15676d;
            if (cVar == null) {
                PrintStream printStream = f21762a;
                StringBuilder k = C13555b.m33972k("WARN: Context named \"");
                k.append(aVar.f15675c);
                k.append("\" has no status manager");
                printStream.println(k.toString());
                return;
            }
            Iterator it = C4436j0.m11622f(0, cVar.mo20058c()).iterator();
            int i = 0;
            while (it.hasNext()) {
                C6859d dVar = (C6859d) it.next();
                if (dVar.mo23112b() > i) {
                    i = dVar.mo23112b();
                }
            }
            if (i >= 1) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = C4436j0.m11622f(0, cVar.mo20058c()).iterator();
                while (it2.hasNext()) {
                    m16476a(sb, "", (C6859d) it2.next());
                }
                f21762a.println(sb.toString());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Context argument cannot be null");
    }
}
