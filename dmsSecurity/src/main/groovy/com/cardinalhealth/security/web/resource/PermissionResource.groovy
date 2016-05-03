package com.cardinalhealth.security.web.resource

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import com.cardinalhealth.security.domain.Permission
import groovy.json.*


@RestController
@RequestMapping("/api/permission")
class PermissionResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	def permissions() {
		Permission p = new Permission()
		p.PermissionID = 1
		p.PermissionName = "PermissionName"
		return p;
		
	}
	
}
