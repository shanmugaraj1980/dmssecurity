package com.cardinalhealth.security.test.web.resource

import static org.hamcrest.collection.IsCollectionWithSize.hasSize
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

import org.springframework.http.MediaType

import spock.lang.Unroll

import com.cardinalhealth.security.test.base.TransactionalWebIntegrationTest
import com.cardinalhealth.security.test.base.WebAppIntegrationBaseSpecification

@TransactionalWebIntegrationTest
class PermissionResourceTest extends WebAppIntegrationBaseSpecification{
	
	static getPermissions(mockMvc) {
		println "test123"
		!mockMvc.perform(get("/api/permission")).isEmpty()
		
	}

}
