using System;
using System.Collections.Generic;
using Joomla.Factory;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;

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

        public static void Select(this IWebElement element, string itemName)
        {
            SelectElement sControl = new SelectElement(element);
            sControl.SelectByText(itemName);
        }

        public static void Select(this IWebElement element, int itemIndex)
        {
            SelectElement sControl = new SelectElement(element);
            sControl.SelectByIndex(itemIndex);
        }
    }
}
