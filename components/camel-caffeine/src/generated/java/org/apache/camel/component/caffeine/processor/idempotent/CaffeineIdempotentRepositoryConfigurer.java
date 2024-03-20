/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.processor.idempotent;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.caffeine.processor.idempotent.CaffeineIdempotentRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CaffeineIdempotentRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.caffeine.processor.idempotent.CaffeineIdempotentRepository target = (org.apache.camel.component.caffeine.processor.idempotent.CaffeineIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "cacheName": target.setCacheName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "cacheName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.caffeine.processor.idempotent.CaffeineIdempotentRepository target = (org.apache.camel.component.caffeine.processor.idempotent.CaffeineIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "cacheName": return target.getCacheName();
        default: return null;
        }
    }
}

