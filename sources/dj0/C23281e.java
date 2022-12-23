package dj0;

import bj0.C21085b;
import java.util.Comparator;

/* renamed from: dj0.e */
public final class C23281e implements Comparator<C21085b> {
    public final int compare(Object obj, Object obj2) {
        C21085b bVar = (C21085b) obj;
        C21085b bVar2 = (C21085b) obj2;
        if (bVar.mo53240b() < bVar2.mo53240b()) {
            return -1;
        }
        if (bVar.mo53240b() <= bVar2.mo53240b()) {
            if (bVar.mo53239a() < bVar2.mo53239a()) {
                return -1;
            }
            if (bVar.mo53239a() > bVar2.mo53239a()) {
                return 1;
            }
            return 0;
        }
        return 1;
    }
}
