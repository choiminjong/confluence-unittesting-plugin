package com.atlassian.tutorial.confluence.plugin.unittesting.impl;

import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.tutorial.confluence.plugin.unittesting.api.MyPluginComponent;


public class MyPluginComponentImpl implements MyPluginComponent
{
        private final ApplicationProperties applicationProperties;

        public MyPluginComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }
        
        return "myComponent";
    }
}