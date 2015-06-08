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

public enum Role{
	SMASTER("scrum master"),
	POWNER("product owner"),
	DEVELOPER ("developer"),
	WATCHER("watcher"),
	USER("user");
	
	private final String rolName;
	
	Role(String name){
		rolName = name;
	}

	public String getRolName() {
		return rolName;
	}
}
