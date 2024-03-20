/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.processor.aggregate.tarfile;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.processor.aggregate.tarfile.TarAggregationStrategy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TarAggregationStrategyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.tarfile.TarAggregationStrategy target = (org.apache.camel.processor.aggregate.tarfile.TarAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "filePrefix": target.setFilePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "filesuffix":
        case "fileSuffix": target.setFileSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "parentdir":
        case "parentDir": target.setParentDir(property(camelContext, java.io.File.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "filePrefix": return java.lang.String.class;
        case "filesuffix":
        case "fileSuffix": return java.lang.String.class;
        case "parentdir":
        case "parentDir": return java.io.File.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.tarfile.TarAggregationStrategy target = (org.apache.camel.processor.aggregate.tarfile.TarAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "filePrefix": return target.getFilePrefix();
        case "filesuffix":
        case "fileSuffix": return target.getFileSuffix();
        case "parentdir":
        case "parentDir": return target.getParentDir();
        default: return null;
        }
    }
}

