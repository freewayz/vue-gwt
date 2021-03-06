package com.axellience.vuegwt.client.vue;

import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import com.axellience.vuegwt.jsr69.component.annotations.JsComponent;
import jsinterop.annotations.JsType;

/**
 * A factory to create {@link VueComponent}s.
 * All the {@link Component} and {@link JsComponent} get a generated {@link VueFactory}.
 * It wraps a {@link VueJsConstructor} that is configured when the factory is created.
 * It can be injected with Gin or Dagger2.
 * @author Adrien Baron
 */
@JsType
public class VueFactory<T extends VueComponent>
{
    protected VueJsConstructor<T> jsConstructor;

    public final T create()
    {
        return jsConstructor.instantiate();
    }

    public VueJsConstructor<T> getJsConstructor()
    {
        return jsConstructor;
    }
}
