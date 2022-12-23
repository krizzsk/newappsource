package com.usebutton.sdk.boost;

import com.usebutton.sdk.boost.BoostRequest;

public interface Boost {
    void fetch(BoostRequest boostRequest, BoostRequest.Listener listener);
}
