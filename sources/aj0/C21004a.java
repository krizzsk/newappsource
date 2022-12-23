package aj0;

import bj0.C21085b;
import java.util.AbstractList;
import java.util.ArrayList;

/* renamed from: aj0.a */
public final class C21004a {

    /* renamed from: a */
    public ArrayList<C21085b> f52753a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<C21004a> f52754b;

    /* renamed from: c */
    public ArrayList f52755c;

    public C21004a(AbstractList abstractList) {
        if (((C21005b) abstractList.get(0)).equals(abstractList.get(abstractList.size() - 1))) {
            abstractList.remove(abstractList.size() - 1);
        }
        this.f52753a.addAll(abstractList);
    }
}
