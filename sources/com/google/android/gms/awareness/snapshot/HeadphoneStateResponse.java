package com.google.android.gms.awareness.snapshot;

import com.google.android.gms.awareness.state.HeadphoneState;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.Preconditions;

public class HeadphoneStateResponse extends Response<HeadphoneStateResult> {
    public HeadphoneState getHeadphoneState() {
        return (HeadphoneState) Preconditions.checkNotNull(((HeadphoneStateResult) getResult()).getHeadphoneState());
    }
}
