package p304x;

import android.util.Size;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.ticketing.ticket.Ticket;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import p427cu.C16497a;
import p648me.C18364b;
import p741pz.C19044c;
import p977zz.C20975x0;

/* renamed from: x.l1 */
public final /* synthetic */ class C7072l1 implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f21987b;

    public /* synthetic */ C7072l1(int i) {
        this.f21987b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f21987b) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 1:
                C7072l1 l1Var = C0590n.f2013y;
                return ((Config.C0564a) obj).mo2447b().compareTo(((Config.C0564a) obj2).mo2447b());
            case 2:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = DefaultTrackSelector.f14029f;
                return 0;
            case 3:
                Charset charset = C18364b.f46812d;
                String name = ((File) obj).getName();
                int i = C18364b.f46813e;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 4:
                int i2 = C16497a.f43085j;
                return Float.compare(((C16497a.C16498a) obj).f43094a, ((C16497a.C16498a) obj2).f43094a);
            case 5:
                return ((SubscriptionDetails) obj).f39794h.f23845c.compareTo(((SubscriptionDetails) obj2).f39794h.f23845c);
            case 6:
                C7072l1 l1Var2 = C19044c.f48433f;
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            case 7:
                return C20975x0.m49116c(((Ticket) obj).f23488q, ((Ticket) obj2).f23488q);
            case 8:
                Ticket ticket = (Ticket) obj;
                Ticket ticket2 = (Ticket) obj2;
                int compareTo = ticket.f23475d.compareTo(ticket2.f23475d);
                if (compareTo == 0) {
                    return C20975x0.m49115b(ticket2.f23480i, ticket.f23480i);
                }
                return compareTo;
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
