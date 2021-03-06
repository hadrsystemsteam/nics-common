/**
 * Copyright (c) 2008-2016, Massachusetts Institute of Technology (MIT)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package edu.mit.ll.nics.common.entity;

// Generated Sep 30, 2011 1:24:44 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Incidenttype generated by hbm2java
 */
@Entity
@Proxy(lazy=false)
@Table(name = "incidenttype")
public class IncidentType implements SADisplayPersistedEntity {

	private int incidenttypeid;
	private String incidenttypename;
	private Set<IncidentIncidentType> incidentIncidenttypes = new HashSet<IncidentIncidentType>(0);

	public IncidentType() {
	}

	public IncidentType(int incidenttypeid, String incidenttypename) {
		this.incidenttypeid = incidenttypeid;
		this.incidenttypename = incidenttypename;
	}

	public IncidentType(int incidenttypeid, String incidenttypename,
			Set<IncidentIncidentType> incidentIncidenttypes) {
		this.incidenttypeid = incidenttypeid;
		this.incidenttypename = incidenttypename;
		this.incidentIncidenttypes = incidentIncidenttypes;
	}

	@Id
	@Column(name = "incidenttypeid", unique = true, nullable = false)
	public int getIncidentTypeId() {
		return this.incidenttypeid;
	}

	public void setIncidentTypeId(int incidenttypeid) {
		this.incidenttypeid = incidenttypeid;
	}

	@Column(name = "incidenttypename", nullable = false, length = 45)
	public String getIncidentTypeName() {
		return this.incidenttypename;
	}

	public void setIncidentTypeName(String incidenttypename) {
		this.incidenttypename = incidenttypename;
	}

}
