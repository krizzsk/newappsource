package p559ii;

import ce0.C21100e;
import ce0.C21105j;
import com.moovit.image.model.Image;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;
import mf0.C24361g;
import mf0.C24362h;
import p581ji.C17854a;
import p583jk.C17866a;
import p583jk.C17878k;
import td0.C24927a;
import zf0.C25440f;

/* renamed from: ii.a */
public final class C17601a {

    /* renamed from: a */
    public final /* synthetic */ int f45276a;

    /* renamed from: b */
    public Object f45277b;

    /* renamed from: c */
    public Object f45278c;

    /* renamed from: d */
    public Object f45279d;

    public C17601a(C25440f fVar, List list, C17601a aVar) {
        this.f45276a = 5;
        C24362h.m61211f(fVar, "classifierDescriptor");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        this.f45277b = fVar;
        this.f45278c = list;
        this.f45279d = aVar;
    }

    /* renamed from: a */
    public final File mo50073a() {
        File file = new File(((C24927a) this.f45277b).mo61483c(), (String) this.f45278c);
        if (file.exists() && !file.isDirectory()) {
            C21105j.m49398c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "cache_policy_journal");
    }

    /* renamed from: b */
    public final void mo50074b(long j, File file) {
        if (j > 0) {
            ((LinkedHashSet) this.f45279d).remove(file);
        }
        ((LinkedHashSet) this.f45279d).add(file);
    }

    /* renamed from: c */
    public final void mo50075c() {
        C21105j.m49401f(mo50073a(), (LinkedHashSet) this.f45279d);
    }

    public final String toString() {
        switch (this.f45276a) {
            case 3:
                StringBuilder k = C13555b.m33972k("TodPassengerQrCodeActionInfo{title=");
                k.append((String) this.f45277b);
                k.append(", instructions=");
                k.append((String) this.f45278c);
                k.append(", icon=");
                k.append((Image) this.f45279d);
                k.append('}');
                return k.toString();
            default:
                return super.toString();
        }
    }

    public C17601a(C24927a aVar) {
        this.f45276a = 4;
        this.f45279d = new LinkedHashSet();
        this.f45277b = aVar;
        this.f45278c = "clever_cache";
    }

    public C17601a(C17866a aVar, C17878k kVar) {
        this.f45276a = 2;
        this.f45279d = Arrays.asList(new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '2', '3', '4', '5', '6', '7'});
        this.f45277b = aVar;
        this.f45278c = kVar;
    }

    public C17601a(Image image, String str, String str2) {
        this.f45276a = 3;
        C21100e.m49373x(str, "title");
        this.f45277b = str;
        this.f45278c = str2;
        this.f45279d = image;
    }

    public C17601a(Vector vector) {
        this.f45276a = 0;
        this.f45278c = null;
        this.f45279d = null;
        if (C17854a.f45839k == null) {
            int i = 0;
            while (i < vector.size()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) vector.elementAt(i)));
                try {
                    C17854a.m44237e(dataInputStream);
                    dataInputStream.close();
                    i++;
                } catch (Exception unused) {
                    throw new RuntimeException("Failed to load key");
                }
            }
        }
        C17854a M = C24361g.m61143M(false);
        this.f45277b = M;
        M.mo50426b((byte[]) null);
    }
}
