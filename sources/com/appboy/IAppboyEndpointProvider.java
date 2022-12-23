package com.appboy;

import android.net.Uri;
import androidx.annotation.Keep;

@Keep
public interface IAppboyEndpointProvider {
    Uri getApiEndpoint(Uri uri);
}
