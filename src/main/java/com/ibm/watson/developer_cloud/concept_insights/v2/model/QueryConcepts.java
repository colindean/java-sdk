
/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class QueryConcepts {

    @SerializedName("query_concepts")
    private List<Concept_> queryConcepts = new ArrayList<Concept_>();

    private List<Result> results = new ArrayList<Result>();

    /**
     * 
     * @return
     *     The queryConcepts
     */
    public List<Concept_> getQueryConcepts() {
        return queryConcepts;
    }

    /**
     * 
     * @param queryConcepts
     *     The query_concepts
     */
    public void setQueryConcepts(List<Concept_> queryConcepts) {
        this.queryConcepts = queryConcepts;
    }

    public QueryConcepts withQueryConcepts(List<Concept_> queryConcepts) {
        this.queryConcepts = queryConcepts;
        return this;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public QueryConcepts withResults(List<Result> results) {
        this.results = results;
        return this;
    }

}