package ut.com.atlassian.tutorial.confluence.plugin.unittesting;

import org.junit.Test;
import com.atlassian.tutorial.confluence.plugin.unittesting.api.MyPluginComponent;
import com.atlassian.tutorial.confluence.plugin.unittesting.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}