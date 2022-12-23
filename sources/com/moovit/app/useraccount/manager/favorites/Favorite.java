package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcelable;
import ce0.C21100e;
import p977zz.C20940g0;

public abstract class Favorite<T> extends C20940g0<T> implements Parcelable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Favorite(T t) {
        super(t);
        C21100e.m49373x(t, "target");
    }
}
