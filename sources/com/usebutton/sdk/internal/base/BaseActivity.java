package com.usebutton.sdk.internal.base;

import android.app.Activity;
import com.usebutton.sdk.internal.base.BasePresenter;

public abstract class BaseActivity<P extends BasePresenter> extends Activity {
    private P presenter;

    public void attachPresenterToLifecycle(P p, BaseViewController baseViewController) {
        this.presenter = p;
        p.attachView(baseViewController);
    }

    public P getPresenter() {
        return this.presenter;
    }

    public void onDestroy() {
        P p = this.presenter;
        if (p != null) {
            p.detachView();
        }
        super.onDestroy();
    }
}
