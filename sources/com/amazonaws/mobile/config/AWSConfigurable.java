package com.amazonaws.mobile.config;

import android.content.Context;
import com.amazonaws.ClientConfiguration;

public interface AWSConfigurable {
    AWSConfigurable initialize(Context context) throws Exception;

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration) throws Exception;

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration, ClientConfiguration clientConfiguration) throws Exception;
}
