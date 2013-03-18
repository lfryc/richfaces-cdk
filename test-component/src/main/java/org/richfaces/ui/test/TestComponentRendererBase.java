package org.richfaces.ui.test;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

import org.richfaces.renderkit.RendererBase;

@ResourceDependencies({
        @ResourceDependency(library = "org.richfaces", name = "testComponent.js"),
        @ResourceDependency(library = "org.richfaces", name = "testComponent.css")})
public abstract class TestComponentRendererBase extends RendererBase {
    public static final String RENDERER_TYPE = "org.richfaces.TestComponentRenderer";
}
