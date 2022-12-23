package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcelable;
import com.moovit.app.useraccount.manager.favorites.Favorite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class FavoriteGroup<G, F extends Favorite<?>> implements Parcelable {

    /* renamed from: b */
    public final G f40591b;

    /* renamed from: c */
    public final ArrayList f40592c = new ArrayList();

    public FavoriteGroup(G g) {
        this.f40591b = g;
    }

    /* renamed from: b */
    public final List<F> mo46585b() {
        return Collections.unmodifiableList(this.f40592c);
    }
}
