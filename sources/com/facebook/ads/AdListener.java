package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(C2289Ad ad);

    @Benchmark
    void onAdLoaded(C2289Ad ad);

    @Benchmark
    void onError(C2289Ad ad, AdError adError);

    @Benchmark
    void onLoggingImpression(C2289Ad ad);
}
