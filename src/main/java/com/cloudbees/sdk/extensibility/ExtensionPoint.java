package com.cloudbees.sdk.extensibility;

import org.jvnet.hudson.annotation_indexer.Indexed;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Marks types that are the extension point, a contract type to be implemented by subtypes.
 *
 * @author Kohsuke Kawaguchi
 */
@Retention(RUNTIME)
@Target(TYPE)
@Indexed
public @interface ExtensionPoint {
    Class<? extends ExtensionLoaderModule> loader() default ExtensionLoaderModule.Default.class;
}
