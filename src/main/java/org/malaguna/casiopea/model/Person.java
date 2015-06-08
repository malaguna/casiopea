//Copyright 2015 Miguel Ángel Laguna Lobato
//
//This file is part of Casiopea Project.
//
//Casiopea  Project is  free  software : it means  you  can redistribute 
//it and/or modify it under  the terms of the GNU General Public License 
//as published by the Free  Software Foundation, either version 3 of the 
//License, or (at your option) any later version.
//
//Casiopea   Project   is  distributed   in  the  hope  that   it   will 
//be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
//of  MERCHANTABILITY or  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
//General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Casiopea Project.  If not, see <http://www.gnu.org/licenses/>.

package org.malaguna.casiopea.model;

import java.util.Date;

public class Person{
	private String uid = null;
	private String name = null;
	private String surname = null;
	private Boolean active = Boolean.TRUE;
	private Date start = new Date();

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}
}
