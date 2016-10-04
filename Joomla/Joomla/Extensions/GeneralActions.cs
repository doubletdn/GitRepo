using System;
using System.Collections.Generic;
using Joomla.Factory;
using OpenQA.Selenium;

namespace Joomla.Extensions
{
    public static class GeneralActions
    {
        public static void Enter(this IWebElement element, string text)
        {
            element.Clear(); 
            element.SendKeys(text);
        }

        public static void Click(this IWebElement element)
        {
            element.Click();
        }

    }
}
