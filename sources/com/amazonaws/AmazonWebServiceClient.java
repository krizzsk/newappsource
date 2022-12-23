package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AmazonWebServiceClient {
    private static final String AMAZON = "Amazon";
    private static final String AWS = "AWS";
    private static final Log LOG = LogFactory.getLog((Class<?>) AmazonWebServiceClient.class);
    public static final boolean LOGGING_AWS_REQUEST_METRIC = true;
    public AmazonHttpClient client;
    public ClientConfiguration clientConfiguration;
    public volatile URI endpoint;
    public volatile String endpointPrefix;
    private volatile Region region;
    public final List<RequestHandler2> requestHandler2s;
    private volatile String serviceName;
    private volatile Signer signer;
    private volatile String signerRegionOverride;
    public long timeOffset;

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration2) {
        this(clientConfiguration2, (HttpClient) new UrlHttpClient(clientConfiguration2));
    }

    private String computeServiceName() {
        int i;
        String simpleName = Classes.childClassOf(AmazonWebServiceClient.class, this).getSimpleName();
        String serviceName2 = ServiceNameFactory.getServiceName(simpleName);
        if (serviceName2 != null) {
            return serviceName2;
        }
        int indexOf = simpleName.indexOf("JavaClient");
        if (indexOf == -1 && (indexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException(C25541a.m63881k("Unrecognized suffix for the AWS http client class name ", simpleName));
        }
        int indexOf2 = simpleName.indexOf("Amazon");
        if (indexOf2 == -1) {
            indexOf2 = simpleName.indexOf(AWS);
            if (indexOf2 != -1) {
                i = 3;
            } else {
                throw new IllegalStateException(C25541a.m63881k("Unrecognized prefix for the AWS http client class name ", simpleName));
            }
        } else {
            i = 6;
        }
        if (indexOf2 < indexOf) {
            return StringUtils.lowerCase(simpleName.substring(indexOf2 + i, indexOf));
        }
        throw new IllegalStateException(C25541a.m63881k("Unrecognized AWS http client class name ", simpleName));
    }

    private Signer computeSignerByServiceRegion(String str, String str2, String str3, boolean z) {
        Signer signer2;
        String signerOverride = this.clientConfiguration.getSignerOverride();
        if (signerOverride == null) {
            signer2 = SignerFactory.getSigner(str, str2);
        } else {
            signer2 = SignerFactory.getSignerByTypeAndService(signerOverride, str);
        }
        if (signer2 instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer2;
            if (str3 != null) {
                regionAwareSigner.setRegionName(str3);
            } else if (str2 != null && z) {
                regionAwareSigner.setRegionName(str2);
            }
        }
        synchronized (this) {
            this.region = Region.getRegion(str2);
        }
        return signer2;
    }

    private Signer computeSignerByURI(URI uri, String str, boolean z) {
        if (uri != null) {
            String serviceNameIntern = getServiceNameIntern();
            return computeSignerByServiceRegion(serviceNameIntern, AwsHostNameUtils.parseRegionName(uri.getHost(), serviceNameIntern), str, z);
        }
        throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
    }

    @Deprecated
    public static boolean isProfilingEnabled() {
        return System.getProperty(SDKGlobalConfiguration.PROFILING_SYSTEM_PROPERTY) != null;
    }

    @Deprecated
    private boolean isRMCEnabledAtClientOrSdkLevel() {
        RequestMetricCollector requestMetricCollector = requestMetricCollector();
        if (requestMetricCollector == null || !requestMetricCollector.isEnabled()) {
            return false;
        }
        return true;
    }

    private URI toURI(String str) {
        if (!str.contains("://")) {
            str = this.clientConfiguration.getProtocol().toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public void addRequestHandler(RequestHandler requestHandler) {
        this.requestHandler2s.add(RequestHandler2.adapt(requestHandler));
    }

    @Deprecated
    public void configSigner(String str, String str2) {
    }

    @Deprecated
    public void configSigner(URI uri) {
    }

    public ExecutionContext createExecutionContext(AmazonWebServiceRequest amazonWebServiceRequest) {
        return new ExecutionContext(this.requestHandler2s, isRequestMetricsEnabled(amazonWebServiceRequest) || isProfilingEnabled(), this);
    }

    @Deprecated
    public final void endClientExecution(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response) {
        endClientExecution(aWSRequestMetrics, request, response, false);
    }

    @Deprecated
    public final RequestMetricCollector findRequestMetricCollector(Request<?> request) {
        RequestMetricCollector requestMetricCollector = request.getOriginalRequest().getRequestMetricCollector();
        if (requestMetricCollector != null) {
            return requestMetricCollector;
        }
        RequestMetricCollector requestMetricsCollector = getRequestMetricsCollector();
        if (requestMetricsCollector == null) {
            return AwsSdkMetrics.getRequestMetricCollector();
        }
        return requestMetricsCollector;
    }

    public String getEndpoint() {
        String uri;
        synchronized (this) {
            uri = this.endpoint.toString();
        }
        return uri;
    }

    public String getEndpointPrefix() {
        return this.endpointPrefix;
    }

    public Regions getRegions() {
        Regions fromName;
        synchronized (this) {
            fromName = Regions.fromName(this.region.getName());
        }
        return fromName;
    }

    @Deprecated
    public RequestMetricCollector getRequestMetricsCollector() {
        return this.client.getRequestMetricCollector();
    }

    @Deprecated
    public String getServiceAbbreviation() {
        return getServiceNameIntern();
    }

    public String getServiceName() {
        return getServiceNameIntern();
    }

    public String getServiceNameIntern() {
        if (this.serviceName == null) {
            synchronized (this) {
                if (this.serviceName == null) {
                    this.serviceName = computeServiceName();
                    String str = this.serviceName;
                    return str;
                }
            }
        }
        return this.serviceName;
    }

    public Signer getSigner() {
        return this.signer;
    }

    public Signer getSignerByURI(URI uri) {
        return computeSignerByURI(uri, this.signerRegionOverride, true);
    }

    public final String getSignerRegionOverride() {
        return this.signerRegionOverride;
    }

    public long getTimeOffset() {
        return this.timeOffset;
    }

    @Deprecated
    public final boolean isRequestMetricsEnabled(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestMetricCollector requestMetricCollector = amazonWebServiceRequest.getRequestMetricCollector();
        if (requestMetricCollector == null || !requestMetricCollector.isEnabled()) {
            return isRMCEnabledAtClientOrSdkLevel();
        }
        return true;
    }

    @Deprecated
    public void removeRequestHandler(RequestHandler requestHandler) {
        this.requestHandler2s.remove(RequestHandler2.adapt(requestHandler));
    }

    @Deprecated
    public RequestMetricCollector requestMetricCollector() {
        RequestMetricCollector requestMetricCollector = this.client.getRequestMetricCollector();
        if (requestMetricCollector == null) {
            return AwsSdkMetrics.getRequestMetricCollector();
        }
        return requestMetricCollector;
    }

    @Deprecated
    public void setConfiguration(ClientConfiguration clientConfiguration2) {
        RequestMetricCollector requestMetricCollector;
        AmazonHttpClient amazonHttpClient = this.client;
        if (amazonHttpClient != null) {
            requestMetricCollector = amazonHttpClient.getRequestMetricCollector();
            amazonHttpClient.shutdown();
        } else {
            requestMetricCollector = null;
        }
        this.clientConfiguration = clientConfiguration2;
        this.client = new AmazonHttpClient(clientConfiguration2, requestMetricCollector);
    }

    public void setEndpoint(String str) {
        URI uri = toURI(str);
        Signer computeSignerByURI = computeSignerByURI(uri, this.signerRegionOverride, false);
        synchronized (this) {
            this.endpoint = uri;
            this.signer = computeSignerByURI;
        }
    }

    public void setRegion(Region region2) {
        String str;
        if (region2 != null) {
            String serviceNameIntern = getServiceNameIntern();
            if (region2.isServiceSupported(serviceNameIntern)) {
                str = region2.getServiceEndpoint(serviceNameIntern);
                int indexOf = str.indexOf("://");
                if (indexOf >= 0) {
                    str = str.substring(indexOf + 3);
                }
            } else {
                str = String.format("%s.%s.%s", new Object[]{getEndpointPrefix(), region2.getName(), region2.getDomain()});
            }
            URI uri = toURI(str);
            Signer computeSignerByServiceRegion = computeSignerByServiceRegion(serviceNameIntern, region2.getName(), this.signerRegionOverride, false);
            synchronized (this) {
                this.endpoint = uri;
                this.signer = computeSignerByServiceRegion;
            }
            return;
        }
        throw new IllegalArgumentException("No region provided");
    }

    public final void setServiceNameIntern(String str) {
        this.serviceName = str;
    }

    public final void setSignerRegionOverride(String str) {
        Signer computeSignerByURI = computeSignerByURI(this.endpoint, str, true);
        synchronized (this) {
            this.signer = computeSignerByURI;
            this.signerRegionOverride = str;
        }
    }

    public void setTimeOffset(int i) {
        this.timeOffset = (long) i;
    }

    public void shutdown() {
        this.client.shutdown();
    }

    public AmazonWebServiceClient withTimeOffset(int i) {
        setTimeOffset(i);
        return this;
    }

    @Deprecated
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration2, RequestMetricCollector requestMetricCollector) {
        this(clientConfiguration2, new UrlHttpClient(clientConfiguration2), (RequestMetricCollector) null);
    }

    public void addRequestHandler(RequestHandler2 requestHandler2) {
        this.requestHandler2s.add(requestHandler2);
    }

    @Deprecated
    public final void endClientExecution(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response, boolean z) {
        if (request != null) {
            aWSRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
            aWSRequestMetrics.getTimingInfo().endTiming();
            findRequestMetricCollector(request).collectMetrics(request, response);
        }
        if (z) {
            aWSRequestMetrics.log();
        }
    }

    public void removeRequestHandler(RequestHandler2 requestHandler2) {
        this.requestHandler2s.remove(requestHandler2);
    }

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration2, HttpClient httpClient) {
        this.clientConfiguration = clientConfiguration2;
        this.client = new AmazonHttpClient(clientConfiguration2, httpClient);
        this.requestHandler2s = new CopyOnWriteArrayList();
    }

    public final ExecutionContext createExecutionContext(Request<?> request) {
        return createExecutionContext(request.getOriginalRequest());
    }

    @Deprecated
    public final ExecutionContext createExecutionContext() {
        return new ExecutionContext(this.requestHandler2s, isRMCEnabledAtClientOrSdkLevel() || isProfilingEnabled(), this);
    }

    @Deprecated
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration2, HttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this.clientConfiguration = clientConfiguration2;
        this.client = new AmazonHttpClient(clientConfiguration2, httpClient, requestMetricCollector);
        this.requestHandler2s = new CopyOnWriteArrayList();
    }

    @Deprecated
    public void setEndpoint(String str, String str2, String str3) {
        URI uri = toURI(str);
        Signer computeSignerByServiceRegion = computeSignerByServiceRegion(str2, str3, str3, true);
        synchronized (this) {
            this.signer = computeSignerByServiceRegion;
            this.endpoint = uri;
            this.signerRegionOverride = str3;
        }
    }
}
