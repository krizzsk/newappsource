package rf0;

import com.google.android.play.core.assetpacks.C14256d1;
import java.util.Iterator;
import nf0.C24497a;

/* renamed from: rf0.a */
public class C24799a implements Iterable<Character>, C24497a {

    /* renamed from: b */
    public final char f62721b;

    /* renamed from: c */
    public final char f62722c;

    /* renamed from: d */
    public final int f62723d = 1;

    public C24799a(char c, char c2) {
        this.f62721b = c;
        this.f62722c = (char) C14256d1.m35488f(c, c2, 1);
    }

    public final Iterator iterator() {
        return new C24800b(this.f62721b, this.f62722c, this.f62723d);
    }
}
