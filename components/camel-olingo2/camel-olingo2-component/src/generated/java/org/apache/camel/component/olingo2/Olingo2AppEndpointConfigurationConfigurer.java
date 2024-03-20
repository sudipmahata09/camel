/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.olingo2.Olingo2AppEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo2AppEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.olingo2.internal.Olingo2ApiName.class);
        map.put("ConnectTimeout", int.class);
        map.put("ContentType", java.lang.String.class);
        map.put("Data", java.lang.Object.class);
        map.put("Edm", org.apache.olingo.odata2.api.edm.Edm.class);
        map.put("EndpointHttpHeaders", java.util.Map.class);
        map.put("EntityProviderReadProperties", org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class);
        map.put("EntityProviderWriteProperties", org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class);
        map.put("FilterAlreadySeen", boolean.class);
        map.put("HttpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        map.put("HttpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        map.put("HttpHeaders", java.util.Map.class);
        map.put("KeyPredicate", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Proxy", org.apache.http.HttpHost.class);
        map.put("QueryParams", java.util.Map.class);
        map.put("ResourcePath", java.lang.String.class);
        map.put("ResponseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class);
        map.put("ServiceUri", java.lang.String.class);
        map.put("SocketTimeout", int.class);
        map.put("SplitResult", boolean.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.olingo2.Olingo2AppEndpointConfiguration target = (org.apache.camel.component.olingo2.Olingo2AppEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.olingo2.internal.Olingo2ApiName.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "data": target.setData(property(camelContext, java.lang.Object.class, value)); return true;
        case "edm": target.setEdm(property(camelContext, org.apache.olingo.odata2.api.edm.Edm.class, value)); return true;
        case "endpointhttpheaders":
        case "endpointHttpHeaders": target.setEndpointHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": target.setEntityProviderReadProperties(property(camelContext, org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class, value)); return true;
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": target.setEntityProviderWriteProperties(property(camelContext, org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class, value)); return true;
        case "filteralreadyseen":
        case "filterAlreadySeen": target.setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": target.setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "httpClientBuilder": target.setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "httpHeaders": target.setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "keypredicate":
        case "keyPredicate": target.setKeyPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy": target.setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "queryparams":
        case "queryParams": target.setQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "resourcepath":
        case "resourcePath": target.setResourcePath(property(camelContext, java.lang.String.class, value)); return true;
        case "responsehandler":
        case "responseHandler": target.setResponseHandler(property(camelContext, org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class, value)); return true;
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
        case "apiName": return org.apache.camel.component.olingo2.internal.Olingo2ApiName.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "contenttype":
        case "contentType": return java.lang.String.class;
        case "data": return java.lang.Object.class;
        case "edm": return org.apache.olingo.odata2.api.edm.Edm.class;
        case "endpointhttpheaders":
        case "endpointHttpHeaders": return java.util.Map.class;
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": return org.apache.olingo.odata2.api.ep.EntityProviderReadProperties.class;
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": return org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.class;
        case "filteralreadyseen":
        case "filterAlreadySeen": return boolean.class;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class;
        case "httpclientbuilder":
        case "httpClientBuilder": return org.apache.http.impl.client.HttpClientBuilder.class;
        case "httpheaders":
        case "httpHeaders": return java.util.Map.class;
        case "keypredicate":
        case "keyPredicate": return java.lang.String.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "proxy": return org.apache.http.HttpHost.class;
        case "queryparams":
        case "queryParams": return java.util.Map.class;
        case "resourcepath":
        case "resourcePath": return java.lang.String.class;
        case "responsehandler":
        case "responseHandler": return org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class;
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
        org.apache.camel.component.olingo2.Olingo2AppEndpointConfiguration target = (org.apache.camel.component.olingo2.Olingo2AppEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return target.getApiName();
        case "connecttimeout":
        case "connectTimeout": return target.getConnectTimeout();
        case "contenttype":
        case "contentType": return target.getContentType();
        case "data": return target.getData();
        case "edm": return target.getEdm();
        case "endpointhttpheaders":
        case "endpointHttpHeaders": return target.getEndpointHttpHeaders();
        case "entityproviderreadproperties":
        case "entityProviderReadProperties": return target.getEntityProviderReadProperties();
        case "entityproviderwriteproperties":
        case "entityProviderWriteProperties": return target.getEntityProviderWriteProperties();
        case "filteralreadyseen":
        case "filterAlreadySeen": return target.isFilterAlreadySeen();
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return target.getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "httpClientBuilder": return target.getHttpClientBuilder();
        case "httpheaders":
        case "httpHeaders": return target.getHttpHeaders();
        case "keypredicate":
        case "keyPredicate": return target.getKeyPredicate();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "proxy": return target.getProxy();
        case "queryparams":
        case "queryParams": return target.getQueryParams();
        case "resourcepath":
        case "resourcePath": return target.getResourcePath();
        case "responsehandler":
        case "responseHandler": return target.getResponseHandler();
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
        case "endpointhttpheaders":
        case "endpointHttpHeaders": return java.lang.String.class;
        case "httpheaders":
        case "httpHeaders": return java.lang.String.class;
        case "queryparams":
        case "queryParams": return java.lang.String.class;
        case "responsehandler":
        case "responseHandler": return java.util.List.class;
        default: return null;
        }
    }
}

