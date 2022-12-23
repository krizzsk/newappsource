package com.google.android.exoplayer2.upstream;

import java.util.List;
import java.util.Map;
import p265tb.C6657i;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, C6657i iVar, byte[] bArr) {
        super(C13715c.m34241g(26, "Response code: ", i), iVar);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
