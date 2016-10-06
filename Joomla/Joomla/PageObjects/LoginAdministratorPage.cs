using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;
using Joomla.Extensions;

namespace Joomla.PageObjects
{
    class LoginAdministratorPage
    {
        //Init driver
        //private IWebDriver driver;

        //Init element
        [FindsBy(How = How.Id, Using = "mod-login-username")]
        private IWebElement Username { get; set; }

        [FindsBy(How = How.Id, Using = "mod-login-password")]
        private IWebElement Password { get; set; }

        [FindsBy(How = How.XPath, Using = "//button[contains(@class,'btn-primary')]")]
        private IWebElement Login { get; set; }    

        //Actions
        public void LoginToJoomla(string username, string password)
        {
            Username.Enter(username);
            Password.Enter(password);
            Login.Click();
        }
    }    
}
