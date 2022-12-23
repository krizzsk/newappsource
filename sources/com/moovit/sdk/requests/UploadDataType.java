package com.moovit.sdk.requests;

import com.moovit.sdk.protocol.ProtocolEnums$MVUploadDataCategory;

public enum UploadDataType {
    SENSOR_DATA(ProtocolEnums$MVUploadDataCategory.SENSORS_DATA_COLLECTION),
    LOG(ProtocolEnums$MVUploadDataCategory.LOGS);
    
    private final ProtocolEnums$MVUploadDataCategory thriftCategory;

    private UploadDataType(ProtocolEnums$MVUploadDataCategory protocolEnums$MVUploadDataCategory) {
        this.thriftCategory = protocolEnums$MVUploadDataCategory;
    }

    public ProtocolEnums$MVUploadDataCategory toThriftCategory() {
        return this.thriftCategory;
    }
}
