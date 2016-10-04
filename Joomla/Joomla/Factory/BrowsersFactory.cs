using System;
using System.Collections.Generic;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.IE;

namespace Joomla.Factory
{
    class BrowsersFactory
    {
        private static readonly IDictionary<string, IWebDriver> Drivers = new Dictionary<string, IWebDriver>();
        public static IWebDriver Driver{get; set;}

        public static void InitBrowser(string browsername)
        {
            if (browsername == null)
                throw new NullReferenceException("Please specific browser name first!");
            switch(browsername)
            {
                case "Firefox":
                    if(Driver==null)
                    {
                        Driver = new FirefoxDriver();
                        Drivers.Add("Firefox", Driver);
                    }
                    break;
                case "Chrome":
                    if (Driver == null)
                    {
                        Driver = new ChromeDriver();
                        Drivers.Add("Chrome", Driver);
                    }
                    break;
                case "IE":
                    if (Driver == null)
                    {
                        Driver = new InternetExplorerDriver();
                        Drivers.Add("IE", Driver);
                    }
                break;
            }
        }

        public static void CloseAllDrives()
        {
            foreach (var key in Drivers.Keys)
            {
                Drivers[key].Close();
                Drivers[key].Quit();
            }
        }


    }
}
