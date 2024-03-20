/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo4;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.olingo4.Olingo4Configuration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo4ConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.olingo4.internal.Olingo4ApiName.class);
        map.put("ConnectTimeout", int.class);
        map.put("ContentType", java.lang.String.class);
        map.put("FilterAlreadySeen", boolean.class);
        map.put("HttpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        map.put("HttpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        map.put("HttpHeaders", java.util.Map.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Proxy", org.apache.http.HttpHost.class);
        map.put("ServiceUri", java.lang.String.class);
        map.put("SocketTimeout", int.class);
        map.put("SplitResult", boolean.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4Configuration target = (org.apache.camel.component.olingo4.Olingo4Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.olingo4.internal.Olingo4ApiName.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "filteralreadyseen":
        case "filterAlreadySeen": target.setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": target.setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "httpClientBuilder": target.setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "httpHeaders": target.setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy": target.setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "serviceuri":
        case "serviceUri": target.setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "splitResult": target.setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return org.apache.camel.component.olingo4.internal.Olingo4ApiName.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "contenttype":
        case "contentType": return java.lang.String.class;
        case "filteralreadyseen":
        case "filterAlreadySeen": return boolean.class;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class;
        case "httpclientbuilder":
        case "httpClientBuilder": return org.apache.http.impl.client.HttpClientBuilder.class;
        case "httpheaders":
        case "httpHeaders": return java.util.Map.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "proxy": return org.apache.http.HttpHost.class;
        case "serviceuri":
        case "serviceUri": return java.lang.String.class;
        case "sockettimeout":
        case "socketTimeout": return int.class;
        case "splitresult":
        case "splitResult": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4Configuration target = (org.apache.camel.component.olingo4.Olingo4Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return target.getApiName();
        case "connecttimeout":
        case "connectTimeout": return target.getConnectTimeout();
        case "contenttype":
        case "contentType": return target.getContentType();
        case "filteralreadyseen":
        case "filterAlreadySeen": return target.isFilterAlreadySeen();
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return target.getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "httpClientBuilder": return target.getHttpClientBuilder();
        case "httpheaders":
        case "httpHeaders": return target.getHttpHeaders();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "proxy": return target.getProxy();
        case "serviceuri":
        case "serviceUri": return target.getServiceUri();
        case "sockettimeout":
        case "socketTimeout": return target.getSocketTimeout();
        case "splitresult":
        case "splitResult": return target.isSplitResult();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpheaders":
        case "httpHeaders": return java.lang.String.class;
        default: return null;
        }
    }
}

