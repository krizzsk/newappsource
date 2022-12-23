package p236r8;

import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import mf0.C24362h;
import p262t8.C6606a;
import p427cu.C16497a;
import p577je.C17746a0;
import p634ln.C18247a;
import p648me.C18364b;
import p977zz.C20975x0;

/* renamed from: r8.c */
public final /* synthetic */ class C6266c implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f19737b;

    public /* synthetic */ C6266c(int i) {
        this.f19737b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f19737b) {
            case 0:
                InstrumentData instrumentData = (InstrumentData) obj;
                InstrumentData instrumentData2 = (InstrumentData) obj2;
                Class<C6267d> cls = C6267d.class;
                if (C6606a.m15601b(cls)) {
                    return 0;
                }
                try {
                    C24362h.m61210e(instrumentData2, "o2");
                    return instrumentData.mo12557a(instrumentData2);
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                    return 0;
                }
            case 1:
                return ((C17746a0.C17750c) obj).mo50187a().compareTo(((C17746a0.C17750c) obj2).mo50187a());
            case 2:
                Charset charset = C18364b.f46812d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 3:
                return ((C18247a) obj).f46553b.compareTo(((C18247a) obj2).f46553b);
            default:
                int i = C16497a.f43085j;
                return C20975x0.m49116c(((C16497a.C16498a) obj).f43095b, ((C16497a.C16498a) obj2).f43095b);
        }
    }
}
