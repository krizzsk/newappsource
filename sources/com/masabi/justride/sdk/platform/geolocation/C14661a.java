package com.masabi.justride.sdk.platform.geolocation;

import android.location.Location;
import p988j$.util.function.Consumer;

/* renamed from: com.masabi.justride.sdk.platform.geolocation.a */
public final class C14661a<T> implements Consumer<Location> {

    /* renamed from: a */
    public static final C14661a f37171a = new C14661a();

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Location location = (Location) obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
