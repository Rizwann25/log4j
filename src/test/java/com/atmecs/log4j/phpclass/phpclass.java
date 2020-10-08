package com.atmecs.log4j.phpclass;

import org.testng.annotations.Test;

import com.atmecs.log4j.pageaction.PageAction;
import com.atmecs.log4j.setup.SetUp;

     public class phpclass extends SetUp{
	 @Test
		public void runphptravels() throws InterruptedException
		{
			PageAction run=new PageAction();
			run.loginSite();
			
		}

}
