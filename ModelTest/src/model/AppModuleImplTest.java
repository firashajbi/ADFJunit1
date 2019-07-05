package model;
import model.AppModuleImpl;

import modeltest.test.AppModuleFixture;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppModuleImplTest {
  AppModuleFixture fixture1 = new AppModuleFixture();

  public AppModuleImplTest() {}

  @Before
  public void setUp() throws Exception {
    fixture1.setUp();
  }

  @After
  public void tearDown() throws Exception {
    fixture1.tearDown();
  }

  /**
   * @see br.com.waslleysouza.model.AppModuleImpl#findEmployeeAndManager(Integer)
   */
  @Test
  public void testFindEmployeeAndManager() {
    AppModuleImpl appModuleImpl = fixture1.getAppModuleImpl();

    int employeeId = 101;
    String ret = appModuleImpl.findEmployeeAndManager(employeeId);
    assertTrue("Employee without manager", ret.equals("Unassigned"));

    employeeId = 102;
    ret = appModuleImpl.findEmployeeAndManager(employeeId);
    assertTrue("Employee with manager", ret.contains("Employee"));

    employeeId = 1000;
    ret = appModuleImpl.findEmployeeAndManager(employeeId);
    assertTrue("Nonexistent employee", ret == null);
  }
}