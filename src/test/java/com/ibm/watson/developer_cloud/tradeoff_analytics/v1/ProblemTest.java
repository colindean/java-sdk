/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.developer_cloud.tradeoff_analytics.v1;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.junit.Test;

import com.ibm.watson.developer_cloud.WatsonServiceTest;
import com.ibm.watson.developer_cloud.tradeoff_analytics.v1.model.Problem;
import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * The Class TradeoffAnalyticsTest.
 */
public class ProblemTest {

	/**
	 * Test convert problem to json and vise versa.
	 */
	@Test
	public void testJsonProblem() {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("problem.json");
		String problemJson = WatsonServiceTest.getStringFromInputStream(in);
		Problem problem = GsonSingleton.getGson().fromJson(problemJson, Problem.class);
		assertNotNull(problem.getSubject());
		assertNotNull(problem.getColumns());
		assertNotNull(problem.getOptions());
		assertNotNull(problem.getColumns().get(0));
		assertNotNull(problem.getOptions().get(0));
	}

}
