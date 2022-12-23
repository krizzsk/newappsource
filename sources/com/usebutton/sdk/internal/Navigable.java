package com.usebutton.sdk.internal;

import com.usebutton.sdk.internal.functional.Observable;

public interface Navigable {

    public interface NavigationListener {
        void onNavigation(Navigable navigable);
    }

    void back();

    boolean canNavigateBack();

    boolean canNavigateForward();

    void forward();

    Observable<NavigationListener> getObservable();
}
