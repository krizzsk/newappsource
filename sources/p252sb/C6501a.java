package p252sb;

import com.google.android.exoplayer2.Format;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.ticketing.ticket.Ticket;
import hi0.C23542h;
import java.util.Comparator;
import p277ub.C6805t;
import p595jw.C17948a;
import p810sz.C19617r;
import p977zz.C20975x0;

/* renamed from: sb.a */
public final /* synthetic */ class C6501a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f20288b;

    public /* synthetic */ C6501a(int i) {
        this.f20288b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f20288b) {
            case 0:
                return ((Format) obj2).f13414i - ((Format) obj).f13414i;
            case 1:
                return ((C6805t.C6806a) obj).f21054a - ((C6805t.C6806a) obj2).f21054a;
            case 2:
                C19617r rVar = C17948a.f46011a;
                return ((Itinerary) obj).mo48288K1().compareTo(((Itinerary) obj2).mo48288K1());
            case 3:
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
                MicroMobilityRide microMobilityRide2 = (MicroMobilityRide) obj2;
                int compareTo = microMobilityRide.f14991i.f15007b.compareTo(microMobilityRide2.f14991i.f15007b);
                if (compareTo == 0) {
                    return C20975x0.m49115b(microMobilityRide2.f14990h, microMobilityRide.f14990h);
                }
                return compareTo;
            case 4:
                Ticket ticket = (Ticket) obj;
                Ticket ticket2 = (Ticket) obj2;
                int compareTo2 = ticket.f23475d.compareTo(ticket2.f23475d);
                if (compareTo2 == 0) {
                    return C20975x0.m49115b(ticket2.f23480i, ticket.f23480i);
                }
                return compareTo2;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                C6501a aVar = C23542h.f59471b;
                int min = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i < min) {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (charAt < charAt2) {
                            return -1;
                        }
                    } else {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    }
                }
                return 1;
        }
    }
}
