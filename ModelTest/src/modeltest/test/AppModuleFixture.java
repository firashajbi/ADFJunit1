package modeltest.test;
import model.AppModuleImpl;
import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;
public class AppModuleFixture {
    private ApplicationModule applicationModule;
     private AppModuleImpl appModuleImpl;

    public AppModuleFixture() {
    }

    public void setUp() {
        String amDef = "model.AppModule";
          /** String config = "AppModuleLocal";
           applicationModule = Configuration.createRootApplicationModule(amDef, config);
           appModuleImpl = (AppModuleImpl) applicationModule;
    **/}

    public void tearDown() {
       /** Configuration.releaseRootApplicationModule(applicationModule, true);**/
        
    }
    public AppModuleImpl getAppModuleImpl() {
        return appModuleImpl;
      }
}
