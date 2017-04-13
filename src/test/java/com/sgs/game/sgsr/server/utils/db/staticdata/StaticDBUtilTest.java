/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticDBUtilTest.
 */
public class StaticDBUtilTest extends TestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		StaticDBUtil.setLOCAL_BASE_PATH("data/test/static");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		StaticDBUtil.setLOCAL_BASE_PATH("data/prod/static");
	}

	/**
	 * Test fetch data first time.
	 */
	@Test
	public void testFetchDataFirstTime() {
		StaticDBUtil.setStaticDataConfig(new HashMap<>());
		StaticDBUtil.setStaticData(new HashMap<>());
		StaticDBUtil.fetchDataFirstTime();

		Assert.assertEquals(2, StaticDBUtil.getStaticData().size());
		Assert.assertEquals(true, StaticDBUtil.getStaticData().containsKey("1.0"));
		Assert.assertEquals(true, StaticDBUtil.getStaticData().containsKey("2.0"));
		Assert.assertEquals(false, StaticDBUtil.getStaticData().containsKey("3.0"));
		Assert.assertEquals(2, StaticDBUtil.getStaticData().get("1.0").size());
		Assert.assertEquals(2, StaticDBUtil.getStaticData().get("2.0").size());
		Assert.assertEquals(true, StaticDBUtil.getStaticData().get("1.0").containsKey("Avatar"));
		Assert.assertEquals(true, StaticDBUtil.getStaticData().get("1.0").containsKey("GlobalConfig"));
		Assert.assertEquals(true, StaticDBUtil.getStaticData().get("2.0").containsKey("Avatar"));
		Assert.assertEquals(true, StaticDBUtil.getStaticData().get("2.0").containsKey("GlobalConfig"));
		Assert.assertEquals(3, StaticDBUtil.getStaticData().get("1.0").get("Avatar").size());
		Assert.assertEquals(2, StaticDBUtil.getStaticData().get("1.0").get("GlobalConfig").size());
	}
}
