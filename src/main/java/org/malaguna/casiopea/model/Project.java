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

public class Project{
	private Integer code = null;
	private String name = null;
	private Boolean active = null;
	private Date start = null;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
