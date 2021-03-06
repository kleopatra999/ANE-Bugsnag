package com.bugsnag.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.bugsnag.android.Bugsnag;

public class SetContext implements FREFunction
{
    @Override
    public FREObject call( FREContext context, FREObject[] args )
    {
        String contextStr = "";

        try
        {
            contextStr = args[0].getAsString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }

        Bugsnag.setContext(contextStr);

        return null;
    }
}