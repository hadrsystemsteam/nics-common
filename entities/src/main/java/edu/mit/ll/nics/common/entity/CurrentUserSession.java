/**
 * Copyright (c) 2008-2015, Massachusetts Institute of Technology (MIT)
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

// Generated Oct 7, 2011 8:20:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * CurrentUserSession generated by hbm2java
 */
@Entity
@Proxy(lazy=false)
@Table(name = "currentusersession", uniqueConstraints = @UniqueConstraint(columnNames = "userid"))
@SequenceGenerator(
	name="SEQ_STORE",
	sequenceName="current_user_session_seq",
	allocationSize=1
)
public class CurrentUserSession extends SADisplayMessageEntity implements SADisplayPersistedEntity, java.io.Serializable {

	private int currentusersessionid;
	private Usersession usersession;
	private User user;
	private SystemRole systemrole;
	private String displayname;
	private Date loggedin;
	private Date lastseen;
	private int systemroleid;
	private int userid;
	private int usersessionid;
	private int workspaceid;

	public CurrentUserSession() {
	}

	public CurrentUserSession(int currentusersessionid,
			Usersession usersession, User user, String displayname,
			Date loggedin, Date lastseen) {
		this.currentusersessionid = currentusersessionid;
		this.usersession = usersession;
		this.user = user;
		this.displayname = displayname;
		this.loggedin = loggedin;
		this.lastseen = lastseen;
	}

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name = "currentusersessionid", unique = true, nullable = false)
	public int getCurrentusersessionid() {
		return this.currentusersessionid;
	}

	public void setCurrentusersessionid(int currentusersessionid) {
		this.currentusersessionid = currentusersessionid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usersessionid", nullable = false, insertable = false, updatable = false)
	public Usersession getUsersession() {
		return this.usersession;
	}

	public void setUsersession(Usersession usersession) {
		this.usersession = usersession;
	}
	
	public void setUsersessionid(int usersessionid){
		this.usersessionid = usersessionid;
	}
	
	@Column(name = "usersessionid", nullable = false)
	public int getUsersessionid(){
		return this.usersessionid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Column(name = "userid", nullable = false)
	public int getUserid(){
		return this.userid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "systemroleid", nullable = false, insertable = false, updatable = false)
	public SystemRole getSystemrole() {
		return this.systemrole;
	}

	public void setSystemrole(SystemRole systemrole) {
		this.systemrole = systemrole;
	}

	@Column(name = "systemroleid", nullable = false)
	public int getSystemroleid(){
		return this.systemroleid;
	}
	
	public void setSystemroleid(int systemroleid){
		this.systemroleid = systemroleid;
	}
	
	@Column(name = "workspaceid")
	public int getWorkspaceid(){
		return this.workspaceid;
	}
	
	public void setWorkspaceid(int workspaceid){
		this.workspaceid = workspaceid;
	}

	@Column(name = "displayname", nullable = false, length = 64)
	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "loggedin", nullable = false, length = 29)
	public Date getLoggedin() {
		return this.loggedin;
	}

	public void setLoggedin(Date loggedin) {
		this.loggedin = loggedin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastseen", nullable = false, length = 29)
	public Date getLastseen() {
		return this.lastseen;
	}

	public void setLastseen(Date lastseen) {
		this.lastseen = lastseen;
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("currentusersessionid", this.currentusersessionid);
		obj.put("usersessionid", this.usersessionid);
		obj.put("userid", this.userid);
		obj.put("systemroleid", this.systemroleid);
		obj.put("displayname", this.displayname);
		obj.put("loggedin", this.loggedin.toString());
		obj.put("lastseen", this.lastseen.toString());
		obj.put("workspaceid", this.workspaceid);
		return obj;
	}
}