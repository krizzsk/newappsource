package com.amazonaws.http;

import ak0.C21006a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.VoidStaxUnmarshaller;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;

public class StaxResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {
    private static final C21006a XML_PULL_PARSER_FACTORY;
    private static final Log log = LogFactory.getLog("com.amazonaws.request");
    private Unmarshaller<T, StaxUnmarshallerContext> responseUnmarshaller;

    static {
        try {
            XML_PULL_PARSER_FACTORY = C21006a.m49161a();
        } catch (XmlPullParserException e) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", e);
        }
    }

    public StaxResponseHandler(Unmarshaller<T, StaxUnmarshallerContext> unmarshaller) {
        this.responseUnmarshaller = unmarshaller;
        if (unmarshaller == null) {
            this.responseUnmarshaller = new VoidStaxUnmarshaller();
        }
    }

    public boolean needsConnectionLeftOpen() {
        return false;
    }

    public void registerAdditionalMetadataExpressions(StaxUnmarshallerContext staxUnmarshallerContext) {
    }

    public AmazonWebServiceResponse<T> handle(HttpResponse httpResponse) throws Exception {
        Log log2 = log;
        log2.trace("Parsing service response XML");
        InputStream content = httpResponse.getContent();
        if (content == null) {
            content = new ByteArrayInputStream("<eof/>".getBytes(StringUtils.UTF8));
        }
        XmlPullParser b = XML_PULL_PARSER_FACTORY.mo53086b();
        b.setInput(content, (String) null);
        AmazonWebServiceResponse<T> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        StaxUnmarshallerContext staxUnmarshallerContext = new StaxUnmarshallerContext(b, httpResponse.getHeaders());
        staxUnmarshallerContext.registerMetadataExpression("ResponseMetadata/RequestId", 2, ResponseMetadata.AWS_REQUEST_ID);
        staxUnmarshallerContext.registerMetadataExpression("requestId", 2, ResponseMetadata.AWS_REQUEST_ID);
        registerAdditionalMetadataExpressions(staxUnmarshallerContext);
        amazonWebServiceResponse.setResult(this.responseUnmarshaller.unmarshall(staxUnmarshallerContext));
        Map<String, String> metadata = staxUnmarshallerContext.getMetadata();
        Map<String, String> headers = httpResponse.getHeaders();
        if (!(headers == null || headers.get("x-amzn-RequestId") == null)) {
            metadata.put(ResponseMetadata.AWS_REQUEST_ID, headers.get("x-amzn-RequestId"));
        }
        amazonWebServiceResponse.setResponseMetadata(new ResponseMetadata(metadata));
        log2.trace("Done parsing service response");
        return amazonWebServiceResponse;
    }
}
