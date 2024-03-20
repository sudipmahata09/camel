/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.UsageRecordYearlyEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class UsageRecordYearlyEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PathAccountSid", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.UsageRecordYearlyEndpointConfiguration target = (org.apache.camel.component.twilio.UsageRecordYearlyEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "pathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
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
        case "apiName": return org.apache.camel.component.twilio.internal.TwilioApiName.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "pathaccountsid":
        case "pathAccountSid": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.UsageRecordYearlyEndpointConfiguration target = (org.apache.camel.component.twilio.UsageRecordYearlyEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return target.getApiName();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "pathaccountsid":
        case "pathAccountSid": return target.getPathAccountSid();
        default: return null;
        }
    }
}

