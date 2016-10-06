using System.Configuration;
using NUnit.Framework;
using OpenQA.Selenium;
using Joomla.Factory;
using Joomla.PageObjects;
using Joomla.Extensions;
using OpenQA.Selenium.Support.UI;


namespace Joomla.TestCases
{
    class Temp
    {
        [SetUp]
        public void preCondition()
        {
            BrowsersFactory.InitBrowser(ConfigurationManager.AppSettings["browser"]);
            BrowserActions.Navigate(ConfigurationManager.AppSettings["URL"]);
        }

        [TearDown]
        public void cleaningUp()
        {
            //BrowsersFactory.CloseAllDrives();
        }

        [Test]
        public void testSection()
        {
            //Pages.LoginAdministrator.LoginToJoomla("demo", "demo123");

            IWebElement sSelect = BrowsersFactory.Driver.FindElement(By.Id("lstComponents"));
            sSelect.Select("Navigate");

        }

    }
}
