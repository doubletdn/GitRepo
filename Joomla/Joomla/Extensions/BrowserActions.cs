using System;
using System.Collections.Generic;
using Joomla.Factory;


namespace Joomla.Extensions
{
    class BrowserActions
    {
        public static void Navigate(string url)
        {
            BrowsersFactory.Driver.Url = url;
        }

    }
}
