package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class ContentFetcher<T> {
    private final FutureTask<T> AFDateFormat = new FutureTask<>(new Callable<T>() {
        public final T call() {
            if (ContentFetcher.this.valid()) {
                return ContentFetcher.this.query();
            }
            return null;
        }
    });
    public final String authority;
    public final Context context;
    private final String[] valueOf;

    public ContentFetcher(Context context2, String str, String... strArr) {
        this.context = context2;
        this.authority = str;
        this.valueOf = strArr;
    }

    public T get() {
        try {
            return this.AFDateFormat.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            onError(e);
            return null;
        }
    }

    public void onError(Exception exc) {
        AFLogger.afErrorLog(exc.getMessage(), exc);
    }

    public abstract T query();

    public void start() {
        new Thread(this.AFDateFormat).start();
    }

    public boolean valid() {
        try {
            ProviderInfo resolveContentProvider = this.context.getPackageManager().resolveContentProvider(this.authority, RecyclerView.C1119a0.FLAG_IGNORE);
            if (resolveContentProvider == null || !Arrays.asList(this.valueOf).contains(AndroidUtils.signature(this.context.getPackageManager(), resolveContentProvider.packageName))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            onError(e);
            return false;
        }
    }
}
