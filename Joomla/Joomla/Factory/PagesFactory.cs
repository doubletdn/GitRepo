using Joomla.Factory;
using OpenQA.Selenium.Support.PageObjects;
using Joomla.PageObjects;

namespace Joomla.Factory
{
    class Pages
    {
        public static T GetPage<T>() where T : new()
        {
            var page = new T();
            PageFactory.InitElements(BrowsersFactory.Driver, page);
            return page;
        }

        //List PageObjects

        public static LoginAdministratorPage LoginAdministrator
        {
            get { return GetPage<LoginAdministratorPage>(); }
        }
    }
}
